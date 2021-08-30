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

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, result;
		char op;

		System.out.print("첫 번째 정수 입력    : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력    4: ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		switch(op)
		{	
			case '+': result=a+b; break;
			case '-': result=a-b; break;
			case '*': result=a*b; break;
			case '/': result=a/b; break;
			
			// default: System.out.println("잘못 입력");
			default : return;				//-- 메소드 종료(리턴 키워드가 포함된) → main() 메소드 종료 (메인은 프로그램의 시작과 끝)→ 프로그램 종료

		}
		// ※ 『return』 : 1. 값을 반환 
		//                 2. 메소드 종료(메소드가 리턴을 만나면 하던 일을 멈추고 그냥 끝남!)

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
	}
}


//switch 문의 『수식』과 case의 『상수』는
// byte, short, int, long 형이어야 한다.

// 근데!!! jdk 1.5부터 이렇게 문자로 쓸 수 있도록 지원이 됨!!!!
// jdk1.7 이상부터는 문자열도 쓸 수 있게됨!!!
// 자바에서 문자열은 객체. 클래스가 있어야 쓸 수 있는 것.
// 이걸 이렇게 문법적으로 지원한다는 건 암튼 대~~~단한 일임.

/*
첫 번째 정수 입력    : 10
두 번째 정수 입력    : 15
연산자 입력(+ - * /) : +

>> 10 + 15 = 25
계속하려면 아무 키나 누르십시오 . . .
*/
/*
첫 번째 정수 입력    : 24
두 번째 정수 입력    : 25
연산자 입력(+ - * /) : g
계속하려면 아무 키나 누르십시오 . . .
*/