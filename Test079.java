/*=====================================
  ■■■ 클래스와 인스턴스 ■■■
  - 생성자(Constructor)와 초기화 블럭(Initialized Block)
=====================================*/

public class Test079
{
	int n;
	int m;

	
	Test079()
	{
		n=10;
		m=20;
		System.out.println("생성자 실행...");
	}

		
	Test079(int n, int m)
	{
		this.n=n;
		this.m=m;
		System.out.println("인자 있는 생성자 실행...");
	}

	// 초기화 블럭(Initialized Block)
	{
		n=100;
		m=200;
		System.out.println("초기화 블럭 실행...");
	}

	// 메소드 순서는 실행 순서 상관없다~!
	// 순서바꿔도 초기화 블럭이 먼저 나옴~!! 초기화가 뭘해도
	// 최종적으로 생성자가 구성해놓은 값으로 덮어진다.


	// 출력 메소드 정의
	void write()
	{
		System.out.println("n : " + n + ", m : " + m);
	}

	/*
	n=100;
	m=200;

	클래스에서 이렇게 직접 연산하는 행위 안됩니다! 메소드에서만 가능

	But 선언과 동시에 초기화는 된다!!

	int n=100;
	int m=200;
	*/

	public static void main(String[] args)
	{
		Test079 ob1 = new Test079();
		ob1.write();
		//--==>> 초기화 블럭 실행...
		//		 생성자 실행...
		//		 n : 10, m : 20

		Test079 ob2 = new Test079(1234, 5678);
		ob2.write();
		//--==>> 초기화 블럭 실행...
		//	     인자 있는 생성자 실행...
		//		 n : 1234, m : 5678
	}
}

/*
초기화 블럭 실행...
생성자 실행...
n : 10, m : 20
초기화 블럭 실행...
인자 있는 생성자 실행...
n : 1234, m : 5678
계속하려면 아무 키나 누르십시오 . . .

*/