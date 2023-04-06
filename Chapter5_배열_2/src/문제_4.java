import java.util.Arrays;

public class 문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10개 저장하는 공간 (선언)
		int[] arr=new int[10];
		//초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			
		}
		//화면에 초기화 된 값 출력 
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) // 인덱스를 이용해서 값을 얻어 온다
		{
			if(arr[i]%3==0)
				System.out.print(arr[i]+" ");
			
		}
		
		/*
		 * for(int i:arr) // 실제 저장된 값을 얻어 온다
		{
			if(i%3==0)
				System.out.println(i+" ");
			
		}
		 */
		
		
		
	}

}
