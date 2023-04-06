
public class 오버로딩_2 {
	/*void names(String n1)
	{
		System.out.println(n1);
	}
	void names(String n1,String n2)
	{
		System.out.println(n1+" "+n2);
	}
	void names(String n1,String n2,String n3)
	{
		System.out.println(n1+" "+n2+" "+n3);
	}
	void names(String n1,String n2,String n3,String n4)
	{
		System.out.println(n1+" "+n2+" "+n3+" "+n4);
	}
	void names(String n1,String n2,String n3,String n4,String n5)
	{
		System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5);
	} */
	// 가변 매개변수
	void names(String...name) //원하는 갯수만큼 데이터 집어넣을 수 있음
	{
		for(String s:name)
		{
			System.out.print(s+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		오버로딩_2 a=new 오버로딩_2();
		a.names("홍길동");
		a.names("홍길동","박문수");
		a.names("홍길동","박문수","이순신");
		a.names("홍길동","박문수","이순신","김두한");
		a.names("홍길동","박문수","이순신","김두한","강감찬");
		
	}

}
