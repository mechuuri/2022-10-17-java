/*
 *	관련된 클래스를 묶어서 한개의 폴더에 저장해서 관리
 *	자바에서 지원하는 패키지
 *	-------------------
 *		java.util ===> jdk1.0
 *		java.io // 입출력 관련
 *		java.net 
 *		java.sql
 *		javax ===> jdk1.2
 *		javax.xml
 *		javax.servlet ===> 웨
 *		-------------
 *
 *		예)
 *			웹
 *			게시판
 *			예매
 *			추천
 *			회원
 *			어디민
 *			데이터형	========> import를 사용
 *		----------------------------------
 *		폴더명 (패키지) com/org => 회사명 => 기능명 
 *		게시판
 *			com.sist.board
 *					-------
 *			com.sist.reserve
 *					 -------
 *			com.sist.member
 *			com.sist.recommand
 *			com.sist.admin
 *
 *			com.sist.board
 *			=> Board
 *			public class Board
 *			{
 *				int bno;
 *				String name;
 *				String subject;
 *				String content;
 *				...
 *	
 *			}
 *			com.sist.member
 *			=> 사용이 불가능
 *			=> Member
 *			public class Member
 *			{
 *				int mno;
 *				String name;
 *			}
 *		
 */
public class 패키지_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
