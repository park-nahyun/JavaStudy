/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - if문 실습 ~ else문 실습
=====================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자에 대한 처리 결과를 출력하는 프로그램을 구현한다.
// 단, 조건문을 활용하여 처리할 수 있도록 하며,
// 연산의 결과는 편의상 정수 형태로 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 24
// 연산자 입력(+ - * /) : +

// >> 10 + 24 = 34
// 계속하려면 아무 키나...

// 첫 번째 정수 입력 : 5
// 두 번째 정수 입력 : 3
// 연산자 입력(+ - * /) : /

// >> 5 / 3 = 1
// >> 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034re
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;
		String c;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : ");
		c = br.readLine();

		if(c=="+")
		System.out.printf("\n%d + %d = %d", a, b, a+b);
		
		else if(c=="-")
		System.out.printf("\n%d - %d = %d", a, b, a-b);

		else if(c=="*")
		System.out.printf("\n%d * %d = %d", a, b, a*b);
		
		else if(c=="/")
		System.out.printf("\n%d / %d = %d%n", a, b, a/b);

		else 
		System.out.println("잘못 입력하셨습니다.");
		
	}
}
