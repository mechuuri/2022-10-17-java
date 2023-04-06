package com.sist.Exception;
/*
 * 	컴파일(이진파일변경), 인터프리터(한줄씩 읽기에서 출력)
 * 	-------------	----------------------
 * 		javac			java
 */
import java.util.Scanner;
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UnCheckException => 예외처리 생략이 가능 => 정수변환, 배열, 나누기
		try
		{
			
	
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 두개 입력(10 10):");
		int[] arr=new int[2];
		arr[0]=scan.nextInt();
		arr[2]=scan.nextInt(); // 오류발생 ==> 프로그램 비정상 종료
		
		int res=arr[0]/arr[1];
		System.out.println("res="+res);
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			// 에러 확인
			//System.out.println(ex.getMessage());
			//Index 2 out of bounds for length 2
			//프로그램 종료
			ex.printStackTrace(); // 실행과정을 출력
		}
		System.out.println("프로그램 종료");
	}

}
