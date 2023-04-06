class Movie
{
	int mno;
	String title;
	String genre;
	Movie()
	{
		
	}
	Movie(Movie m)// 객체를 본떠온다
	{
		System.out.println("mno:"+m.mno);
		System.out.println("title:"+m.title);
		System.out.println("genre:"+m.genre);
	}
}
public class 매개변수생성자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1=new Movie();
		m1.mno=1;
		m1.title="홍길동전";
		m1.genre="액션";
		
		Movie m2=new Movie(m1);
			
	}

}
