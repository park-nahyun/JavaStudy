/*=====================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Calendar 클래스
=====================================*/

// ○ 실습 문제
//	  오늘을 기준으로..
//    입력받는 날짜만큼 후의 연, 월, 일 요일을 확인하여
//    결과를 출력하는 프로그램을 구현한다.
//    단, Calendar 클래스를 활용하여 처리한다.

// 실행 예)
// 오늘 날짜 : 2021-3-8 월요일
// 몇 일 후의 날짜를 확인하고자 하십니까? : 200

// ==========[확인결과]==========
// 200일 후 : 2021-xx-xx x요일
// ==============================
// 계속하려면 아무 키나


// ※ 특정 날짜를 기준으로 날 수를 더하는 연산 메소드
//	  『날짜객체.add(Calendar.DATE, 날 수)』


import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test139
{
	public static void  main(String[] args)
	{
		
		// Scanner 클래스 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		// Calendar 클래스 인스턴스 생성
		Calendar now = Calendar.getInstance();

		// 주요 변수 선언
		int nalsu;			//-- 사용자로부터 입력받은 날 수 
		int y, m, d, w;		//-- 연, 월, 일, 요일
		String[] week =  {"일", "월", "화", "수", "목", "금", "토"};

		// 현재의 연, 월, 일, 요일 확인(가져오기 : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);


		// 현재의 연, 월, 요일 확인결과 출력
		// System.out.println("오늘 날짜 : " + y + "-" + m + "-" + d + "-" + week[w-1] +"요일");
		System.out.printf("오늘 날짜 : %tF %tA\n", now, now);
		//--==>> 오늘 날짜 : 2021-3-8-월요일

		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);
		
		// 날 수 더하기 연산
		now.add(Calendar.DATE, nalsu);
		
		// 결과 출력
		System.out.println();
		System.out.println("==========[확인결과]==========");
		System.out.printf("%d일 후 : %tF %tA\n", nalsu, now, now);
		System.out.println("==============================");
	


		/*
		int y, m, d, n;
		String[] week =  {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		String yoyil;
		int weekday;
 
		// 오늘 날짜 그냥 하는거야^^
		System.out.println("오늘 날짜 : " + td.get(Calendar.YEAR) +"-"+ (td.get(Calendar.MONTH)+1) +"-"+ td.get(Calendar.DATE) +" "+ week[td.get(Calendar.DAY_OF_WEEK)-1]);

		//yoyil = sc1.next();

		// 요일 배정
		//for (int i=0;i<7 ;i++ )
		//{
		//	if (yoyil == week[i])
		//		weekday = i;
		//}

		// 몇 일 후 날짜? 입력

		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
		n = sc.nextInt();
		
		td.add(Calendar.DATE, n);
		System.out.println( n + "일 후 : " + td.get(Calendar.YEAR) +"-"+ (td.get(Calendar.MONTH)+1) +"-"+ td.get(Calendar.DATE) +" "+ week[td.get(Calendar.DAY_OF_WEEK)-1]);
	
		*/
	}
}


/*
==========[확인결과]==========
200일 후 : 2021-09-24 금요일
==============================
계속하려면 아무 키나 누르십시오 . . .
*/