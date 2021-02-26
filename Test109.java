/*=====================================
  ■■■ 클래스 고급 ■■■
  - 상속(Inheritance)
=====================================*/
/*
※ 메소드 오버라이딩(Method Overriding)의 특징
	- 메소드 이름, 리턴 타입, 파라미터 수나 타입이 완전히 일치해야 한다.
	- 반드시 상속 관계가 있어야 한다.
	- 재정의된 하위 클래스의 메소드 접근제어지시자는
	  상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
	  예를 들어, 상위 클래스 메소드의 접근제어지시자가 『protected』인 경우
	  하위 클래스가 이 메소드를 오버라이딩(Overrinding)하는 경우
	  접근제어지시자는 『protected』 또는 『public』이어야 한다.
	- 『static』, 『final』,『private』 메소드는 오버라이딩(Overriding)할 수 없다.
		// static은 class 로딩과 함께 메모리 퍼올려지므로.. 이미 독립된 공간에 존재. 나중에 인스턴스 생성으로 덮어도 독립된 공간에는 여전히 존재
		// final은 메소드에도 붙을 수 있다. final은 진짜진짜최종이므로 수정 안돼~! 그리고 많이 쓰임.
		// private은 자식이라도 접근이 불가능하니까.. 상속을 못받은 것!
	- Exception의 추가가 불가능하다.
	  즉, 상위 클래스의 메소드가 가지고 있는 기존의 예외 사항에
	  새로운 Exception을 추가하는 것은 불가능하다.
	- 물려받은 걸 큰 틀 이상으로 바꾸지 못하게 만들기 위함.

*/
/*
class 부모
{
	protcted void input() throws IOException
	{
		...;
	}
}

class 자식 extends 부모
{
	@Oberride
	protcted void input() throws IOException, ArrayIndexOutOFBoundsException
	{
		...;
		...;
	// 이게 안된다고!!!!
	}
}


or

class 부모
{
	protcted void input(String temp) 
	{
		...;
	}
}

class 자식 extends 부모
{
	@Oberride
	protcted void input(String temp) throws IOException
	{
		Br...
		br.readLine();
		...;
		...;
	// 이게 안된다고!!!!
	}
}


*/

// 상위 클래스, 부모 클래스, super class
class SuperTest109
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}
}

// 하위 클래스, 자식 클래스, sub class
class SubTest109 extends SuperTest109
{
	/*
	private int a = 5; (못가져 오지만 지금은 같은 패키지)
	protected int b = 10;
	public int c = 20

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b " : " + c);
	}
	*/

	protected int b = 100;

	public void print()
	{
		// System.out.println("Sub print() 메소드 : " + a + " : " + b + " : " + c);
		//--==>> 에러 발생(컴파일 에러) a는 private라 접근이 안됨..
		//-- 슈퍼 클래스(SuperTest109)에서 선언된 변수 a에는 접근할 수 없다.
	
		System.out.println("Sub print() 메소드 : " + b + " : " + c);
		//--==>> Sub print() 메소드 : 100 : 20
		// 여기서의 b는 자식의 b.

		System.out.println("Sub print() 메소드 : " + super.b + " : " + c);
		//--==>> Sub print() 메소드 : 10 : 20
		//-- 슈퍼 클래스(SuperTest109)에서 선언된 변수 b에 접근하기 위해서는
		//	 『super』 키워드를 사용하면 된다.

		System.out.println("Sub print() 메소드 : " + c);
		System.out.println("Sub print() 메소드 : " + this.c);
		System.out.println("Sub print() 메소드 : " + super.c);
		//--==>>
		/*
		Sub print() 메소드 : 20
		Sub print() 메소드 : 20
		Sub print() 메소드 : 20
		*/

		//-- 슈퍼 클래스(SuperTest109)에서 선언된 c에 접근하는 데는
		//   아무 제약이 없다.

	}

	@Override
	public void write()
	{
		// System.out.println("Sub write() 메소드 : " + a + " : " + b + " : " + c);
		System.out.println("Sub write() 메소드 : " + b + " : " + c);
	}

	//-- 컴파일 에러
	//-- 이 위치에서는 a가 보이지 않는다. 부모 클래스 안에서는 보이지만.

}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test109
{
	public static void main(String[] args)
	{
		// 하위 클래스(SubTest109) 인스턴스 생성
		SubTest109 ob = new SubTest109();
		ob.print();
		//--==>> Sub print() 메소드 : 10 : 20
		ob.write();
		//-->> Super write() 메소드 : 5 : 10 : 20
		// ※ write() 메소드 오버라이딩 후...
		//--==>> sub write () 메소드 : 100 : 20
		//-- 슈퍼 클래스(SuperTest109)에서 선언된 변수 a에 접근할 수 없다.
		//   → private 변수이기 때문에..
		//	 또한, 이 때 접근한 변수 b는 부모로부터 물려받은 b가 아닌
		//   자신의 변수 b인 것을 확인할 수 있다.
		//     자식 클래스에 a가 없는데 어떻게 a가 나오지?
		//	   부모 클래스의 write가 자식 클래스로 내려온다는 개념.. 실제로 쫙!생기는게 아니라
		//     쫑쫑쫑 오는 것..

		//--------------------------------------------------------------------------------
		System.out.println("-------------------------------------- 구분선");

		ob.write();
		
		// 변수와 메소드는 상속되는.. 매커니즘 같은게 다르다.
		// 메소드는 일종의 튜닝~!

		((SuperTest109)ob).write();													// check~!!!
		//--==>> Sub write() 메소드 : 100 : 20

		// 메소드는 덮어쓰기! 재정의!

		// SuperTest109 타입으로 캐스팅(형변환).. ob(생성된 객체)만! 형변환..
		// 자식 객체의 위상이 부모 객체의 위상으로 변한다!!

		System.out.println(ob.b); // 책 물려받고, 내가 한 권 더 만든 것
		//--==>> 100

		// 변수는 중복 정의!!

		System.out.println(((SuperTest109)ob).b);
		//--==>> 10

		// 메소드는 재정의!!


		// ※ 슈퍼 부름 (엄.. 변수만 가능한 것..! 메소드는 아냐)

		// ※ 메소드와 변수를 꼭 구분하여 정리해 둘 것~!!!

	}
}


		/*
		class 학생
		{
		}

		class 정준 extends 학생         
		{
		}

		class 혜림 extends 학생         
		{
		}

		class  서현 extends 학생         
		{
		}

		학생의 기본 속성을 정준, 혜림, 서현이 물려받은 것.

		정준 ob1 = new 정준();    
		이렇게 생성된 정준이 객체는 학생 속성을 전부 물려받은 상태.

		학생 ob2 = ob1; 이게 된다~!

		그런데

		학생 ob2 = (학생)ob1; 이렇게 해야해
		*/

		/*
		class 포유류
		{
			...
		}

		class 사람 extends 포유류
		{
			...
		}

		class 외부
		{
			메소드()
			{
				사람 kd = new 사람();			길동이는 사람.. 길동이라는 이름 붙여서 사람 하나 맹듬..
				사람 객체인 길동이가 만들어짐. 얜 사람 타입이야~!
				
				포유류 sr = (포유류)kd; 
				길동이를 포유류 타입에 담고싶어. 근데 사람보다 큰 타입이지~! 그래서 형변환!~
				사람 타입은 클래스 구조상~~ 포유류 타입에 들어가지니까~~! 일단 지금은 이렇게 해도 돼~!
				오직 상 속 관 계 에 서 만 하는 것..

				byte kd = 10;
				int sr = (int)kd;

				primitive에서 자동형변환 할 때, 명시적으로 형변환 표기하는 것처럼..
			}
		}

		// 이게 왜 가능? 사람 인스턴스를 만들 때 포유류 인스턴스를 자동으로 만든다.
		// 이 때 포유류 생성자(설계도)가 자바에게 넘어감 
		// 즉 자바가 포유류가 뭔지 알기 때문에.. 
		// 그래서 반대는 안됨. 포유류 클래스는 사람이 뭔지 모름~(부모는 자식을 다 모름)

		*/