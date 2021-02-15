/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - 반복문 실습(while문 실습)
=====================================*/

// 1부터 100까지 정수의 합을 구하되...
// 10의 배수가 될 때 마다 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 1 ~ 10 까지의 합 : xx
// 1 ~ 20 까지의 합 : xx
// 1 ~ 30 까지의 합 : xx
//		.
//		.
// 1 ~ 100 까지의 합 : xxxx
// 계속하려면 아무 키나...

public class Test047
{
	public static void main(String[] args)
	{
		int n = 1;
		int sum = 0;

		while(n<=100)
		{
			sum+= n;

			if(n%10==0)		// n이 10의 배수 
			{
				System.out.printf(" 1 ~ %d 까지의 합 : %d%n", n, sum);
			}

			n++;
		}
	}
}


/* 
 1 ~ 10 까지의 합 : 55
 1 ~ 20 까지의 합 : 210
 1 ~ 30 까지의 합 : 465
 1 ~ 40 까지의 합 : 820
 1 ~ 50 까지의 합 : 1275
 1 ~ 60 까지의 합 : 1830
 1 ~ 70 까지의 합 : 2485
 1 ~ 80 까지의 합 : 3240
 1 ~ 90 까지의 합 : 4095
 1 ~ 100 까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .
*/


/* n을 0부터 시작 할 때는?

public class Test047
{
	public static void main(String[] args)
	{
		int n = 0;
		int sum = 0;

		while(n<=100)
		{
			n++;

			sum+= n;

			if(n%10==0)		// n이 10의 배수 
			{
				System.out.printf(" 1 ~ %d 까지의 합 : %d%n", n, sum);
			}

		}
	}
}

*/