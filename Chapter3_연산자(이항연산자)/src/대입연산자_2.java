/*
 * 		정수 1개 입력 받아서 +5 값을 저장 후 출력
 */
import java.util.Scanner;
public class 대입연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		//num=num+5;
		num+=5;
		System.out.println("num="+num);
		// num=15 ==> -5 값을 저장 후 출력
		//num=num-5;
		num-=5;
		System.out.println("num="+num);
		// num=10 ==> *5 값을 저장 후 출력
		num*=5;
		System.out.println("num="+num);
		// num=50 ==> /5 값을 저장 후 출력
		num/=5;
		System.out.println("num="+num);
		// num=10 ==> &5 값을 저장 후 출력
		//num=num&5;
		num&=5;
		System.out.println("num="+num);
		
		// num=0 ==> |5 값을 저장 후 출력
		num|=5;
		System.out.println("num="+num);
		
		// num=5 ==> ^5 값을 저장 후 출력
		num^=5;
		System.out.println("num="+num);
		
		// num=0 ==> <<5 이동
		num<<=5;
		System.out.println("num="+num);
		
		// num=0 ==> >>5 이동
		num>>=5;
		System.out.println("num="+num);
		
		// = , +=(누적, 데이터 수집)
		
		
		
		
		
	}

}
