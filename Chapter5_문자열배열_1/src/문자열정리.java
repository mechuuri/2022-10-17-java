/*
 * 	(startWith) : 문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)
			
			boolean startWith(String fs)
			메소드는 사용자가 요청값 ==> 요청처리 결과값

	(endWith):문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)
			
			boolean endWith(String s)

	**(equals):두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교)
			
			boolean equals(String fs) ==> 대소문자 구분해서 비교
			
	**(indexOf):지정한 문자가 문자열에 몇번째에 있는지를 반환한다.
			
			int indexOf(char c)	indexOf('.')
			int indexOf(String s)	indexOf("java")

	**(lastindexOf):문자열에 지정한 문자가 마지막 몇번째에 있는 int를 반환한다.
	
			int lastIndexOf(char c)
			int lastIndexOf(String s) // 실행하고 나온 결과값은 int로..?

	**(length):문자열의 길이를 반환한다.
			
			int length()
			
			boolean login(String id,String pwd)
			사칙연산 ==>
			
	(replace):문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다.
			
			String replace(char o,char n)
			String replace(String s1,String s2)
			
	(replaceAll):정규표현식을 지정한 문자로 바꿔서 출력한다.

			String replaceAll(String s,String s1)
			
	(split):지정한 문자로 문자열을 나눌수 있다.(배열로 반환)

			String[] split(String s)
			
	**(substring):문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)

			String substring(int s)
			String substring(int s,int e) ==> e-1 (마지막은 제외)

	(toLowerCase):문자열에 대문자를 소문자로 변환한다.
			
			String toLowerCase()

	(toUpperCase):문자열에 소문자를 대문자로 변환한다.
		
			String toUpperCase()
			
	**(trim):문자열에 공백을 없에준다.
			
			String trim()
			
	(toString):지정한 개체의 원시 값을 반환
			
			String toString()
	
	**(contains):두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.
			
			String contains(String s)

	(charAt):지정한 index번째에 문자를 반환한다.
			
			char charAt(int i)
			
	**valueOf() : 모든 데이터형을 문자열로 변환 (웹, 네트워크, 윈도우)
	
	*
	String / Integer / ArrayList
	----------------------------- Connection , Statement , ResultSet




 */
public class 문자열정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello Java,Java";
		System.out.println(s.toString());
		System.out.println(s.replace("Java", "JSP"));
	}

}
