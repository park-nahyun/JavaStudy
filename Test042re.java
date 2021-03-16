/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - switch문 실습
=====================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산의 처리 결과를 출력하는 프로그램을 구현한다.
// 단, switch 문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 형태로 처리한다.

// 실행 예)
// 첫 번째 정수 입력	: 10
// 두 번째 정수 입력	: 31
// 연산자 입력(+ - * /) : +

// >> 10 + 31 = 41
// 계속하려면 아무 키나 누르세요...!


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042re
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;
		char op;

		System.out.print("첫 번째 정수 입력    : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력    : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		switch(op)
		{	
			case 47: System.out.println("a / b = " + (a/b)); break;
			case 43: System.out.println("a + b = " + (a+b)); break;
			case 45: System.out.println("a - b = " + (a-b)); break;
			case 42: System.out.println("a * b = " + (a*b)); break;
			
			default: System.out.println("잘못 입력");
		}
			
	}
}

/*
첫 번째 정수 입력    : 10
두 번째 정수 입력    : 2
연산자 입력(+ - * /) : /
a / b = 5
계속하려면 아무 키나 누르십시오 . . .
*/