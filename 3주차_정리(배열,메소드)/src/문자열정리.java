import java.util.Arrays;

/*
 * 	���ڿ��� �����ϴ� ��������
 * 	------------------ ''(char), ""(String)
 * 						������ 1��		������ ������ ���ÿ� ���� (char[]=> ���� �ٷ�� ���ؼ� Ŭ����)
 * 						int => Integer, double => Double, boolean => Boolean
 * 						������������ Ŭ������ ���� (Wrapper)
 * 						char[] => String
 * 	=> String : �������� (���� ����� �������� �ּҰ�)
 * 	  --------
 * 		1) �Ϲ� ��������ó�� ���
 * 			String s="" (���� ���� ���Ǵ� ����)
 * 			  |    |  |
 * 			�������� ������ ��
 * 		2) Ŭ������ó�� ���
 * 			String s=new String(""); // ���ο� �޸𸮸� ���� ��� (new =>�޸𸮰� �ٸ� �޸𸮸� ����)
 * 		3) Ŭ���� ==> ���(�޼ҵ�����)
 * 			=> ��ȯ
 * 				1) toUppterCase() ===> ���ڿ��� �빮�ڷ� ��ȯ
 * 				2) toLowerCase() ===> ���ڿ��� �ҹ��ڷ� ��ȯ
 * 			*	3) replace() ===> ������ ����(���ڿ�)�� ����
 * 			*	4) replaceAll() ===> ���Խ��� �̿��ؼ� ����
 * 									  �� ���ڿ��� ���� (��õ�̳� ũ�Ѹ��� ��) �����ν��� �ȵǴ� ���ϱ� �������� ���� ó��
 * 									 	���ְ�, ���ִ�, ���ִ�...
 * 										-------------------- ����+(�ڿ� ���ڰ� �ѱ��� �ִ�..) 
 * 			=> ����
 * 			*	1) trim() : �¿쿡 �ִ� ���� ���� (����� �Է�)
 * 			*	2) substring90 : ���ڿ� �ڸ� ��쿡 �ַ� ��� (...)
 * 				3) concat() : ���ڿ� ���� (+ ����ϱ� ������ ���� ������� ����)
 * 			=> �˻�
 * 			*	1) startsWith() : ���ξ� (�����ϴ� ���ڿ�) ==> ��(��Ű���.�ֽŹ湮)
 * 				2) endsWith() : ���̾� (������ ���ڿ�)
 * 			*	3) contains() : ���� ���ڿ��� ã�� �� (�ڹٽ�ũ��Ʈ) ==> SearchBar
 * 			*	4) equals() : ���� ���ڿ� ���� (������ ��� ��ҹ��� ����) ==> ã��(id,pwd)
 * 			=> ��Ÿ
 * 			*	1) valueOf() : ��� ���������� ���ڿ��� ��ȯ�� ��
 * 			*	2) toString() : ���ڿ� ��ȯ
 * 			*	3) length() : ���ڿ� ����
 */
public class ���ڿ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ���ڿ� ����
		String name="ȫ�浿�Դϴ�";
		System.out.println("name:"+name);
		System.out.println("������ ����:"+name.length());
		char[] arr=name.toCharArray(); // char�� ��ȯ
		String temp=String.valueOf(arr); // char[] => String���� ����. valueOf ��� ������ String ���ڿ��� �����ϴ�
		System.out.println(temp);
		System.out.println(Arrays.toString(arr));
		if(name.contains("ȫ")) // ���� �� true
		{
			System.out.println("�����ϰ� �ִ�");
		}
		else
		{
			System.out.println("�������� �ʴ´�");
		}
		System.out.println("=============================");
		if(name.startsWith("ȫ")) // ���� �� true
		{
			System.out.println("�����ϴ� ���ڿ��Դϴ�");
		}
		else
		{
			System.out.println("�����ϴ� ���ڿ��� �ƴմϴ�");
		}
		System.out.println("============================");
		if(name.endsWith("ȫ")) // ���� �� true
		{
			System.out.println("������ ���ڿ��Դϴ�");
		}
		else
		{
			System.out.println("������ ���ڿ��� �ƴմϴ�");
		}
	}

}
