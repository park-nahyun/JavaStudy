/*=====================================
  ■■■ 클래스와 인스턴스 ■■■
=====================================*/

// ○ 실습 문제
// 원의 넓이와 둘레 구하기

// 원의 넓이와 둘레를 구할 수 있는 클래스를 독립적으로(별도로) 생성한다.
// (클래스명 : CircleTest) → CircleTest.java

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : xx

// >> 반지름이 xx인 원의
// >> 넓이 : xxx.xx
// >> 둘레 : xxx.xx
// 계속하려면 아무 키나...

/*
import java.util.Scanner;
class CircleTest
{

	Scanner sc = new Scanner(System.in);

	int r;													//-- 반지름
	final double PI = 3.141592;								//-- 원주율
	// 『final』 : 변수의 상수화

	void input()
	{
		System.out.print("반지름 입력 : ");				
		r = sc.nextInt();
	}
	double area()
	{
		double result = (r * r * PI);
		return result;
	}
	double cir()
	{
		double result = (2 * r * PI);
		return result;
	}
	void print(double a, double c)
	{
		System.out.printf("반지름이 %d인 원의%n", r);
		System.out.printf("넓이 : %.2f%n", a);
		System.out.printf("둘레 : %.2f%n", c);
	}
}

*/

// BufferedReader는 readLine 때문에 쓰는 것..! 외부로부터 데이터 입력해온다고 할 ㄸㅐ 각서쓰는 것


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CircleTest
{

	int r;													//-- 반지름
	final double PI = 3.141592;								//-- 원주율
	// 『final』 : 변수의 상수화

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("반지름 입력 : ");				// 실행시키면 에러가 난다.
		r = Integer.parseInt(br.readLine());			// 여기서 던져진 예외들이 어디서 굴러떨어지겠음? 바로.. 얘를 호출한 main 메소드로!
	}
	double area()
	{
		double result = (r * r * PI);    
		return result;
	}
	double cir()
	{
		double result = (2 * r * PI);
		return result;
	}
	void print(double a, double c)
	{
		System.out.printf("\n>> 반지름이 %d인 원의%n", r);
		System.out.printf(">> 넓이 : %.2f%n", a);
		System.out.printf(">> 둘레 : %.2f%n", c);
	}
}

