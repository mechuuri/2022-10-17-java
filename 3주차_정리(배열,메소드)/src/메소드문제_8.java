// 입력 받은 값이 짝수인지 홀숨인지 판별하는 메소드를 구현하시오
public class 메소드문제_8 {
	static String method1(int a)
	{
		if(a%2==0)
			return "짝수입니다";
		return "홀수입니다";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=method1(10);
		System.out.println(s);
	}

}
