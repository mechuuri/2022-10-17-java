/*
 * 	단항연산자
 * 		= 증감연산자 ++, --
 * 			++ : 값 1 증가 (무조건 증가)
 * 			-- : 값 1 감소 (무조건 감소)
 *			1)전치 연산자 
 *				++a ===> 다른 변수에 대입 시 먼저 증가 후 그 값을 대입
 *						b=++a >> b=a
 *			2)후치 연산자 
 *				a++ ===> 다른 변수에 대입 시 먼저 대입 후 값이 증가
 *						b=a++
 *
 * 		= 부정연산자 (!) => boolean만 사용 (true > false, false > true)
 * 		= 형변환연산자 (type)
 * 			자동 형변환 ==> 변수에 값을 대입, 연산처리 시(큰데이터로)
 * 						int a='A';
 * 						double d=10; ....> 10.0
 * 						int + double = double
 * 						char + char = int
 * 
 * 			강제 형변환 ==> 라이브러리에서 데이터 추출 => 강제로 변경 (크게 바꿀 수도 있고 작게 바꿀 수도 있음)
 * 				(double)10 ==> 10.0
 * 				(int)'A' ==> 65
 * 				(char)65 ==> 'A'
 *  
 *  
 *  
 */
public class 단항연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1" + "2"); //12
		System.out.println(true + ""); //true
		System.out.println('A' + 'B’); //131
							//65	66
		System.out.println('1' + 2); //51
							//49+2
						
		System.out.println('1' + '2’); //99
							//49+50
		System.out.println('J' + “ava”); //Java
		double d=10.5f;
		
		

	}

}
