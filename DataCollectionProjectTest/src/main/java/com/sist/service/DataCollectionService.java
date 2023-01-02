/*
 package com.sist.service;
import com.sist.dao.*;
import java.util.*;

//import javax.security.auth.Subject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class DataCollectionService {
	public static void main(String[] args) {
		DataCollectionService ds=new DataCollectionService();
		//ds.foodCategoryData();
		ds.foodDetailData();
		//ds.foodLocationData();
		
	
	}
	public void foodCategoryData()
	{
		foodDetailDAO dao=new foodDetailDAO();
		try
		{
			//사이트 연결 => HTML 태그 읽기
			Document doc=Jsoup.connect("https://www.mangoplate.com").get();
			//System.out.println(doc.toString());
			Elements title=doc.select("div.top_list_slide div.info_inner_wrap span.title");
			Elements subtitle=doc.select("div.top_list_slide div.info_inner_wrap p.desc");
			Elements poster=doc.select("div.top_list_slide img.center-croping");
			Elements link=doc.select("div.top_list_slide a");
			//System.out.println(link.toString());
		for(int i=0;i<title.size();i++)
		{
			System.out.println(i+1);
			System.out.println(title.get(i).text());
			System.out.println(subtitle.get(i).text());
			System.out.println(poster.get(i).attr("data-lazy"));
			System.out.println(link.get(i).attr("href"));
			System.out.println("============================================");
			
			CategoryVO vo=new CategoryVO();
			vo.setTitle(title.get(i).text());
			vo.setSubtitle(subtitle.get(i).text());
			vo.setPoster(poster.get(i).attr("data-lazy"));
			vo.setLink(link.get(i).attr("href"));
			dao.foodCategoryInsert(vo);
		}
			
	}catch(Exception ex) {}
		
}	
	public void foodDetailData()
	{
		
		try
		{
			foodDetailDAO dao=new foodDetailDAO();
			ArrayList<CategoryVO> list=dao.foodCategoryInfoData();
			for(CategoryVO vo:list)
			{
				//System.out.println(vo.getFcno()+" "+vo.getTitle()+" "+vo.getLink());
			
				foodDetailVO fdvo=new foodDetailVO();
				fdvo.setFcno(vo.getFcno());
				System.out.println(vo.getFcno()+" "+vo.getTitle());
				Document doc=Jsoup.connect(vo.getLink()).get();
				Elements link=doc.select("section#contents_list span.title a");
			for(int k=0;k<link.size();k++)
			{
				//System.out.println(link.get(k).attr("href"));
				// 망플 상세페이지
				Document doc2=Jsoup.connect("https://www.mangoplate.com"+link.get(k).attr("href")).get();
				//1.상세페이지의 이미지
				Elements image=doc2.select("div.list-photo_wrap img.center-croping");
				String poster="";
				for(int j=0;j<image.size();j++)
				{
					// 사진1개
					String s=image.get(j).attr("src");
					poster+=s+"^";
				}
			poster=poster.substring(0,poster.lastIndexOf("^"));
			
			poster=poster.replace("&", "#");
			fdvo.setPoster(poster);
			//System.out.println(poster);
			//2. 맛집명
			//추천리스트 목록페이지
			//1290
			Element name=doc2.selectFirst("span.title h1.restaurant_name");
			Element score=doc2.selectFirst("strong.rate-point span");
			System.out.println(name.text()+" "+score.text());
			//
			fdvo.setName(name.text());
			fdvo.setScore(Double.parseDouble(score.text()));
			//3.평점
			//4.주소,전화,음식종류,가격대,주차,시간,메뉴,좋아요,괜찮다,별로
			String addr="no",tel="no",type="no",price="no",time="no",menu="no",parking="no";
			Elements detail=doc2.select("table.info tbody tr th");
			for(int i=0;i<detail.size();i++)
			{
				//System.out.println(detail.get(i).text());
				String label=detail.get(i).text();
				if(label.equals("주소"))
				{
					Element e=doc2.select("table.info tbody tr td").get(i);
					addr=e.text();					
				}
				else if(label.equals("전화번호"))
				{
					Element e=doc2.select("table.info tbody tr td").get(i);
					tel=e.text();					
				}
				else if(label.equals("음식 종류"))
				{
					Element e=doc2.select("table.info tbody tr td").get(i);
					type=e.text();					
				}
				else if(label.equals("가격대"))
				{
					Element e=doc2.select("table.info tbody tr td").get(i);
					price=e.text();					
				}
				else if(label.equals("주차"))
				{
					Element e=doc2.select("table.info tbody tr td").get(i);
					parking=e.text();					
				}
				else if(label.equals("영업시간"))
				{
					Element e=doc2.select("table.info tbody tr td").get(i);
					time=e.text();					
				}
				else if(label.equals("메뉴"))
				{
					Element e=doc2.select("table.info tbody tr td").get(i);
					menu=e.text();					
				}
				
			}
		String addr1=addr.substring(0, addr.indexOf("지"));
		String addr2=addr.substring(addr.indexOf("지")+3);
		
		System.out.println("주소:"+addr1);
		System.out.println("지번:"+addr2);
		
		System.out.println("전화:"+tel);
		System.out.println("음식 종류:"+type);
		System.out.println("가격대:"+price);
		System.out.println("시간:"+time);
		System.out.println("주차:"+parking);
		System.out.println("메뉴:"+menu);
		//
		fdvo.setAddr(addr);
		fdvo.setTel(tel);
		fdvo.setTime(time);
		fdvo.setType(type);
		fdvo.setParking(parking);
		fdvo.setPrice(price);
		fdvo.setMenu(menu);
		
		Element script=doc2.selectFirst("script#reviewCountInfo");
		System.out.println(script.data());// 스크립트 안에 있는 데이터 읽기 ==> data()
		// 442. [{"action_value":1,"count":3},{"action_value":2,"count":12},{"action_value":3,"count":129}]
		String s=script.data();
		JSONParser jp=new JSONParser();
		JSONArray arr=(JSONArray)jp.parse(s);
		System.out.println(arr.toString());
		for(int i=0;i<arr.size();i++)
		{
			JSONObject obj=(JSONObject)arr.get(i);
			if(i==0)
			{
				System.out.println("별로("+obj.get("count")+")");
				String ss=String.valueOf(obj.get("count"));
				fdvo.setBad(Integer.parseInt(ss));
			}
			if(i==1)
			{
				System.out.println("괜찮다("+obj.get("count")+")");
				String ss=String.valueOf(obj.get("count"));
				fdvo.setSoso(Integer.parseInt(ss));
			}
			if(i==2)
			{
				System.out.println("맛있다("+obj.get("count")+")");
				String ss=String.valueOf(obj.get("count"));
				fdvo.setGood(Integer.parseInt(ss));
			}
		}
		System.out.println("=====================================");
		dao.foodDetailInsert(fdvo);
		}
			
			
	}
			
}catch (Exception ex) {
			
		}
	}
	

}
*/
