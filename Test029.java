/*=====================================
  ■■■ 연산자(Operator) ■■■
  - 삼항 연산자 == 조건 연산자!라고 더 많이 부름
=====================================*/

// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가... 윤년인지 평년인지 판별하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, 입력은 BufferedReader의 readLine()을 활용하고
// 연산은 조건 연산자를 활용할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2011
// 2011년 → 평년
// 계속하려면 아무 키나...

// ※ 윤년의 판별 조건
//		연도가 4의 배수이면서 100의 배수가 아니거나
//		또는, 400의 배수이면 윤년~!!
//		그렇기 않으면... 평년~!!


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int Y;
		String strResult;
		
		System.out.print("임의의 연도 입력 : ");
		Y = Integer.parseInt(br.readLine());

		strResult = Y % 4 == 0 && Y % 100 != 0 || Y % 400 == 0 ? "윤년" : "평년";
		// 조건 연산 과정에서 두 개 이상의 조건이 등장이 등장하면 무 조 건 논리 연산자!
		
		// 내가 한 것 System.out.println(Y + "년 → " + strResult);
		System.out.printf("%d년 → %s\n" , Y, strResult);
		
	}
}

/*
임의의 연도 입력 : 2011
2011년 → 평년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2020
2020년 → 윤년
계속하려면 아무 키나 누르십시오 . . .

*/