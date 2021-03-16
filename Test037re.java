/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - if문 실습 ~ else문 실습
=====================================*/

// 사용자로부터 임의의 정수를 세 개 입력받아
// 작은 수 부터 큰 수 순으로 출력하는 프로그램을 구현한다.
// 단, 입력 데이터를 한 번에 처리할 수 있도록 구성하며(Scanner 사용)
// 『xor』 연산자를 활용하여 스왑 처리를 할 수 있도록 한다.

// 실행 예)
// 임의의 세 정수 입력(공백 구분) : 54 23 31

// >> 정렬 결과 : 23 31 54
// 계속하려면 아무 키나...

import java.util.Scanner;

public class Test037re
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.print("임의의 세 정수 입력(공백 구분) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if(a>b)
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}
		if(b>c)
		{
			b = b^c;
			c = c^b;
			b = b^c;
		}
		if(a>b)
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}

		System.out.printf("\n>> 정렬 결과 : %d %d %d\n", a, b, c);
	}
}