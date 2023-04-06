package com.sist.main;
import java.io.*;
import java.net.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			URL url=new URL("https://www.daum.net/");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			if(conn!=null)// 연결되었다면
			{
				BufferedReader in=
						new BufferedReader(new InputStreamReader(conn.getInputStream()));
				while(true)
				{
					String s=in.readLine();
					if(s==null) break;
					
				}
			}
		}catch(Exception ex) {}
	}

}
