// 년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오
public class 메소드문제_6 {
static boolean isYear(int year)
{
	if((year%4==0 && year%100!=0) || year%400==0)
			return true;
		return false;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=isYear(2022);
		if(bCheck==true)
			System.out.println("윤년입니다");
		else
			System.out.println("윤년이 아닙니다");
	}

}
