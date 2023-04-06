package com.sist.regex;
import java.util.regex.*; // 정규식 패턴을 만들어서 원하는 문자나 데이터를 찾는 것
public class MainClass_Regex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String data="HP:010-1111-1111,OFFICE:02-2222-2222";
		String pattern="(0\\d{1,2})-(\\d{4})-(\\d{4})";// d 숫자다음에 숫자몇개 올것인지 
		// 0 숫자 1,2 010 02, 4 4 시발 존니 어려워
		//System.out.println(pattern);
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(data);
		while(m.find())// 존재여부 확인
		{
			System.out.println(m.group());
		}*/
		String ip="221.89.63.1,211.89.63.131,127.0.0.1,169.123.174.2,223.130.195.200,211.249.220.24"
					+"142.250.196.99,12345.123.11111.5555,67676767676.567";
		String pattern="(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})";
		//				[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.
		//				\\d ==> [0-9]
		
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(ip);//  ip만 출력
		while(m.find())
		{
			if((m.group(1)+"."+m.group(2)+"."+m.group(3)).equals("211.89.63"))
			{
				System.out.println(m.group()+" => IP는 접근을 거부 (403)");
			}
		}
			
	}

}
