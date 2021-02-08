/*===========================================
  ■■■ 변수와 자료형 ■■■
  - 변수와 자료형 실습 및 테스트 : double
===========================================*/

public class Test009
{
	public static void main(String[] args)
	{
		// 정수와 정수의 나눗셈
		double a = 1/2;
		// double a = 0;
		System.out.println("double a : " + a);
		//--==>> double a : 0.0

		double b = 1/2 + 1/2;
		// double b = 0 + 1/2;
		// double b = 0 + 0;
		// double b = 0;
		System.out.println("double b : " + b);
		//--==>> double b : 0.0

		// 정수와 실수의 나눗셈
		double c = 1/2.0;
		System.out.println("double c : " + c);
		//--==>> double c : 0.5
		//-- 나눗셈 연산과 관련하여 피연산자 중 실수가 포함되어 있다면
		//   실수 기반의 연산이 이루어지며 결과값은 실수 형태로
		//   연산되어 반환된다.


		double d = 3/2 + 1/2;
		// double d = 1 + 1/2;
		// double d = 1 + 0;
		// double d = 1;
		System.out.println("double d : " + d);
		//--==>> double d : 1.0

		double e = 3/2 + 1/2.0;
		// double e = 1 + 1/2.0;
		// double e = 1 + 0.5;
		// double e = 1.5;
		System.out.println("double e : " + e);
		//--==>> double e : 1.5


	}
}

/* [실행 결과]
double a : 0.0
double b : 0.0
double c : 0.5
double d : 1.0
double e : 1.5
계속하려면 아무 키나 누르십시오 . . .
*/



