/*
 * 중첩!!!!!
 * 범위가 있을 때는 if문 (출력해야될 숫자 多)
 * 하나씩 선택할 때는 switch - case
 * 
 * 	switch()
 * {
 * 		case1:
 * 			switch()
 * 		{
 * 		}
 * }
 * 
 */
// 가위바위보
import java.util.Scanner;
public class 제어문_선택문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자 입력
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2):");
		int user=scan.nextInt();// 0,1,2 중 하나 받아야됨
		// 컴퓨터 (난수)
		int com=(int)(Math.random()*3);//0~2
		
		switch(com)
		{
		case 0:
			System.out.println("컴퓨터:가위");
			break;
			
		case 1:
			System.out.println("컴퓨터:바위");
			break;
			
		case 2:
			System.out.println("컴퓨터:보");
			break;
		}
		
		switch(user)
		{
		case 0:
			System.out.println("사용자:가위");
			break;
			
		case 1:
			System.out.println("사용자:바위");
			break;
			
		case 2:
			System.out.println("사용자:보");
			break;
		}
		
		// 결과값 출력
		switch(com)
		{
		case 0:// 가위
			switch(user)
			{
			case 0:
				System.out.println("비겼다!!");
				break;
			case 1://바위
				System.out.println("사용자 win!!");
				break;
			case 2://보
				System.out.println("컴퓨터 win!!");
				break;
			}
		case 1://바위
			switch(user)
			{
			case 0://가위
				System.out.println("컴퓨터 win!!");
				break;
			case 1://바위
				System.out.println("비겼다!!");
				break;
			case 2://보
				System.out.println("사용자 win!!");
				break;
			}
		case 2://보
			switch(user)
			{
			case 0://가위
				System.out.println("컴퓨터 win!!");
				break;
			case 1://바위
				System.out.println("사용자 win!!");
				break;
			case 2://보
				System.out.println("비겼다!!");
				break;
			}
	}


