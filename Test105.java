/*====================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
=====================================*/

// 풀이 없는 문제

// ○ 실습 문제
//	  사용자로부터 여러 학생의 성적 데이터를 입력받아
//	  점수가 높은 순으로 등수를 부열하여 결과를 출력하는 프로그램을 구현한다.
//	  단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1) : 곽춘배 90
// 이름 점수 입력(2) : 곽춘식 80
// 이름 점수 입력(3) : 곽춘용 85
// 이름 점수 입력(4) : 곽춘삼 75
// 이름 점수 입력(5) : 곽춘기 95

//==============================
// 1등 곽춘기 95
// 2등 곽춘배 90
// 3등 곽춘용 85
// 4등 곽춘식 80
// 5등 곽춘삼 75

import java.util.Scanner;

public class Test105
{
	public static void main(String[] args)
	{
		int n; // 인원 수
		Scanner sc = new Scanner(System.in);

		// 1. 인원 수 입력 받기
		System.out.print("인원 수 입력 : ");
		n = sc.nextInt();

		// 2. 배열 안에 배열 넣어보자..

		String str[][] = new String[n][n];
		int score[] = new int[n]; // 점수만 추출해서 넣을 배열
		String temp; // 이름 잠시 보관할.. 변수..

		for (int i=0;i<n ;i++ )
		{
			System.out.printf("이름 점수 입력(%d) : ", i+1);
			for (int j=0;j<2 ;j++ )	
					str[i][j] = sc.next();
			score[i] = Integer.parseInt(str[i][1]);
		}

		// 확인
		// for (int i=0;i<n;i++ )
			// System.out.print(" " + score[i]);

		// 3. 점수 비교하기

		int pass = 0;
		boolean flag;

		do
		{
			pass++;
			flag = false;

			for (int i =0;i<score.length-pass ;i++ )
			{
				if (score[i]<score[i+1])
				{
					score[i] = score[i]^score[i+1];
					score[i+1] = score[i+1]^score[i];
					score[i] = score[i]^score[i+1];

					temp = str[i][0];
					str[i][0] = str[i+1][0];
					str[i+1][0] = temp;
					

					flag = true;
				}
			}

		}
		while (flag);

		for (int i=0;i<n;i++ )
			System.out.print(" " + score[i]);
		for (int i=0;i<n;i++)
			System.out.printf("%d등 %s %d%n", i+1, str[i][0], score[i]);
	
		
	}
}


// 이름 배열 점수 배열 따로 받기
// String 따로..
// Record class 만들기 
// arrStu = new Record[n]
// arrStu[i].score