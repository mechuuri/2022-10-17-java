import java.util.Arrays;

public class 문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char[] alpha= {'a','b','c','d'};
	for(int i=0;i<alpha.length;i++)
	{
		System.out.print(alpha[i]+" ");
		
	}
	System.out.println();
	for(char c:alpha)
	{
		System.out.print(c+" ");
	}
	System.out.println();
	System.out.println(Arrays.toString(alpha));
	}

}
