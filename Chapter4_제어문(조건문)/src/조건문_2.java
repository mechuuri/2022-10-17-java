// 문자 한 개를 설정하고 알파벳 => 대문자, 소문자, 알파벳이 아닌지 확인 
public class 조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='홈';
		if(c>='A' && c<='Z')
		{
			System.out.println(c+"은(는) 대문자입니다");
		}
		if(c>='a' && c<='z')
		{
			System.out.println(c+"은(는) 소문자입니다");
		}
		if(!(c>='A' && c<='Z' || c>='a' && c<='z'))// 알파벳이 아니라면~
		{
			System.out.println(c+"은(는) 알파벳이 아닙니다");
		}
	}

}
