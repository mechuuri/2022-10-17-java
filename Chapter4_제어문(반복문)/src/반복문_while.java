/*
 * 		while (167P)
 * 		-------------- 무한루프(데이터벵스에서 많이 등장)
 * 		1) 순차적으로 실행
 * 			초기값
 * 			while(조건식) 조건이 true일 때 반복 {}, false 종료
 * 			{
 * 				반복수행문장
 * 				증가식
 * 			}
 * 			===> for(초기갑;조건식;증가식)
 * 					반복수행문장
 * 			주의점)
 * 				for(;;) ===> while(true)
 * 				while() ==> 반드시 조건문을 제시해야 함 (빈괄호 안돼)
 * 					---- 조건(비교,논리,부정), true / false
 * 
 * 
 */
public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A-Z, Z-A
		char c='A';
		while(c<='Z')
		{
			System.out.print(c+" ");//무한루프
			c++;//하나씩 증가
			
		}
		System.out.println();
		c='Z'; // 현재 c의값이 z에서 +1이 된 상태이기 때문에 z로 다시 초기화 시켜줌
		while(c>='A')
			{
					System.out.print((char)(c+32)+" ");//소문자 변환 +32, 대문자로 변환 -32 char+int = int
					c--; //'A'=> 65  'a'=> 97
			}
		System.out.println();
		int i=1;
		while(i<=100)
		{
			i++;
		}
		
		System.out.println("i:"+i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
