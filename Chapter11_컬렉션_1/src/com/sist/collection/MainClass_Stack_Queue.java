package com.sist.collection;

import java.util.ArrayList;

/*
 *  Stack : LIFO (나중에 들어간 것이 먼저 나오게) => 메모리
 *  	int a=10;==3
 *  	{
 *  		int b=20==2
 *  		{
 *  			int c=30;==1
 *  		}
 *  	}
 *  
 *  Queue : FIFO => 운영체제 (먼저 클릭한걸 먼저 나오게)
 *  				메모장 / 그림판 / 브라우저
 *  				네트워크에서는 Queue 사용
 *  
 *  Stack : 저장 / 출력
 *  		push	pop
 *  Queue : 저장 / 출력
 *  		opper poll
 *  		==> !empty()
 */
public class MainClass_Stack_Queue {
	private int s_index;
	private int e_index;
	private int[] arr=new int[10];
	private ArrayList list=new ArrayList();
	public MainClass_Stack_Queue()
	{
		s_index=0;
		e_index=arr.length-1;
	}
	public void push(int a)
	{
		arr[s_index]=a;
		s_index++;
	}
	public void pop()
	{
		for(int i=e_index;i>=0;i--)
		{
			
				System.out.println(arr[1]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass_Stack_Queue sq=new MainClass_Stack_Queue();
		sq.push(1);
		sq.pop();
		System.out.println("=====");
		sq.push(2);
		sq.pop();
		sq.push(3);
	}

}
