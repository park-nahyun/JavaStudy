/*=====================================
  ■■■ 클래스 고급 ■■■
  - 상속(Inheritance)
=====================================*/

// ○ 실습 문제
//	  다음과 같은 프로그램을 구현한다.
//	  단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 15
// 연산자 입력(+ - * /) : -
// >> 20 - 15 = 5
// 계속하려면 아무 키나...


// 최상위 클래스가 object


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


// super class
class AClass
{
	protected int x, y;
	protected char op;


	/*
	AClass() // 생성자는 상속 안돼. 굳이 안써도 되는건데 걍 써둔거야.. 디폴트잖아..
	{
		super(); 얜 부모가 없어도 사실 이렇게 삽입됨 뒤에서 볼 것..
	}
	*/
	

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result); 
	}
}


// sub class
class BClass extends AClass
{
	// 뭘 갖다 쓸 수 있는지 들여다 보자
	/*
	protected int x, y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result); 
	}
	*/

	BClass() // 부모 생성자가 디폴트라 딱히 할게..
	{
	}

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 두 정수 입력(공백 구분) : ");	// 20 15 BR은 이걸 하나로 읽어오지
		String temp = br.readLine();							// "20 25"
		String[] str = temp.split("\\s");			// 구분자 → 공백
		// ※ 문자열.split("구분자");
		//	  ex) "사과 딸기 바나나 포도 수박".split(공백);
		//		   반환 → 배열 → {"사과", "딸기", "바나나", "포도", "수박"}
		//	  ex) "1 23 456 7".split(공백):
		//		   반환 → 배열 → {"1", "23", "456", "7"}
		//	 문자열 안에서 띄어쓰기는 \s로 표기. 역슬러시 두 개가 역슬러시 하나..

		//==> String[] str = {"20", "15"};

		if (str.length != 2)
			return false;	// 값의 반환 → false 그리고... 메소드 종료
							// false(거짓)를 반환하며 메소드 종료

		// ※ 이 조건문을 수행할 경우 아래에 코드가 남아있는 상황이더라도
		//	  더 이상 수행하지 않고 결과값을 반환하며 메소드는 종료된다.

		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		if (op!='+' && op!='-' && op!='*' && op!='/')
			return false;  // input 메소드를 종료시키겠다

		return true;

		/*

		if (op == '+' || op == '-' || op == '*' || op == '/')
			return true;

		return false;

		*/
	} // end input()


	double calc()
	{
		double result = 0;

		switch (op)
		{
		case '+' : result = x+y; break;
		case '-' : result = x-y; break;
		case '*' : result = x*y; break;
		case '/' : result = (double)x/y; break;
		}

		return result;
	}

 // ~~ 출력 메소드는 상속받았음
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test108
{
	public static void main(String[] args) throws IOException
	{
		BClass ob = new BClass();

		// boolean check = ob.input();

		if (!ob.input())
		{
			System.out.println("Error...");
			return;	// 메인메소드를 종료시키겠다
		}
		
		double result = ob.calc();		
		ob.write(result);
	}
}

/*
class BClass extends AClass
{
	BClass()
	{
		super();
	}
	Scanner sc = new Scanner(System.in);
	public void input() throws IOException
	{
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
	}

	public void cal()
	{
		double result=0;
		this.x = x;
		this.y = y;
		if (op == '+')
			result = x+y;
		if (op == '-')
			result = x-y;
		if (op == '*')
			result = x*y;
		if (op == '/')
			result = x/(double)y;	

		write(result);
	}

	@Override
	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result); 
	}

}

public class Test108
{
	public static void main(String[] args) throws IOException
	{
		BClass ob = new BClass();

		ob.input();
		ob.cal();
	}
}
*/