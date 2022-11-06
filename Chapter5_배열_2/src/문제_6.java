import java.util.Arrays;

public class 문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 데이터 저장
		int[] num= {94,85,95,88,90};
		int max=num[0];
		int min=num[0];
		
		System.out.println(Arrays.toString(num));
		
		for(int i:num)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	}

}
