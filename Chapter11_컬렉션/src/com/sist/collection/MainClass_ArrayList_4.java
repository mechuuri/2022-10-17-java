package com.sist.collection;
/*
 * 	ArrayList
 * 	----------
 * 	interface List extends Collection
 * 	class ArrayList implements List
 * 		  ---------- 구현된 클래스가 만들어져 있다
 * 			Collection : add(), get(), set(), size(),remove()
 * 				|
 * 			   List
 * 				|
 * 		----------------------------
 * 		|		|			|
 * 	ArrayList	Vector	 LinkedList
 * 	---------------------------------
 * 	공통점
 * 	1) 순서가 존재한다 (인덱스번호有) => 자동으로 생성 (항상 순차적으로 유지)
 * 					ㄴ0번부터 생성
 * 	2) 중복된 데이터 허용
 * 	3) List(인터페이스)를 구현하기 때문에 모든 메소드가 동일
 * 	차이점
 * 	1) 저장방법 (ArrayList / Vector => 동기화, 비동기화) => Vector를 보완한 클래스 : ArrayList
 * 	   권장사항 Vector보다는 ArrayList를 사용하는 것이 좋 다 
 * 	2) 저장할 때 인덱스번호 조절 (ArrayList) => 빈번하게 수정, 추가가 많은 경우에는 LinkedList 사용
 * 	==> 사용처는 데이터베이스에서 읽은 데이터를 저장 => 브라우저에서 출력하는 역할 
 * 	==> 주력 : ArrayList, HashMap
 * 		Vectro => 네트워크(서버=> 사용자 정보를 저장할 때)
 * 
 */
import java.util.*;
public class MainClass_ArrayList_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1=new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		ArrayList list2=new ArrayList();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add('A');
		list2.add('B');
		list2.add('C');
		
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		
		// 제거 (중복된 데이터만 남겨놓고 나머지는 제거 : retainAll())
		list1.retainAll(list2);
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		
		list1.containsAll(list2);
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		
		// add, size, get, remove,set, retainAll, containsAll, subList, addAll
		/*
		 * add() : 데이터 추가
		 * size() : 저장된 갯수
		 * get() : 저장된 데이터 읽기
		 * remove() : 삭제
		 * set() : 수정
		 * containsAll() : 두개의 ArrayList에서 중복된 데이터 모으기
		 * retainAll() : 두 개의 ArrayList에서 중복된 데이터만 남기기
		 * addAll() : 전체 데이터를 복사할 경우
		 * subList() : 부분적으로 데이터를 복사할 때 사용
		 */
		
	}

}
