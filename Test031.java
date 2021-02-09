/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - if문 실습
=====================================*/

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 다음과 같은 형태로 출력하는 프로그램을 구현한다.
// 단, BufferedReader의 readLine()을 통해 입력받을 수 있도록 하며,
// printf()를 통해 출력할 수 있도록 한다.

// 실행 예)
// 이름 입력 : 박수수
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// >> 당신의 이름은 박수수입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70,
// >> 총점은 240이고, 평균은 80입니다.
// >> 등급은 B 입니다.

// ※ 이 때, 등급은 평균 점수를 기준으로 처리한다.
// 90점 이상			 : A		
// 80점 이상 ~ 90점 미만 : B
// 70점 이상 ~ 80점 미만 : C		
// 60점 이상 ~ 70점 미만 : D
// 60점 미만			 : F

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int kor,eng, mat, tot;  //-- 국어, 영어, 수학, 총점
		double avg;				//-- 평균
		String name;				//-- 이름
		char grade;					// 등급

		// 변수를 꼭 위에서 한 번에 선언할 필요 없음.
		// 한번에 볼 수 있지.
		// 필요할 때 아래에서 선언해도 됨. 일일이 올려서 보기 귀찮으니까..

		System.out.print("이름 입력 : ");
		name = br.readLine();
		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 : ");
		mat = Integer.parseInt(br.readLine());
		
		// 총점 산출
		tot = (kor + eng + mat);

		// 평균 산출
		avg = tot/3.0;      // 정수/정수는 몫만 나오니까!!!!!

		if(avg >= 90)
		{
		grade = 'A';
		}

		else if(avg >= 80)			// 위 내용을 포함(90이상이 안된다)하기 때문에 굳이 90미만 안써줘도 됨.
		grade = 'B';								// 잘못된 결과를 알려줄 뿐!! 이게 더 위험!!

		else if(avg >= 70)
		grade = 'C';
				 
		else if(avg >= 60)
		grade = 'D';

		else						// else F로 하면 에러난다!! 변수 선언때 F로 초기화 하지 않으면..
		grade = 'F';

		/*
		else if(avg >= 80 && avg < 90)			// 여기서 논리 연산 잘못해도 자바가 잘못 알려주지 않음.
		grade = 'B';								// 잘못된 결과를 알려줄 뿐!! 이게 더 위험!!

		else if(avg >= 70 && avg < 80)
		grade = 'C';
				 
		else if(avg >= 60 && avg < 70)
		grade = 'D';

		else
		grade = 'F';


		*/
		

		System.out.printf("\n>> 당신의 이름은 %s입니다.\n", name);
		System.out.printf(">> 국어 점수는 %d,\n", kor);
		System.out.printf(">> 영어 점수는 %d,\n", eng);
		System.out.printf(">> 수학 점수는 %d,\n", mat);
		System.out.printf(">> 총점은 %d이고, 평균은 %.2f입니다.\n", tot, avg);   //aver은 실수다
		System.out.printf(">> 등급은 %c입니다.", grade);

	}
}

// 왜 else if로 F처리하면 안되지?
// 자바 입장에서는 출력할 때 변수 안에 값이 있냐없냐가 중요
// else if로 끝나면.. F가 아니면 어떡해?? 이렇게 묻는다는 것!!


/*
이름 입력 : 박수수
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

>> 당신의 이름은 박수수입니다.
>> 국어 점수는 90,
>> 영어 점수는 80,
>> 수학 점수는 70,
>> 총점은 240이고, 평균은 80.00입니다.
>> 등급은 B입니다.계속하려면 아무 키나 누르십시오 . . .
*/
