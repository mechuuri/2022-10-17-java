package com.sist.movie;
// 변수 은닉화 => 데이터를 보호 (해킹, 변질) ==> 메모리에 없다고 가장(private)
// 다른 클래스에서 사용이 불가 => 변수의 기능만 첨부 (읽기/쓰기) 읽기: getXxx(), 쓰기: setXxx()
/*
 													getter / setter
 	======> MyBatis / Spring ==> setter에 값을 자동으로 채워준다
 */
													
public class MusicVO {
	private int mno;
	private String title;
	private String singer;
	private String album;
	private String state;
	private int crement;
	
}
