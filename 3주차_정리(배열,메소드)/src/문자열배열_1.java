/*
 * 	���ڿ� �迭
 * ----------
 * 		String[] movie={"","",""};
 * 		String[] movie=new String[100];
 */
import java.io.*;
import java.util.Scanner;
public class ���ڿ��迭_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] movie=new String[1938];
		try
		{
			StringBuffer sb=new StringBuffer();
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
					int i=0;
			while((i=fr.read())!=-1)
			{
				sb.append(String.valueOf((char)i));
			}
			fr.close();
			//System.out.println(sb.toString());
			String data=sb.toString();
			String[] temp=data.split("\n");
			i=0;
			for(String s:temp)
			{
				movie[i]=s;
				i++;
			}
		}catch(Exception ex) {}
		//1. ��� �߷�
		for(String s:movie) // movie�� ����� ���� �ϳ��� �о��
		{
			System.out.println(s);
		}
		//2. �˻�
		Scanner scan=new Scanner(System.in);
		/*System.out.print("1~1938������ ��ȭ ��ȣ �Է�:");
		int mno=scan.nextInt();
		
		String detail=movie[mno-1];
		String[] ss=detail.split("\\|");
		for(String s:ss)
		{
			System.out.println(s);
		}
		*/
		System.out.print("�⿬�� �̸� �Է�:");
		String name=scan.next();
		
		for(String data:movie)
		{
			if(data.contains(name))
			{
				//System.out.println(data);
				String[] temp=data.split("\\|");
				System.out.println(temp[1]);
				//System.out.println();		
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
