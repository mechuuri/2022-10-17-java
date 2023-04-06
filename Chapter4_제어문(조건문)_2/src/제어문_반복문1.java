/*
 * 	[반복문] : 같은 형태가 여러개인 경우에 사용하는 제어문   
 * 			= for : 반복 횟수가 지정되어 있으면
 * 				
 * 					1	  2
 * 				for(초기값;조건식;증감식) ==> 화면 UI 프엔
 * 				{
 * 					반복 수행 문장
 * 				}
 * 			= while : 반복 횟수가 없는 경우 (데이터베이스) 백엔
 * 				
 * 				초기값 
 * 				int a=10;---------1
 * 				while(a<10)---2
 * 				{
 * 					수행문장
 * 					증감식
 * 				}
 * 			---------------------------------ㄴ 수행을 안할 수 있다 
 * 			= do~while : 한번 이상을 반드시 수행 
 * 				초기값 --->1
 * 				do
 * 				{
 * 					실행문장 -->2
 * 					증가식 -->3
 * 
 * 				}while(조건식);
 * 
 * 				조건 검색 ==> 선 조건, 후 조건
 * 
 * 		for문 (156P.)
 * 		for => 일반 for
 * 				forEach(웹에서 사용) => map, foreach, for of, for in
 * 				---------------- 배열 / 컬렉션
 * 
 * 		for             false => for문 종료
 * 		1)형식   	  1  → 2  ←  4
 * 			for(초기값;조건식;증감식)
 *                     ↓       ↗  
 *                  3반복수행문장 
 * 
 * 			1부터 10번 수행
 * 			
 * 			for(int i=1;i<=10;i++) // 10이 될때까지 1씩 증가 
 * 			{
 * 				반복문장
 * 			}
 * 
 * 			100번 수행
 * 			for(int i=0;i<=100;i++) //i 0부터 100까지
 * 
 * 			A~Z
 * 			for(char c='A';c<='Z';c++)
 * 
 * 			**무한 루프 for(;;)
 * 			
 * 			
 * 			*foreach 구문
 * 			int[] arr={1,2,3,4,5,6,7}
 * 			for (int a:arr)
 * 		2)동작 순서
 * 
 */
//2~9까지 정수 입력을 받아서 해당 단을 출력하는 프로그램
public class 제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan=(int)(Math.random()*8)+2;//2~9
		System.out.println(dan+"단");
		
		
		for(int i=1;i<=9;i++)// i++, i+=2, i+=3...
		{
			System.out.printf("%2d*%2d=%2d\n",dan,i,dan*1);
			
		}
		}
	
	}


