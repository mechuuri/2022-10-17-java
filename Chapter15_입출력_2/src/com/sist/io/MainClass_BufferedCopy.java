package com.sist.io;
import java.io.*;
public class MainClass_BufferedCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	BufferedInputStream bis=new BufferedInputStream(new FileInputStream("c:\\javaDev\\apache-tomcat-9.0.68.zip"));
        	BufferedOutputStream bos=
        			new BufferedOutputStream(new FileOutputStream("c:\\java_data\\tomcat.zip"));
        	byte[] buffer=new byte[1024];
        	int i=0;
        	while((i=bis.read(buffer, 0, 1024))!=-1)
        	{
        		bos.write(buffer, 0, i);
        	}
        	bis.close();
        	bos.close();
        	System.out.println("파일 복사 완료!!");
        }catch(Exception ex) {}
	}

}