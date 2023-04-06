package com.sist.generics;
import java.util.*;
class Sawon
{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private int pay;
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public Sawon(int sabun, String name, String dept, String loc, int pay) {
		// 매개변수 있는 생성자 
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
		this.pay = pay;
	}

	
	
}
public class MainClass_제네릭스활용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sawon> list=new ArrayList<Sawon>();
		list.add(new Sawon(1,"홍길동","개발부","서울",300));
		list.add(new Sawon(2,"박문수","기획부","부산",300));
		list.add(new Sawon(3,"이순신","자재부","서울",300));
		list.add(new Sawon(4,"강감찬","영업부","제주",300));
		list.add(new Sawon(5,"박지성","개발부","서울",300));
		
		// 출력
		System.out.println("======== 사원 목록 =========");
		for(Sawon sa:list)
		{
			System.out.println(sa.getSabun()+" "
					+sa.getName()+" "
					+sa.getDept()+" "
					+sa.getLoc()+" "
					+sa.getPay());
		}
		
	}

}
