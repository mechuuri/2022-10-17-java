/*
 * 	메소드 : 특정 작업을 하기 위한 명령문의 집합
 * 		  ** 메소드 VS 함수 -> 독립적으로 생성 => 자바스크립트, C언어 ==> 기능은 동일
 * 			ㄴ 클래스 종속(클래스 안에서 생성)
 * 			특정 작업(한가지 기능을 수행)
 * 		  ** 형상관리 : GIT (협업)
 * 	1) 메소드를 사용하는 목적
 * 		= 반복되는 기능을 제거
 * 		= 코드관리가 쉽다 (기능별로 나눠서 처리) ==> 문장 단락을 나눠서 처리 (유지보수)
 * 		= 소스가 간결해 진다 (중복코드를 제거)
 * 		= 다른 클래스와 연결
 * 		= 재사용률 높임
 * 	2) 메소드의 종류
 * 		= 공통 메소드 : 자동으로 메모리에 저장 = static(***)
 * 		= 인스턴스 메소드 : 메모리마다 따로 저장되는 메소드
 * 	3) 메소드를 만드는 형식
 * 		1. 리턴형  2. 메소드명 (3. 매개변수)
 * 		{
 * 			처리 문장 => 지역변수, 연산처리, 제어문처리
 * 			return 값; => 결과값
 * 		}
 * 	4) 메소드의 구성요소
 * 		1. 리턴형 : 사용자 요청 ==> 처리 ==> 결과값을 사용자에게 전송
 * 				--------------------------------------
 * 				 웹) 로그인, 회원가입, 게시판 글쓰기, 게시판, 영화 => 목록, 상세...
 * 					메뉴(메소드), 버튼
 * 					==> 기능 설계 (벤치마킹 ==> 요구사항 분석)
 * 				==> 한개만 사용이 가능
 * 					기본형 (int, double, String, 클래스, 배열)
 * 					형식) 
 * 						int 메소드명()
 * 						double 메소드명()
 * 						String 메소드명()
 * 						--------------------------> Call By value
 * 						Movie 메소드명()
 * 						int[] 메소드명() ==> 여러개 줄 때 배열사용
 * 						--------------------------> 사용하지 않을 수 있다 (리턴형 => 매개변수) Call By Reference
 * 				*** 결과값이 없는 경우 ==> void(메소드 자체에서 처리)
 * 
 * 		2. 메소드명 : 식별자(변수)
 * 					알파벳, 한글(대소문자 구분)
 * 					숫자를 사용할 수 있다 (앞에 사용금지)
 * 					키워드 사용 금지
 * 					특수문자 (_,$) 
 * 					메소드명의 길이는 제한이 없다(5~12)
 * 					** 소문자로 시작한다
 * 					파일 이름을 가지고 온다 : getFileName()
 * 										-	-
 * 										저장을 한다 : setXxx()
 * 										가지고 온다 : getXxx()
 * 										존재 여부 확인 (boolean) : isLogin()
 * 										의미 있는 명칭 => 찾기
 * 					** 단어가 두개 이상이면 첫자는 대문자로 시작, 아니면 _로 시작
 * 					** 변수명, 메소드명 ...: 리펙토링
 * 
 * 		3. 매개변수 : 사용자가 요청한 값
 * 					매개변수 갯수는 제한이 없다 (로그인(id,pwd), 회원가입, 글쓰기...)
 * 													  ---------------- 배열, 클래스
 * 					매개변수가 3개 이상 ==> 배열, 클래스 이용한다
 * 					구분은 ,로 한다
 * 					*** 사용자로부터 어떤 값을 받을 지, 어떤 결과값을 보내줄지
 * 					메소드명(int a,int b,int c)
 * 					메소드명(int[] arr
 * 					** 없는 경우도 있다 ==> ()
 * 
 * 
 * 		4. 처리문장 : 연산처리 (연산자), 제어문
 * 				   -------------------
 * 					오라클, 파일 찾기
 * 
 * 		5. 결과값 : 메소드안에 "return 값"
 * 				    결과값이 없는 경우 : void ==> return이 생략이 가능(컴파일러가 자동 첨부)
 * 				  return의 위치는 메소드 안에만 존재하면 된다
 * 				  return은 메소드 종료시에 사용 (for => break)
 * 
 * 	5) 메소드 => 생각
 * 			1. 동작 과정(행위)
 * 			2. 화면에 출력된 내용 : 리턴형
 * 			3. 사용자에게 유도 : 어떤 매개변수를 넘겨주고 있는지
 * 
 * 	6) 메소드 유형
 * 	------------------
 * 		리턴형	매개변수
 * 	------------------
 * 		 O		 O
 * 			==> boolean isLogin(String id,String pwd) **** 메소드 유형 중 가장 많이 나오는
 * 				------			--------------------
 * 				로그인 요청 => 사용자로부터 id,pwd를 받아서 결과값으로는 true/false를 전송
 * 				목록 ==> 사용자로부터 페이지 번호를 받아서 => 이미지를 여러개 전송
 * 				String[] movieList(int page)
 * 				상세보기 ==> 사용자로부터 영화 고유번호를 받아서 상세보기에 출력할 데이터 전송
 * 				String movieDetail(int movieNo)
 * 	------------------
 * 		 O		 X
 * 			==> double random() : 값만 전송
 * 			==> String trim() : 값만 전송
 * 	------------------
 * 		 X		 O
 * 		--- >> 리턴형이 없는 경우 ==> void
 * 			==> 메소드 안에서 자체 처리 (뉴스 출력)
 * 				System.out.println("Hello") => void println(String msg) 사용자에게 값을 받아서 출력만 해주는..
 * 				=> 파일 저장, 파일 수정
 * 	------------------
 * 		 X		 X
 * 		--- 다음줄에 출력한다 <br> System.out.println(); 매개변수 없을 때는 다음 줄에 출력한다
 * 	------------------	 
 * 
 * 		예)
 * 			1~10까지 출력하는 메소드를 만든다 ==> 메소드 자체에서 처리. 호출하면 바로 출력하는.. 4번째 유형 리턴형, 매개변수 X
 * 
 * 			1~10까지 합을 구하라 ==> 리턴형 O 매개변수 X
 * 
 * 			1~n까지 합을 구하라 ==> n을 사용자로부터 받아서 합을 보내준다 ==> 리턴형 O 매개변수 O
 * 			--- 사용자로부터 받는다
 * 	
 * 			사용자로부터 단을 받아서 해당 단을 출력해라
 * 							------------- 메소드 자체 처리 (void) 리턴 X 매개변수 O
 * 
 * 			매개변수는 사용자로부터 받은 값
 * 			==> Scanner : 매개변수
 * 			==> 웹, 윈도우 : 입력창 (검색,로그인,회원가입)
 * 			사용자가 요구할 때 (구하라...) => 매개변수 존재
 */
public class 메소드정리_1_예시까지 {
	// 1~10까지 출력하는 메소드를 만든다 ==> 1~10까지 출력하는 기능 (메소드)
	static void print()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	// 1~10까지 합을 구하라 ==> 리턴형이 존재 (범위가 지정되면 => 매개변수는 존재하지 않는다)
	static int hap()
	{
		// 1~10까지 합을 구해서 전송!!!
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum+=i;
		}
		return sum;
	}
	// 1~n까지 합을 구하라
	static int hap2(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
	// 사용자로부터 단을 받아서 해당단을 출력
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.println(dan+"*"+i+"="+dan*+i);
		}
		return; // 생략이 가능
	}
	// main() ==> 프로그램의 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드 호출 ==> 메소드명(매개변수 값...) ==> void인 경우 처리법
		// 리턴형 ==> 데이터형(리턴형의 데이터형과 일치) 변수=메소드명(매개변수)
		// System.out.println(메소드명())
		/*
		 * 	메소드는 호출하면 처음부터 return이 있는 곳까지 수행 ==> 호출한 위치로 다시 복귀
		 */
		print();// 리턴형(X),매개변수(X)
		System.out.println("==================");
		int sum=hap();// 리턴형(O),매개변수(X)
		// 리턴형이 있는 경우에는 리턴값(return 10)을 받아서 변수에 저장
		System.out.println("sum="+sum);
		System.out.println("sum="+hap()); // 메소드 안에서 메소드 호출이 가능
		
		int sum2=hap2(100);// 리턴형(O), 매개변수(O)
		System.out.println("sum2="+sum2);
		// static void gugudan(int dan) ==> 받을 때 dan은 7
		gugudan(7); 
		// 호출 방법 ==> 메소드 안에 있는 명령문을 실행해라
		
		
		
		
		
		
		
		
	}

}
