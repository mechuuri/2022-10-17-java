/*
 * 	if / for	
 * 
 * 	난수 발생 ==> 1~100 50<
 * 	알파벳 ===> K>		&& 두가지 동시에 만족
 * 
 * 
 * 
 */
public class 논리연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		//			0.0~0.99 ==> 0.0~99.0 ==> 0~100
		char b=(char)((Math.random()*26)+65);// 0~25 + 65 ===> 65~90 알파벳의 시작이 a(65) 소문자로 바꿀라면  +97
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		boolean result=a>50 || b<'K';
		System.out.println(result);
		// 조건 검색 
		
		
	}

}
