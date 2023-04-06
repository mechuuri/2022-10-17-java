/* 
 *	대입연산자 : =
 *			-----필수 (변수의 초기값, 변수값 변경, 연산 결과값 받기)
 *			int a=10
 *
 *			a=20;
 *	복합대입연산자 : +=, -=, *=, /=, <<=, >>=, |=, ^= 
 *		
 *		+= (누적), 문자열을 모아서 관리할 때 
 *		int a=10;
 *		a+=20; ===> a=a+20
 *		--	a=30
 *		
 *
 *		a++
 *		++a
 *		a+=1
 *		a=a+1
 *		--------------- 동일
 *
 *		여러개 ==> 5개 증가
 *
 *		a+=1 ==> a=a+1 ==> a에 1을 더한 값으로 변경해서 저장
 *		a-=1 ==> a=a-1
 *		a*=1 ==> a=a*1
 *		
 * 
 */
public class 대입연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; // 10을 a에 대입해라 ==> ; (컴퓨터에 명령을 내린다)
		// 프로그램 => 프로그래머가 컴퓨터에 명령을 내려서 수행이 가능하게 만든다
		// 명령에도 순서가 존재한다 		=> 명령순서 => 처리가 원할하게 만든다(알고리즘) 
		a=20;// a에 저장된 데이터를 20으로 변경한다
		System.out.println("a="+a);
		
		int pencils=534;
		int students=30;
		
		int penscilsPerStudent=pencils/students;
		System.out.println(penscilsPerStudent);
		
		int pencilsLeft=pencils%students;
		System.out.println(pencilsLeft);
		
		int value=365;
		
		System.out.println((value/100)*100);
		
		int x=10;
		int y=5;
		System.out.println((x>7)&&(y<=5));
		System.out.println((x%3==2)||(y%2!=1));
		
		
		
	}

}
