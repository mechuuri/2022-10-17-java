package com.sist.regex;
/*
 *   <div class="thumb_cont">
          <strong class="tit_item">
          <a href="/moviedb/main?movieId=149380" class="link_txt" data-tiara-layer="moviename">올빼미</a>
          </strong>
 */
import java.util.*;
import java.util.regex.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class MainClass_Regex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] movie={
				"올빼미",
				"블랙 팬서: 와칸다 포에버",
				"동감",
				"데시벨",
				"스트레인지 월드",
				"원피스 필름레드",
				"창밖은 거울",
				"폴:600미터",
				"그녀가 말했다",
				"아마겟돈 타임"
		};
		Scanner scan=new Scanner(System.in);
		System.out.println("============= 영화 목록 =============");
		for(int i=0;i<movie.length;i++)
		{
			System.out.println((i+1)+"."+movie[i]);
		}
		System.out.println("==================================");
		System.out.print("영화 선택:");
		int movieId=scan.nextInt();
		
		String title=movie[movieId-1];// 배열번호는 0번부터 시작이라
		System.out.println("선택된 영화명:"+title);
		try
		{
			String url="https://www.youtube.com/results?search_query="+title;
			Document doc=Jsoup.connect(url).get(); // 유튜브 서버 연결 > 네트워크 
			String pattern="/watch\\?v=[^가-힣]+";// 한글을 제외한 여러문자 데이터를 갖고오 ㅏ 
			String data=doc.toString();
			Pattern p=Pattern.compile(pattern);
			Matcher m=p.matcher(data);
			String key="";
			int i=0;
			while(m.find())
			{
				
				if(i==1)
				{
					key=m.group();
					break;
				}
			}
			key=key.substring(key.indexOf("=")+1,key.indexOf("\""));
			//System.out.println(key);
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe https://www.youtube.com/embed/"+key);
					
		}catch(Exception ex) {}
		
		
		
		
		
		
		
		
		
		
		
	}

}
