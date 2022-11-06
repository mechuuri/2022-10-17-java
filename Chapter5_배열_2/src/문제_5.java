import java.util.Arrays;

public class 문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;// 인덱스 이용해서 값 넣어줌
		}
		System.out.println(Arrays.toString(arr));// 배열에 든 숫자 출력
		int sum=0; // 평균을 출력
		for(int i:arr)// 실제값을 가져와서 누적 시켜야됨
		{
			sum+=i;
		}
		System.out.printf("평균:%.2f\n",sum/(double)arr.length);
	}

}
