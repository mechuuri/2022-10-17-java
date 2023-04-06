package com.sist.string;
/*
 * String 클래스 (웹=> 데이터형이 문자열만 존재한다)
 * 1) 문자열을 저장하는 데이터형/ 클래스형
 * 2) Object로부터 상속을 받은 클래스
 * 3) String 클래스는 final 클래스 ==> 변경이 불가능한 클래스 (있는 그대로 라이브러리를 사용해야된다)
 */
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// charAt : public char charAt(int index) : 지정된 위치의 문자를 읽어 올 때 사용 (웹에서 사용빈도는 거의 없다)
		/*String s="Hello Java";
		//		  0123456789
		char c=s.charAt(4);
		System.out.println("c="+c);*/
		
		// length() : public int length() => 문자의 갯수를 읽어 온다 (영문, 한글 동일)
		// length() ==> 화면 UI일 때 글자 수 확인, 비밀번호 검사 
		/*String e="ABC";
		String h="홍길동";
		System.out.println("e의 글자수:"+e.length());
		System.out.println("h의 글자수:"+h.length());*/
		
		String s="Hello Java";
		// public String toUpperCase()
		// public String toLowerCase()
		System.out.println("대문자변환:"+s.toUpperCase());
		System.out.println("소문자변환:"+s.toLowerCase());
		// 문자열에 저장된 데이터는 변경이 안된다
		System.out.println("원본:"+s);
				  
	}

}
