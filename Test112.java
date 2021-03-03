/*=====================================
  ■■■ 클래스 고급 ■■■
  - 인터페이스(Interface)
=====================================*/
 

/*
○ 인터페이스(Interface)란
   완전히 미완성된 채로 남겨져
   인터페이스 안에 존재하는 그 어떤 메소드도
   몸체(정의부)가 없기 때문에 실행 부분이 존재하지 않는다.
   클래스를 위한 템플릿으로서의 기능을 수행하는
   추상 클래스의 한 종류이다.

○ 인터페이스는 클래스와 달리 다중 상속이 가능하며
   인터페이스 자체도 상속된다.
   기존의 C++ 언어 등에서 지원되는 다중 상속이
   사용 과정에서 많은 문제점들을 노출시켰기 때문에
   자바에서는 다중 상속의 개념을 인터페이스라는 개념으로 변형하여
   인터페이스를 통해 다중 상속을 구현하는 방법을 지원한다.

○ 인터페이스는 상수와 추상 메소드만 가질 수 있으며
   인터페이스 안의 메소드들은 접근제어지시자를 명시하지 않아도
   『public』으로 설정되어 클래스에서 구현(implements)함으로써
   바로 접근이 이루어질 수 있다.

   // 인터페이스는 최대한 많이 쓰게끔 해야함. 그래서 public. 
   // 사람들이 다 저거만 쓰네~~ 저거에 맞춰 만들어야지~~~ 대충 이런 느낌..
   // 닌텐도에 이 팩 저 팩 다 꽂을 수 있는 것 ~ 인터페이스 !! 닌텐도의 기능 향상~!
   

○ 특징
   - 추상 클래스의 일종으로 선언만 있고 정의가 없다.
   - final 변수는 가질 수 있다. (상수의 개념)
   - 인터페이스는 『public static final』 상수만 만들 수 있다.
   - 인터페이스를 구현하기 위해서는 『extends』 대신에 『implements』를 이용한다.
   - 하나 이상의 인터페이스를 implements 할 수 있다.
   - 인터페이스를 implements한 클래스는
   	 인터페이스의 모든 메소드를 Overriding 해야 한다.
	 → 그렇게 해야 해당 클래스를 기반으로 인스턴스 생성이 가능하다.
   - 인터페이스가 다른 인터페이스를 상속받을 수 있으며
     이 때, 『extends』 키워드를 사용한다.
	 또한, 클래스와 달리 인터페이스는 다중 상속이 가능하다.

*/ 


// 인터페이스

interface Demo
{
	public static final double PI=3.141592;

	// 인터페이스의 멤버 변수는 『static final』을 별도로 명시하여 붙이지 않아도
	// 자동으로 『static final』인 상태~!!!
	public int a=10;				// 인터페이스는 상수와 추상 메소드만 가질 수 있으며~~~!!!!!!!

	//  public static final int a = 10;

	/*
	public void print()
	{
		System.out.println("인터페이스 print() 메소드...");
	}
	
	정의 되었기 때문에 안돼!!!
	*/

	// 인터페이스의 메소드는 선언만 가능(정의 불가)
	// 자동으로 『abstract』인 상태
	// public abstract void print(); 
	public void print(); 
}


// 클래스
// class DemoImpl

// Demo 인터페이스를 구현하는 추상 클래스
// abstracts class DemoImpl implements Demo
//
// Demo 인터페이스를 구현하는 클래스

class DemoImpl implements Demo
{
	public void write()
	{
		System.out.println("클래스에 정의된 메소드...");
	}

	@Override
	public void print()
	{
		System.out.println("인터페이스 메소드 재정의...");
	}
}


// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test112
{
	public static void main(String[] args)
	{
		// Demo ob = new Demo(); 
		//-- 인터페이스를 대상으로 인스턴스 생성 불가~!!!

		// DomoImpl obTemp = new DemoImpl();
		//-- Demo 인터페이스의 모든 메소드를 재정의한 DemoImpl 클래스는
		//	 더이상 추상 클래스가 아니기 떄문에
		//   인스턴스 생성 가능~!!!
		 
		// Demo ob = (Demo)obTemp;	// 업..캐스팅..? 된다~~!!!
		// Demo ob = obTemp;
		//			 obTemp = new DemoImpl();

		// ------------------------------------ 된다~!

		// 인터페이스 객체는 상위 객체
		Demo ob = new DemoImpl();			//-- 업 캐스팅
		ob.print();
		//--==>> 인터페이스 메소드 재정의...

		// ob.write();
		//--==>> 에러 발생(컴파일 에러)


		((DemoImpl)ob).write();				//-- 다운 캐스팅
		//--==>> 클래스에 정의된 메소드...

		System.out.println(Demo.PI);		//-- static이기 때문에...
		//--==>> 3.141592
		//--==>> 클래스명.변수 -->> 스태틱 변수 호출. 인스턴스 생성과 상관 없이!!! 호출가능

		System.out.println(Demo.a);			//-- (우리 눈에 안보여도) static이기 때문에...
		//--==>> 10
		
		// Demo.a = 30;						//-- (우리 눈에 안보여도) final 이기 때문에... 안돼!!!
		//--==>> 에러 발생 ; cannot assign a value to final variable a
	}
}


/*
인터페이스 메소드 재정의...
클래스에 정의된 메소드...
3.141592
10
계속하려면 아무 키나 누르십시오 . . .
*/