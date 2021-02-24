/*=====================================
  ■■■ 만년 달력 ■■■
=====================================*/

// ○ 다음과 같은 프로그램을 구현한다.

// 실행 예)
// 『연도』를 입력하세요 : 2021
// 『월』을 입력하세요 : 7
/*
		[2021년 7월]

  일  월  화  수  목  금  토
=============================
				   1   2   3
   4   5   6   7   8   9  10
  11  12  13  14  15  16  17
  18  19  20  21  22  23  24
  25  26  28  28  29  30  31
=============================
계속하려면 아무 키나...
*/


/* 문제 인식 및 분석 

	- 서기 1년 1월 1일 월요일
	- 연도가 4의 배수이면서 100의 배수가 아니거나,
	  400의 배수이면 2월은 29(윤년),
	  나머지 2월 28일(평년)

	- 2021년 7월의 달력을 그린다고 가정하면
	  1. 1. 1. ~ 2021.6.30 까지의 전체 날 수를 구한다.
	  그 날 수에 +1 연산을 수행하면... (2021년 7월 1일의 요일 확인)
	  7월의 달력 그릴 준비 끝~!!!

	- 요일 = 전체날수 % 7
	  요일 = 0 → 일요일
	  		 1 → 월요일
			 	 :

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test100
{
	public static void main(String[] args) throws IOException
	{
		// BuffredReader 클래스 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 배열 선언 및 초기화
		// 각 달이 담고있는 마지막 날짜(매 월의 최대 날짜)
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// 확인
		// System.out.println(days.length);
		//--==>> 12

		// 주요 변수 선언
		int nalsu, y, m, w ; //-- 날수, 년, 월, 요일

		do
		{
			System.out.print("『연도』를 입력하세요 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);
		
		do
		{
			System.out.print("『월』을 입력하세요 : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);
		
		//--------------------------------- 여기까지 수행하면 유효한 연도, 월 입력한 상태~!!!

		// 입력받은 년도에 해당하는 2월의 마지막 날 계산

		if (y%4==0 && y%100!=0 || y%400 == 0)		//-- 윤년이라면..
			days[1] = 29;
		else
			days[1] = 28;							// 써도 되고 안써도 됨


		//-- else 구문은
		//	 현재 days 배열의 1번째 요소가 기본적으로 28로 입력되어 있는
		//	 상태이기 때문에 생략이 가능한 구문이 된다.

		// 1년 1월 1일 ~ 입력 받은 년도 이전 년도의 12월 31일까지의 
		// 날 수 계산
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		// 확인
		// System.out.println(nalsu);

		/*
		『연도』를 입력하세요 : 2019
		『월』을 입력하세요 : 5
		737059
		계속하려면 아무 키나 누르십시오 . . .
		*/

		// 입력받은년도 (해당년도) 1월 1일 ~ 입력한 월의 이전 월 까지의
		// 날 수 누적 계산
		// 즉, 위의 예에 따르면...
		// 2019년 1월 1일 ~ 2019년 4월 30일까지의 날 수 누적하여
		// 기존 nalsu에 누적
		for (int i=0;i<(m-1) ;i++ )			// i<(m-1) check~!!! = i<=(m-2)
			nalsu += days[i];
		
		// 확인
		// System.out.println(nalsu);
		//--==>>
		/*
		『연도』를 입력하세요 : 2019
		『월』을 입력하세요 : 5
		737210
		*/

		// 입력 받은 월의 1일
		nalsu += 1;				//== nalsu++

		// 확인
		// System.out.println(nalsu);

		/*
		5월 1일까지의 날 수
		『연도』를 입력하세요 : 2019
		『월』을 입력하세요 : 5
		737211
		계속하려면 아무 키나 누르십시오 . . .
		*/

		//-------------------------------------------------- 여기까지 수행하면 모든 날 수에 대한 종합 완료

		// 요일 산출
		// : 입력받은 월의 1일이 무슨 요일인지 확인하기 위한 연산
		w = nalsu%7;	//-- 0:일요일, 1:월요일, 2:화요일 ...

		// 확인
		// System.out.println(w);

		//--==>>
		/*

		*/

		// 출력(달력 그리기)
		System.out.println();
		System.out.println("\t [ " + y + "년 " + m + "월 ]");
		System.out.println();
		System.out.println("  일  월  화  수  목  금  토");  // 두 칸 공백 . 한 요일은 총 4칸 먹음.
		System.out.println("============================");

		// 특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정)
		for (int i=1;i<=w;i++ )							// w가 0일 땐 공백 발생하면 안됨
		{
			System.out.print("    ");
		}

		// 확인
		// System.out.printf("%4d", 1); // 하나의 날짜가 4칸 씩, 그리고 1일이 어디에 찍히는 지 보는 것.
		/*
		『연도』를 입력하세요 : 2019
		『월』을 입력하세요 : 5

				[ 2019년5월 ]
		일  월  화  수  목  금  토
		============================
					1계속하려면 아무 키나 누르십시오 . . .
		*/

		// 해당 월(입력한 월)의 날짜만 출력될 수 있도록 반복문 구성
		for (int i=1; i<=days[m-1];i++ )
		{
			System.out.printf("%4d", i); // 개행 없이 쭈우우욱
			w++;						 //-- 날짜가 증가하는만큼 요일도 함께 증가 할 수 있도록..
		

			if (w%7==0) // 일요일마다
				System.out.println();	// 개행.
		}

		// 달의 마지막 날짜가 출력 형식을 모두 채웠을 경우
		// 이미 일요일 개행이 이루어졌기 때문에
		// 이 경우에는 추가 개행을 하지 않도록 처리
		if (w%7!=0)
			System.out.println();            // 이거 다시 !!!!!!!
	
		System.out.println("============================");

	}
}

/*
        [ 2021년 7월 ]

  일  월  화  수  목  금  토
============================
                   1   2   3
   4   5   6   7   8   9  10
  11  12  13  14  15  16  17
  18  19  20  21  22  23  24
  25  26  27  28  29  30  31
											여기 이 공백 뭐야~~! 일요일마다 개행하라고 되어있기 때문!!
============================
계속하려면 아무 키나 누르십시오 . . .
*/

/*
import java.util.Scanner;

public class Test100
{
	public static void main(String[] args)
	{
		// 변수, 배열 선언
	
		int y, m;  // 년도, 월
		Scanner sc = new Scanner(System.in);

		String yoyil [] = {"일", "월", "화", "수", "목", "금", "토"};
		int nalja [] = new int[31];
		for (int i =0;i<31;i++)
			nalja[i] = i+1;


		// 사용자 안내
		System.out.print("『연도』를 입력하세요 : ");
		y = sc.nextInt();

		System.out.print("『월』을 입력하세요 : ");
		m = sc.nextInt();

		// ① 입력한 년월의 첫날이 무슨 요일인지 알아내기 

		int [] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int nalsu, i, w; // 루프 변수들
		String day;

		// 전 해 까지 날 수 
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/10 + (y-1)/100;

		// 전 달 까지 날 수
		for (i=0;i<m-1;i++)
			nalsu += month[i];

		// 날수 7로 나눠서 요일 알아내기

		day = yoyil[nalsu%7];					// 이건 1월 1일 월요일 기준이라 월화수목금토일 이 순서로 계산된 것. 아래랑 헷갈리지 말 것
		System.out.println(day);
		
		// 입력한 달의 날자들 요일별로 분배하기

		System.out.println();
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("=============================");
		
		for (i=0;i<7;i++)
			if (yoyil[i] == day)  
				for (int j=0;j<i;j++)
					System.out.print("    ");

			for (int k=0;k<nalja.length ;k++ )
				System.out.printf("%-4d", nalja[k]);			
		
		System.out.println();
		System.out.println("=============================");


		
		

		// 토요일마다 개행 어케하나요..
		// 이렇게는 불가능할듯..
	}
}

*/

/*
if (m == 1 || m == 3 || m== 5 || m == 7 || m == 8 || m == 10 || m == 12)
				{
					for (int j=0;j<31;j++)
						System.out.printf("%-3d", nalja[j]);
				}

				else if (m == 4 || m == 6 || m== 9 || m == 11)
				{
					for (int j=0;j<30;j++)
						System.out.printf("%-3d", nalja[j]);

				}

				else
				{
					if (y%4==0 && y%100!=0 && y%400==0)
					{
						for (int j=0;j<29;j++)
							System.out.printf("%-3d", nalja[j]);
					}
					else
					{
						for (int j=0;j<28;j++)
							System.out.printf("%-3d", nalja[j]);
					}

					*/