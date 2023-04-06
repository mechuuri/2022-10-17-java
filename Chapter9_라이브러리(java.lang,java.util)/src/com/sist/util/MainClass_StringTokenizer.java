package com.sist.util;
// 513page
/*
 * 
 */
import java.util.*;
public class MainClass_StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date="2022-11-21";
		StringTokenizer st=new StringTokenizer(date,"-");
		// StringTokenizer(date) ==> " "은 구분문자에서 생략이 가능
		String year=st.nextToken();
		String month=st.nextToken();
		String day=st.nextToken();
		//String temp=st.nextToken(); 더 많이 갖고 오면 안됨!
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
