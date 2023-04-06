// 242p 응용
import java.util.Scanner;
import java.io.*;
public class MovieSystem {
	Movie[] movie=new Movie[1938];
	{
		// 데이터값 대입
		try
		{
			int k=0;
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)
			{
				sb.append(String.valueOf((char)i));
			}
			String data=sb.toString();
			String[] temp=data.split("\n");
			for(String s:temp)
			{
				// 메모리 할당하고 데이터 값 부여
				String[] m=s.split("\\|");
				movie[k]=new Movie();
				movie[k].mno=Integer.parseInt(m[0]);
				movie[k].title=m[1];
				movie[k].genre=m[2];
				movie[k].poster=m[3];
				movie[k].actor=m[4];
				movie[k].regdate=m[5];
				movie[k].grade=m[6];
				movie[k].director=m[7];
				k++;
			}
		}catch(Exception ex) {}
	}

	public static void main(String[] args) {
		MovieSystem ms=new MovieSystem();
		// 1. 출력 (영화 제목)
		for(Movie m:ms.movie) // m하나가 영화에 대한 모든 정보를 갖고 있음
		{
			System.out.println(m.mno+"."+m.title);
		}
		System.out.println("=========================================");
		Scanner scan=new Scanner(System.in);
		System.out.print("장르 입력:");
		String genre=scan.next();
		for(Movie m:ms.movie) // movie => 객체배열 (영화의 모든 정보) ==> Movie (한개에 대한 정보)
		{
			if(m.genre.contains(genre))
			{
				System.out.println(m.title+"("+m.genre+")");
			}
		}
		
		
		
		
	}
	
}


