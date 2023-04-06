package com.sist.string;
import java.io.*;
/*
 * 
 */
public class MainClass_StringBuffer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\javaDev\\movie.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)
			{
				sb.append(String.valueOf((char)i));// 문자열 결합 ==> 최적화
			}
			System.out.println(sb.toString());
			// 문자열 결합 => append(), String 변경 => toString()
			// public StringBuffer append(String s)
			// 오버로딩 ==> append(boolean b) append(char[] c) append(int i)...=> 문자열로 변경이 된다
			// public String toString()
			// ==> 데이터 읽기가 끝나면 ==> String으로 변환 (String으로 제어)
		}catch(Exception ex) {}
		finally
		{
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
		
		
		
	}

}
