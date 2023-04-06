// 문자열을 거꾸로 출력하는 메소드를 구현하시오
public class 메소드문제_4 {
static void reverse(String s)
{
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.print(s.charAt(i));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("Heollo Java!!");
	}

}
