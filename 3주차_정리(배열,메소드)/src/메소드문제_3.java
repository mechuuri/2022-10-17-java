// ���ڿ��� �Է¹޾Ƽ� �¿� ��Ī���� Ȯ���ϴ� �޼ҵ带 �����Ͻÿ�
import java.util.Scanner;
public class �޼ҵ幮��_3 {
	static boolean method(String s)
	{
		boolean bCheck=true;
		for(int i=0;i<s.length()/2;i++)
		{
			int last=s.length()-1-i;
			if(s.charAt(i)==s.charAt(last))
			{
				bCheck=false;
				break;
			}
		}
		return bCheck;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s="";
		while(true)
		{
		System.out.print("���ڿ� �Է�:");
		s=scan.next();
		if(s.length()%2!=0)
		{
			System.out.println("�߸��� �Է��Դϴ�!!");
			continue;
		}
		break;
		}
		boolean bCheck=method(s);
		if(bCheck==true)
			System.out.println("�¿� ��Ī�Դϴ�");
		else
			System.out.println("�¿� ��Ī�� �ƴմϴ�");
		
		
		
		
		
		
		
	}

}
