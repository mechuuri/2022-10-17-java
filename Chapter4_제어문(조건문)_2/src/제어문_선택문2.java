/* 계절확인 현재 월 넣어서 계절 확인하기~~  149p=P
 * 12 1 2 => 겨울
 * 3 4 5 => 봄
 * 6 7 8 => 여름
 * 9 10 11 => 가을
 * 
 */
import java.util.Scanner; //sc +ctrl+space
public class 제어문_선택문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("현재 월을 입력하세요?");
		
		int month=scan.nextInt();// 화면을 통해 입력받은 숫자를 month에 저장
		
		switch(month)//실수안됨 
		{
			case 3: case 4: case 5: //if(month==3 || month==4 || month==5)
				System.out.println("봄입니다");
			break;
			
			case 6: case 7: case 8:
				System.out.println("여름입니다");
			break;
			
			case 9: case 10: case 11:
				System.out.println("가을입니다");
			break;
			
			case 12: case 1: case 2:
				System.out.println("겨울입니다");
			break;
			
			default:
				System.out.println("잘못된 입력입니다!!");
			
				
		}
	}

}
