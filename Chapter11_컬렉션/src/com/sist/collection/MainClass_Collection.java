package com.sist.collection;

import java.util.*;
public class MainClass_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();// 지정하지 않는다 (크기) ==> 가변형(18만개)
		// 저장
		
		list.add("홍길동");// 인덱스가 0번
		list.add("심청이");// 1
		list.add("이순신");// 2
		list.add("강감찬");// 3
		list.add(2,"을지문적");// 2번에 자리에 넣어주삼 => 인덱스번호가 2번(자동으로 변경)
		// 항상 순차를 유지함 => for문 사용이 편함  속도가 느려짐 
		System.out.println("저장된 인원수:"+list.size());
		// 출력  size() ==> 저장된 개수 ==> 배열에선 length
		System.out.println("======= 컬렉션에 추가 =======");
		for(int i=0;i<list.size();i++)
		{
			//String name=(String)list.get(i);// 데이터 읽기 0번~size전까지 오류 : Object로 바꿀건지, 형변환 할건지
			String name=list.get(i).toString();// Object
			//			----------- Object
			System.out.println(i+"=>"+name);
		}
		System.out.println("======= 컬렉션 수정 set() =======");
		// 인덱스 2번 수정 set(2,"수정데이터")
		list.set(2, "박문수");// 을지문덕 => 박문수
		for(int i=0;i<list.size();i++)
		{
			//String name=(String)list.get(i);// 데이터 읽기 0번~size전까지 오류 : Object로 바꿀건지, 형변환 할건지
			String name=list.get(i).toString();// Object
			//			----------- Object
			System.out.println(i+"=>"+name);
		}
		System.out.println("======= 컬렉션 삭제 remove() =======");
		// remove(int index)
		// 3번 => 퇴사(삭제)
		list.remove(3);
		System.out.println("저장될 인원수:"+list.size());
		for(int i=0;i<list.size();i++)
		{
			//String name=(String)list.get(i);// 데이터 읽기 0번~size전까지 오류 : Object로 바꿀건지, 형변환 할건지
			String name=list.get(i).toString();// Object
			//			----------- Object
			System.out.println(i+"=>"+name);
		}
		
		System.out.println("======= 전체 삭제 clear() =======");
		list.clear();
		System.out.println("저장된 인원수:"+list.size());
		if(list.isEmpty())// 데이터가 없니?
		{
			System.out.println("저장된 데이터가 없습니다요~");
		}
		/*
		 * 	1. add(Object o) ==> Object(데이터형은 모든것을 사용할 수 있다) ==> 클래스형을 저장
		 * 	2. set(int index, Object o)
		 * 	3. remove(int index)
		 * 	4. int size()
		 * 	5. boolean isEmpty()
		 * 	6. Object get(int index)
		 * 
		 * 	==> [] => List ==> asList()
		 */
		
	}

}
