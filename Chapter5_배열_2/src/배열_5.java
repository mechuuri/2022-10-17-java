import java.util.Arrays;

// 배열 복사
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {100,200,300,400,500};
		int[] copy=new int[arr.length*2]; // 배열에 있는 값만 복사 (주소는 다름 !!!!!!!!!!!!!!)
		
		System.arraycopy(arr, 0, copy, 3, 3);// src: 값을 갖고 있는 애, 0번부터 갖고 오겠다, 카피의 대상, 0번부터 카피 뜨겠다, 몇개를 카피?
		// arr의 인덱스, 			copy 인덱스
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("copy="+Arrays.toString(copy));
	}

}
