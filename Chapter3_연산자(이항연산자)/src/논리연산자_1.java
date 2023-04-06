/*
 * 		논리연산자 : &&, || ==> 결과값 boolean(true / false)
 * 				(조건)&&(조건)
 * 				-----  -----
 * 				  |		 |
 * 				 ----------
 * 					  |&&, ||
 * 					결과값 도출
 * 				&& => 직렬(조건 두개가 true일 경우에 ==> true)
 * 			
 * 				(조건)||(조건)
 * 	
 * 				|| => 병렬(조건 중 한 개 이상이 true면 true)
 * 
 * 		*** && : 범위나 기간이 포함되면 90~100 A
 * 		*** || : 범위나 기간이 미포함
 * 		*** 효율적인 연산 처리 ***
 * 	
 * 		실행 결과
 * 
 * 		------------------------------------------------
 * 							&&				||
 * 		------------------------------------------------
 * 		true ture			true			true
 * 		------------------------------------------------
 * 		true false			false			true
 * 		------------------------------------------------
 * 		false true			false			true	
 * 		------------------------------------------------
 * 		false true			false			false
 * 		------------------------------------------------
 * 
 * 		&&연산자 두개의 조건이 true일 경우에만 true
 * 		(조건) && (조건)
 * 		-----
 * 		false	============> false
 * 
 * 		||연산자 두개의 조건 중에 한 개 이상 true ==> true
 * 		(조건) || (조건)
 * 		true ==================> true (뒤에 있는 조건은 처리하지 않는다) ==> 효율적인 계산
 * 
 * 
 * 
 */
public class 논리연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=9;
		
		//boolean (t/f)
		
		boolean result=(a>b)&&++b==a; //false
		//				true ==> 조건 처리
		// 				false ==> 조건 처리 없이 결과값을 출력
		System.out.println(result);
		System.out.println("a="+a);
		System.out.println("b="+b);
		// 	b=10
		result=(a>b)||++b==a;
		// 		true ==> 조건처리 하지 않는다
		//		false ==> 조건 처리함
		System.out.println(result);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		
	}

}
