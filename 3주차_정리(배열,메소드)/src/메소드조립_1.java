import java.util.Arrays;
import java.util.Scanner;
// 구조화된 프로그램
// 기능별 나눠서 작업 ==> 리턴형 / 매개변수
import javax.swing.plaf.synth.SynthSeparatorUI;
public class 메소드조립_1 {
	// 메소드는 선언=> 구현 클래스{}안에서만 사용이 가능
	// 중복없는 난수 발생
	static int[] rand()
	{
		int[] com=new int[3];
		for(int i=0;i<3;i++)
		{
			com[i]=(int)(Math.random()*9)+1;// 1~9 사이의 난수 발생 => 중복 없이
			for(int j=0;j<i;j++)// 첫번 째 난수는 제외 j<i
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
				
		}
		return com;
	}
	// 사용자 입력
	static int[] userInput()
	{	int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true) // 무한루프 => 횟수가 지정이 안됨
		{
			// 2. 사용자 입력을 유도
			System.out.print("세자리 정수 입력:");
			// 입력한 정수값을 받는다
			int input=scan.nextInt();
			
			// 오류처리 ==> 1. 세자리 정수를 입력하지 않은 경우
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다..");
				continue; // while 처음으로 다시 돌아가게
			}
			// 비교하기 위해서 배열에 저장
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			// 같은 정수가 입력되면 안됨 => 오류 처리
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("같은 수는 사용할 수 없습니다!");
				continue;
			}
			// 0 입력 여부 확인 => 오류 처리
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용할 수 없습니다!");
				continue;
			}
			break;// 정상적으로 입력이 된 경우 종료
		}
		return user;
	}
	// 비교
	static int compare(int[] com,int[] user)
	{
		
		int s=0,b=0;
		for(int i=0;i<3;i++)// com=0, user=0,1,2 / com=1, user=0,1,2...
		{
			for(int j=0;j<3;j++)// user
			{
				if(com[i]==user[j])// 9번 검색 => 같은 수가 있다면
				{
					if(i==j)// 같은 자리에 존재
						s++;
						else// 다른 자리에 존재
							b++;
				}
			}
		}
		hint(user,s,b);
		return s;
	}
	// 힌트
	static void hint(int[] user, int s, int b)
	{
		System.out.printf("Input Number:%d%d%d,Result:%dS-%dB\n",user[0],user[1],user[2],s,b);
	}
	static boolean isEnd(int s)
	{
		if(s==3)
			return true;
		return false;
	}
	// 종료여부 확인

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=rand();
		System.out.println(Arrays.toString(com));
		while(true)
		{
			int[] user=userInput();
			int s=compare(com,user);
			if(isEnd(s))
			{
				System.out.println("Game Over!");
				break;
			}
		}
		int[] user=userInput();
		//System.out.println(Arrays.toString(user));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
