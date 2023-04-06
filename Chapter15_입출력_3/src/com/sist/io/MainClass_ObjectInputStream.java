package com.sist.io;
import java.util.*;
import java.io.*;
class Sawon implements Serializable // 저장될 때 직렬로 저장되게 => 직렬화 
{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private String job;
	// sabun name dept loc job : 데이터스트림(연속적인 메모리에 저장)
	
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Sawon(int sabun, String name, String dept, String loc, String job) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
		this.job = job;
	}
	public Sawon() {}
	
}
public class MainClass_ObjectInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<Sawon> list=new ArrayList<Sawon>();
		list.add(new Sawon(1,"홍길동","개발부","서울","대리"));
		list.add(new Sawon(2,"김두한","기획부","부산","사원"));
		list.add(new Sawon(3,"이순신","자재부","제주","과장"));
		list.add(new Sawon(4,"강감찬","총무부","인천","사원"));
		list.add(new Sawon(5,"박지성","개발부","서울","부장"));
		// ArrayList 자체를 저장
		try
		{
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("c:\\java_data\\sawon.txt"));
			oos.writeObject(list);
			oos.close();
			System.out.println("저장완료!!");
		}catch(Exception ex) {}*/
		
		// 데이터 읽기 => 화면 출력
		ArrayList<Sawon> list=new ArrayList<Sawon>();
		try
		{
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("c:\\java_data\\sawon.txt"));
			list=(ArrayList<Sawon>)ois.readObject();
			ois.close();
			
			// 출력
			for(Sawon s:list)
			{
				System.out.println(s.getSabun()+" "
						+s.getName()+" "
						+s.getDept()+" "
						+s.getLoc()+" "
						+s.getJob());
			}
		}catch (Exception ex) {}
		
		
	}

}
