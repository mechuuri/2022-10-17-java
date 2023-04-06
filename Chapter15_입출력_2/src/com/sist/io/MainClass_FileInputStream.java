package com.sist.io;
import java.io.FileInputStream;
import java.util.*;
public class MainClass_FileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis=new FileInputStream("c:\\download\\sawon.txt");
			// 파일 읽기 / 파일 쓰기 전용이 아니고(글자가 좀 깨짐) 파일 복사 (다운로드/업로드)
			int i=0;// 한글자씩 파일을 읽어 올 때 ==> 글자마다 번호를 출력
			while((i=fis.read())!=-1)// -1이 아닐 때까지 EOF(파일이 끝날때까지 i값을 갖고와)
			{
				 System.out.println((char)i);
			}
			fis.close();
		}catch(Exception ex) {}
	}

}
