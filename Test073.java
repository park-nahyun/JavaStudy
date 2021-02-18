/*=====================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스 개념 적용 및 클래스 설계 실습
=====================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 사칙 연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 적용하여 작성할 수 있도록 한다.
// 편의상 정수 기반으로 연산 수행한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 30 15
// 임의의 연산자 입력(+ - * /) : +
// >> 30 + 15 = 45
// 계속하려면 아무 키나...


import java.util.Scanner;
import java.io.IOException;


class Calculate
{
	// ○ 주요 속성 구성
	int su1, su2;
	char op;

	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("임의의 연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
	}

	int yonsan()
	{
		int result=0;

		if (op =='+')
			result = su1 + su2;
		else if (op == '-')
			result = su1 - su2;
		else if (op == '*')
			result = su1 * su2;
		else if (op == '/')									
			result = su1 / su2;
		else												// 이게 없이 끝냈을 때는 변수 초기화가 필요 없었는데 잘못 입력~! 추가하려면 변수 초기화를 해야함..
			System.out.println("잘못 입력!!!");				// 왜냐면 잘못 입력되었을 때 result에 뭘 넣어야 할지 자바가 혼란스러워지니까! 
	
		return result;
	}

	void print(int result)
	{
		System.out.printf(">> %d %s %d = %d%n", su1, op, su2, result);
	}
}

public class Test073
{
	public static void main(String[] args) throws IOException
	{
		Calculate ob = new Calculate();
		ob.input();
		int r = ob.yonsan();
		ob.print(r);
	}
}

/*

class Calculate
{
	// ○ 주요 속성 구성
	int su1, su2;
	char op;

	// ○ 입력 메소드 정의
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("임의의 연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
	}

	// ○ 연산 메소드 정의
	int cal()
	{
		int result=0;

		switch (op)   
		{
			case '+': result = su1+su2; break;
			case '-': result = su1-su2; break;
			case '*': result = su1*su2; break;					// 0으로 초기화 해뒀기 때문에 디폴트 값 없어도 에러 안남
			case '/': result = su1/su2; break;					// 잘못 입력하셨습니다 메시지 남기고 싶으면 어떡해?
		}		
		return result;											// 그럴려면 string cal()로 해줘야함.. 지금 우리 단계에서 못하는 것!
	}
	
	// ○ 출력 메소드 정의
	// >> 30 + 15 = 15
	void print(int r)  // 엄.. 여기서 int result일 필요가 없음
	{
		System.out.printf(">> %d %s %d = %d%n", su1, op, su2, r);
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test073
{
	public static void main(String[] args) throws IOException
	{
		// Calculate 클래스 기반의 인스턴스 생성
		Calculate ob = new Calculate();

		// 생성한 인스턴스를 통한 입력 메소드 호출
		ob.input();

		// 생성한 인스턴스를 통한 연산 메소드 호출
		int result = ob.cal();
		ob.print(result);
	}
}

*/