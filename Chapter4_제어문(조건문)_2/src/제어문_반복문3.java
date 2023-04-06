//updown게임
//난수 
//숫자를 입력했을 때 난수보다 작으면 값을 더 높이기 >> 값 맞추기 

import java.util.Scanner;

public class 제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int com=(int)(Math.random()*100)+1;
		
		for(;;)//마칠때까지 계속 for문 돌려라 (무한루프)
		{
			System.out.println("1~100까지 정수를 입력:");
			int user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("잘못된 입력이다");
				// 처음부터 다시 실행해라
				continue;// 증가식으로 돌아간다 
			}
		
			
			if(com>user)
			{
				System.out.println("입력값보다 큰 수를 입력하세요");
			}
			else if(com<user)
			{
				System.out.println("입력값보다 작은 수를 입력하세요");
			}
			else
			{
				System.out.println("Game Over!!");
				System.exit(0);
			}
			
			
			
		}
	}
}


