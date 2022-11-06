//==> 초기화 (난수) => {값...} >> 명시적 초기화
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언
		int[] arr=new int[5];
		//	arr[0] ~[4] = 0
		for(int i=0;i<5;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 값을 출력
		// 향상된 for문 ===> 출력 전용 (forEach구문)
		/*
		 * 	for(데이터형 변수:배열명) ==> 데이터가 없으면(데이터가 다 출력되면) 자동으로 for문 종료 ==> 실제데이터 가져오기 때문에 값 변경이 어려움
		 * 		---------
		 * 		실제 배열에 저장된 값을 읽어 온다 (항상 같은 데이터형이나 큰 데이터형 사용)
		 * 		int[] ==> int, long, double
		 * 		char[] ==> int, long, double, char
		 * 		double[] ==> double
		 * 		long[] ==> long, double
		 * 
		 * 
		 */
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		// forEach ==> 배열 / 컬렉션 ==> 화면 출력 (웹에 화면 출력 시 forEach)
		
		// 배열 변경 후 다시 출력
		System.out.println();
		
		/*arr[0]=arr[0]+1;
		arr[1]=arr[1]+2;
		arr[2]=arr[2]+3;
		arr[3]=arr[3]+4;
		arr[4]=arr[4]+5;
		*/
		
		for(int i=0;i<5;i++)
		{
			arr[i]=arr[i]+(i+1);
		}
		// readonly
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
	}

}
