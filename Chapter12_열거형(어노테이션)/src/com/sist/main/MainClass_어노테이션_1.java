package com.sist.main;
import java.lang.reflect.Method;
import java.util.*;
class Board{
	public void write()// 사용자가 데이터를 넘길 때 writ.do => 글쓰기 
	{
		System.out.println("글쓰기 처리");
	}
	public void list() // list.do
	{
		System.out.println("게시물 목록 출력...");
	}
	public void update() // update.do
	{
		System.out.println("게시물 수정하기");
	}
	public void delete() // delete.do
	{
		System.out.println("게시물 삭제...");
	}
	public void find() // find.do
	{
		System.out.println("게시물 찾기...");
	}
	public void detail() // detail.do
	{
		System.out.println("상세보기");
	}
}
public class MainClass_어노테이션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("기능 요청:");
		String cmd=scan.next();
		
		try
		{
			// 라이브러리에 있음
			Class clsName=Class.forName("com.sist.main.Board2");
			// 클래스 정보 읽기
			// 메모리 할당
			Object obj=clsName.getDeclaredConstructor().newInstance();
			// 클래스 안에 선언된 모든 메소드 읽기
			Method[] methods=clsName.getDeclaredMethods();
			for(Method m:methods)
			{
				RequestMapping rm=m.getAnnotation(RequestMapping.class);
				// Method 위에 있는 메소드 찾기
				if(rm.value().equals(cmd))
				{
					m.invoke(obj, null);// 메소드 호출
					// detail() ==> null 매개변수 없는 경우 호출
					break;
				}
			}
		}catch(Exception ex) {}
				
	}

}
