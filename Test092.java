/*=====================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스 설계
  - 배열 활용
=====================================*/

// ○ 실습 문제
// 아래의 클래스(WeekDay)를 완성한다.
// 사용자로부터 년, 월, 일을 입력받아
// 해당 날짜의 요일을 출력하는 프로그램을 구현한다.
// 단, 달력 클래스(Calender)는 사용하지 않는다.
// 또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
// 그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.

// 실행 예)
// 년 월 일 입력(공백 구분) : 1997 10 6
// >> 1997년 10월 6일 → 월요일
// 계속하려면 아무 키나...

// ※ 문제 인식 및 분석
//		- 윤년 및 평년의 개념 적용
//		- 1년 1월 1일 → 월요일



import java.util.Scanner;

class WeekDay
{
	// 주요 변수 선언(속성 구성)
	private int y, m, d;

	// 메소드 정의(입력받기)
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(공백 구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}

	// 메소드 정의(요일 산출하기)
	String week()
	{
		// 각 월의 마지막 날짜(각 월의 최대값)을 배열 형태로 구성
		int months[]= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// 2월 값은 확정이 안나서 지금은 뭐가 들어가든 상관ㄴ 자리만 마련.

		// 요일명에 대한 배열 구성
		String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};
		
		// 날 수를 종합할 변수, 루프 변수, 요일 변수
		int nalsu, i, w;

		// 윤년에 따른 2월의 날 수 계산
		// 윤년이라면... 2월의 마지막 날짜를 29일로 설정 → month[1] = 29;
		// 평년이라면... 2월의 마지막 날짜를 28일로 설정 → month[1] = 28;


		if (y%4==0 && y%100!=0 || y%400==0)	//-- 입력한 연도가 윤년이라면...
			// 2월의 마지막 날짜를 29일로 설정
			months[1] = 29;
		else	//-- 입력한 연도가 평년이라면...
			// 2월의 마지막 날짜를 28일로 설정
			months[1] = 28;

		// ① 1년 1월 1일부터 입력받은 년도의 이전 년도
		nalsu = (y-1) * 365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		// test
		// System.out.println(nalsu);

		// ② 해당 년도의 입력받은 월의 이전 월까지의 
		//	  날 수 계산 후 1번 결과에 더하는 연산

		for (i=0;i<(m-1);i++) // 같거나 작다 하면 안됨. 배열에서 방 번호는 -1까지니까
			nalsu += months[i];

		// 테스트
		// System.out.println(nalsu);

		// ③ 입력받은 일의 날짜만큼 날 수 계산 후
		//	  2번 결과에 더하는 연산

		nalsu += d;		//-- 날 수를 d만큼 증가시켜라~

		// 테스트
		// System.out.println(nalsu);


	//-------------------------------------------날 수 연산 끝~~!

		// 무슨 요일인지 확인하기 위한 연산
		w = nalsu % 7;					// 전체 날 수 % 7 == 0 → 일요일
										// 전체 날 수 % 7 == 1 → 월요일
										//			:				
										//			

		// 테스트
		// System.out.println(w);
		// System.out.print(weekNames[w]);

		return weekNames[w];
	}

	// 메소드 정의(결과 출력하기)
	void print(String day)
	{
		System.out.printf("\n>> %d년 %d월 %d일 → %s요일%n", y, m, d, day);
	}
}

public class Test092
{
	public static void main(String[] args)
	{
		WeekDay wd = new WeekDay();
		
		wd.input();					//-- 입력 메소드 호출

		String result = wd.week();  //-- 요일 산출 메소드 호출
		wd.print(result);			//-- 결과 출력 메소드 호출
	}
}





/*

import java.util.Scanner;

class WeekDay
{
	// 주요 변수 선언(속성 구성)
	private int y, m, d;

	// 메소드 정의(입력받기)
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(공백 구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}

	// 메소드 정의(요일 산출하기)
	String week()
	{
		int arr[]= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (y%4==0 && y%100!=0 || y%400==0)
				arr[1] = 29;
		int month=0, year=0, day = 0;
		
		// 년수

		// year = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		
		for (int i = 0; i<y-1;i++)
		{
			if (y%4==0 && y%100!=0 || y%400==0)
				year+=366; 
			else
				year+=365;
		}

		// 달수
		for (int i = 0; i<m-1; i++)
			month+=arr[i];
		
		
		// 날수
		day = d-1;

	


		String arr1[] = {"월", "화", "수", "목", "금", "토", "일"};
		int result = 0;
		result = (day + month + year)%7-1;
			if (result<=0)
				result+=7;
		
		
		return arr1[result];
	}

	// 메소드 정의(결과 출력하기)
	void print(String day)
	{
		System.out.println("결과 : " + day);
	}
}

public class Test092
{
	public static void main(String[] args)
	{
		WeekDay wd = new WeekDay();
		
		wd.input();					//-- 입력 메소드 호출
		String result = wd.week();  //-- 요일 산출 메소드 호출
		wd.print(result);			//-- 결과 출력 메소드 호출
	}
}


*/