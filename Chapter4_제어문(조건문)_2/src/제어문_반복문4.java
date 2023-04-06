// 1~100까지 for(int i=1;i<=100;i++) => 총합, 짝수합, 홀수합 ...> 변수는 3개 
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0,even=0,odd=0;// 합을 구할 때 초기화는 항상 0으로
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				even+=i; // even=even+i 누적함수
				System.out.printf("even=%d,i=%d\n,even,i");//even,i값 출력
			}
			else
			{	
				odd+=i;
				System.out.printf("odd=%d,i=%d\n,odd,i");//odd,i값 출력
			}
			total+=i;
		}
		System.out.println("1~100까지 총합:"+total);
		System.out.println("1~100까지 짝수합:"+even);
		System.out.println("1~100까지 홀수합:"+odd);
	}
//3의 배수(a3), 5의 배수(a5), 7의 배수(a7)
	int a3=0,a5=0,a7=0;// 합을 구할 때 초기화는 항상 0으로
	
	for(int i=1;i<=100;i++)
	{
		if(i%3==0) //
			a3+=i;
		if(i%5==0)//else if 쓰면 답이 달라짐 
			a5+=i;
		if(i%7==0)
			a7+=i;
		
	}		
			

	System.out.println("1~100까지 3의배수합:"+a3);
	System.out.println("1~100까지 5의배수합:"+a5);
	System.out.println("1~100까지 7의배수합:"+a7);
}

}
