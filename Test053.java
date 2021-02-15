/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - 반복문 실습(while문 실습)
=====================================*/

// ○ 과제
// 사용자로부터 원하는 단(구구단)을 입력받아
// 해당하는 구구단을 출력하는 프로그램을 구현한다.
// 단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
// 프로그래을 종료해버릴 수 있도록 처리한다.

// 실행 예)
// 원하는 단(구구단) 입력 : 8
// 8 * 1 = 8
// 8 * 2 = 16
//    :
// 8 * 9 = 72
// 계속하려면 아무 키나...

// 원하는 단(구구단) 입력 : 11
// 1부터 9까지의 정수만 입력 가능합니다.
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, a=1, result;
		
		System.out.print("원하는 단(구구단) 입력 : ");
		n = Integer.parseInt(br.readLine());
		
		while(1<=n&&n<=9)
		{
			while(a<=9)
			{
				result = n*a;
				System.out.printf("%d * %d = %d%n", n, a, result);
				a++;
			}
			return;
		}

		System.out.println("1부터 9까지의 정수만 입력 가능합니다.");

	}
}

/*
원하는 단(구구단) 입력 : 8
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
8 * 4 = 32
8 * 5 = 40
8 * 6 = 48
8 * 7 = 56
8 * 8 = 64
8 * 9 = 72
계속하려면 아무 키나 누르십시오 . . .
*/