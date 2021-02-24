/*=====================================
  ■■■ 주민등록번호 유효성 검사 ■■■
=====================================*/

/*
○ 주민번호 검증 공식

	① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

		123456 - 1234567 (→ 주민번호)
		******   ******
		234567   892345  ( → 각 자리에 곱해질 수)

	② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.

	ex ) 7 5 0 6 1 5 - 1 8 6 2 1 3 3 
	     * * * * * *   * * * * * *
		 2 3 4 5 6 7   8 9 2 3 4 5
________________________________________
    → 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15

	   == 217

	③ 더해진 결과물을 11로 나누어 『나머지』를 구한다.

		나머지 : 8

    ④ 11에서 나머지 뺀 결과 값을 구한다.
		→ 3
	추가-
	④ 를 수행한 결과 11이나 10이 나오게 되었을 경우...
	즉, ③ 의 수행 결과 나머지가 0이나 1일 경우...
	해당 값을 10으로 나눈 나머지를 얻어낸다.

    ex) 11 - 1 = 10  --> 0
	    11 - 0 = 11  --> 1
	
	⑤ ④에서 처리한 연산 결과가 주민번호를 구성하는 마지막 숫자와
		일치하는지를 비교한다. 
		일치~~!!!
		헐 대박

	※ 마지막 숫자와 같은 경우 유효한 주민등록번호~!!!

*/

// 실행 예)
// 주민번호 입력(xxxxxx-xxxxxxx) : 750615-1862133
// >> 정확한 주민번호~!!!
// 계속하려면 아무 키나...

// 주민번호 입력(xxxxxx-xxxxxxx) : 750615-1862137
// >> 잘못된 주민번호~!!!
// 계속하려면 아무 키나...

// 주민번호 입력(xxxxxx-xxxxxxx) : 750615-18621		// → 자릿수 부적합
// >> 입력 오류~!!!
// 계속하려면 아무 키나...


// 배열.length → 배열방의 길이(크기, 갯수)  얘는 속성!!!!

// ※ 문자열.length() → 문자열의 길이 반환  얘는 메소드!!! () 붙지?
//    문자열.substring() → 문자열 추출

import java.util.Scanner;


// useDelimiter 사용하기~~!! (하림씨 솔루션)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test101
{
	public static void main(String[] args) throws IOException
	{

		// BufferedReader 클래스 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력받은 주민번호
		String str;

		// 주민번호를 대상으로 곱해지는 수 배열
		int chk[] = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};     // chech~!!! 주민번호 하이픈 자리랑 연산될만한 무언가를 자리에 두자 
		//
		
		// 곱셈 연산 후 누작합
		// int tot = 1; 하면 안됩니다~~!
		int tot = 0;

		// 사용자에게 안내 메세지 출력 및 주민번호 입력
		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		str = br.readLine();


		if (str.length() != 14)
		{
			System.out.println(">> 입력 오류~!!!");
			return;  // 제대로 입력됐으면 종료
		}

		// 확인 테스트
		// System.out.println(">> 자릿수가 적합한 상황~!!!");

		for (int i=0;i<13 ;i++ )     // i → 0 1 2 3 4 5 6 7 8 9 10 11 12 ~~ chk의 길이만큼
		{
			if (i==6)
				continue;			// 뒷부분 무시하고 계속해라..! 6일 때 하이픈이니까

			tot += chk[i] * Integer.parseInt(str.substring(i, (i+1)));   // 반복문 감 안올 땐 첫번째 인덱스를 먼저 만드셈~!!!
			// 하이픈 자르고 중간 건너 뛰고 앞, 뒤 따로 연산하는 방법이 있음.. 그럼 chk 배열 애초에 두 개 만들었으면 될 일..

			
		}

			//-- 여기까지 수행하면 ①과 ②를 끝낸 상황이며

			//   규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한 값은
			//   변수 tot에 담겨있는 상태가 된다.


			int su = 11 - tot%11; 

			// 테스트
			System.out.println(su);
			//-- 주민번호 입력(xxxxxx-xxxxxxx) : 920909-2094612
			//				2

			// 최종 결과 출력 이전에 추가 확인 연산 필요~!!!
			// → su에 대한 연산 결과가 두 자리로 나올 경우
			//	  주민번호 마지막 자릿수와 비교할 수 없는 상황

			su = su%10;      // 조건문 할 필요ㄴㄴ 어차피 두 자리 수 아닌 사람도 10으로 나누면 나머지 같음

			//-- 여기까지 수행하면 ③과 ④와 추가까지 모두 끝낸 상황이며
			//	 최종 연산 결과는 변수 su에 담겨있는 상황이 된다.

			//   최종 결과 출력
			// if (su == Integer.parseInt(주민번호마지막자리하나추출))
			// if (su == Integer.parseInt(str 마지막자리하나추출))

			if (su == Integer.parseInt(str.substring(13)))
				System.out.println(">> 정확한 주민번호~!!!");
			else
				System.out.println(">> 잘못된 주민번호~!!!");
	}
}


/*

public class Test101
{
	public static void main(String[] args) 
	{
		String j;
		Scanner sc = new Scanner(System.in);
		int joomin[] = new int[14];
		int pandok[] = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		int sum=0;

		for (int i = 0;i<14;i++)
		{
			if (i==6)
				continue
			System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
			joomin[i] = sc.nextInt();
		}
		
		for (int i = 0;i<pandok.length ;i++)
		{
			if (i>=0&&i<=5)
				sum += joomin[i] * pandok[i];

			else if (i>=7&&i<=12)
				sum += joomin[i+1] * pandok[i];

			else 
				continue;
		}
		
		System.out.println(sum);


	}
}
*/

/*

	public static void main(String[] args) throws IOException
	{
		String j;
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		j = sc.next();
		int sum=0;

		String joomin[] = new String[j.length()]; // 주민번호를 문자열로 받을 배열
		int joomin2[] = new int[j.length()-1]; // 문자열로 받은 걸 정수로 변환해서 받을 배열

		int pandok[] = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};

		for (int i=0;i<j.length();i++)
		{
			// 주민 배열에 입력받은 번호 하나씩 넣기
			joomin[i] = j.substring(i,i+1));

			if(i>=0 && i<=5)
				joomin2[i] = Integer.parseInt(joomin[i]);
			else if(i>=7 && i<=12)
				joomin2[i-1] = Integer.parseInt(joomin[i]);
		}

		// 연산하기

		for (int i=0; i<pandok.length ;i++ )
		{
			sum += joomin2[i]*pandok[i];
		}
		
		System.out.println(sum);

		// 실행 에러 NumberFormatException: For input string: ""
		// 아직 String을 int로 변환하는 건 내가 못할 듯?


*/


// 테스트
		// String strTemp = "동해물과백두산이 마르고닳도록";
		// System.out.println(strTemp.length());
		//--==>> 15 (공백까지 포함)

		// 테스트
		// System.out.println("남산위의 저 소나무".length());
		//--==>> 10

		// 테스트
		// System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 5));
		//--==>> de
		// substring(m, n) → 문자열 인덱스 m 번째 부터 n-1번째까지 추철
		//					  인덱스는 0부터(배열처럼)

		// 테스트
		// System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 24));
		//--==>> defghijklmnopqrstuvwx

		// 테스트
		///System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 25));
		//--==>> defghijklmnopqrstuvwxy

		// 테스트
		///System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 26));
		//--==>> defghijklmnopqrstuvwxyz

		// 테스트
		// System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 27));
		//--==>> 에러 발생(런타임 에러)
		//		 java.lang.StringIndexOutOfBoundsException

		// 테스트
		// System.out.println("봄이오니졸려죽겠네".substring(4, 9));
		// System.out.println("졸려죽겠네");	
		//-->> 졸려죽겠네
		//	   졸려죽겠네

		// 테스트
		// System.out.println("졸려도좀참자".substring(3));
		// 메소드 오버로딩~~!! 위에거는 2개 받고 이거는 1개 받고
		///System.out.println("졸려도촘잠자".substring(3, "졸려도좀참자".length()));
		// System.out.println("졸려도촘잠자".substring(3, 6));
		// System.out.println("좀참자");
		/*
		좀참자
		촘잠자	
		촘잠자
		좀참자
		*/
