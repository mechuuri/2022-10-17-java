/*
 * 학점 계산하기!!!!! 다중 조건문이 더 편리함. . . . .
 * 90~100 A
 * 80~89 B
 * 70~79 C
 * 60~69 D
 * 59 -- F
 * 함수/메소드(안에)
 * 
 */
import java.util.Scanner;
public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3개의 정수 입력을 받아라 ㅋ(국어, 영어, 수학)
		Scanner scan=new Scanner(System.in);
		System.out.println("국어,영어,수학 점수 입력(80 80 80):");
		int kor=scan.nextInt();//사용자가 입력한 값 가져와서 대입시키기 
		int eng=scan.nextInt();//읽어오는 기능=>메소드.....
		int math=scan.nextInt();
		
		//총점
		int total=kor+eng+math;
		//평균
		double avg=total/3.0;
		
		//학점
		char score=' ';//a 줘도 상관 없음 
		switch((int)(avg/10)) // 실수 안되기 떄문에 int로 형변환 ... case문장을 적게 => 10,9,8,...
		{
			// if(avg==10 || avg==9)
			case 10:// 10이나 9일 때 A
			case 9:
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
				break;
			case 6:
				score='D';
				break;
			default:
				score='F';
		}
		
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+score);
		}

	}


