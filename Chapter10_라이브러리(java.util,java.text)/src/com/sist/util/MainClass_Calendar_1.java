package com.sist.util;
import java.util.*;
/*
 * 	calendar : Date 클래스 보완
 */
public class MainClass_Calendar_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today=Calendar.getInstance();
		System.out.println("년도:"+today.get(Calendar.YEAR));
		System.out.println("월:"+(today.get(Calendar.MONTH)+1));// 0번부터 시작한다
		System.out.println("일:"+today.get(Calendar.DATE));
		String[] strWeek= {"","일","월","화","수","목","금","토"};// week는 1부터 싲가
		System.out.println("요일:"+strWeek[today.get(Calendar.DAY_OF_WEEK)]);
		// 1:일, 2:월 ... 7:토
		System.out.println("시간:"+today.get(Calendar.HOUR));
		System.out.println("분:"+today.get(Calendar.MINUTE));
		System.out.println("초:"+today.get(Calendar.SECOND));
		System.out.println("마지막날:"+today.getActualMaximum(Calendar.DATE));// 11월의 마지막 날
	
	
	
	}

}
