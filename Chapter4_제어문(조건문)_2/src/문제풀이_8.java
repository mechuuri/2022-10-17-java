/*
 * 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
 *
 	합을 구해서 출력하는 변수
 	=> 1. 루프변수 ==> i, j
 	   2. 누적변수 ==> sum ==> sum+i ==> 0으로 초기화 해야함 =0 (구매) ===> sum(hit)
 	   3. 플러그변수 ==> flag ==> 1111111 222 1111 222
*/
import java.util.Scanner;
public class 문제풀이_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int sum=0;
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
			
		}
		
		System.out.println("2+4+6+....100까지의 정수의 합:"+sum);
		
		
		
		
	
		
		
		
		
	}

	/*Scanner scan=new Scanner(System.in);
		//int a2=scan.nextInt();
		int sum=0;
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
				
			
		}
		
		System.out.println("2+4+...100의 합:"+sum);
		*/
		
		
	}


