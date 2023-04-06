/*
 * 	주의점
 * 	한개의 파일(java) => class를 여러개 사용 가능
 * 	** 1. 자바는 항상 => 클래스명과 저장명이 동일
 * 	class A => A.java
 * 	여러개가 있는 경우
 * 	-------------
 * 	class A
 * 	class B
 * 	** 2. 한 파일 안에서 public class는 한번 사용이 가능
 * 	** 3. 가급적이면 한 파일에 class 한 개씩 사용을 권장
 * 	** 4. 주의점 : Student => 다른 파일에서는 Student를 사용할 수 없다 (같은 폴더 상에서)
 *  */ 
class Student

{
	String name;
	int kor,eng,math;
	
}
public class 객체배열_1_사람과목3_합_평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student(); // hong(주소) ==> name(null),kor(0),eng(0),math(0)
		Student lee=new Student(); // lee(주소) ==> name,kor,eng,math
		Student park=new Student(); // park(주소) ==> name,kor,eng,math 
		//==> 객체 생성시마다 메모리가 따로 만들어지는 변수(인스턴스 변수)
		//1. 변수에 값 대입
		hong.name="홍길동"; // 초기화 된 값을 갱신
		hong.kor=90;
		hong.eng=80;
		hong.math=70;
		
		lee.name="이순신"; // 초기화 된 값을 갱신
		lee.kor=80;
		lee.eng=80;
		lee.math=90;
		
		park.name="박문수"; // 초기화 된 값을 갱신
		park.kor=88;
		park.eng=90;
		park.math=78;
		
		// 출력 / 제어...
		Student[] std= {hong,lee,park};
		for(int i=0;i<std.length;i++)
		{
			System.out.println(std[i].name+" "
					+std[i].kor+" "
					+std[i].eng+" "
					+std[i].math+" "
					+(std[i].kor+std[i].eng+std[i].math)+" "
					+(std[i].kor+std[i].eng+std[i].math)/3.0);
		}
	
	
	
	
	
	
	
	
	}

}
