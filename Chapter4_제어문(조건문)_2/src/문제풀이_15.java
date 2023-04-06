//15)	Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
//십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라

import java.util.Scanner;
public class 문제풀이_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("2자리수 정수 입력(10~99) >> ");
		int num=scan.nextInt();
		//int a=num/10; 앞 자리 자르기
		//int b=num%10; 뒷 자리 자르기 
		//if(a==b)
		
		if(num%11==0)// 같은 수 
			System.out.println("10의 자리와 1의 자리가 같습니다");
		
		else
			System.out.println("10의 자리와 1의 자리가 같지 않습니다");
			
	}

}
