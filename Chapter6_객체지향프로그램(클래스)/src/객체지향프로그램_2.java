/*
 * 배고파배고파배고파배고파
 * 
 */
// 클래스를 메모리에 저장하는 방법 ==> 저장된 데이터를 읽는 방법
// 학생과 관련된 데이터 모아서 저장 ==> 1명에 대한 정보를 설계한다 ==> 저장시 new 이용하면 여러명의 학생 정보 저장이 가능
// 클래스는 사용자가 직접 만들어서 처리(크기도 결정)
class Student{ // 한명에 대한 정보(다른 데이터형도 한번에 선언 가능)
	int hakbun;
	String name;
	String sex;
	int age;
	int kor,eng,math;
}
public class 객체지향프로그램_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 선언 후 저장
		Student hong=new Student(); // new를 쓰는 이유 : 같은 데이터를 따로따로 저장하기 위해
		System.out.println("hong="+hong); 
		// 초기값
		hong.hakbun=1; //  변수 => 필요시에는 언제든지 변경이 가능
		// . 연산자 (메몰지 주소 접근
		hong.name="홍길동";
		hong.sex="남자";
		hong.age=25;
		hong.kor=90;
		hong.eng=80;
		hong.math=70;
		Student lee=new Student();
		System.out.println("lee="+lee);
		lee.hakbun=2; //  변수 => 필요시에는 언제든지 변경이 가능
		lee.name="이순신";
		lee.sex="남자";
		lee.age=25;
		lee.kor=90;
		lee.eng=80;
		lee.math=70;
		Student kang=new Student();
		System.out.println("kang="+kang);
		kang.hakbun=3; //  변수 => 필요시에는 언제든지 변경이 가능
		kang.name="강감찬";
		kang.sex="남자";
		kang.age=25;
		kang.kor=90;
		kang.eng=80;
		kang.math=70;
		System.out.println("이름:"+hong.name); // 메모리 주소에서 가져옴. 
		// 객체명, 변수명 => 저장/ 읽기
		// 변수 => 쓰기, 읽기
		System.out.println("이름:"+lee.name);
		System.out.println("이름:"+kang.name);
	}

}
