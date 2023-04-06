package com.sist.string;

import java.util.Arrays;
/*
 * https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j69i59j0i433i512j0i131i433i512j0i512j69i65j69i61j69i60.766j0j7&sourceid=chrome&ie=UTF-8
 */
public class MainClass_String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//%EC%9E%90%EB%B0%94 // 보낼때 바이트 형식
			//EC9E90EBB094 ==> 인코딩 (byte[])
			String name="자바";
			System.out.println("=== 인코딩 ==="); 
			byte[] b=name.getBytes("UTF-8");
			for(byte bb:b)
			{
				System.out.print(String.format("%02X", bb));// 16진법으로 출력 
			}
			System.out.println("\n==== 디코딩 ====");
			byte[] b2=name.getBytes("CP949");
			for(byte bb:b2)
			{
				System.out.print(String.format("%02X", bb));// 16진법으로 출력 
			}
		}catch(Exception ex) {}
		
	}

}
