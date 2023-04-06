package com.sist.exception;

import java.io.IOException;

/*
 * 	1. try~catch
 * 	2. throws
 * 	   --------
 * 		예외선언 (예외회피) => 시스템에 예외 알려줌
 * 		형식)
 * 			public void display() throws NumberFormatException, RuntimeException, Exception
 * 										 ---------------------------------------------------
 * 											catch: 순서, throws 순서가 없다
 * 			=> 라이브러리는 예상된 예외를 throws로 이용해서 등록
 * 			  ==> 				------------------ 처리하면서 사용을 해야 한다
 * 			=> 사용법 2개가 있다
 * 			1) try~catch : 직접 처리하는 방법
 * 			2) throws : 선언만 처리 
 * 
 * 			public void display() throws Exception => display를 호출시 Exception을 처리한 후 사용해야 됨
 * 			{
 * 			}
 * 
 * 			public void aaa()
 * 			{
 * 				display(); // 오류 코드
 * 			}
 * 
 * 			1) 
 * 				public void aaa()
 * 				{
 * 					try
 * 					{
 * 						display();	
 * 					}catch(Exception e){}
 * 				}
 * 
 * 			2) public void aaa() throws Exception
 * 				{
 * 					display();
 * 				}
 * 		-----------------------------------------------
 * 		public void aaa() throws NumberFormatException, ArrayIndexOutOfBoundsException
 * 		{	
 * 		}
 * 
 * 		main()
 * 		{
 * 			aaa(); // 정상 수행
 * 		}
 * 	
 * 		// Exception / Throwable
 * 			모든 예외를 처리할 수 있는 클래스 
 * 
 * 			void aaa() throws IOException,ClassNotFoundException
 * 
 * 			void bbb() throws IOException, ClassNotFoundException
 * 			void bbb() throws Exception ==> 확대
 * 			void bbb() throws Throwable ==> 확대
 * 
 * 			void aaa() throws Throwable ==> 축소
 * 
 * 			void bbb() throws Exception(X)
 * 
 * 					Throwable
 * 						|
 * 
 * 			
 */

public class MainClass_예외처리_1 {
	//CheckException => 컴파일러가 예외처리가 되었는지 확인
	public static void aaa() throws Exception
	{
		
	}
	//UnCheckException => 컴파일러가 예외처리를 확인하지 않는다 => 예외처리를 생략할 수 있다 
	public static void bbb() throws NumberFormatException,NullPointerException
	{
		// 예외처리 생략할 수 있다
	}
	//										간접 ==> 자바시스템에서 처리 요청
	public static void main(String[] args) throws InterruptedException,IOException {
		// TODO Auto-generated method stub
		/*bbb();
		try
		{
			aaa();
		}catch(Exception ex) {} */
		//aaa();
		try
		{
			Thread.sleep(1000);
		}catch(Exception ex) {}// 프로그래머가 직접 처리해서 사용 
		
	}

}
