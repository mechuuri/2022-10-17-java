/*
 *    클래스의 구성요소 
 *      변수 
 *      메소드 
 *      생성자 
 *     ---------
 *     생성자 
 *     ----- 특이한 메소드 
 *      1) 클래스명과 동일 
 *      2) 리턴형이 없다 
 *      3) 오버로딩을 지원한다 
 *         ------ 여러개를 만들 수 있다 
 *      생성자가 하는 역할 
 *      -------------
 *      1. 멤버변수의 초기화
 *         => 명시적 초기화  
 *            int a=10;
 *            int b=20; ==> 클래스에서 사용이 가능 
 *         => 외부에서 데이터 읽기
 *         => 파일에서 데이터 읽기
 *         => 쿠키값 읽기 =================> 생성자 
 *      2. 객체 생성시에 호출되는 메소드 
 *      3. 시작동시에 처리하는 내용 
 *         ------------------
 *          자동 로그인 , 서버연결 , 윈도우 레이아웃 , 데이터베이스 드라이버 
 *      4. 생성자를 생략할 수 있다 ==> 자동으로 컴파일러가 한개 생성을 해준다 
 *         *** 필요시에만 만든다 
 *         
 *         
 *      class ClassName
 *      {
 *         제어문 , 연산자는 사용 할 수 없다 
 *         변수의 값을 다시 설정하면 오류 발생 
 *         -----------------
 *           선언만 가능하다 (구현이 불가능하다) 
 *         -----------------
 *      }
 *      
 *      class A
 *        => A() ==> 컴파일러에 의해서 자동 추가 (디폴트 생성자)
 *           A(int a)
 *           A(int a, int b)
 *           A(String name)
 *           void A(String name,String name) ==> 일반 인스턴스 메소드 
 */
public class 생성자_1 {
    생성자_1() {
		System.out.println("생성자 Call...");
		// 생성자는 호출시에 반드시  new 생성자()
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //생성자_1 a=new 생성자_1();
        new 생성자_1();
	}
	//
}