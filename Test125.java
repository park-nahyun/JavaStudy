/*=====================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스
=====================================*/
/*
○ Wrapper 클래스

   1. 자바에서는 언어 수준에서 제공하는 기본형 데이터를 제외한
      나머지는 클래스로 설계하여 객체 단위로 처리한다.
	  따라서 자바에서는 이러한 기본형 데이터를
	  객체 단위로 처리할 수 있도록 클래스를 제공할 수 밖에 없는데
	  이러한 클래스를 가리켜 Wrapper 클래스라 한다.
  

   2. 기본 자료형인
   	  byte, short, int,     long, float, double, char, boolean 형에 대응하는
	  (얘네는 야생의.. 자유로운 데이터들..)
	  Byte, Short, Integer, Long, Float, Double, Char, Boolean 의   (클래스 이름이므로 대문자)
	  (얘네는 위의 애들을 하나하나 설계화 해놓은 것.. 위의 애들을 가둬놓을 틀..)
	  Wrapper 클래스 및
	  큰 숫자들을 다루기 위한
	  java.math.BigInteger 와 java math.BigDecimal 클래스를 제공한다.

	  Wrapper 클래스는 java.lang 패키지에 포함되어 이으므로
	  별도의 import 과정 없이 바로 사용하는 것이 가능하며,
	  기본형과 마찬가지로 Wrapper 클래스도 내부 메소드를 통해
	  형 변환이 가능하고 동등 비교와 같은 연산도 가능하다.

	  ex) java.lang.Integer 클래스
	  	  int 기본 자료형의 Wrapper 클래스로
		  정수를 다루는데 필요한 상수나 메소드, 진수 변환 등에 필요한
		  메소드 등을 포함하고 있다.

		  static int parseInt(String s)
		  : 문자열 형식으로 저장된 숫자를 정수 형태로 변환한다.

		  byte byteValue(), int intValue(),
		  short shortValue(), long longValue()
		  float floatValue(), double doubleValue()
		  : 해당 기본 자료형으로 형 변환한 값을 반환한다.

자바는 모든 걸 객체로 처리하지만.. 언어라면 이 정도는 해야한다.. 싶은 것들을 기본적인 것들..을... wrapper 클래스로..

○ 오토 박싱(Auto-Boxing)과 오토 언박싱(Auto-Unboxing)  --> 여기서의 박스가 일종의 클래스라고 봄..

	일반적으로 레퍼런스 형과 기본 자료형은 호환되지 않으며
	이 경우 발생하는 문제 해결을 위해 자바에서는 Wrapper 클래스를 제공하게 되었다.
	하지만 JDK 1.5부터 레퍼런스 형과 기본 자료형이
	다음과 같이 형 변환이 가능하게 되었다.

	int a=10, b;
	Integer ob;
	ob=a; 원래 Integer 타입만 담을 수 있는데 ..
	// 기본 자료형(int)이 Integer 형으로 자동 변환
	// 실제로는... 『ob = new Integer(a);』 인티저 메소드 안에 a 넣어서 변환 후 ob 변수에 넣기..
	// 이렇게 해야함..

	b=ob; // ob라는 객체를 b에 담는 것.. 자유롭게 해준 것.. 언박싱..
	// 4바이트 정수형에 객체를 담겠다고..?
	// Object(Integer)가 기본 자료형(int)으로 자동 변환(오토 언박싱)
	// 실제로는... 『b = ob.intValue();』

	이는 JDK 1.5 이후 추가된 오토 박싱과 오토 언박싱이라는
	기능으로 인해 가능해진 것이다. 

	// 어디까지 객체화 할 것 인가...? 하는 문제의식에서 출발..
	// 실수, 정수,, 이런 거 언제 담아..
	// 그래서 raw한.. 가장 기본적인 타입으로 가지고 있는게 자료형.. 가장 원시적인..
	// 하지만.. 자바는 객체 처돌이.. 이 원시적 자료와 객체 사이의 간극.. 어떻게 좁히냐..
	// 이 사이의 연결고리가 없다 = 호환되지 않는다.
	// 10이라는 숫자를 자바에 던졌을 때 자바는 이것도 객체야~~라고 하는 건데 실제로 그렇지 않음..
	// 레퍼런스(참조 타입 객체)와 기본자료형이 호환 안되면..
	// 현실에서 다루는 데이터를 자바에서 처리 못하고 자바가 처리한 걸 현실에서 못써..
	// 그래서 뤠퍼가 나온 것...
*/

	/*
	CircleTest ob = 20;
	원래 이렇게 안돼. 얜 클래스. 클래스는 인스턴스 생성을 통해 메모리 할당 받고 뭐 해야함..

	Integer ob = new Integer(10);
	원래는 이렇게 해야 클래스를 '객체 타입'으로 만들 수 있는 건데..
	10을 넘겨줘서..
	오토박스 덕에 이걸 Integer ob = 10; 할 수 있게 된 것~!
	*/


public class Test125
{
	public static void main(String[] args)
	{
		int a=10, b;
		Integer c;
		Object d;

		b = a;			//-- int형 데이터(자료)를 int형 변수에...
		c = new Integer(0);
		// 원칙적으로 c에는 주소가 들어감..


		// ※ 레퍼런스 자료형(참조 타입)과 기본 자료형(기본 타입)은 호환되지 않는다.
		//	  JDK 1.5부터 레퍼런스 형과 기본 자료형이
		//	  자동으로 형 변환이 가능하게 되었다. (내부적으로 처리...)

		b = c;		//-- Integer형 데이터(객체)를 int형 변수에...(오토 언박싱)
		b = c.intValue();	// (언박싱) 우리가 메소드를 통해 자유롭게 해줌..

		d = new Object();
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : java.lang.Object@15db9742

		// Integer가 오버라이딩했기때문에 업캐스팅해도.. object가 가진.. Integer가 오버라이딩 해놓은 그 메소드..
		d = new Integer(10); // 업 캐스팅~~!!! 어디서 오버라이딩된거..?
		// Object d = new Integer(10);

		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : 10

		d = new Double(12.345);	// 업 캐스팅
		System.out.println("d.toString() : " + d.toString());
		//-->> d.toString() : 12.345

		d = 10;		// Object d = 10; 이거를 문법적으로 허용해준 것! 오토 박싱
		System.out.println("d.toString() : " + d.toString());
		//-->> d.toString() : 10

		d = 12.345;		//-- 오토 박싱
		System.out.println("d.toString() : " + d.toString());
		//-->> d.toString() : 12.345

		/*
		Scanner sc;
		sc = new Scanner(System.in);
		*/
	}
}



/*
class Object
{
	Strint toString()
	{}
}

class Integer // extends Objext
{
	String to String()

	얘를 상속 받고 그대로 뒀다면

	Objext obj1 = new Object();
	Systme.~!  출력하면 해시코드


	지금한 건
	Object obj2 = new Integer();
	// 업캐스팅 됐으니까 얘도 Integer 쓴 것~!

	Integer itg = new Integer();
	System~~(itg.toString());
	그런데 이 결과가 해시코드가 아니라면?
	0이 나온다면?

	@Override
	{
		String toString()
	}
	되었다는 것~!
}
*/


/*
인스턴스 생성하면 클래스 전체가 메모리에 퍼올려지는게 아니라..
사실상 변수만 퍼올려짐..
메소드는 별도의 영역에서 ㄸㅏ로 퍼올려짐..

*/