/*=====================================
  ■■■ 클래스 고급 ■■■
  - 인터페이스(Interface)
=====================================*/

// ○ 실습 문제
//	  성적 처리 프로그램을 구현한다.
//	  단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 2104256 곽두팔
// 국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2104257 윤춘삼
// 국어 영어 수학 점수 입력   (공백 구분) : 85 70 65

// 2106256 곽두팔  90 100  85			275		97
//				   수  수  우
// 2106257 윤춘식  85  70  65			220		73
//				   우  미  양
// 계속하려면 아무 키나...

// 90 ~ 100 : 수
// 80 ~  89 : 우 
// 70 ~  79 : 미
// 60 ~  69 : 양
// 나머지   : 가


import java.util.Scanner;

// 속성만 존재하는 클래스 → 자료형 활용
class Record 
{
	String hak, name;		//-- 학번, 이름
	int kor, eng, mat;		//-- 국어, 영어, 수학 점수
	int tot, avg;			//-- 총점, 평균(편의상 정수 처리)
	int score[] = new int[3];
}

// 인터페이스
interface Sungjuk 
{
	public void set();
	public void input();
	public void print();
}


// 문제 해결 과정에서 설계해야 할 클래스
class SungjukImpl extends Record implements Sungjuk
{
	
	Scanner sc = new Scanner(System.in);

	Record[] rc;
	int n;
	public void set()
	{
		System.out.print("인원 수 입력(1~10) : ");
		n = sc.nextInt();
		rc = new Record[n];
	}

	// Record[] rc = new Record[n]; 여기서 선언하면 웨않듀ㅔ..??
	

	public void input()
	{

		for (int i=0;i<n ;i++ )
		{
			rc[i] = new Record();
			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", i+1);
			rc[i].hak = sc.next();
			rc[i].name = sc.next();
			System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");
			rc[i].score[0] = rc[i].kor = sc.nextInt();
			rc[i].score[1] = rc[i].eng = sc.nextInt();
			rc[i].score[2] = rc[i].mat = sc.nextInt();

			rc[i].tot = rc[i].kor+rc[i].eng+rc[i].mat;
			rc[i].avg = rc[i].tot/3;
		}
		
	}

	public void print()
	{
		for (int i=0;i<n;i++)
		{
			System.out.printf("%s %s %3d %3d %3d\t%d\t%d%n", rc[i].hak, rc[i].name, rc[i].kor, rc[i].eng, rc[i].mat, rc[i].tot, rc[i].avg);
			System.out.print("           ");
			/*
			for (int j=0;j<3;j++)
			{
				if (rc[i].score[j] >= 90 && rc[i].score[j] <= 100)
					System.out.print("   수");
				else if (rc[i].score[j] >= 80 && rc[i].score[j] <= 89)
					System.out.print("   우");
				else if (rc[i].score[j] >= 70 && rc[i].score[j] <= 79)
					System.out.print("   미");
				else if (rc[i].score[j] >= 60 && rc[i].score[j] <= 69)
					System.out.print("   양");
				else 
					System.out.print("   가");
			}
			*/

			for (int j=0;j<3;j++)
			{
				switch (rc[i].score[j]/10)
				{
					case 10 : case 9: System.out.print("   수"); break;
					case 8: System.out.print("   우"); break;
					case 7: System.out.print("   미"); break;
					case 6: System.out.print("   양"); break;
					default: System.out.print("   가");
				}
			}
			System.out.println();


			/*
			스위치문.. 점수 나누기 10 해서 9면 ~ 수 8이면 우~
			*/

		
		}
	}
	
}


public class Test116
{
	public static void main(String[] args)
	{
		// check~!!!
		// Sungjuk은 인터페이스
		Sungjuk ob;
		ob = new SungjukImpl();

		// 문제 해결 과정에서 작성해야 할 ob 구성

		ob.set();
		ob.input();
		ob.print();
	}
}


/*
인원 수 입력(1~10) : 2
1번째 학생의 학번 이름 입력(공백 구분) : 789456 김민수
국어 영어 수학 점수 입력   (공백 구분) : 34 64 97
2번째 학생의 학번 이름 입력(공백 구분) : 123456 박치치
국어 영어 수학 점수 입력   (공백 구분) : 45 78 94
789456 김민수  34  64  97       195     65
              가   양   수
123456 박치치  45  78  94       217     72
              가   미   수
계속하려면 아무 키나 누르십시오 . . .

*/