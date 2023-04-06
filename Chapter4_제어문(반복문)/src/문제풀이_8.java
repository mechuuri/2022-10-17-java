/*
 * 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.

 */
public class 문제풀이_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=3;i<=4462;i++)
		{
			if(i%2==0)
				
			sum+=i; //짝수일 때만 값 누적
			
			
			
		}	
			System.out.println("sum:"+sum);
			
		
	}

}
