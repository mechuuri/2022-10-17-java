import java.util.Arrays;
import java.util.Scanner;
/*
 * 	1. 데이터 저장 : 변수, 배열
 * 	2. 초기화 
 * 	3. 제어 (사용자 요청)
 * 	4. 제어 결과값 출력
 * 
 * 	데이터 저장 == 데이터 가공 == 출력
 */
// => O, X ==> 10개 저장(난수로) O,X가 몇개 들어있는지???왓
public class 배열_4_OX문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] munje=new char[10];
		char[] user=new char[10];
		for(int i=0;i<munje.length;i++)
		{
			System.out.println((i+1)+"번째 O,X입력:");
			int a=(int)(Math.random()*2);
			if(a==0)
				munje[i]='O';
				else
					munje[i]='X';
		}   // 초기화 주는 과정
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<user.length;i++)
		{
			System.out.print("O,X입력:");
			char dap=scan.next().charAt(0);
			if(!(dap=='O' || dap=='X')) // ||나오면 오류 처리
			{
				System.out.println("잘못된 입력입니다!!");
				i--; // 감소시키지 않으면 건너뛰어짐..ㅡㅡ 
				continue; // 증가식으로 올라간다 , 하나를 감소시켜야됨
			}
			user[i]=dap;
		}
		System.out.println(Arrays.toString(munje));
		System.out.println(Arrays.toString(user));
		
		// 확인
		int count=0;
		for(int i=0;i<user.length;i++)
		{
			if(munje[i]==user[i])
				count++;
		}
		System.out.println("정답:"+count+"개 입니다");
		
		
		
		
		
		
		
		
		
		
		
	}

}
