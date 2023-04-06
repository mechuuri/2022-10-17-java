// 문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오
import java.util.Scanner;
public class 메소드문제_2 {
static String change(String alpha)
{
	return alpha.toUpperCase();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력:");
		String alpha=scan.next();
		String s=change(alpha);
	}

}
