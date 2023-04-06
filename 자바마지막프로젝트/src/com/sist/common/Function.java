package com.sist.common;
/*
 	C/S => 네트워크
 	       흐름 (서버의 기능, 클라이언트 기능) ==> 웹프로그램, 오라클 프로그램 
 	            요청						------------------- 이미 서버가 만들어져있다
 	클라이언트 ==========> 서버 (요청처리, 찾기, 삭제, 수정, 추가)
 	           응답
 	클라이언트 <========== 
 	   |
 	 요청,화면 출력
 	 
 	 웹 프로그램 ==> 요청 (구분) => 파일명 ==> 요청 (파일명을 보내고 처리 결과를 받아온다)
 	 --------
 	 클라이언트 : 브라우저
 	 서버 : JSP / Spring => 톰캣, 아파치, IIS
 	 
 	 오라클 프로그램 ==> 요청(구분) => SQL 문장 (SELECT, INSERT, UPDATE, DELETE)
 	 -----------
 	 클라이언트 : 자바 응용프로그램
 	 서버 : 오라클 
 	 
 	 서버
 	 => 로그인하는 사람
 	 => 로그인 되어 있는 사람 
 	 
 	 => 방들어가기
 	   = 이미 방에 있는 사람
 	   = 방에 들어가는 사람 
 	 => 방 나가기
 	   = 방 남아 있는 사람
 	   = 방에서 나가는 사람
 	 => 종료
 	   = 남아 있는 사람 
 	   = 종료하는 사람 
 */
public class Function {
	public static final int LOGIN=100;// 로그인 기능 ==> 내부 프로토콜(프로그램에서 약속을 만들어 처리)
	//LOGIN => 이미 로그인된 사람 처리 
	public static final int MYLOG=100;// 로그인 하는 사람 처리 
	public static final int MAKEROOM=200;// 방만들기 기능
	public static final int ROOMIN=210;// 이미 방에 들어가 있는 사람 처리
	public static final int MYROOMIN=220;// 방에 들어가는 사람 처리
	public static final int ROOMOUT=230;// 남아 있는 사람 처리
	public static final int MYROOMOUT=240;// 실제로 나가는 사람 처리 
	public static final int WAITUPDATE=250;// 대기실 실시간 갱신
	public static final int WQITCHAT=300;// 대기실 채팅
	public static final int ROOMCHAT=400;// 방에서 채팅
	public static final int SENDMSG=500;// 쪽지 보내기
	public static final int INFO=600;// 정보 보기
	public static final int CHATEND=900;// 종료하기 (남아있는 사람)
	public static final int MYEND=990;// 종료하는 사람 처리
	
	
	
}
