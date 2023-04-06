package com.sist.math;
/*
 * 
 */
import static java.lang.Math.round;
import static java.lang.Math.ceil;
import static java.lang.Math.random;
public class MainClass_Math_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.2f\n", 87.555);
		System.out.println(round(87.555));
		System.out.println(ceil(87.111));
		System.out.println((int)(random()*100));
		/*System.out.println(Math.round(87.555));
		System.out.println(Math.ceil(87.111));
		
		System.out.println((int)(Math.random()*100));// int 형변환 시키면 안됨 ==> 무조건 0임
		// 				int로 형변환하면(소수점을 다 지움) 우선순위가 random이기 떄문에 0이 됨 => 괄호를 쳐서 우선순위 조정
	*/
	
	
	
	}

}
