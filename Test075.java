/*=====================================
  ■■■ 클래스와 인스턴스 ■■■
  - 생성자(Constructor)
=====================================*/

// 생성자는 값을 반환할 수는 없지만 매개 변수를 넘겨 받을 수는 있음

class NumberTest2
{
	int num;
	
	/*
	NumberTest2()
	{
	}				// 우리 눈에 보이진 않지만 이게 디폴트로 생성된 것!
	*/

	// 사용자 정의 생성자 → 인자를 전달받는 생성자
	NumberTest2(int n)				// 이대로 하면 에러 난다
	{
		num = n;					

		// 시각적인 확인을 위한 출력 문구 삽입
		System.out.println("인자 전달 : " + n);
	}

	int getNum()
	{
		return num;
	}
}
public class Test075
{
	public static void main(String[] args)
	{
		// NumberTest2 클래스 기반의 인스턴스 생성
		// NumberTest2 ob = new NumberTest2(); // 매개 변수 없는 이걸 불러도 호출할 수 있는 것이 없음
		//-- 사용자 정의 생성자를 정의한 이후에는 컴파일 에러가 발생한다.
		// NumberTest2 클래스에는
		// 사용자 정의 생성자가 존재하고 있는 상황이기 때문에
		// 『default 생성자』(→ NumberTest2())가 자동으로 생샹되지(삽입되지) 않는다.

		// NumberTest2 클래스 기반의 인스턴스 생성
		NumberTest2 ob = new NumberTest2(10);
		//--==>> 인자 전달 : 10
		//-- 인스턴스 생성과 동시에 인자값이 있는 사용자 정의 생성자 호출~~!

		System.out.println("메소드 반환 값 : " + ob.getNum());
		//-->> 메소드 반환 값 : 10

		// NumberTest2 클래스 기반의 인스턴스 생성
		NumberTest2 ob2 = new NumberTest2(2456);
		//-->> 인자 전달 : 2456

		System.out.println("메소드 반환 값 : " + ob2.getNum());
		//-->> 메소드 반환 값 : 2456

	}
}