/*
 * 	1. switch()
 * 			 ↑ 정수/문자/문자열
 * 	2. 변수 선언
 * 		switch(no)
 * 		{
 * 			case 1:
 * 				{
 * 					int a=10;
 * 				}
 * 			break;
 * 		
 * 			case 2:
 * 			{
 * 				int a=20;
 * 			}// a는 사라진다
 * 			break;
 * 		
 * 			case 3:
 * 			{
 * 				int a=30;
 * 			}// a는 사라진다
 * 			break;
 * 		
 * 		*{ } : 어떤 위치든 설정이 가능하다
 * 
 * 
 * 
 * 		}
 * 
 * 
 * 
 * 
 */
public class 제어문_선택문주의점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=40;//main 전체에서 사용 ==> {}(블록) 안에서만 사용되는 변수 ==> 지역변수(=블록변수) : 반드시 초기화가 필요하다  {}이 끝나면 자동으로 회수 됨 
		if(true)
		{
			int a=10;
			if(true)
			{
				int b=20;
				if(true)
				{
						int c=30;
				}// c
				int c=100;
			}
		}
	}

}
