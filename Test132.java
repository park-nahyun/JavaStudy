/*=====================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - String 클래스
=====================================*/

public class Test132
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
		//--==>> seoul korea

		// ○ 문자열 추출
		System.out.println(s.substring(6, 9));
		//--==>> kor
		//-- 『String 클래스의 substring(s, e)』
		//    String 문자열을 대상으로
		//	  5번째에서... e-1번째까지...
		//	  (단, 인덱스는 8부터 시작)

		System.out.println(s.substring(7));
		//--==>> orea
		//--  『String 클래스의 substring(s)』
		//     String 문자열을 대상으로
		//     s번째에서 끝까지... (즉, 문자열이 가진 길이만큼...)

		// ○ 문자열의 데이터의 값 비교
		System.out.println(s.equals("seoul korea"));
		//--==>> true
		System.out.println(s.equals("Seoul korea"));
		//--==>> false
		//-- 대소문자 엄격히 구분

		System.out.println(s.equalsIgnoreCase("Seoul KoReA"));
		//--==>> true
		//-- 대소문자 구분 안함

		// ○ 찾고자하는 대상 문자열(s)에
		//    『kor』 문자열이 존재할까?
		//     존재한다면 그 위치는 어떻게 될까?
		

		// seoul korea
		System.out.println(s.indexOf("kor"));
		//--==>> 6

		System.out.println(s.indexOf("ea"));
		//--==>> 9
		
		System.out.println(s.indexOf("e"));
		//--==>> 1
		// 젤 처음에 찾은 애만 보여주고 끝~!

		System.out.println(s.indexOf("tt"));
		//--==>> -1 
		// 찾고자 하는 문자열이 대상 문자열에 존재할 경우
		// 그 문자열의 인덱스를 반환하지만
		// 존재하지 않을 경우 음수를 반환하게 한다. (-1)


		// ○ 대상 문자열(s)이 『rea』로 끝나는지의 여부 확인
		//	  (true / false)

		// seoul korea
		System.out.println(s.endsWith("rea")); //--==>> true
		System.out.println(s.endsWith("oul")); //--==>> false

		//	  찾고자 하는 대상 문자열(s)에
		//	  『e』 문자열이 존재할까?
		//	  존재한다면 그 위치는 어떻게 될까?
		//	  (단, 뒤에서부터 검사)

		// seoul korea
		System.out.println(s.indexOf("e"));	//--==>> 1
		System.out.println(s.indexOf("o")); //--==>> 2
		System.out.println(s.lastIndexOf("e")); 
		//--==>> 9
		// 스캔은 앞에서, 인덱스 카운팅은 뒤에서
		System.out.println(s.lastIndexOf("o"));
		//--==>> 7


		// ○ 대상 문자열(s) 중
		//    『6』번째 인덱스 위치의 문자는?

		// seoul korea
		System.out.println(s.charAt(6));
		//--==>> k
		// System.out.println(s.charAt(20));
		//--==>> 런타임 에러 StringIndexOutOfBoundsException

		// ○ 대상 문자열(s)과 비교 문자열("seoul corea") 중
		//    어떤 문자열이 더 큰가?
		//    두 무자열이 다르다면 차이를 확인(사전식 배열)
		System.out.println(s.compareTo("seoul corea"));
		//--==>> 8
		//-- c ~ k → defghijk(8)

		System.out.println(s.compareTo("seoul koreb"));
		//--==>> -1
		//-- b ~ a → a(-1)

		System.out.println(s.compareTo("seoua korea"));
		//--==>> 11
		//-- a ~ l abcdefghijkl(11)

		// ○ 대상 문자열(s) 중
		//	  해당 문자열을 찾아 원하는 형태로 수정
		s = "우리나라 대한민국 대한독립 만세";
		s = s.replaceAll("대한", "大韓");	// 리턴 자료형은 void. 반환ㄴ
		System.out.println("s : " + s);
		//--==>> s : 우리나라 大韓민국 大韓독립 만세
		
		// ○ 공백 제거
		s = "          사        랑            ";	// tab키로 띄우면 안됨.
		System.out.println("|" + s + "|");
		//--==>> |          사        랑            |

		System.out.println("|" + s.trim() + "|");
		//--==>> |사        랑|
		//-- 양쪽 끝단 가장자리 공백 제거

		System.out.println("|" + s.replaceAll(" ", "") + "|");
		//--==>> |사랑|

		int n = 2345678;
		System.out.printf("%d", n);
		System.out.format("%d", n);
		//--==>> 23456782345678 
		//-- 2345678이라는 데이터를 %d라는 형태로 출력하라는 뜻
		//-- 둘 다 리턴 자료형이 void. 

		System.out.println();

		s = String.format("%d", n);
		//-- static이 붙어있는 클래스 메소드!!!(클래스이름직접부르기.메소드)
		//-- 리턴 자료형이 string. 어딘가에 담아야 한다.
		System.out.println(s);
		//--==>> 2345678

		s = String.format("%,d", n);
		System.out.println(s);
		//--==>> 2,345,678

		double p = 3.141592;
		s = String.format("%f", p);
		System.out.println(s);
		//--==>> 3.141592

		s = String.format("%.2f", p);
		System.out.println(s);
		//--==>> 3.14

		String[] strArray = "기본,열정,배려".split(","); // {"기본", "열정", "배려"}
		// 앞은 문자열 객체.. .찍었으니까 string클래스에서 제공하는 메소드 사용 가능..
		for (String str : strArray)
		{
			System.out.print(str + " ");		// strArray에 있는 걸 하나씩 꺼내서 이렇게 처리해주세요 
		}
		System.out.println();
		//--==>> 기본 열정 배려
		

	}
}