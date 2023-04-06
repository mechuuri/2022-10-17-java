/*
 * i	j
 * 줄수	별표
 * 1	1
 * 2	2
 * 3	3
 * 4	4
 * 
 */
import java.util.Scanner;
public class 반복문_중첩for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int n=scan.nextInt();*/
		// 1. 변수위치
		
		for(int i=1;i<=4;i++)
		{
			char c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
					
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
