/*1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
 * 
 */



import java.util.Scanner;
public class 문제풀이_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{System.out.printf("%5d",i);
			
				if(i%3==0)
				System.out.println();
			}
		}
		
		
		
		
		
		
		
		
		/*for(int i=1;i<=30;i++) // 3개 출력하고 밑으로 내림
		{
			if(i%2==0)
			{
				System.out.printf("%5d",i);//5씩 띄어서 출력하고 다음에
				if(i%3==0)// 3으로 나눈값의 나머지가 0이면 
					System.out.println();//한칸을 띄어라 
			}
		}*/
	}

}
