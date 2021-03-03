/*=====================================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스
=====================================*/
/*
○ Annonymous 클래스(익명의 클래스, 무명 클래스)

	- AMT나 안드로이드 이벤트 처리에서 일반적으로 활용
	- 상위 클래스 메소드를 하나 정도 재정의할 필요성이 있을 때 사용
	- 클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는
	  번거로움 때문에 익명의 클래스를 생성하여 처리한다.

○ 형식 및 구조

	new 상위클래스의생성자()
	{
			접근제어지시자 자료형 메소드()
			{
				// ...;
			}
	};	// ← 반드시 세미콜론 필요함~!!!
*/

// import java.lang.Object;
// 모든 클래스는 눈에 보이지 않지만 예외없이
// import java.lang.*; 이 들어있음!! 언어적으로 기본적으로 들어가야 할 패키지들..
// 자동으로 들어가게 한 것. 에디트 플러스에서 빨간색으로 표시되는 모든 것들(String, System.. 등..)

// 외부 클래스
// 클래스는 다중상속 안된댔는데 Test가 만약에 다른 클래스를 상속 중이라면..?
//-- extends 없는 애들만 extends Object함!!! 알고보면 그 부모 클래스가 Object를 상속..
class Test // extends Object(사실 모든 클래스는 Object를 extends함..)
{
	// super....;  // 뭘 상속 안받아져 있어도 이렇게 쓰는게 가능!!! (Object로..)

	/*
	String toString()
	{} 이 메소드도 여기 있겠지?

	.. 오브젝트가 가지고 있는 애들 이미 생성받은 상태..
	배열 복사 한거 기억해내봐..
	(int)배열.clone();  <-- 이 메소드 사실 오브젝트 안에 있던 것.. 그래서 형변환 필요 했던 것..
	*/

	public Object getString()	// 상위 클래스 생성자 써야하니까...
	{

		/*
		// Object를 반환하고 싶다면 원래...
		Object result = new Object();
		result.메소드();
		result.변수 = xxx; 혹은 메소드를 통해 변수 변경..
		return result;
		뭐 이렇게 해야하잖아
		*/
		
		/*
		return new Object(); 이렇게도 할 수 있겠지? 그냥 생성된 걸 바로 리턴..

		혹은

		returtn new Object() 이렇게도...
		{
			중얼중얼...
		}
		*/
		

		// 익명의 클래스
		return new Object() // 객체 반환을 String으로 하겠다
		{
			@Override
			public String toString()	// toString은 Object 안에 있는 메소드~!
			{
				return "익명의 클래스...";
			}
		};		// ☜ 세미콜론(미 작성 시 에러 발생)
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test120
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println(ob1.toString());     // object가 갖고 있던 것
		//--==>> Test@15db9742
		System.out.println(ob1.getString());	// 우리가 정의한 것
		//--==>> 익명의 클래스...

	}
}


// 클래스 파일
// Test 클래스
// Test$1 이름 없는 애는 숫자만~!
// Test120 클래스