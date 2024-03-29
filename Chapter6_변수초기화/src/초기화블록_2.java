/*
 *	생성자 특징
 *	=> 클래스명과 동일
 *	=> 리턴형이 없다(특수 메소드)
 *	=> 여러개를 만들어서 사용이 가능 (오버로딩 지원)
 *	=> 매개변수가 없는 생성자(기본 생성자) => 생성자가 없는 경우 (자동 추가)
 *	   매개변수가 있는 생성자 => 사용자가 보내준 값을 받아서 메모리에 저장
 *	=> 메모리가 만들어지면 변수에 초기값을 첨부해 주는 역할
 *		------------ 객체 생성
 *	=> 초기화(외부에서 데이터 읽기, 오라클 연결, 서버연결, 자동 로그인)
 *	 *** class블록은 구현을 할 수 없다(선언만 가능)
 *	=> 생성자 호출시에는 반드시 new 생성자()
 *						---------
 *
 *	*** static ==> 클래스명.변수명, 클래스명.메소드명
 *	*** instance ==> 객체명.변수명, 객체명.메소드명
 *
 *
 */
 class A
 
{
	int a=10;
	static int b=20;
	
	{
		a=100;
	}
	
	static
	{
		b=200;
	}
	
	A()
	{
		a=1000;
		b=2000;
	}
}
/*
 * 	1. 명시적 초기화()
 * 	2. 명시적 초기화가 불가능
 * 		인스턴스 : 생성자를 이용해서 초기화
 * 		static : static{} => 가끔(MyBatis)
 */
public class 초기화블록_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		/*
		 * 	b
		 * 	----	----	---- 	-----
		 * 	0		20		200		2000
		 * 	----	----	----	------
		 * 	a
		 * 	----	----	----	------
		 * 	0		10		100		10000
		 * 	----	----	----	------
		 */
	}

}
