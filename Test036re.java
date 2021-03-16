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

public class Test036re
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());

		if (a>b && b>c)
		{
			System.out.printf(">> 정렬 결과 : %d %d %d\n", c, b, a);
		}
		else if(a>c && c>b)
		{
			System.out.printf(">> 정렬 결과 : %d %d %d%n", b, c, a);
		}
		else if(b>a && a>c)
		{
			System.out.printf(">> 정렬 결과 : %d %d %d%n", c, a, b);
		}
		else if(b>c && c>a)
		{
			System.out.printf(">> 정렬 결과 : %d %d %d%n", a, c, b);
		}
		else if(c>a && a>b)
		{
			System.out.printf(">> 정렬 결과 : %d %d %d%n", b, a, c);
		}
		else if(c>b && b>a)
		{
			System.out.printf(">> 정렬 결과 : %d %d %d%n", a, b, c);
		}
		else
		{
			System.out.printf("잘못 입력하셨습니다.");
		}
	}
}