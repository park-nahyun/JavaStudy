/*=====================================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스
=====================================*/

class Test // 외부클래스
{
	static int a=10;		// 전역변수 멤버변수 static 변수(클래스변수)
	int b=20;				// 전역변수 멤버변수 instance 변수


	// ▶ 첫 번째 write() 메소드
	void write()
	{
		System.out.println("write()...①");

		final int c=30; // 지역변수 상수화된변수(값이 변하지 않는 변수)
		int d=40;		// 지역변수 값이 수시로 변할 수 있는 변수
		
		// 얘네는 첫째 write 생성될 때 같이 생성 받음

		// 내부 클래스
		// 메소드 안에 존재하는 또다른 클래스(local class, 지역 클래스)
		class LocalTest
		{
			// 두 번째 write() 메소드
			void write()
			{
				System.out.println("write()...②");

				System.out.println("a : " + a);
				System.out.println("b : " + b);
				// Test 클래스 기반으로 LocalTest인스턴스 생성되어야 write() 가능
				// 따라서 b는 태어나 있을 것..
				System.out.println("c : " + c);
				// LocalTest인스턴스 생성되어야 write()
				// But 인스턴스 생성이 언제 될 지 알 수 없다.
				// 이 위치에서 c찍어라 d찍어라 구성하면
				// But write 메소드안에서 이 변수들은
				// 언제든 값이 바뀔 수 있음.
				// 그래서 얘네 값을 단정지을 수 없음..!(불안정한 상태)
				// 그래서 접근 못하게 하는 것~!
				// System.out.println("d : " + d);
				//--==>>  local variables referenced from an inner class must be final or effectively final

				// 이 때 final은 c가 10년 뒤에 태어나든 20년 뒤에 태어나든
				// 값이 확정되어있다고 말해주는 것!!! 그래서 접근가능한~!
			}
			// 얘네는 인스턴스 있어야 태어남..
		}
		
		//c=20;
		d=30;

		// 첫 번째 write() 메소드에서 생성한 지역 클래스의 인스턴스
		LocalTest ob1 = new LocalTest();

		//  두 번째 write() 메소드 호출
		ob1.write();
	}

}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test118
{
	public static void main(String[] args)
	{
		// 외부 클래스에 대한 인스턴스 생성
		Test ob2 = new Test();

		// 첫 번째 write() 메소드 호출
		ob2.write();
	}
}



/*
write()...①
write()...②
a : 10
b : 20
c : 30
계속하려면 아무 키나 누르십시오 . . .
*/


// 클래스 파일
// Test 클래스
// Test$1LocalTest   $1 --> 첫번째 메소드 안에 있는 클래스 파일이라는 뜻..
// Test118 클래스
