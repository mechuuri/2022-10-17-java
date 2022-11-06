import java.util.Arrays;

/*
 * 	bubble sort 버블 정렬
 * 	
 * 	20	30	10	50	40
 * 	--	--
 * 	20	30
 * 		--	--
 * 		10	30
 * 			--	--
 * 			30	50
 * 				--	--
 * 				40	50
 * 	-------------------- 1 round (for 1회 실행)
 * 	20	10	30	40	50
 * 	--	--
 * 	10	20
 * 		--	--
 * 		20	30
 * 			--	--
 * 			30	40
 * 	-------------------- 2 round (for 2회 실행)
 * 	10	20	30	40	50
 * 	--	--
 * 	10	20
 * 		--	--
 * 		20	30
 * 	-------------------- 3 round (for 3회 실행)
 * 	10	20	30	40	50
 * 	--	--
 * 	10	20
 * 	-------------------- 4 round (for 4회 실행)
 */

public class 배열응용_6_버블정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 출력
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		// 버블 정렬 시작
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1]) // arr[j]<arr[j+1] 내림차순 18 개졸료
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("정렬 후:");
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
