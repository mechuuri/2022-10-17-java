package com.sist.collection2;
/*
 * 		Collection
 * 			|
 * 			Map
 * 		--------------- 인터페이스
 * 			|
 * 	-----------------
 *  	|			|
 * 	  Hashtable		HashMap(***)
 * 
 * 	특징) 두개를 동시에 저장 (key, value)
 * 		=> key는 중복할 수 없다, value는 중복이 가능
 * 		=> 1) key는 문자열, value 상관없다
 * 		   2) 사용처 : 웹에서 지원하는 모든 클래스 (Map형식)
 * 					=> HttpServletRequest, HttpServletResponse, HttpSession, Cookie
 * 					   request.setAttribute("id","admin");
 * 					   id="admin" pwd="1234"
 * 					=> 외부에서 지원하는 라이브러리 => 스프링, 마이바티스
 * 					예) ("movieAllData","SELECT * FROM movie")
 * 			  스프링 => 클래스 관리("a",new A())
 * 		=> 주요 메소드
 * 		   저장 : put(key, 값)
 * 		   읽기 : get(key)
 * 		   ---------------------> 최신 방문 영화
 */
import java.util.*;
public class MainClass_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("id", "admin");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("age", 25);
		map.put("password", "4567");
		
		//값 출력
		/*System.out.println("ID:"+map.get("id"));// 키 값을 줘야함
		System.out.println("Password:"+map.get("password"));
		System.out.println("이름:"+map.get("name"));
		System.out.println("성별:"+map.get("sex"));
		System.out.println("나이:"+map.get("age"));*/
		
		Set s=map.keySet();
		System.out.println(s);
		for(Object obj:s)
		{
			String key=(String)obj;
			System.out.println(key+":"+map.get(key));
		}
	}

}
