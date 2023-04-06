import java.util.Scanner;

/*
 * 	char 비교 : char는 정수형으로 변경 후 비교
 * 
 * 	'A' <'B'
 * 	65	 66
 * 
 * 	1 > '0' => false
 * 		 48  ==> 1>48 ==>
 * 	모든 문자마다 번호(아스키 코드)
 * 
 * 	c언어 : 변수 선언 시 먼저 
 * 	자바 : 원하는 위치에서 변수 선언이 가능 
 * 
 * 
 * 
 * 
 * 
 */
public class 비교연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='A';
		char b='a';
		
		System.out.printf("%c == %c : %b\n", a,b,a==b);
		System.out.printf("%c == %c : %b\n", a,b,a+32==b);
		// 대소문자의 차이 ==> 32
		System.out.printf("%c != %c : %b\n", a,b,a!=b);
		// %b ==> boolean 출력 
		/*
		 * %d : 대입하는 데이터는 정수이어야 함
		 * %c : 대입하는 데이터는 문자이어야 함 ('')
		 * %f : 대입하는 데이터는 실수이어야 함
		 * %s : 대입하는 데이터가 문자열이어야 함 ("")
		 * %b : boolean (true / false)
		 * 
		 */
		int c=98;
		System.out.printf("%d == %c : %b\n", c,b,c==b); //char는 모든 연산이 있는 경우 항상 정수로 변경이 됨
		// ==, != (boolean) true, false
		
		boolean b1=true;
		boolean b2=false;
		
		System.out.printf("%b == %b : %b\n",b1,b2,b1==b2);
		System.out.printf("%b != %b : %b\n",b1,b2,b1!=b2);
		// 소스 코딩시마다 컴파일한다
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int k=scan.nextInt();
		System.out.println((k%2==0)?"짝수":"홀수"); //  삼항연산자 
			
	}

}
