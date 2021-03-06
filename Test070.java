/*=====================================
  ■■■ 클래스와 인스턴스 ■■■
=====================================*/

// 직사각형 클래스 설계 → Rect

/*
·내용(비즈니스로직) : 직사각형의 넓이와 둘레를 계산, 클래스로 표현.
·클래스의 정체성 → 직사각형
·클래스의 속성 → 가로, 세로, (넓이, 둘레, 무게, 생상, 재질, ....)
·클래스의 기능 → 넓이 계산, 둘레 계산, 가로/세로 입력, 결과 출력
										___________		___________
										가로 입력 :		가로 : xxx
										세로 입력 :		세로 : xxx
														넓이 : xxxx
														둘레 : xxxx


// 객체를 구성 → 데이터(속성, 상태) + 기능(행위, 동작)
       |
	   |  설계도 ------------------	   -----------------
	   |
   클래스 설계 →   변수			 +		메소드 


*/

import java.util.Scanner;

class Rect				// 직사각형 클래스 설계(명명 규칙 참조 - 대문자 시작)
{
	// ○ 변수 선언(가로/세로);
	// 전역 변수 - 클래스 영역 안에서 글로벌 활동이 가능한 변수
	// 멤버 변수 - 클래스에 소속되어 있는 요소로써의 의미
	// 인스턴스 변수 - 인스턴스가 생성도었을 때 비로소 메모리 할당이 이루어지는 변수
	//				 - 생성된 인스턴스를 통해 접근 가능한 변수(xx.변수)
	int w, h;

	// ○ 메소드 정의(가로/세로 입력);
	//	  - 메소드 이름 명명(명명 규칙 참조 - 소문자 시작, 동사형태가 포함되는 것이 좋다)
	//    - 매개변수 구성
	//    - 반환 자료형 구성(호출한 곳에 어떤 값을 두고 오겠다 하는 것)
	//    - 메소드 내부 정의
	// ※ 『void』는 메소드 실행 후 메소드를 호출한 곳에 
	//		결과를 돌려줄 필요가 없을 때 지정하여 사용하게 디는데
	//		아무것도 돌려주지(반환하지) 않는다고 해서
	//		반환 자료형을 명시하지 않게되면 문법적인 에러가 발생하게 된다.
	//		(반환 자료형을 명시하지 않는 문법은 생상자에서 선점~!!!)


	void input() // 아무 값도 받지 않은 상태. 사용자가 입력한 값 가져오기 위해.. (매개 변수가 직접 넘겨 받는 것이 아니라 호출이 되면~).. 아무 것도 넘겨주지 않는다.. 무슨말.. 모르겠다..
			// 반환 자료형은 void(아무 것도 두고 오지 않을래요!).. but 답이 정해지지 않음... int..boolean..다 가능..제대로 입력됐으면 뭔가 두고오고 안됐으면 다른거 두고오고~! 
			// 지금은 그냥 입력 받기만 할거라서 void..
	{
		//  Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in); // 문법적으로 가능한데 바람직하진 않음./.=
		System.out.print("가로 입력 : ");
		w = sc.nextInt();
		System.out.print("세로 입력 : ");
		h = sc.nextInt();
	}

	// ○ 메소드 정의(둘레 계산)
	// 메소드의 실행 후 결과가 정수인 경우를 지정하기 위해
	// 리턴 자료형(반환 자료형)은 『int』형을 사용하게 된다.
	// 사각형의 둘레를 구하는 과정에서 필요한 연산은
	// 『(가로 + 세로) * 2』이며, 이들은 모두 정수이기 때문이다.
	// 또한, 넓이나 둘레를 담을 변수를 클래스 내부에 별도로 선언한 것이 아니기 때문에
	// 연산 결과는 메소드를 호출한 곳에 반환하는 형태로 처리되어야 한다.

	int callength()
	{
		// (가로 + 세로)*2 : 
		// w, h가 보인다! callength는 멤버 메소드... 이미 보이는 영역에 있으므로 딱히 넘겨 받아야 할 값이 없음!!!
		// 가로 세로 속성만 있고 둘레, 넓이 변수는 딱히 선언 안했지... void안돼...

		return (w + h) * 2; 
	}

	/* void callengh()
	  하려면 a = int return(w + h ) *2

	*/

	// ○ 메소드 정의(넓이 계산)

	int calArea()
	{
		int result;

		result = w * h ;

		return result;

		// 가로 * 세로
	}

	// ○ 메소드 정의(결과 출력)
	// 매개 변수를 통해 데이터를 넘겨받을 수 있도록 정의(갖고 있지 않은 데이터)
	// 메소드의 매개 변수는 메소드 내에서만 활동 가능(보이는 영역)
	// 매개변수 선언 시 각각의 변수마다 자료형을 따로 지정해야 한다~~!!!
	void print(int a, int l)  //넓이, 둘레 // 매개 변수 뭘 넘겨줘야 할까.. 출력 메소드에서는 출력만! 넓이, 둘레는 값을 가지고 있지 않다
	{
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + l);     // a, l 값은 사용하는 쪽에서 넣어주는 것...
	}
}


// ※ 하나의 자바 파일(.java)에 여러 개의 클래스(class)를 만들 수 있다. 
//	  하지만, 『public class』는 하나만 올 수 있다.
//	  파일을 저장할 때의 이름은 『public class』 이름으로 지정행 하며,
//	  구성된 모든 클래스가 『public class』가 아닐 경우
//	  이들 중 파일을 대표할 수 있는 클래스를 선택하여
//	  해당 클래스의 이름으로 지정해야 한다.
//	  또한, 여러 개의 클래스가 설계된 하나의 파일을 컴파일하게 되면
//    내부에 설계된 클래스의 수 만큼 클래스 파일(.class)이 생성된다.



// main() 메소드를 포함하고 있는 외부의 다른 클래스

public class Test070
{

	public static void main(String[] args)
	{
		// Rect 클래스 기반의 인스턴스 생성
		// ----------------
		//     설계도면
		Rect ob = new Rect();		
		int a, b;      // 둘레, 넓이

		ob.input();
		a = ob.callength();
		b = ob.calArea();
		ob.print(b,a);

		// ???? =  ob.input();  할 필요 없음. 리턴이 void니까..
	}
}


// 클래스 안에서 메소드 정의 순서는 중요하지 않음. 메소드가 순서대로 실행되는 것이 아니기 때문에... 어차피 외부에서 불러다 쓰므로~!!!
// 한 파일에서 클래스 여러개 쓸 수 있다. 그러나 public이 붙은 건 하나 밖에 안됨! 자바 파일명은 public이 붙은 클래스로 저장해야한다~~!!!