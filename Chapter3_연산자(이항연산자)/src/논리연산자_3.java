// 	알파벳을 입력을 받아서 대문자 / 소문자  ==> && (범위 안에 포함)
import java.util.Scanner; // 외부에 있는 클래스를 읽어올 때 사용 
// Math, System ==> java.lang(생략이 가능) ==> 자동 인식
public class 논리연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); // 키보드로 입력한 값을 저장했다가 엔터를 쳤을 때 메모리에 저장
		System.out.printf("알파벳 입력:");
		
		char c=scan.next().charAt(0);// 입력된 알파벳 1개 가지고 온다( Scanner의 단점 : 문자 1개를 못 받는다)
		
		boolean b1=c>='A' && c<='Z';// 대문자 조건
		boolean b2=c>='a' && c<='z';// 소문자 조건
		
		System.out.println("b1="+b1+"=>대문자");
		System.out.println("b2="+b2+"=>소문자");
		
		//알파벳인지 아닌지 확인 조건 (c>='A' && c<='Z') || (c>='a' && c<='z')
		
		
		
		
	}

}
