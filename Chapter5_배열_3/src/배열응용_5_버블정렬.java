import java.util.Arrays;

public class 배열응용_5_버블정렬 {

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
		
		System.out.println("정렬 후:");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1;i>=0;i--) // 거꾸로 출력 
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
