/*
 * 231page
 * 
 * 	클래스와 객체 (메모리에 저장된 상태)
 * 	--- 설계 (데이터 + 메소드)
 * 
 * 		  new (메모리 저장) => 인스턴스화
 * 	클래스 ==============> 객체 (인스턴스)
 * 	클래스명 객체명=new 생성자()
 * 	-----  
 * 	메모리 크기(프로그램에 필요한 데이터를 모아서 관리)
 * 	
 * 	실제로 존재하는 데이터의 모음(현실, 비현실) ==> 관련된 데이터나 기능을 모아서 관리(클래스)
 * 	*** 클래스는 객체를 정의, 객체를 생성
 * 	*** 실제 동작 : 객체
 * 	객체 : 여러개 관련된 데이터를 모아서 메모리에 저장 (데이터형이 다르다)
 * 	--- 구성요소
 * 		멤버변수(메뉴출력), 특성, 필드, 속성, 전역변수
 * 		메소드, 함수, 동작, 행위 ... 필요한 부분만 출력하는게 목록 
 * 		
 * 		class에 사용할 수 있는 변수
 * 		----------------------
 * 		1. 일반 변수 (기본형)
 * 		2. 클래스 (String)
 * 		3. 배열 
 * 
 */
class FoodHouse{
	// 자동 초기화
	int fno; 
	String title; // 멤버변수 : 클래스와 클래스 사이에 선언 됨. 프로그램 종료까지 사라지지 않는 변수
	double score;
	String address;
	String tel;
	String type;
	String price;
	String time;
	String[] menu; // 유사한 데이터가 여러개 있으면 선언 시 배열로 선언. null값 초기화
}

public class 객체지향프로그램_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 메모리 생성
		FoodHouse food1=new FoodHouse();
		// 메모리에 저장을 하기 위해서는 값을 대입 ==> 클래스는 자동 초기화
		// 파일에 읽어서 대입, 데이터베이스로부터 대입
		food1.fno=1;
		food1.title="상진식감";
		food1.score=4.8;
		
		FoodHouse food2=new FoodHouse();
		food2.fno=2;
		food2.title="전통맛집";
		food2.score=4.4;
		
		
		// 2. 메모리에 값을 추가
		// 3. 메모리에 추가된 값을 읽어온다
		System.out.println(food1.fno);
		System.out.println(food1.title);
		System.out.println(food1.score);
		System.out.println("========================");
		System.out.println(food2.fno);
		System.out.println(food2.title);
		System.out.println(food2.score);
	}

}
