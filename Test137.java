/*=====================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Calendar 클래스
=====================================*/
/*
※ Calender 클래스는 추상클래스이기 때문에 객체를 생성할 수 없다.
	(추상 클래스 : 미완성된 클래스)

   즉, 『Calender ob = new Calender();』→ 이와 같은 구문을 통해 인스턴스 생성이 불가

○ Calender 클래스 객체(인스턴스)를 생성할 수 있는 방법

	1. Calender ob1 = Calender.getInstance();
	2. Calendar ob2 = new GregorianCalendar();
	// 업캐스팅을 한 것

	3. GregorianCalendar ob3 = new GragorianCalender();
	(※ GregorianCalendar : Calendar 클래스의 하위(자식) 클래스)
*/

// 년, 월, 일, 요일을 Calender 클래스로부터 가져와 출력

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test137
{
	public static void main(String[] args)
	{
		// Calender rightNow = new Calendar();

		// Calendar 클래스 인스턴스 생성
		Calendar rightNow = Calendar.getInstance();

		// 생성된 달력(Calendar) 인스턴스를 통해
		// 날짜 관련 정보를 얻어낼 수 있는 메소드 → get()
		
		int y = rightNow.get(Calendar.YEAR);
		// get은 인스턴스 메소드..
		// YEAR은 클래스변수(클래스로 호출했으니까)이자 상수화된 변수(대문자)
		
		int m = rightNow.get(Calendar.MONTH)+1;			// 『+1』 check~!!!
		// 각 월은 배열 인덱스 형태로 보관되어있다~~ 
		// 즉 0이 나오면 1월, 2 나오면 3월..
		int d = rightNow.get(Calendar.DATE);
		// 얘넨 윈도우 시스템을 이용하기 때문에 시스템 날짜가 바뀌면 얘네 값들도 바뀜..

		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(y + "-" + m + "-" + d + " " + w);
		//--==>> 2021-3-5 6 → 금

		// 테스트
		System.out.println(Calendar.SUNDAY);
		System.out.println(Calendar.MONDAY);
		System.out.println(Calendar.TUESDAY);
		System.out.println(Calendar.WEDNESDAY);
		System.out.println(Calendar.THURSDAY);
		System.out.println(Calendar.FRIDAY);
		System.out.println(Calendar.SATURDAY);
		/*
		1
		2
		3
		4
		5
		6
		7
		*/

		String week = "";
		switch(w)
		{
			case 1: week="일요일"; break;
			// case Calendar.SUNDAY: week="일요일"; break;
			case 2: week="월요일"; break;
			// case Calendar.MONDAY: week="월요일"; break;
			case 3: week="화요일"; break;
			// case Calendar.TUESDAY: week="화요일"; break;
			case 4: week="수요일"; break;
			// case Calendar.WEDNESDAY: week="수요일"; break;
			case 5: week="목요일"; break;
			// case Calendar.THURSDAY: week="목요일"; break;
			case 6: week="금요일"; break;
			// case Calendar.FRIDAY: week="금요일"; break;
			case 7: week="토요일"; break;
			// case Calendar.SATURDAY: week="토요일"; break;
		}

		System.out.println(y + "-" + m + "-" + d + " " + week);
		//--==>> 2021-3-5 금요일

		System.out.println("\n/////////////////////////\n");

		// Calender 클래스 인스턴스 생성
		Calendar rightNow2 = new GregorianCalendar();

	    String[] week2 =  {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

       
		// 달력의 날짜 세팅 → 『set()』 메소드 활용
		// 2021년 7월 9일 세팅
		rightNow2.set(2021, 6, 9);	// month 세팅 주의~!
	
		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//--==>> 6 → 금요일

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> 

		// 생년월일 세팅
		// 요일 확인
		rightNow2.set(1992, 8, 9);
		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);

		//--==>> 수요일



	}
}