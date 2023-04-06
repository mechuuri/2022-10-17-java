package com.sist.string;

import java.util.StringJoiner;

/*
 * 	471page
 * 	--------11장, 12장, 15장 ==> 2장~8장 (기본), 9장(String, Object) ==> web관련
 * 	String
 * 	-------
 * 	StringBuffer : append() : 문자열 결합
 * 				   toString()
 * 	Math : random() / ceil() / round()
 * 	Wrapper : Integer, Double, Boolean => 문자열을 해당 데이터형 변경
 * 			  parseInt(), parseDouble() , parseBoolean() ////****
 * 			  => 박싱 / 언박싱								 ////****
 * 			  => List<int> (X) ==> List<Integer>
 * 	StringTokenizer : nextToken(), counterToken(), hasMoreTokents
 * 	pattern / Matcher
 * 	-------	  -------- find(), group(), complie()
 */
public class MainClass_String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color="red,green,blue,black,white,yellow,magenta";
		// 칼라별 분리
		String[] colors=color.split(",");
		for(String c:colors)
		{
			System.out.println(c);
		}
		System.out.println("=== 출력형식 (join) ===");
		String ss=String.join("-", colors); // join = replace 거의 비슷
		System.out.println(ss);
		System.out.println("=== 출력형식 ===");
		ss=color.replace(",", "-");
		System.out.println(ss);
		// 이미지 (여러개를 동시에 묶어서 저장) => 구분자 사용해서 저장 ==> 데이터를 나눠서 출력
		// 오라클 => ^
		StringJoiner sj=new StringJoiner("/","{","}");// {데이터/데이터/데이터} (구분자,접두어,접미어)
		for(String s:colors)
		{
			sj.add(s);
		}
		System.out.println(sj.toString());// 객체를 문자열로 변환시켜서 출력
		
		
		
		
	}

}
