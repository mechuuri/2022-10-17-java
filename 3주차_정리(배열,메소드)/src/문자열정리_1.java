/*
 * 	*** indexOf : �տ��� ã��
 * 	*** lastIndexOf : �ڿ������� ã��
 * 	------------------ ������ ��ġ ã��
 * 	*** split
 * 	================================ 12�� �޼ҵ�� �ݵ�� �ϱ�
 */
public class ���ڿ�����_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String movie="1|���ũ Ż��|���|https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|�� �κ�(�ص� ��������), ��� ������(������ ���̵� ���� ����)|2016 .02.24 �簳��, 1995 .01.28 ����|15�� ������|";
		// spllit
		String[] data=movie.split("\\|"); // split => ���Խ�
		// ���Խ� ��ȣ : ^(����) , ?(���翩��) , |(����) , +(�ѱ��� �̻�) , *(0���� �̻�) , .(�Ѱ�����) �������� �ΰ��� �Է��ؾ� ��
		// ����Ŭ : !=, ^=, <>
		for(String s:data)
		{
			System.out.println(s);
		}
	
	
	
	
	
	
	
	
	
	}

}
