
public class ���ڿ�_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="�������� ���� ���� ���� ���! �����̹���������ͱ��� �����";
		//System.out.println(data.length());
		if(data.length()>17)
		{
			data=data.substring(0,17)+"...";
		}
		System.out.println(data);
		
		String address="����Ư���� ���빮�� �����23�� 78 1F ���� ����� ���빮�� ���� 221-8 1F";
		String addr1=address.substring(0,address.lastIndexOf("��")).trim();
		System.out.println(addr1);
		
		String addr2=address.substring(address.indexOf("��")+3); //������ 3���� ���� ������ ������
		System.out.println(addr2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
