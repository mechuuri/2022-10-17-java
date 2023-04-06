/*
 * i	j	 k
 * 줄수	공백	 별표
 * 	1	3	 1		i+j=4 ==> j=4-i
 * 	2	2	 2
 * 	3	1	 3
 * 	4	0	 4
 * 
 * 	1	0	 4
 * 	2	1	 3
 * 	3	2	 2
 * 	4	3	 1
 * 
 */
public class 문제_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=5-i;k++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=i-1;k++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
