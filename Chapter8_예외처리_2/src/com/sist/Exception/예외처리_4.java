package com.sist.Exception;

import java.util.Arrays;

public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] arr=new int[6];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=(int)(Math.random()*45)+1;
				for(int j=0;j<i;j++)
				{
					if(arr[j]==arr[i])// 중복이 있다면
					{
						i--;
						break;
					}
				}
			}
			System.out.println("오늘의 로또 번호:");
			Arrays.sort(arr); //ASC 오름차순(작은것부터 큰것 출력)
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
				Thread.sleep(1000); //1초 후에 하나씩 나오게
			}
		}catch(InterruptedException e)// 충돌 방지
		{
			System.out.println(e.getMessage());
		}
	}

}
