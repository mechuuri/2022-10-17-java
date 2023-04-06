/*
 * 	java.lang => import를 생략한다
 *  ---------
 *  Object : clone / toString / equals / getClass / finalize
 *  String : substring / length / trim /split / replace / indexOf / lastindexOf / 
 *  		 valueOf / startsWith / contains / equals
 *  ------------
 *  StringBuffer
 *  Wrapper
 *  System
 *  Math
 *  ---------------- 웹
 */
public class 라이브러리_정리1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java";
		char[] c=s.toCharArray(); // 문자열 => char[] 기억해
		for(char ch:c)
			System.out.println(ch);
		
		String ss=String.valueOf(c);
		System.out.println(ss);
		
	}

}
