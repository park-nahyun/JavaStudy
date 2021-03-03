/*=====================================
  ■■■ 클래스 고급 ■■■
  - 인터페이스(Interface)
=====================================*/
 
// 인터페이스
interface Demo
{
	public void write();
	public void print();
}

// 클래스
// class DemoImpl
//
// 인터페이스를 구현하는 추상 클래스
abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() 메소드 재정의...");
	}

	// public void print();
}

// 클래스
// class DemoImpSub
//
// 추상 클래스를 상속받은 추상 클래스
// abstract class DemoImplSub extends DemoImpl
//
// 추상 클래스를 상속받은 클래스
class DemoImplSub extends DemoImpl
{
	@Override
	public void print()
	{
		System.out.println("print() 메소드 재정의...");
	}
}

// 클래스
public class Test114
{
	public static void main(String[] args)
	{
		// Demo ob1 = new Demo();		//-- 인터페이스 → 인스턴스 생성 불가
		// DemoImpl ob2 = new DemoImpl();		//-- 추상 클래스 → 인스턴스 생성 불가
		DemoImplSub ob3 = new DemoImplSub(); 

		ob3.write();
		ob3.print();

		//--==>> write() 메소드 재정의...
		//		 print() 메소드 재정의...
	}
}