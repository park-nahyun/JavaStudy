/*=====================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스
=====================================*/

public class Test129
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);			//-- boxing
		Integer i2 = new Integer(i);	//-- boxing

		System.out.println(b2);			//--==>> 3
		System.out.println(i2);			//--==>> 256

		print(b2);
		print(i2);
	}

	/*
	static void print(Byte b)
	{
	}

	static void print(Integer i)
	{
	}

	원래는 이렇게 해야하는데 
	한번에 처리하고 싶은 것
	*/

	// Object
	// Number → Wrapper 클래스들의 조상이 Number. Whapper들은 얘를 다 상속 받음
	// ※ java.lang.Number 클래스(추상 클래스)
	//    모든 Wrapper 클래스들의 부모 클래스(슈퍼 클래스, 상위 클래스)이다.
	//    b2, i2 자료형이 Number n에 넘어오면서
	//    업 캐스팅이 일어나게 된다.   (그냥 숫자라면 Auto-Boxing)
	
	/*
	static void print(Object n)		// 여기 넘겨지는 건 객체 형식이기만 하면 다된다.
	{								// 이러면 데이터의 안정성ㄴㄴ
		 ...						// 뭐든 담을 수 있다는 건 반대로 안에 뭐가 들었는지 예측 못할 수도 있다는 것
	
	}

	*/

	static void print(Number n)		// 추상클래스라 인스턴스 생성은 직접 못하지만, Wrapper를 담을 수는 있다.
	{
		System.out.println(n.toString());	// Integer의 toString..
	}

	// Object obj = new 클래스();  //-- 업캐스팅. 객체(클래스) 타입이면 뭐든 가능

	// 메소드를 다 따로 만들게 아니라 캐스팅을 염두해서 하나로 만드는 것이 가능한!!!

	/*
	3
	256
	3
	256
	*/
}


/*
void set(int b)
{}

byte b = 5;
set(b);

byte b를 넘겨줘도 자동으로 int b로 형변환 되었듯!!
*/
