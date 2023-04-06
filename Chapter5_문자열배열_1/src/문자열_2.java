import java.util.Arrays;

// concat : 문자열 결합
// 문자열.concat(문자열) ==> 문자열+문자열
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello ";
		String s2="Java!!";
		System.out.println(s1.concat(s2));
		// 문자열 ==> 기능 수행하고 나면 ==> 문자열은 변경하지 않는다 (원본은 그대로 있고 조작만)
		System.out.println(s1.substring(3));
		
		String msg="Hello Java";
		// a=>b  ==> Hello jbvb
		System.out.println(msg.replace("a", "b"));
		
		String msg1="홍길동 version 2!!";
		System.out.println(msg1.replaceAll("[^가-힣]", ""));
		// [가-힇] [A-Za-z] [0-9]
		System.out.println(msg1.replaceAll("[^A-Za-z]", ""));
		System.out.println(msg1.replaceAll("[^0-9]", ""));
		
		String movie="범죄, 스릴러 |한국 |105분  |2022 .10.26 개봉";
		String[] m=movie.split("\\|"); // ^ , | , ? , . , + , \\* 사용중인 기호는 \(역슬래쉬)를 붙여야함
		System.out.println(Arrays.toString(m));
	}

}
