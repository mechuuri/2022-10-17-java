import java.util.Arrays;

/*
 * 6. 0~9사이의 난수를 100개 발생해서 
   빈도를 구해서 출력하시오 
   예)
   0의 개수: 1
   1의 개수: 1
   ..
   9의 개수: 0
   	===============> 같은 용도?
   	
   	1. 3명의 국어, 영어, 수학, 총점, 평균, 등수
   import java.util.Scanner;	
   	int[] kor=new int[3];
   	int[] eng=new int[3];
   	int[] math=new int[3];
   	int[] total=new int[3];
   	int[] rank=new int[3];
   	//int[][] 성적=new int[3][5];  ==> 데이터를 다섯개씩 가져간다 
   	
   	double[] avg=new double[3];
   	
   	for(i=0;i<3;i++)
   	{
   		System.out.println((i+1)+"번째 국어 입력:");
   		kor[i]=scan.nextInt();
   		System.out.println((i+1)+"번째 영어 입력:");
   		eng[i]=scan.nextInt();
   		System.out.println((i+1)+"번째 수학 입력:");
   		math[i]=scan.nextInt();
   		
   		total[i]=kor[i]+eng[i]+math[i];
   		avg[i]=total[i]/3.0;
   	}
   	for(int i=0;i<3;i++)
   	{
   		rank[i]=1;
   		for(int j=0;j<3;j++)
   		{
   			if(total[i]<total[j])
   				rank[i]++;
   		}
   	}
   	for(int i=0;i<3;i++)
   	{
   		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5d\n",kor[i],eng[i],math[i],total[i],avg[i],rank[i]);
   		
   	
   	}
   
   	
   	
   	
   	
   	
 */
public class 문제풀이_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[100];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		
		int[] result=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			result[arr[i]]++;
		}
		for(int i=0;i<result.length;i++)
		{
			System.out.println(i+"의 개수 :"+result[i]);
			
		}
	}

}
