import java.util.Arrays;
import java.util.Scanner;
// ����ȭ�� ���α׷�
// ��ɺ� ������ �۾� ==> ������ / �Ű�����
import javax.swing.plaf.synth.SynthSeparatorUI;
public class �޼ҵ�����_1 {
	// �޼ҵ�� ����=> ���� Ŭ����{}�ȿ����� ����� ����
	// �ߺ����� ���� �߻�
	static int[] rand()
	{
		int[] com=new int[3];
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
		return com;
	}
	// ����� �Է�
	static int[] userInput()
	{	int[] user=new int[3];
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
			break;// ���������� �Է��� �� ��� ����
		}
		return user;
	}
	// ��
	static int compare(int[] com,int[] user)
	{
		
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
		hint(user,s,b);
		return s;
	}
	// ��Ʈ
	static void hint(int[] user, int s, int b)
	{
		System.out.printf("Input Number:%d%d%d,Result:%dS-%dB\n",user[0],user[1],user[2],s,b);
	}
	static boolean isEnd(int s)
	{
		if(s==3)
			return true;
		return false;
	}
	// ���Ῡ�� Ȯ��

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=rand();
		System.out.println(Arrays.toString(com));
		while(true)
		{
			int[] user=userInput();
			int s=compare(com,user);
			if(isEnd(s))
			{
				System.out.println("Game Over!");
				break;
			}
		}
		int[] user=userInput();
		//System.out.println(Arrays.toString(user));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
