import java.util.Arrays;

/*
 * 	정렬 ASC(오름차순) / DESC(내림차순)
 * 	= 선택정렬
 * 		30 10 40 50 20 
 * 		-- --
 * 		10 30
 * 		--	  --
 * 		10	  40
 * 		--   	 --
 * 		10		 50
 * 		--			--
 * 		10			20
 * 		-----------------1 round (for 1회 실행)
 * 		10 30 40 50 20
 * 		   -- --
 *		   30 40
 *		   --    --
 *		   30    50 
 *		   --	    --
 *		   20  	 	30
 *		-----------------2 round (for 2회 실행) 		   
 *
 * 	= 버블정렬
 */
// 5개 난수 
public class 배열응용_4_정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정렬 대상
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 출력
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		// 정렬
		for(int i=0;i<arr.length-1;i++)// 자기자신은 비교하지 않음 arr.length-1
		{
			for(int j=i+1;j<arr.length;j++)// 맨 마지막 번호까지 비교하도록 arr.length
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];// 숫자 바꿔주는 거 변수 하나 만들어야됨
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println((i+1)+":"+Arrays.toString(arr));
		}
		System.out.println("정렬 후:");
		System.out.println(Arrays.toString(arr));
		
		
		
		/*
		 * 왓더퍽 1891881818181818181818졸려졸려졸려개졸려
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
