import java.util.Arrays;
/*
 * 	O Z B I R
 * 
 * 	arr.length-1-i ==> 한자리 고정하고 돌릴 수 있게 => 4,3,2,1
 */
public class 배열응용_7_알파벳정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr=new char[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("정렬 전:");	
		System.out.println(Arrays.toString(arr));
		// 정렬
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)// j는 i보다 하나 더 많은 것을 비교해야됨 j=i+1 // 맨 마지막까지 비교해야 됨 j<arr.length
			{
				if(arr[i]>arr[j]) // 작은게 올라옴 > : 오름차순 < : 내림차순
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
		}
		System.out.println("정렬 후:");	
		System.out.println(Arrays.toString(arr));
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
