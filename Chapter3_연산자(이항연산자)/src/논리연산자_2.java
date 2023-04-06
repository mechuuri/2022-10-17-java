/*
 *   if / for 
 *   --- (조건)
 *   
 *   1) 구구단 ================= 2차 for
 *   2) 페이지 나누기 (O) ======= 1차 for (조건문 ==> &&)
 *   
 *   난수 발생 ==> 1~100  50<
 *   알파벳  ===> K>   && 두가지를 동시에 만족 
 */
public class 논리연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=(int)(Math.random()*100)+1;
	//			0.0~0.99 ==> (0~99)+1 >> 1~100
	char b=(char)((Math.random()*26)+65);// 0~25 +65  ==> 65~90
	
	System.out.println("a="+a);
	System.out.println("b="+b);
	boolean result=a>50 || b<'K';
	System.out.println(result);
	
	
	}

}
