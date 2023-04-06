package com.sist.server;
import java.util.*;
import java.io.*;
import java.net.*;
/*
 	서버 프로그램 ===> TCP(신뢰성 중심, 연결지향적=>전화) / UDP(게임개발, 비연결지향적 = 우편)
 	---------     ------------------------------------------------------ RTCP (화상, 음성)
 	1. 전화기를 개통
 	   ----- 연결기기 => 솦트웨어로 제작, 전화번호, 전화선
 	         ------ Socket, IP(고정IP), PORT (0~65535)
 	   ---- 개통 bind()
 	   Socket s=new Socket();
 	   s.bind(ip,port)
 	   
 	2. 전화가 올때까지 대기상태
 		s.listen()
 	3. 전화가 왔을 때 어떻게 처리
 		s.accept() => 접속을 받은 경우 => 접속한 사람의 IP ==> 발신자 번호 
 	4. 통신 시작
 		s.write() => 전송 ======> s.read()
 		s.read() => 요청을 받는다 <=== s.write()
 */
public class Server {

}
