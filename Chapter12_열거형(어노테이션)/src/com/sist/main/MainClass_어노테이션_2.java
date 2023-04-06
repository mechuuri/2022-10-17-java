package com.sist.main;
import java.util.*;
/*
  	문서 => 정리 (소스코드안에서 정리) => 주석 (기능은 없다, 검색만하는 역할)
  	=> 많이 사용하는 곳 : 스프링 , 마이바티스, JPA
  	=> 사용자 정의는 거의 없다
  	
  	=> @Overide
  	=> @Deprecated ==> 경고 => 새로운 메소드가 있다
  	=> @SuperessWarnings => 경고를 나타나지 않게 만든다
  	=> @FunctionallInterface => 람다식 설정 
  	-----------------------------------------703
 */
class Board2{
	@RequestMapping("wirte.do")
	public void write()// 사용자가 데이터를 넘길 때 writ.do => 글쓰기 
	{
		System.out.println("글쓰기 처리");
	}
	@RequestMapping("list.do")
	public void list() // list.do
	{
		System.out.println("게시물 목록 출력...");
	}
	@RequestMapping("update.do")
	public void update() // update.do
	{
		System.out.println("게시물 수정하기");
	}
	@RequestMapping("delet.do")
	public void delete() // delete.do
	{
		System.out.println("게시물 삭제...");
	}
	@RequestMapping("find.do")
	public void find() // find.do
	{
		System.out.println("게시물 찾기...");
	}
	@RequestMapping("detail.do")
	public void detail() // detail.do
	{
		System.out.println("상세보기");
	}
}

public class MainClass_어노테이션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("기능 요청:");
		String cmd=scan.next();
		
		try
		{
			Class clsName=Class.forName("com.sist.main.Board2");
			// 클래스 정보 읽기
			// 메모리 할당
			Object obj=clsName.getDeclaredConstructor().newInstance();
			// 클래스 안에 선언된 모든 메소드 읽기
			
		}catch(Exception ex) {}
				
	}

}
