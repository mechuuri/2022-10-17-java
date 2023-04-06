package com.sist.collection;
import java.util.*;
import java.util.Queue;

public class MainClass_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new LinkedList(); // 생성자가 존재하지 않음 => 추상클래스, 인터페이스
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
		
	}

}
