/*
 *  기억해
 *  format(변경할 때) ==> printf() 랑 비슷
 *  join/format ==> byte[] => 인코딩
 */
package com.sist.string;

public class MainClass_String_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 시간 처리 ==> 원하는 형식으로 변경 (웹에서는 System.out.printf("")=> X)
		int a=10;
		int b=20;
		String temp=String.format("%d+%d=%d", a,b,a+b);
		System.out.println(temp);
		
		// 12관람가 ==> 12 ==> format("%d관람가", 12)
	}

}
