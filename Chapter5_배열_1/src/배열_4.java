// 초기화 ==> 사용자 입력 ==> 배열 : 같은 데이터형을 모아서 관리
// 기능별로 모아서 처리 
/*
 * 	3명의 학생 ==> 국어, 영어, 수학 점수를 입력 받아 총점, 평균, 학점을 출력해라
 * 	---------------------------------------------------------
 * 	변수 18개
 * 	배열 6개 => 국어, 영어, 수학, 총점, 평균, 학점 ==> 인덱스 0,1,2
 */
import java.util.Scanner;
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어 3개 저장 공간
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3]; // 총점
		
		double[] avg=new double[3]; // 평균
		char[] score=new char[3]; // 학점
		
		Scanner scan=new Scanner(System.in); // 점수를 부여

			for(int i=0;i<3;i++)
		{
			System.out.print((i+1)+"번쨰 국어점수 입력:");
			kor[i]=scan.nextInt();
			
			System.out.print((i+1)+"번쨰 영어점수 입력:");
			eng[i]=scan.nextInt();
			
			System.out.print((i+1)+"번쨰 수학점수 입력:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			

		
		}
		// 학점 
		for(int i=0;i<3;i++)
		{
			switch((int)avg[i]/10) // 정수, 문자, 문자열만 
			{
			case 10: case 9:
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
			default:
				score[i]='F';
			}
		}
		
		
		
		
		
		//출력 ==> 배열 1개에 있는 값만 출력이 가능... ==> 5개 동시에 출력 (일반=>인덱스)
		for(int i=0;i<3;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-5d%7.2f%3c\n",kor[i],eng[i],math[i],total[i],avg[i],score[i]); // -는 왼쪽 정렬 5자리 생기는데 왼쪽부터 채우고 공백 발생 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
