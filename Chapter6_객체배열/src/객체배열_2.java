import java.util.Scanner;

public class 객체배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std=new Student[3];//같은 폴더에 생성된 클래스는 어떤 클래스든 상관없이 사용이 가능
		/*
		 * 	std		std[0]		std[1]		std[2]
		 * 	-----	--------------------------------
		 * 	0x100	null	|	null	|	null
		 * 	-----	|--------------------------------
		 * 		   0x100 |			|			|
		 * 				 |			|			|
		 * 				name	   name        name
		 * 				kor        kor         kor
		 * 				eng        eng         eng
		 * 				math	   math		   math
		 */
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<std.length;i++)
		{
			// std[i]의 메모리를 만들어 줘야된다
			std[i]=new Student();
			// NullPointerException ==> new 사용 여부 (output창 잘보거라 
			// 기본 문법에러는 이클립스에서 출력
			
			System.out.println("이름 입력:");
			std[i].name=scan.next();
			
			System.out.println("국어 입력:");
			std[i].kor=scan.nextInt();
			
			System.out.println("영어 입력:");
			std[i].eng=scan.nextInt();
			
			System.out.println("수학 입력:");
			std[i].math=scan.nextInt();
			
		}
		
		// 출력
		for(int i=0;i<std.length;i++)
		{
			System.out.println(std[i].name+" "
					+std[i].kor+" "
					+std[i].eng+" "
					+std[i].math+" "
					+(std[i].kor+std[i].eng+std[i].math)+" "
					+(std[i].kor+std[i].eng+std[i].math)/3.0);
		}
		
		
		
		
		
		
		
	}

}
