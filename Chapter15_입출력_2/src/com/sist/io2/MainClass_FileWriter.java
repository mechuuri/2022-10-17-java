package com.sist.io2;
import java.io.*;
import java.util.*;
class Student
{
	private int hakbun;
	private String name;
	private int eng,math,kor;
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
}
public class MainClass_FileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일 읽기
		try
		{
			String data="1|홍길동|90|80|90\n"
					+"2|박문수|90|99|90\n"
					+"3|심청이|100|95|90\n"
					+"4|이순신|90|85|97\n"
					+"5|강감찬|70|40|60";
			// 저장
			FileWriter fw=new FileWriter("c:\\java_data\\student.txt");///
			fw.write(data);// file 저장
			fw.close();// 파일 닫기
			/*
			 * 	FileWriter => write, close()
			 * 	FileReader => read, close()
			 * 	-1 : EOF
			 */
			System.out.println("데이터 저장 완료!!");
		}catch(Exception ex) {}
	}

}
