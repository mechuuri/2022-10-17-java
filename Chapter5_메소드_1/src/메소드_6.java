/*
 * 	리턴형 	매개변수
 * ----------------------------------------
 *	결과값			매개변수
 *----------------------------------------
 *	 O				  O		====> 1유형 ==> 로그인 : 사용자 입력(ID, PWD) ==> 결과값  boolean
 *----------------------------------------
 *	O				  X		====> 2유형
 *----------------------------------------
 *  X				  O		====> 3유형		  
 *----------------------------------------
 * X				  X		====> 빈도수 낮음
 *----------------------------------------
 *	
 *		** 메소드(행위, 동작)를 만드는 목적
 *			1) 재사용, 다른 클래스와 통신
 *				예)
 *					class Human
 *					{
 *						이름, 주민번호, 성별, 키, 몸무게, 혈액형 ==> 메소드
 *						먹는다, 걷는다, 키보드친다... ==> 변수
 *					}
 *					class 교수 extends Human 
 *					class 군인
 *					class 사원
 *					class 학생
 *				------------------> 사람 <===> 자판기
 *			2) 반복 제어
 *			3) 수정이 쉽게 구조화(단락): 가독성, 에러발생시 메소드 한개만 처리
 *
 *			경우의 수
 *			로그인 : 로그인(O), 로그인(X)
 *				    ID가 존재		0  ==> NOID
 *					Password존재  1  ==> NOPWD
 *					로그인 		2  ==> OK
 *			----------------------------------- 가독성
 *
 *
 *
 *
 */
public class 메소드_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
