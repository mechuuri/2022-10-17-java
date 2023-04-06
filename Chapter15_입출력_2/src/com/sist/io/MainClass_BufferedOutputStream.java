package com.sist.io;
import java.io.*;
public class MainClass_BufferedOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File dir=new File("c:\\java_data");
			if(!dir.exists())// 폴더가 존재하지 않는 경우
			{
				dir.mkdir();// 저장 폴더를 만든다
				System.out.println("데이터 저장 폴더가 생성되었습니다!!");
			}
			else
			{
				System.out.println("이미 존재하는 폴더입니다!!");
			}
			// 파일을 바로 연결하는 것이 아니라 임시로 사용자가 보내준 데이터를 메모리에 저장했다가 close가 되면 파일과 연결
			BufferedOutputStream bos=
					new BufferedOutputStream(new FileOutputStream("c:\\java_data\\student.txt"));// Create
		/*
		 	new FileOutputStream("") => Create (파일을 생성)
		 	new FileOutputStream("", true) => Append (기존의 파일에 데이터 추가)
		 */
			String std="1|홍길동|90|80|70\n"
					+"2|박문수|90|80|70\n"
					+"3|이순신|90|80|70\n"
					+"4|강감찬|90|80|70\n"
					+"5|을지문덕|90|80|70";
			bos.write(std.getBytes());// 메모리에 저장
			bos.close();// 파일로 전송
			System.out.println("데이터 저장 완료!!");
					
		}catch(Exception ex) {}
	}

}
