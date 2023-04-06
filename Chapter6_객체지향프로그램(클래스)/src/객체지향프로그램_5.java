/*
 * 	1. 객체(인스턴스) 생성, 저장 메모리 활용
 * 	1) 생성
 * 	ex) class Music
 * 		클래스명 변수명(인스턴스;객체);
 * 		Music music; => 선언 (null => 주소값이 없는 상태) : 실제 데이터가 저장된 메모리를 참조 (참조변수=>배열, 클래스)
 * 
 * 		music=new Music(); //생성 ==> 실제 데이터를 저장하는 메모리 확보
 * 		------------------ 선언 => 사용(변수 앞에 static. 자동저장) 
 * 		= 인스턴스 : new를 이용시마다 생성시마다 따로 저장되는 변수
 * 		--------------------------------------------- .을 이용해서 접근한다 
 * 		= static (공유변수) => 컴파일시 자동 메모리에저장 => 클래스명.변수, 클래스명.메소드()
 * 												=> 같은 클래스안에서는 클래스명을 생략할 수 있다
 * 	2) 메모리 생성하는 과정
 * 	TV t ===> 		====t====
 * 				실제 데이터가 있는 메모리 주소값 ==> null
 * 					=========
 * 
 * 	메모리 주소 설정
 * 	t=new Tv();
 * 			0x100===========
 * 				크기
 * 				===========
 * 				채널
 * 				===========
 * 				색상
 * 				===========
 *  new를 사용하면 => 메모리 저장 장소가 달라진다(바로 회수가 어렵다 => GC
 */
class Sawon{
	int sabun;
	String name;
	String dept;
	String job;
	long pay;
}
public class 객체지향프로그램_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사원이 3명
		Sawon s1=new Sawon(); //s1=>  [sabun,name,dept,jab,pay}
		s1.sabun=1;
		s1.name="홍길동";
		s1.dept="개발부";
		s1.job="대리";
		s1.pay=3800;
		
		Sawon s2=new Sawon();
		s1.sabun=2;
		s1.name="이순신";
		s1.dept="기획부";
		s1.job="대리";
		s1.pay=3500;
		Sawon s3=new Sawon();
		s1.sabun=1;
		s1.name="강감찬";
		s1.dept="인사부";
		s1.job="대리";
		s1.pay=3300;
		
	}

}
