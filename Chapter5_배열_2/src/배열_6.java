import java.util.Arrays;
/*
 * 	System.arraycopy() : 배열의 크기가 다를 때 내가 원하는 위치에 데이터를 배치할 때 
 * 	arr.clone() : 있는 그대로 값을 가져올 때 
 * 
 * 
 */
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'A','B','C','D','E'};
		char[] copy=new char[arr.length];
		// 값을 복사 ==> 출력 arr/copy
		
		copy=arr.clone();
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("copy="+Arrays.toString(copy));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

}
