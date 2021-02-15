/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - 반복문 실습(while문 실습)
=====================================*/

// ○ 과제
// 사용자로부터 임의의 정수를 입력받아
// 1부터 그 수 까지의 전체 합과, 짝수의 합과, 홀수의 합을
// 각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 284
// 1 ~ 284 까지 정수의 합 : XXXX
// 1 ~ 284 까지 짝수의 합 : XXXX
// 1 ~ 284 까지 홀수의 합 : XXXX
// 계속하려면 아무 키나... 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, a=1, sum=0, even=0, odd=0;

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		while(a<=n)
		{
			sum += a;

			while(a%2==0)
			{
				even += a;
				break;
			}

			while(a%2!=0)
			{
				odd += a;
				break;
			}

			a++;
		}
		System.out.printf("1부터 %d까지 정수의 합 : %d%n", n, sum);
		System.out.printf("1부터 %d까지 짝수의 합 : %d%n", n, even);
		System.out.printf("1부터 %d까지 홀수의 합 : %d%n", n, odd);
						
	}
}

/*
임의의 정수 입력 : 284
1부터 284까지 정수의 합 : 40470
1부터 284까지 짝수의 합 : 20306
1부터 284까지 짝수의 합 : 20164
계속하려면 아무 키나 누르십시오 . . .
*/