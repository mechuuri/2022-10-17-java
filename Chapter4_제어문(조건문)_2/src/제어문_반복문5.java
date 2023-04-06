import java.util.Scanner;
public class 제어문_반복문5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for(;;)
		{
			System.out.print("1. 메모장, 2. 그림판, 3. 브라우저, 4. 종료:");
			int no=scan.nextInt();
			
			if(no<1 || no>4)// ||나오면 경고 줄 때
			{
				System.out.println("메뉴 선택이 잘못되었습니다!!");
				continue;// 다시 처음으로 
			
			}
			switch(no)
			{
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("프로그램을 종료합니다");
				System.exit(0);// 0번 : 정상 종료, -1번 : 비정상 종료
			}
		}
	}

}
