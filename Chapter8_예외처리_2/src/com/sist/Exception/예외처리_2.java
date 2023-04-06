package com.sist.Exception;
//멀티 catch블록
import java.util.Scanner;
public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열로 받아서 정수 변환 ==> 나누기
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("첫번째 정수 입력:");
			String num1=scan.next();
			System.out.print("두번째 정수 입력:");
			String num2=scan.next();
			
			// 오류 예상 => 정수
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2); // NumberFormatException
			
			// 나누기 => 오류예상 (0)
			
			int n3=n1/n2;
			System.out.println("결과값:"+n3);
		}// 오류발생시 처리
		catch(NumberFormatException | ArithmeticException e)
		{
			//e.printStackTrace(); // 오류 발생한 위치 잡아주는..[기본]
			// e는 객체 ==> 어떤 클래스의 객체인지 확인할 때 ==> instanceof 연산자를 이용한다 
			if(e instanceof NumberFormatException)
				System.out.println("문자열이 입력되었습니다.\n 정수를 입력하세요");
			else if(e instanceof ArithmeticException)
				System.out.println("0으로 나눌 수 없습니다!!");
		}
		// 웹 ==> 화면 출력
		System.out.println("화면 출력 유지..."); // 비정상종료 방지하고 정상 수행할 수 있게 프로그램 제작
		/*
		 * catch는 여러번 사용이 가능
		 * catch에 사용되는 예외처리클래스는 순서가 존재한다 (계층구조 => 위에 있는 클래스가 여러개를 동시에 처리할 수 있다)
		 */
	}

}
