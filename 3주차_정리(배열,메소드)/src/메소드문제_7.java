// 두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.
public class 메소드문제_7 {
	static int max(int a,int b)
	{
		/*int max=0;
		if(a<b)
			max=b;
		else
			max=a;*/
		return Math.max(a,b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=max(50,60);
		System.out.println(m);
	}

}
