// ���ڿ��� �ҹ��ڸ� �빮�ڷ� �ٲٴ� �޼ҵ带 �����Ͻÿ�
import java.util.Scanner;
public class �޼ҵ幮��_2 {
static String change(String alpha)
{
	return alpha.toUpperCase();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���ĺ� �Է�:");
		String alpha=scan.next();
		String s=change(alpha);
	}

}
