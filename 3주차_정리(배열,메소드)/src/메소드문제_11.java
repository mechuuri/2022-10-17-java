// �޼ҵ带 �����Ͽ� �Է¹��� ���ڸ� �Ųٷ� ������ ���� ����ϴ� ���α׷��� �ۼ��ϼ��� ����ϴ� => void
/*
 * 	�޼ҵ� : �Ű�����, ������
 * 		--------  ----- ó�� ����� (��� => void)
 * 		����ڷκ��� �޴� ��
 */
import java.util.Scanner;
public class �޼ҵ幮��_11 {
	static void reverse(int num)
	{
		String s=String.valueOf(num); // ���ڿ� ��ȯ
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int num=scan.nextInt();
		reverse(num);
	}

}
