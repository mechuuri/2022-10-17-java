package com.sist.collection;
/*
 * 
 */
import java.util.*;
public class MainClass_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		System.out.println("==== 수정 ====");
		list.set(1, 20);
		System.out.println(list);
		System.out.println("==== 삭제 ====");
		list.remove(3);
		System.out.println(list);
		System.out.println("==== 전체삭제 ====");
		list.clear();
		if(list.isEmpty())
			System.out.println("데이터가 없습니다");
		
	}

}
