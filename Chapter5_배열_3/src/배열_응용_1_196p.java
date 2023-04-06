import java.util.Arrays;

// 5개의 정수를 저장 ==> 총합 / 평균 ==> 196
// 응용 ==> 3명의 학생 국어, 영어, 수학 ==> 총점/평균/학점 ==> 등수 count?
// 숫자 야구 게임
public class 배열_응용_1_196p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score=new int[5]; // 선언
		for(int i=0;i<score.length;i++) // 필요한 값을 저장
		{
			score[i]=(int)(Math.random()*71)+30; // 100점 만점에 30점 기본으로 줌 ==> 0~100
		}
		System.out.println(Arrays.toString(score)); // 출력
		// 총합 / 평균
		int total=0;
		//double avg=0.0;
		// 총합 구하기
		for(int i:score)
		{
			total+=i;
		}
		// 총합 출력
		System.out.println("총합:"+total);
		System.out.printf("%.2f\n",total/(double)score.length);
		
	}

}
