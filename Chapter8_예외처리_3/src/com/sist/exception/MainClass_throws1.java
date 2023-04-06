package com.sist.exception;
/*
 * 	throws
 * 	------
 * 	이미 만들어진 메소드에서 예외에 대한 예측이 어렵다
 * 	==> 다른 언어(선언) ==> 코딩 에러처리를 할 수 없다
 * 	==> 자바에는 어떤 에러가 발생할지를 선언하고 있다 (대비) => 견고한 프로그램을 만들 수 있다
 * 	==> 가독성
 * 	------------------------------------------------------------------
 * 	void aaa(char a,int a,int b)
 *  void bbb(int a,int b,int c)
 *  
 *  aaa('A','A',10)
 *  
 *  throws ==> 생성자, 메소드에서만 사용이 가능
 *  			초기화 블록에서는 throws를 사용할 수 없다
 */
public class MainClass_throws1 {
	static void aaa(char c,int a,char b)
	{
		System.out.println("1");
	}
	static void aaa(int a,int b,int c)
	{
		System.out.println("2");
	}
	public static void method1() throws Exception
	{
		method2();
	}
	public static void method2() throws Exception
	{
		throw new Exception();
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try
		{
			method1();
		}catch(Exception ex) {}
	}

}
