/*
 * 	자바에서 지원하는 제어문
 * 	1) 조건문
 * 		if(조건)
 * 		{
 * 			조건이 true일 때 실행하는 문장 ==> 단일 조건문 (false일 때는 if를 건너 뛰는 문장)
 * 		}
 * 		==> 검색, 로그인, 아이디중복, 우편번호 검색, 상세보기 
 * 
 * 		if(조건)
 * 		{
 * 			조건이 true일 때 처리
 * 
 * 		}
 * 		else
 * 		{
 * 			조건이 false일 때 처리
 * 		}
 * 		==> 선택 조건문 (한 줄 변경 ==> 삼항연산자)
 * 		==> 예약일 / 예약일이 아닌
 * 		==> 로그인 상태, 쿠키 저장, 확인(입력)
 * 
 * 		if(조건)
 * 		{
 * 			조건이 true면 수행 문장 =====> 문장을 수행하고 종료
 * 			조건이 false면 다음 조건으로 이동
 * 		}
 * 		else if(조건)
 * 		{
 * 			조건이 true면 수행 문장 =====> 문장을 수행하고 종료
 * 			조건이 false면 다음 조건으로 이동
 * 		}
 * 		else if(조건)
 * 		{
 * 			조건이 true면 수행 문장 =====> 문장을 수행하고 종료
 * 			조건이 false면 다음 조건으로 이동
 * 		}
 * 		else
 * 		{
 * 			해당 조건이 없는 경우 무조건 수행하는 문장 
 * 		}
 * 		==> 메뉴 처리, 권한 부여, 별점 ...
 * 	--------------------------------------------------
 * 	***** 조건(true/false) => 부정연산자, 논리연산자, 비교연산자, equals
 * 
 * 
 * 		}
 * 		else
 * 		{	
 * 		}
 * 	2) 선택문
 * 	3) 반복문
 * 	4) 반복제어문	
 */
// 경우의 수 ==> 1(if), 2(if~else), 3(다중 조건문)
//=> 로그인 처리
//=> 로그인 처리 ==> id 체크, pwd 체ㅏ크
import java.util.Scanner;
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String ID="Admin";
		final String PWD="1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ID를 입력하세요");
		String id=scan.next();
		
		System.out.println("비밀번호를 입력하세요");
		String pwd=scan.next();
		/*
		 * 	equalsIgnoreCase : 대소문자 구분이 없다
		 * 	equals : 대소문자 구분 
		 */
		
		//로그인
		/*if(id.equalsIgnoreCase(ID) && pwd.equals(PWD))
		{
			System.out.println("로그인 되었습니다.");
			System.out.println("메인페이지로 이동");
		}
		else
		{
			System.out.println("로그인 실패입니다");
			System.out.println("로그인 || 회원가입으로 이동");
		}*/
		//중첩 조건문
		if(id.equals(ID))
		{
			if(pwd.equals(PWD))
			{
				System.out.println("로그인 되었습니다!!");
			}
			else
			{
				System.out.println("비밀번호가 틀립니다!!");
			}
		}
		else
		{
			System.out.println("ID가 존재하지 않습니다!!");
		}
		
		
		
		

	}

}
