/*
 * 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라 
 * 1+2-3+4+5-6+7+8-9+10 ==> if(i%3==0)
 * 짝수일 때 - 홀수일 때 +
 */
public class 문제풀이_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
				sum-=i;
			else
				
				sum+=i;
			
		}
		System.out.println("1-2+3-4+5-6+7-8+9-10 :"+sum);
	}

}
