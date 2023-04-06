/*
 * 	배열 생성, 초기화, for
 * 	데이터값 제어 : 일반 for, 데이터 출력 : forEach
 * 
 *	1) 데이터 저장
 *	2) 연산자, 제어문
 *	3) 결과값 출력 
 * 
 * 
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 알파벳을 저장 ==> 출력 26개 
		char[] alpha=new char[26]; // 초기화 '\u0000' -> char가 초기화 될 때 공백문자
		/*
		 * 	new ==> 메모리 저장공간 확보
		 * 	int ===> (new 이용했을 때) 0
		 * 	long ===> 0L
		 * 	float ==> 0.0F
		 * 	double ==> 0.0
		 * 	char ===> '\u0000'
		 * 	boolean ==> false
		 */
		// 배열에 값을 대입
		// 배열 ==> 인덱스를 이용한다 ==> int (0)
		char c='A';
		for(int i=0;i<alpha.length;i++) // 배열 범위를 초과하면 에러 발생되기 때문에 에러 방지용\
		{
			alpha[i]=c++; //alpha[i] : 0번부터 25번까지 대입
		}
		// 제어할 수 있다
		// 출력
		for(char ch:alpha) // forEach 구문 : (alpha부분) 배열(고정)아니면 컬렉션(가변)만 사용이 가능. 가지고 있는 값을 가져오기
		{
			System.out.print(ch+" ");
		}
	}

}
