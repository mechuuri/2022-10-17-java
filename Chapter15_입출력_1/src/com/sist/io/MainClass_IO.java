package com.sist.io;
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
public class MainClass_IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			// File 관련 
			// 1. File 목록 읽기 : File[] listFiles()
			// 2. File 만들기 / 디렉토리 만들기 createNewFile(), mkdir()
			// 3. File 속성
			// 4. = 파일명 / 경로명 / 파일+경로명 / 수정 날짜, 디렉토리, 파일 여부 확인 / 숨김, 쓰기, 읽기
			//		getName() getParent(), getPath() lastModified, isFile, isDriectory
			// 		canWrite, canRead isHidden
			/*File dir=new File("c:\\javaDev");// 디렉토리 
			File[] files=dir.listFiles();// 디렉토리의 모든 파일을 갖고와라
			for(File f:files)
			{
				if(f.isDirectory())// 폴더인 경우
					System.out.println("<DIR>"+f.getName());
				else
					// 파일일 경우
					System.out.println(f.getName());
			}*/
			// 폴더 만들기 : mkdir()
			File file=new File("c:\\download\\sawon.txt");
			/*if(!dir.exists())// 폴더가 없다면 ==> exists() : 존재여부 확인
			{
				dir.mkdir();
			}*/
			// 파일 만들기 : createNewFile
			/*if(!file.exists())
			{
				file.createNewFile();
			}*/
			// 파일에 대한 정보 확인 
			System.out.println("파일명:"+file.getName());
			System.out.println("경로명:"+file.getParent());
			System.out.println("경로+파일:"+file.getPath());
			System.out.println("파일크기:"+file.length());
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy년도 MM월 dd일 hh시 mm분 ss초");
			System.out.println("파일수정일:"+sdf.format(file.lastModified()));
			System.out.println("숨김파일:"+file.isHidden());
			System.out.println("읽기전용:"+file.canRead());
			System.out.println("쓰기전용:"+file.canWrite());
		}catch(Exception ex) {}
	}

}
