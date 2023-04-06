package com.sist.wrapper;

public class MainClass_Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer ii=10;// 박싱
		int i=ii;// 언박싱
		System.out.println("ii="+ii+",i="+i);
		System.out.println(ii.toString());// 문자열 변환
		System.out.println(ii.MAX_VALUE);// int형의 최대값
		System.out.println(ii.MIN_VALUE);// int형의 최소값
		System.out.println(Integer.toBinaryString(ii));// 이진법 변환
		System.out.println(Integer.toOctalString(ii));// 8진법
		System.out.println(Integer.toHexString(ii));// 16진법
		// 기본형 + 기능 첨부 
		String s="100";
		// 문자열을 정수형으로 변경할 때 paresInt() ==> 웹에서 필수
		int k=Integer.parseInt(s);
		System.out.println(k);
		
		
		
	}

}
