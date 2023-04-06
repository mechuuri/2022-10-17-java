/*
 * 	문자열 관련 데이터형 (자바) ==> "", char ''
 * 	--------------
 * 		String
 * 		------ 문자열을 저장하는 기능, 문자열 제어하는 기능 (라이브러리)
 * 	1) 저장 방법
 * 		String s=""; 일반 변수처럼 쓰는 방법 ->기본형 (가장 많이 사용됨) 웹의 90% 모든 데이터가 문자열 
 * 		String id="admin" => char c={'a','d','m','i','n'}
 * 		------ char[]을 사용하기 쉽게 만든 클래스
 * 		String s=new String("");
 * 	2) String 기능 (메소드)
 * 	  -----------
 * 		1. 문자 변환
 * 			1) toUpperCase : 대문자 변환
 * 			2) toLowerCase : 소문자 변환
 * 			****3) valueOf : 모든 데이터형을 문자열로 변경 (외워)
 * 					int a=10;
 * 					valueOf(a) ===> "10" ==> parseInt("10") ==> 10
 * 					boolean b=true
 * 					valueOf(b) ==> "true" ==> parseBoolean("true") ==> true
 * 		2. 문자 제어
 * 			1) substring() : 문자열 자를 때 사용 (개 중요) 화면 UI에서 사용
 * 		3. 문자 변경
 * 			1) trim() ==> 좌우 공백을 제거할 때  (사용자 입력할 때)
 * 			2) replace() ==> 글자 변경 ==> 오라클(크롭링) ==> 이미지
 * 			3) replaceAll() ==> 정규식 (문자형식)
 * 				ip
 *				replaceAll("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.")
 * 			4) split() : 문자열을 배열로 변경
				String s="red,blue,green";
				String[] arr=s.split(",") ==> {"red","blue","green"}
 * 		4. 문자 비교
 * 			*1) equals() : 대소문자 구분 후 비교
 * 			*2) contains() : 포함(검색)
 * 			3) startsWith : 서제스트 (시작단어)
 * 			4) endsWith : 끝나는 단어
 * 			   --------------------------- 검색기
 * 		5. 문자 찾기
 * 			*1) indexOf : 앞에 있는 데이터 찾기
 * 			   String s="Hello Java"
 * 					s.indexOf("a");
 * 			2) lastIndexOf : 뒤에서 데이터 찾기
 * 
 *  	6. 기타기타기타
 *  		concat("a","b") ==> ab ==> +역할
 *  		*charAt() ==> 문자 한개를 가지고 올 떄
 *  		toCharArray() => 문자열을 char[]로 변경
 */
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 변수(문자열) 선언
		//String msg="Hello Java";
		String msg;
		//char[] ===> 
		/*
		 * 	"Hello Java" ==> {'H','e','l','l'...}
		 * 	 01234 5678
		 * 
		 * 	charAt(0) ==> 'H' 인덱스 번호
		 */
		//2. 초기화
		msg="Hello Java"; //입력값 받아올 때, 파일 읽어올 때 (선언하고 나중에 초기화)
		 //  0123456789
		//3. 활용(요청처리)
		//	1) 문자의 갯수 확인 (length()) ==> 문자의 총 갯수 가져올 때
		System.out.println(msg.length()); //공백도 문자로 취급 // 비밀번호 자리수
		// 	2) 공백을 제거
		System.out.println(msg.trim().length()); // 입력값을 사용자가 등록을 할 때 (실수=> space)
		// 	좌우에 있는 공백만 제거가 가능
		//	3) 대문자 변환
		System.out.println(msg.toUpperCase()); //검색할 때
		//	4) 소문자 변환
		System.out.println(msg.toLowerCase()); //검색할 때
		// ==> 한글 검색 (자음->찾기) => 메소드
		// 	5) 자르기 substring()
		/*
		 *	substring(int start) => 지정된 위치부터
		 *	substring(int start,int end) =>  
		 */
		System.out.println(msg.substring(6));
		System.out.println(msg.substring(0,5)); // end는 제외. 하나가 더 커야됨
		String post="101-123";
		System.out.println(post.substring(0,3));
		System.out.println(post.substring(4));
		String fileName="문자열_1.java";
		System.out.println(fileName.substring(6));
		// 파일명 ==> 문자열.1.java
		System.out.println(fileName.substring(fileName.lastIndexOf(".")+1));
		System.out.println(msg.indexOf("a"));
		System.out.println(msg.lastIndexOf("a")); //맨 마지막에 있는 a찾음
		//4. 출력
		/*
		 * 	라이브러리 공부할 때
		 * 	1. 메소드명 (기능)
		 * 	2. 매개변수
		 * 	3. 리턴형 
		 */
	
	}

}
