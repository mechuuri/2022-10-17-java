package com.sist.collection2;
/*
 	Properties
 	-----------
 	파일을 읽어서 데이터를 가지고 온다
 	=> 중요한 데이터가 있는 경우 (데이터베이스 정보)
 						 -------------- 오라클 위치, ID, Password
 	=> 유효성 검사
 	----------------- 마이바티스, 스프링 ...(XML,properties)
 	1) 객체 생성
 	2) 파일 읽기
 	3) 키 => 값읽기
 */
import java.util.*;
import java.io.*;
public class MainClass_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Properties prop=new Properties();
			//파일 읽기 660page
			prop.load(new FileInputStream("C:\\javaDev\\newJavaStudy\\Chapter11_컬렉션_2\\src\\com\\sist\\collection2\\info.properties"));
			String name=prop.getProperty("name");
			String address=prop.getProperty("address");
			String tel=prop.getProperty("tel");
			System.out.println(name+" "+address+" "+tel);
			// 663page
			Properties props=System.getProperties();
			System.out.println(props.getProperty("java.version"));// 시스템버전
			System.out.println(props.getProperty("user.language"));// 언어
			props.list(System.out);// 정보 출력
			// System에 저장된 정보
			// 662page
			Properties props2=new Properties();
			props2.setProperty("driver", "oracl.jdbc.driver.OracleDriver");
			props2.setProperty("url", "jdbc:oracle:thin:@localhost:1521:XE");
			props2.setProperty("username", "hr");
			props2.setProperty("password", "happy");
			try
			{
				props2.store(new FileOutputStream("db.properties"), "데이터베이스 정보");
				props2.storeToXML(new FileOutputStream("db.xml"), "datebase info");
			}catch(Exception ex) {}
		}catch(Exception ex) {}
	}

}
