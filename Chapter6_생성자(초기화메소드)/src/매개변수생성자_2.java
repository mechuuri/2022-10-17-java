class Member
{
	int mno;
	String name="홍길동";
	String address="서울";
	String tel="010-1111-1111";
	
	Member(String name, String address, String tel)
	{
		mno=++mno;
		this.name=name;
		this.address=address;
		this.tel=tel;
	}
	Member(int mno, String name, String address, String tel) {
		
		this.mno = mno;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	// 메모리 할당 시에 => 초기화 
	void print()
	{
		System.out.println("회원번호:"+mno);
		System.out.println("이름:"+name);
		System.out.println("주소:"+address);
		System.out.println("전화:"+tel);
	}
}
public class 매개변수생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member(1,"홍길동","서울","010-1111-1111");
		m1.print();
		Member m2=new Member(2,"박문수","경기","010-2222-2222");
		m2.print();
		Member m3=new Member(3,"이순신","부산","010-3333-3333");
		m3.print();
		Member m4=new Member("강감찬","인천","010-4444-4444");
		m4.print();
		
		
	}

}
