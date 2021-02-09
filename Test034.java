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

public class Test034
{
	public static void main(String[] args) throws IOException
	{

		
/* 방식 1.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();  // br은 문자열로 가져와서 캐릭터에 담는건데 안되지?1
		                        // in.read도 4바이트 정수형(아스키 코드)니까 변환 필요

		if(op =='+')
		System.out.printf("\n>> %d + %d = %d%n", a, b, a+b);          // 왜 ==? 아스키 코드끼리 비교하는거!!
		
		else if(op == '-')
		System.out.printf("\n>> %d - %d = %d%n", a, b, a-b);

		else if(op == '*')
		System.out.printf("\n>> %d * %d = %d%n", a, b, a*b);
		
		else if(op == '/')
		System.out.printf("\n>> %d / %d = %d%n", a, b, a/b);

		else
		System.out.println("입력 과정에 오류가 존재합니다.");

	*/

// 방식2 
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, op;   // 어차피 op는 아스키코드

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();  */

		/*
		"1234" → Integer.parseInt("1234") → 1234
		"ABCD" → Integer.parseInt("ABCD") → 에러남~
		Integer은 형변환과 다른 개념임. 즉
		op = Integer.parseInt(br.readLine()); 하면 안됨
		"+"를 --> + 라는 숫자로 바꿀 수 없으니까.
		*/

		// 테스트 (확인) a, b = 10
		// System.out.println("op : " + op);
		//-- +  → 43
		//-- -  → 45
		//-- *  → 42
		//-- /  → 47  아스키코드 숫자 그대로

/*
		if(op ==43 )
		System.out.printf("\n>> %d + %d = %d%n", a, b, a+b);       
		
		else if(op == 45)
		System.out.printf("\n>> %d - %d = %d%n", a, b, a-b);

		else if(op == 42)
		System.out.printf("\n>> %d * %d = %d%n", a, b, a*b);
		
		else if(op == 47)
		System.out.printf("\n>> %d / %d = %d%n", a, b, a/b);

		else
		System.out.println("입력 과정에 오류가 존재합니다."); */



// 방식 3. 출력을 간소화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, result=0;
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();  

		if (op == '+')		
			result = a + b ;
		else if (op == '-')		
			result = a - b ;
		else if (op == '*')
			result = a * b ;
		else if (op == '/')
			result = a / b ;
		
		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);
	}
}

/*
첫 번째 정수 입력 : 13
두 번째 정수 입력 : 14
연산자 입력(+ - * /) : +

>> 13 + 14 = 27
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 34
두 번째 정수 입력 : 35
연산자 입력(+ - * /) : -

>> 34 - 35 = -1
계속하려면 아무 키나 누르십시오 . . .
*/


//  op = Integer.parseInt(br.readLine());
// 얘는 아스키코드로 바꿔주는 코드가 아닙니다ㅠ 젭알