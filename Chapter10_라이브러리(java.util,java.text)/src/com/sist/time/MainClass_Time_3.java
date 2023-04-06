package com.sist.time;
/*
 * 	Period / Duration -- 시간 차이
 * 	------ 날짜 차이
 * 
 * 	LocalDate d1
 *  LocalDate d2
 *  
 *  Peruid p=d1-d2
 *  
 *  LocalTIme t1;
 */
import java.time.*;
public class MainClass_Time_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2022, 11, 23);
		
		Period p=Period.between(date1, date2); // 차이 나타날때
		System.out.println(p.getDays());
		// 음수(이전) / 양수(이후) / 0(같은 날)
	}

}
