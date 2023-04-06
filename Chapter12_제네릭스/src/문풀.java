import java.util.*;
public class 문풀 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i= {10,20,30,40,50,60,70,40,30,20};
		
		Set set=new HashSet();
		for(int ii:i)
		{
			set.add(ii);
		}
		List list=new ArrayList(set);
		Collections.sort(list);
		System.out.println(list);
	}

}
