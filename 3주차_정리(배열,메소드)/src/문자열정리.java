import java.util.Arrays;

/*
 * 	문자열을 저장하는 데이터형
 * 	------------------ ''(char), ""(String)
 * 						ㄴ문자 1개		ㄴ문자 여러개 동시에 저장 (char[]=> 쉽게 다루기 위해서 클래스)
 * 						int => Integer, double => Double, boolean => Boolean
 * 						데이터형마다 클래스로 제작 (Wrapper)
 * 						char[] => String
 * 	=> String : 참조변수 (실제 저장된 데이터의 주소값)
 * 	  --------
 * 		1) 일반 데이터형처럼 사용
 * 			String s="" (가장 많이 사용되는 형식)
 * 			  |    |  |
 * 			데이터형 변수명 값
 * 		2) 클래스형처럼 사용
 * 			String s=new String(""); // 새로운 메모리를 만들어서 사용 (new =>메모리가 다른 메모리를 생성)
 * 		3) 클래스 ==> 기능(메소드저장)
 * 			=> 변환
 * 				1) toUppterCase() ===> 문자열을 대문자로 변환
 * 				2) toLowerCase() ===> 문자열을 소문자로 변환
 * 			*	3) replace() ===> 지정된 문자(문자열)를 변경
 * 			*	4) replaceAll() ===> 정규식을 이용해서 변경
 * 									  ㄴ 문자열의 패턴 (추천이나 크롤링할 때) 문자인식이 안되다 보니까 패턴으로 만들어서 처리
 * 									 	맛있고, 맛있는, 맛있대...
 * 										-------------------- 맛있+(뒤에 글자가 한글자 있는..) 
 * 			=> 제어
 * 			*	1) trim() : 좌우에 있는 공백 제거 (사용자 입력)
 * 			*	2) substring90 : 문자열 자를 경우에 주로 사용 (...)
 * 				3) concat() : 문자열 결합 (+ 사용하기 때문에 많이 사용하진 않음)
 * 			=> 검색
 * 			*	1) startsWith() : 접두어 (시작하는 문자열) ==> 웹(쿠키사용.최신방문)
 * 				2) endsWith() : 접미어 (끝나는 문자열)
 * 			*	3) contains() : 포함 문자열을 찾을 때 (자바스크립트) ==> SearchBar
 * 			*	4) equals() : 같은 문자열 여부 (영문일 경우 대소문자 구분) ==> 찾기(id,pwd)
 * 			=> 기타
 * 			*	1) valueOf() : 모든 데이터형을 문자열로 변환할 때
 * 			*	2) toString() : 문자열 변환
 * 			*	3) length() : 문자열 갯수
 */
public class 문자열정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 문자열 선언
		String name="홍길동입니다";
		System.out.println("name:"+name);
		System.out.println("문자의 갯수:"+name.length());
		char[] arr=name.toCharArray(); // char로 변환
		String temp=String.valueOf(arr); // char[] => String으로 변경. valueOf 모든 내용을 String 문자열로 변경하는
		System.out.println(temp);
		System.out.println(Arrays.toString(arr));
		if(name.contains("홍")) // 포함 시 true
		{
			System.out.println("포함하고 있다");
		}
		else
		{
			System.out.println("포함하지 않는다");
		}
		System.out.println("=============================");
		if(name.startsWith("홍")) // 포함 시 true
		{
			System.out.println("시작하는 문자열입니다");
		}
		else
		{
			System.out.println("시작하는 문자열이 아닙니다");
		}
		System.out.println("============================");
		if(name.endsWith("홍")) // 포함 시 true
		{
			System.out.println("끝나는 문자열입니다");
		}
		else
		{
			System.out.println("끝나는 문자열이 아닙니다");
		}
	}

}
