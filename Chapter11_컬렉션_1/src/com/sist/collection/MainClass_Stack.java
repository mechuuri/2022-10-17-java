package com.sist.collection;
import java.util.*;
//input=0 / output=0
//input=0 / output=length-1
/*
 * 	for(int i=0;i<arr.size();i++) ==> Queue
 * 	for(int i=arr.size()-1;i>=0;i--) ==> Stack
 */
public class MainClass_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		// 저장			
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
	}

}
