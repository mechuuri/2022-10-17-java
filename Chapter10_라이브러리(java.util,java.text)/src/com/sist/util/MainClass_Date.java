package com.sist.util;
import java.text.SimpleDateFormat;
import java.util.*;
public class MainClass_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성하는 과정
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/M/d h시:m분:s초");
		while(true)
		{
			Date date=new Date(); // 1초마다 한번씩 시스템 시간 읽어오기
			String today=sdf.format(date); // 날짜를 위의 형식으로 바꿔라
			// 스케쥴러 ==> 경매프로그램
			System.out.println(today);
		try
		{
			Thread.sleep(1000);
		}catch(Exception ex) {}
		
		}
	}
		

}
