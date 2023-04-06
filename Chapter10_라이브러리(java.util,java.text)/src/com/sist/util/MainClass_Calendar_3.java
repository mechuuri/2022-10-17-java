package com.sist.util;
import java.util.*;
public class MainClass_Calendar_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Calendar => Date(*****) ==> 오라클에 저장
		Calendar cal=Calendar.getInstance();
		Date date=new Date(cal.getTimeInMillis());// 날짜 => long형 시간까지 계산해서 나옴
		System.out.println(date);
		// 2. Date => Calendar(*****)
		Date date2=new Date();
		Calendar cal2=Calendar.getInstance();
		cal2.setTime(date2);// date를 cal로 
		System.out.println("년도:"+cal2.get(Calendar.YEAR));
		System.out.println("월:"+cal2.get(Calendar.MONTH)+1);
		System.out.println("일:"+cal2.get(Calendar.DATE));
		// month(0~11까지 저장), week(1(일)~7(토))
	
	
	
	}

}
