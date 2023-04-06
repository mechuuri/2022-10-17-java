package com.sist.collection;
// 정수 저장
import java.util.*; // ArrayList가 들어있음
public class MainClass_ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();// 저장공간 생성
		list.add(7);// 0
		list.add(4);// 1
		list.add(3);// 2
		list.add(6);// 3
		list.add(2);// 4
		list.add(5);// 5
		list.add(1);// 6 ==> index번호는 add하는 순서로 지정된다
		for(Object i:list)// for-each구문에서 데이터형을 일치시켜야 됨 넘겨줄 때 string이면 String으로
		{
			System.out.println(i);
		}
		System.out.println("======= 정렬 =======");
		Collections.sort(list);
		for(Object i:list)// for-each구문에서 데이터형을 일치시켜야 됨 넘겨줄 때 string이면 String으로
		{
			System.out.println(i);
		}
		System.out.println("======= Copy =======");
		
		ArrayList list2=new ArrayList(list.subList(1, 5));// 1번부터 5개
		// 배열 ==> copy ==> arrycopy(): 원하는 위치만 카피, clone(): 전체 카피
		for(Object i:list2)// for-each구문에서 데이터형을 일치시켜야 됨 넘겨줄 때 string이면 String으로
		{
			System.out.println(i);
		}
		// 원하는 부분만 copy ==> subList ==> 페이지 나누기 
		// CURD => Create(add) Update(set) Read(get) Delete(remove)
	}

}
