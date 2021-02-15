/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - 반복문 실습(while문 실습)
=====================================*/

// 1 * 2 * 3 * .... * 10

// 실행 예)
// 연산 결과 : xxxx
// 계속하려면 아무 키나....

/*
public class Test049
{
	public static void main(String[] args)
	{
		int n = 1;
		int result = 1;

		while(n<=10)
		{
			result = n * result;
			n++;
		}

		System.out.println("연산 결과 : " + result);
	}
}
*/

/*
연산 결과 : 3628800
계속하려면 아무 키나 누르십시오 . . .
*/



public class Test049
{
	public static void main(String[] args)
	{

		int n=0, result = 1; // 누적곱을 담을 변수... 1로 초기화! 0으로 하면 다 곱했을 때 0 나옴;
		while (n<10)
		{
			n++;
			result *= n;    // 누적곱 연산
		}

		System.out.println("연산 결과 : " + result);
	}
}

/*
연산 결과 : 3628800
계속하려면 아무 키나 누르십시오 . . .
*/

