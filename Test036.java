/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - if문 실습 ~ else문 실습
=====================================*/

// 사용자로부터 임의의 정수를 세 개 입력받아
// 작은 수 부터 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 45
// 두 번째 정수 입력 : 81
// 세 번째 정수 입력 : 13

// >> 정렬 결과 : 13 45 81
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;									//-- 사용자가 입력하는 임의의 정수를 담을 변수
		int temp;										//-- 담긴 물을 바꾸기 위해서는 빈 컵이 필요!
		
		// 우린 아직 세 명 한꺼번에 비교 못해
		// 컴퓨터는 둘둘씩 비교한다.

		System.out.print("첫 번째 정수 입력 : ");		
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());
		
		if (a>b)     //  ① 첫 번째 정수가 두 번쨰 정수보다 크다면...
		{
			temp = a; // 두 정수의 자리를 바꾼다
			b = a;
			a = temp;
		}
		if (b>c)     //  ② 두 번째 정수가 세 번째 정수보다 크다면...
		{
			temp = b; // 두 정수의 자리를 바꾼다
			b = c;
			c = temp;
		}
		if (a>b)	// ③ 첫 번째 정수가 두 번째 정수보다 크다면...
		{
			temp = a; // 두 정수의 자리를 바꾼다
			a = b;
			b= temp;
		}
		System.out.printf(">> 정렬 결과: %d %d %d%n", a, b, c);
	}
}

/*

2 2 2  | 3 2 1 | 2 1 3 | 3 1 2 | 1 3 2 | 1 2 3
 	   | 2 3 1 | 1 2 3 | 1 3 2 | 1 2 3
	   | 2 1 3 |       | 1 2 3
	   | 1 2 3


※ 이 if문들은 독립적! 각각 다로여야 함. else if라면 아래 조건을 수행 안할수도.
	우리는 1, 2 충족하더라도 3을 수행해야 하는 연산.

*/