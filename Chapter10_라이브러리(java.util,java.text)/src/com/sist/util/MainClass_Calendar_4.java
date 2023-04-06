package com.sist.util;
import java.util.*;
public class MainClass_Calendar_4 {

	public static void main(String[] args) {
		// 사용자로부터 년 월 받기
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 월 입력(2022 11):");
		int year=scan.nextInt();
		int month=scan.nextInt();
		
		// ==> 1일자의 요일 확인, 요청달의 마지막 날짜
		Calendar cal=Calendar.getInstance();// 객체 생성
		cal.set(Calendar.YEAR, year);// 사용자가 요청한 날짜로 변경
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);// 1일자 확인 
		
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;// 0번
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		String[] strweek={"일","월","화","수","목","금","토"};
		//System.out.println("요청 일자의 1일자 요일:"+strweek[week] );
		System.out.println(year+"년도 "+month+"월");
		for(String s:strweek)
		{
			System.out.print(s+"\t");
		}
		System.out.println();
		for(int i=1;i<=lastday;i++)
		{
			if(i==1)// 맨 첫줄에 출력되니까 공백을 주려고
			{
				for(int j=0;j<week;j++)
				{
					// 공백 => 요일 전까지 공백 출력
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)// 일요일이면
			{
				week=0;// 일요일로 변경
				System.out.println();
			}
		}
		
		
		
	}

}
