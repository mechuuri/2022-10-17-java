// �⵵�� �Է¹޾Ƽ� �������� ���θ� Ȯ���ϴ� �޼ҵ带 �����Ͻÿ�
public class �޼ҵ幮��_6 {
static boolean isYear(int year)
{
	if((year%4==0 && year%100!=0) || year%400==0)
			return true;
		return false;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=isYear(2022);
		if(bCheck==true)
			System.out.println("�����Դϴ�");
		else
			System.out.println("������ �ƴմϴ�");
	}

}
