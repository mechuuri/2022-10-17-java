package com.sist.main;
import java.net.URLEncoder;
import java.util.*;

import org.json.simple.parser.JSONParser;
import org.json.simple.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sist.dao.*;
//FoodMain=DataCollectionService
/*
 *  <div class="top_list_slide">
        <ul class="list-toplist-slider" style="width: 531px;">
            <li>
              <img class="center-croping" alt="제천/단양 맛집 베스트 5곳 사진"
                   data-lazy="https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/ltkypgxhkzqpxvfh.png?fit=around|600:400&amp;crop=600:400;*,*&amp;output-format=jpg&amp;output-quality=80"/>

              <a href="/top_lists/2893_jecheon_danyang"
                 onclick="trackEvent('CLICK_TOPLIST', {&quot;section_position&quot;:0,&quot;section_title&quot;:&quot;믿고 보는 맛집 리스트&quot;,&quot;position&quot;:0,&quot;link_key&quot;:&quot;TIVMDQO&quot;});">
                <figure class="ls-item">
                  <figcaption class="info">
                    <div class="info_inner_wrap">
                      <span class="title">제천/단양 맛집 베스트 5곳</span>
                      <p class="desc">"제천, 단양 맛집 가보자고"</p>
                      <p class="hash">
                          <span>#제천 </span>
                          <span>#단양 </span>
                          <span>#충청북도 </span>
                          <span>#충북 </span>
                          <span>#제천시 </span>
                          <span>#단양시 </span>
                          <span>#리솜리조트 </span>
                          <span>#리솜포레스트 </span>
                          <span>#리솜 </span>
                          <span>#단양역 </span>
                          <span># </span>
                      </p>
                    </div>
                  </figcaption>
                </figure>
              </a>
            </li>
            <li>
 */
public class FoodMain {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FoodMain fm=new FoodMain();
        //카테고리 오케이 디테일,로케이션 낫 오케이 18
        //fm.foodCategoryGetData();
        fm.foodDetailData();
        //fm.foodLocationData();
	}
	public void foodCategoryGetData()
	{
		foodDetailDAO dao=new foodDetailDAO();
		try
		{
			//사이트 연결 => HTML태그 읽기
			Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
			//System.out.println(doc.toString());
			Elements title=doc.select("div.top_list_slide div.info_inner_wrap span.title");
			Elements subject=doc.select("div.top_list_slide div.info_inner_wrap p.desc");
			Elements poster=doc.select("div.top_list_slide img.center-croping");
			Elements link=doc.select("div.top_list_slide a");

			for(int i=0;i<title.size();i++)
			{
				System.out.println(i+1);
				System.out.println(title.get(i).text());
				System.out.println(subject.get(i).text());
				System.out.println(poster.get(i).attr("data-lazy"));
				System.out.println(link.get(i).attr("href"));
				System.out.println("===============================");
				
				CategoryVO vo=new CategoryVO();
				vo.setTitle(title.get(i).text());
				vo.setSubtitle(subject.get(i).text());
				vo.setPoster(poster.get(i).attr("data-lazy"));
				vo.setLink(link.get(i).attr("href"));
				dao.foodCategoryInsert(vo);
			}
		}catch(Exception ex) {}
				
	}
		
	public void foodDetailData()
	{
		foodDetailDAO dao=new foodDetailDAO();
		try
		{
			ArrayList<CategoryVO> list=dao.foodCategoryInfoData();
			for(CategoryVO vo:list)
			{
				//System.out.println(vo.getCno()+" "+vo.getTitle()+" "+vo.getLink());
				
				//
				foodDetailVO fvo=new foodDetailVO();
				fvo.setFcno(vo.getFcno());
				System.out.println(vo.getFcno()+" "+vo.getTitle());
				Document doc=Jsoup.connect(vo.getLink()).get();
				Elements link=doc.select("section#contents_list span.title a");
				for(int k=0;k<link.size();k++)
				{
					//System.out.println(link.get(k).attr("href"));
					Document doc2=Jsoup.connect("https://www.mangoplate.com"+link.get(k).attr("href")).get();
					//1. 이미지
					Elements image=doc2.select("div.list-photo_wrap img.center-croping");
					String poster="";
					for(int j=0;j<image.size();j++)
					{
						String s=image.get(j).attr("src");
						poster+=s+"^";
						
					}
					poster=poster.substring(0,poster.lastIndexOf("^"));
					
					poster=poster.replace("&", "#");
					fvo.setPoster(poster);
					//System.out.println(poster);
					//2. 맛집명
					/*
					 * 
					 */
					// 추천리스트 목록페이지
					Element name=doc2.selectFirst("span.title h1.restaurant_name");
					Element score=doc2.selectFirst("strong.rate-point span");
					System.out.println(name.text()+" "+score.text());
					//
					fvo.setName(name.text());
					fvo.setScore(Double.parseDouble(score.text()));
					//3. 평점
					//4. 주소, 전화, 음식종류, 가격대, 주차, 시간, 메뉴, 좋아요, 괜찮다, 별로
					String address="no",tel="no",type="no",price="no",time="no",menu="no",parking="no";
					Elements detail=doc2.select("table.info tbody tr th");
					for(int i=0;i<detail.size();i++)
					{

						String label=detail.get(i).text();
						if(label.equals("주소"))
						{
							Element a=doc2.select("table.info tbody tr td").get(i);
							address=a.text();
						}
						else if(label.equals("전화번호"))
						{
							Element a=doc2.select("table.info tbody tr td").get(i);
							tel=a.text();
						}
						else if(label.equals("음식 종류"))
						{
							Element a=doc2.select("table.info tbody tr td").get(i);
							type=a.text();
						}
						else if(label.equals("가격대"))
						{
							Element a=doc2.select("table.info tbody tr td").get(i);
							price=a.text();
						}
						else if(label.equals("주차"))
						{
							Element a=doc2.select("table.info tbody tr td").get(i);
							parking=a.text();
						}
						else if(label.equals("영업시간"))
						{
							Element a=doc2.select("table.info tbody tr td").get(i);
							time=a.text();
						}
						else if(label.equals("메뉴"))
						{
							Element a=doc2.select("table.info tbody tr td").get(i);
							menu=a.text();
						}
					}
					String addr1=address.substring(0,address.indexOf("지"));
					String addr2=address.substring(address.indexOf("지")+3);
					
					System.out.println("주소:"+addr1);
					System.out.println("지번:"+addr2);
					
					System.out.println("전화:"+tel);
					System.out.println("음식종류:"+type);
					System.out.println("가격대:"+price);
					System.out.println("시간:"+time);
					System.out.println("주차:"+parking);
					System.out.println("메뉴:"+menu);
					//
					fvo.setAddr(address);
					fvo.setTel(tel);
					fvo.setTime(time);
					fvo.setType(type);
					fvo.setParking(parking);
					fvo.setPrice(price);
					fvo.setMenu(menu);
					
					Element script=doc2.selectFirst("script#reviewCountInfo");
					System.out.println(script.data());// 스크립트 안에 있는 데이터 읽기 => data()
					// [{"action_value":1,"count":3},{"action_value":2,"count":12},{"action_value":3,"count":129}]
					String s=script.data();
					JSONParser jp=new JSONParser();
					/*
					 * 1. HTML 데이터 추출 => HTMLParser = Jsoup
					 * 2. JSON 데이터 추출 => JSONParser 
					 * 		=> ArrayList => []
					 * 		=> ~VO		 => {}
					 * 3. XML 데이터 추출 => DocumentBuilder
					 * -----------------------------------------
					 * 
					 * 	[] => JSONArray
					 * 	{} => JSONObject
					 */
					//==> RestFul ==> Spring
					JSONArray arr=(JSONArray)jp.parse(s);
					System.out.println(arr.toString());
					for(int i=0;i<arr.size();i++)
					{
						JSONObject obj=(JSONObject)arr.get(i);
						if(i==0)
						{
							System.out.print("별로("+obj.get("count")+")");
							String ss=String.valueOf(obj.get("count"));
							fvo.setBad(Integer.parseInt(ss));
						}
						else if(i==1)
						{
							System.out.print("괜찮다("+obj.get("count")+")");
							String ss=String.valueOf(obj.get("count"));
							fvo.setSoso(Integer.parseInt(ss));
						}
						else if(i==2)
						{
							System.out.print("맛있다("+obj.get("count")+")");
							String ss=String.valueOf(obj.get("count"));
							fvo.setGood(Integer.parseInt(ss));
						}
					}
					System.out.println("====================================");
					dao.foodDetailInsert(fvo);
				}
			}
		}catch(Exception ex) {}		
	}
		
	public void foodLocationData()
	{
		foodDetailDAO dao=foodDetailDAO.newInstance();
		try
		{
			String[] gus = { "강서구", "양천구", "구로구", "마포구", "영등포구", "금천구",
				    "은평구", "서대문구", "동작구", "관악구", "종로구", "중구", "용산구", "서초구", "강북구",
				    "성북구", "도봉구", "동대문구", "성동구", "강남구", "노원구", "중랑구", "광진구", "송파구",
				    "강동구" };
            int k=1;
           
            int m=1;
            for(String gu:gus)
            {
            	System.out.println("구:"+gu);
            	
            	for(int i=1;i<=10;i++)
            	{
            		String url="https://www.mangoplate.com/search/"
              			  +URLEncoder.encode(gu, "UTF-8")+"?keyword="
              			  +URLEncoder.encode(gu, "UTF-8")+"&page="+i;
              	    Document doc=Jsoup.connect(url).get();
              	    Elements link=doc.select("figure.restaurant-item div.info a");
              	    for(int j=0;j<link.size();j++)
              	    {
              	    	System.out.println(link.get(j).attr("href"));
              	    	Document doc2=
    							Jsoup.connect("https://www.mangoplate.com"+link.get(j).attr("href")).get();
    					   /*
    					    *  <div class="restaurant_title_wrap"> 
    					    *  <span class="title"> 
    					    *  <h1 class="restaurant_name">부성불고기찜닭</h1> 
    					    *  <strong class="rate-point "> 
    					    *  <span>4.2</span> </strong>
    	                        
    	                        figure class="restaurant-photos-item">
    	                        img class="center-croping
    					    */
    					   Element title=doc2.selectFirst("span.title h1.restaurant_name");
    				       
    					   String sss="";
    					   try
    				       {
	    					    Element score=doc2.selectFirst("strong.rate-point span");
	    					    sss=score.text();
    				       }catch(Exception ex)
    				       {
    				    	   sss="0.0";
    				       }
    				       // 포스터 
    				       /*
    				        *  https://mp-seoul-image-production-s3.mangoplate.com/sources/web/restaurants/276164/1862524_1609739956858?fit=around|512:512&amp;crop=512:512;*,*&amp;output-format=jpg&amp;output-quality=80
    				        */
    				       Elements poster=doc2.select("div.list-photo_wrap img.center-croping");
    				       String image="";
    				       for(int o=0;o<poster.size();o++)
    				       {
    				    	   image+=poster.get(o).attr("src")+"^"; // , 
    				       }
    				       image=image.substring(0,image.lastIndexOf("^"));// 마지막 ^를 제거 
    				       image=image.replace("&", "#");
    				       StringTokenizer st=new StringTokenizer(image,"^");
    				       int p=1;
    				       
    				       while(st.hasMoreTokens())
    				       {
    				    	   System.out.println(p+"."+st.nextToken());
    				    	   p++;
    				       }
    				       // 한개 => Element , 여러개 => Elements
    				       /*
    				        *   <table class="info no_menu "> 
    	                        <tr class="only-desktop"> 
    					      <th>주소</th> 
    					      <td>강원도 강릉시 옥가로 50<br/> 
    					      <span class="Restaurant__InfoAddress--Rectangle">지번</span> 
    					      <span class="Restaurant__InfoAddress--Text">
    					         강원도 강릉시 옥천동 219-11</span> 
    					      </td> 
    					    </tr>
     <tr class="only-desktop"> 
    					      <th>전화번호</th> 
    					      <td>033-641-3601</td> 
    	      					</tr>
    				        */
    				       /*Element address=doc2.select("table.info td").get(0);
    				       String addr=address.text();
    				       Element tel=doc2.select("table.info td").get(1);
    				       String phone=tel.text();
    				       Element type=doc2.select("table.info td").get(2);
    				       String tp=type.text();
    				       
    				       String pr="";
    				       try
    				       {
    				          Element price=doc2.select("table.info th").get(3);
    				          String s=price.text();
    				          if(s.equals("가격대"))
    				          {
    				        	  Element pp=doc2.select("table.info td").get(3);
    				        	  pr=pp.text();
    				          }
    				       }catch(Exception ex)
    				       {
    				    	      pr="none";
    				       }
    				       
    				       
    				       //Element parking=doc2.selectFirst("");
    				       //Element time=doc2.selectFirst("");
    				       //Element menu=doc2.selectFirst("");
    				        
    				        */
    				       ////////////////////////////////////////////////////
    				       String addr="no",phone="no",tp="no",pr="no",pa="no",ti="no",mu="no";
    				       Elements etc=doc2.select("table.info tr th");
    				       //System.out.println(etc);
    				       for(int a=0;a<etc.size();a++)
    				       {
    				    	   String ss=etc.get(a).text();
    				    	   if(ss.equals("주소"))
    				    	   {
    				    		   Element e=doc2.select("table.info td").get(a);
    				    		   addr=e.text();
    				    	   }
    				    	   else if(ss.equals("전화번호"))
    				    	   {
    				    		   Element e=doc2.select("table.info td").get(a);
    				    		   phone=e.text();
    				    	   }
    				    	   else if(ss.equals("음식 종류"))
    				    	   {
    				    		   Element e=doc2.select("table.info td").get(a);
    				    		   tp=e.text();
    				    	   }
    				    	   else if(ss.equals("가격대"))
    				    	   {
    				    		   Element e=doc2.select("table.info td").get(a);
    				    		   pr=e.text();
    				    	   }
    				    	   else if(ss.equals("주차"))
    				    	   {
    				    		   Element e=doc2.select("table.info td").get(a);
    				    		   pa=e.text();
    				    	   }
    				    	   else if(ss.equals("영업시간"))
    				    	   {
    				    		   Element e=doc2.select("table.info td").get(a);
    				    		   ti=e.text();
    				    	   }
    				    	   else if(ss.equals("메뉴"))
    				    	   {
    				    		   Element e=doc2.select("table.info td").get(a);
    				    		   mu=e.text();
    				    	   }
    				       }
    				       System.out.println("번호:"+m);
    				       System.out.println("업체명:"+title.text());
    				       System.out.println("점수:"+sss);
    				       System.out.println("주소:"+addr);
    				       System.out.println("전화:"+phone);
    				       System.out.println("음식종류:"+tp);
    				       System.out.println("가격대:"+pr);
    				       System.out.println("주차:"+pa);
    				       System.out.println("영업시간:"+ti);
    				       System.out.println("메뉴:"+mu);
    				       System.out.println("===========================");
    				       // 데이터베이스 저장 
    				       foodLocationVO fvo=new foodLocationVO();
    				       fvo.setNo(m);
    				       
    				       fvo.setName(title.text());
    				       fvo.setScore(Double.parseDouble(sss));
    				       fvo.setAddr(addr);
    				       fvo.setTel(phone);
    				       fvo.setType(tp);
    				       fvo.setPrice(pr);
    				       fvo.setParking(pa);
    				       fvo.setTime(ti);
    				       fvo.setMenu(mu);
    				       fvo.setPoster(image);
    				       // 번호는 자동 증가 
    				       // <script id="reviewCountInfo" type="application/json">[{"action_value":1,"count":0},{"action_value":2,"count":3},{"action_value":3,"count":23}]</script>
    				       Element review=doc2.selectFirst("script#reviewCountInfo");
    				       // class(중복) => . , id(중복이 없다) => # => 태그 구분
    				       //System.out.println(review.data()); // script => data()
    				       String json=review.data();// javasctript
    				       // text() => HTML  attr= HTML html =HTML  
    				       JSONParser jp=new JSONParser();
    				       JSONArray arr=(JSONArray)jp.parse(json);//[{},{},{}]
    				       String good="",soso="",bad="";
    				       for(int b=0;b<arr.size();b++)
    				       {
    				    	   JSONObject obj=(JSONObject)arr.get(b);//{}
    				    	   if(b==0)
    				    	   {
    				    		   bad=String.valueOf(obj.get("count"));
    				    		   //                       키 {"count":10}
    				    	   }
    				    	   else if(b==1)
    				    	   {
    				    		   soso=String.valueOf(obj.get("count"));
    				    	   }
    				    	   else if(b==2)
    				    	   {
    				    		   good=String.valueOf(obj.get("count"));
    				    	   }
    				       }
    				       System.out.println("GOOD:"+good);
    				       System.out.println("SOSO:"+soso);
    				       System.out.println("BAD:"+bad);
    				       fvo.setGood(Integer.parseInt(good));
    				       fvo.setSoso(Integer.parseInt(soso));
    				       fvo.setBad(Integer.parseInt(bad));
    				       // 데이터베이스에 저장 
    				       dao.foodLocationInsert(fvo);
    				       m++;
              	    }
            	}
            	System.out.println("==============================");
            	k++;
            }
		}catch(Exception ex){}
	}

}



