package com.sist.lang;
/*
 * java.lang => 프로그램에서 가장 많이 사용되는 기본이 되는 클래스의 집합
 * ----------	--------------------- import를 생략할 수 있다
 */
// 소멸자 예제
/*
 *  객체 생성 과정
 *  1. 클래스 설계
 *  2. 객체 생성하고 저장(클래스의 내용 저장)
 *  3. 객체 활용(객체가 가지고 있는 메소드, 변수활용)
 *  4. 객체 소멸
 *  5. 소멸 여부 확인(GC이 작동이 됐는지 확인 ==> finalize() 호출되면 소멸이 된것)
 */
class Main{
	private int a=10;
	public Main(int a)
	{
		this.a=a;
		System.out.println("Main클래스 메모리 할당..(객체 생성)");
	}
	public void display()
	{
		System.out.println("Main클래스 객체 활용...");
	}
	// 소멸이 될 때 자동 호출 (소멸자)
	/*
	 * 	class A
	 * 	{
	 * 		public A(){}
	 * 		public ~A(){} ==> 자동 처리(GC) => 해제되는 시간 (메모리 누수) => GC()호출
	 * 		// 객체는 null을 설정
	 * 		// 사용하지 않는 경우
	 * 	}
	 */
	@Override
	protected void finalize() throws Throwable {
		System.out.println("객체 소멸(메모리 해제)...");
	}
	//Object가 가지고 있는 메소드
	
}
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main(10); // 객체 생성
		// 저장된 메모리에서 필요한 내용 설정
		m.display(); // 객체 활용
		m=null; // 해제
		// 메모리 해제 명령 내리기
		System.gc();
	}

}
