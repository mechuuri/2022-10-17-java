/*
 * 	���ھ߱�����
 * 	1) �����߻� (�ߺ�����)
 * 	2) ����� �Է�
 * 	3) ��
 * 	4) ��Ʈ
 * 	5) ���Ῡ�� Ȯ��
 * ------------------ 5�� �޼ҵ�.......
 */
import java.util.Arrays;
import java.util.Scanner;
public class �޼ҵ�����_2_���ھ߱� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ���� �߻�
		int[] com=new int[3];// ���� ����
		int[] user=new int[3];// ����� �Է°� ����
		/// ====> 1�� ��� (�޼ҵ� ó��)
		for(int i=0;i<3;i++)
		{
			com[i]=(int)(Math.random()*9)+1;// 1~9 ������ ���� �߻� => �ߺ� ����
			for(int j=0;j<i;j++)// ù�� ° ������ ���� j<i
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
				
		}
		// Ȯ��
		System.out.println(Arrays.toString(com));
		
		Scanner scan=new Scanner(System.in);
		while(true) // ���ѷ��� => Ƚ���� ������ �ȵ�
		{
			// 2. ����� �Է��� ����
			System.out.print("���ڸ� ���� �Է�:");
			// �Է��� �������� �޴´�
			int input=scan.nextInt();
			
			// ����ó�� ==> 1. ���ڸ� ������ �Է����� ���� ���
			if(input<100 || input>999)
			{
				System.out.println("�߸��� �Է��Դϴ�..");
				continue; // while ó������ �ٽ� ���ư���
			}
			// ���ϱ� ���ؼ� �迭�� ����
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			// ���� ������ �ԷµǸ� �ȵ� => ���� ó��
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("���� ���� ����� �� �����ϴ�!");
				continue;
			}
			// 0 �Է� ���� Ȯ�� => ���� ó��
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0�� ����� �� �����ϴ�!");
				continue;
			}
			// 3. ��
			// ���� �ڸ��� ���ڰ� ������ ��� ==> S
			// ������ ���� => �ٸ� �ڸ� ==> B
			int s=0,b=0;
			for(int i=0;i<3;i++)// com=0, user=0,1,2 / com=1, user=0,1,2...
			{
				for(int j=0;j<3;j++)// user
				{
					if(com[i]==user[j])// 9�� �˻� => ���� ���� �ִٸ�
					{
						if(i==j)// ���� �ڸ��� ����
							s++;
							else// �ٸ� �ڸ��� ����
								b++;
					}
				}
			}
			
			// 4. ��Ʈ
			System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
			// 5. ���Ῡ�� Ȯ��
			if(s==3)
			{
				System.out.println("Game Over!");
				break;
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
}
