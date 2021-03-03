/*=====================================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스
=====================================*/


// 외부 클래스(outer)
class InnerOuterTest
{
	static int a=10;
	int b=20;

	// 내부 클래스(inner)
	class InnerNested
	{
		int c=30;

		// ▶ inner의 write() 메소드
		void write()
		{
			System.out.println("inner의 write()...");
			
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			// InnerNested 탄생할 때 b 탄생 할 때 일치..?
			System.out.println("c : " + c);
			// 얘도 접근 가능..
		}
	}
	
	// ▶ outer의 write() 메소드
	void write()
	{
		System.out.println("outer의 write()...");

		// 내부 클래스(inner)의 인스턴스 생성
		InnerNested ob1 = new InnerNested();

		// inner의 write() 메소드 호출
		ob1.write();
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test119
{
	public static void main(String[] args)
	{
		// 외부 클래스(outer)의 인스턴스 생성
		InnerOuterTest ob2 = new InnerOuterTest();
		
		// outer의 write() 메소드 호출
		ob2.write();
		/*
		outer의 write()...
		inner의 write()...
		a : 10
		b : 20
		c : 30
		계속하려면 아무 키나 누르십시오 . . .
		*/

		// InnerNested ob3 = new InnerNested();
		//--==>> 에러 발생(컴파일 에러)


		// InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		// static 붙어있는 클래스는 이렇게 처리했지
		//--==>> 여기선 안됨. 에러 발생(컴파일 에러)

		// ※ 중첩 내부 클래스(static 내부 클래스)와는 달리
		//    외부 클래스의 인스턴스(객체)를 사용하지 않고
		//	  단독으로 내부 클래스의 인스턴스를 생성하는 것은
		//    불가능하다.

		// ※ Test117.java와 비교할 것~!!!

		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();

		/*
		inner의 write()...
		a : 10
		b : 20
		c : 30
		계속하려면 아무 키나 누르십시오 . . .
		*/

		// 이건 ob2에 외부 클래스의 인스턴스가  생성 되어있는 경우

		// 바로 생성하려면

		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();

		/*
		a : 10
		b : 20
		c : 30
		계속하려면 아무 키나 누르십시오 . . .
		*/

		
		// 클래스 파일
		// InnerOuter 외부 클래스
		// InnerOuter$InnerNested 내부 클래스(static 붙어 있든 없든 상관 노)
		// Test119 클래스

		
	}
}

