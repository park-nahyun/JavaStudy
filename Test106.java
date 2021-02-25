/*=====================================
  ■■■ 클래스 고급 ■■■
  - 상속(Inheritance)
=====================================*/

/*
○ 상속(Inheritance)이란
   새로 설계(생성)하고자 하는 클래스가
   이미 설계되어 있는 다른 클래스의 기능과 중복되는 경우
   이미 설계된 클래스의 일부분이나 전체 구조를
   공유할 수 있도록 하는 기능을 의미한다.

   즉, 상속은 객체를 좀 더 쉽게 만들 수 있는
   고수준의 재사용성(reusability)을 확보하고
   객체 간의 관계를 구성함으로써
   객체 지향의 또 다른 큰 특징 중 하나인 『다형성』의 문법적 토대가 된다.

   상속은 기존 프로그램의 클래스 내용을 공유함으로써
   중복된 코드들을 다시 작성할 필요 없이
   반복적이고 세부적인 작업을 처리하지 않기 때문에
   프로그램을 작성하는 시간을 절약할 수 있고
   유지보수를 편리하게 할 수 있으며,
   프로그램의 길이도 짧아지게 된다.

   또한, 이미 작성한 프로그램들은 앞서 테스트되었기 때문에
   오류를 줄일 수 있어 현재 작성중인 프로그램에만 전념할 수 있다.


※ 주의할 점
   자바는 다.중.상.속.을 지원하지 않기 때문에
   두 개 이상의 클래스에서 상속받을 수 없다.
   즉, 단일상속만 허용한다. (자식의 입장에서 한 명의 아버지)

	- 우리 아버지는 ~뿐이에요.
	- 자식은 여럿 있을 수 있음.

*/

// 부모 클래스, 상위 클래스, Super class, 기초(기반) 클래스, 조상 클래스
class SuperTest106
{
	// 『protected』 : 상속받는 클래스, 동일 패키지에서 접근 가능한 접근제어지시자
	protected double area;

	// 생성자 - 사용자 정의 생성자(부모 클래스 생성자)
	SuperTest106()
	{
		// SuperTest106();  But 이건 클래스 생성자가 가져간 문법..
		// → super(); 이런 모양으로 부모 생성자가 생성되어 있다. 우리 눈에 안보일 뿐..
		// 생성자가 다른 생성자를 호출할 때는 맨위에 호출해야 한다!!! 기억해!!!
		System.out.println("SuperTest...");
	}

	// 부모 클래스가 갖고 있는 출력 메소드
	void write(String title)
	{
		System.out.println(title + " - " + area);
	}
}


// 자식 클래스, 하위 클래스, Sub class, 유도 클래스, 자손 클래스
public class Test106 extends SuperTest106    // Test106 extends SuperTest106
{
	// SuperTest106의 코드... 그대로 내려온다!

	/*
	protected double area;    // 생성자는 상속되지 않는다!! 그래서 부모클래스 생성자가 없다.

	void write(String title)
	{
		System.out.println(tittle + " - " + area);	// 얜 접근제어지시자가 default라 원래 상속받는 클래스가 접근 못하지만, 
	}												// 같은 패키지 안에 있으므로 접근 가능한 것!

	*/

	Test106()
	{
		System.out.println("Sub class...");
	}
	
	public void circle()
	{
		int r = 10;
		area = r * r * 3.141592;	// area가 선언되지 않았지만 ST에 선언되어 있으므로.. 상속받아서..
		write("원");		// 인스턴스 생성 없이 부르는 건 같은 클래스 안에서만 가능. 즉 상속받았기 때문에 가넝한..
	}
		
	
	public void rect()
	{
		int w = 20, h = 5;
		super.area = (double)w * h; 
		super.write("사각형");

		// this.area 는 가까운 클래스를 찾아보는 것, 얘가 포함되어 있는 클래스를 보는 것
		// super.area 는 얘의 부모클래스를 보는 것.
		// 위에선 안썼잖아?
		// 원칙적으로는 super. 표기해야함.
		// 위에건 굳이 표기 안한 것. '아버지로부터 물려받은 내 차 어딨지?' 안하는 것 처럼ㅋㅋㅋ
		// area 변수나 write라는 메소드가 지금은 하나 뿐이니까.
	}

	public static void main(String[] args)
	{
		// 자식 클래스(Test106)의 인스턴스 생성
		Test106 ob = new Test106();
		// 부모클래스 생성자도 같이 나온다.
		// 권리만 물려받는게 아니라 책임도 물려 받는 것.
		// 부모 인스턴스가 생성되어야 area 등등 쓸 수 있고, 자식은 그걸 썼으니까..
		// --==>> Super class...
		//		  Sub class...

		ob.circle();
		//--==>> 원 - 314.1592

		ob.rect();
	}
}

/*결과출력
SuperTest...
Sub class...
원 - 314.1592
사각형 - 100.0
계속하려면 아무 키나 누르십시오 . . .
*/