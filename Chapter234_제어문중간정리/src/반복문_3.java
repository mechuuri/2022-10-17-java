
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A ~ Z ==> for, while
		char c='A';
		System.out.println("==== for문 ====");
		for(c='A';c<='Z';c++)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println("==== while문 ====");
		c='A';
		while(c<='Z')
		{
			System.out.print(c+" ");
			c++;
		}
		
		System.out.println();
		System.out.println("==== do~while문 ====");
		char c1='A';
		do
		{
			System.out.print(c1+" ");
			c1++;
		}while(c1<='Z');
		
		
		
		
		
		
	}

}
