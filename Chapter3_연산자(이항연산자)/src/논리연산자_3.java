// 알파벳을 입력 받아서 대문자 / 소문자 ==> &&
import java.util.Scanner;
// Math, System ==> java.lang(생략 가능 ) => 자동 인식
public class 논리연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("알파벳 입력:");
		char c=scan.next().charAt(0);// 입력된 알파벳 1개를 가지고 온다 (Scanner의 단점 : 문자 1개를 못받음;;)
		boolean b1=c>'A' && c<='Z';// 대문자 조건
		boolean b2=c>='a' && c<='z';// 소문자 조건 
		System.out.println("b1="+b1+"=>대문자");
		System.out.println("b2="+b2+"=>소문자");
		
		// (c>='A' && c<='Z') || (c>='a' && c<='z'); ==> 알파벳 조건
		

	}

}
