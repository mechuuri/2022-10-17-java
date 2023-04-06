class Recipe{
	String title;
	String name;
	String writer;
	String intro;
	String 용량;
	String time;
	String 난이도;
	String[] 기본재료=new String[8];
	String[] 양념재료=new String[6];
	String[] 순서=new String[3];
	
}
public class 문제풀이_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recipe r1=new Recipe();
		r1.title="소세지가지볶음밥 만드는 법 가지요리 소세지요리 복음밥요리 한그릇요리";
		r1.name="레시피 작성자";
		r1.writer="하이유니별";
		r1.intro="건강하고 맛있는 집밥 레시피와 다이어트 레시피를 소개할게요.^^ ";
				
	}

}
