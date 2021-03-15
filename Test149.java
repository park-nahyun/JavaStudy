/*======================================================
  ■■■ 컬렉션 프레임 워크(Collection Framework) ■■■ 
========================================================*/
// 객체지향 다음으로 중요한 개념 ! ! !

/*
○ 컬렉션 프레임워크(Collection Framework)
   == 컬렉션(Collection) + 프레임워크(Framework)
	  ------------------   ---------------------
			 |			   약속, 틀(구조, 뼈대), 환경
			 |
		    집합 → 수집품, 소장품, (물건이나 사람들의) 무리, 더미, 수집, 수거
	  ------------------------------------------------------------------------
				       모여있는 것들... 모아놓은 것들...

==> 자료 구조 

○ 자료		// 자료는 정보와 다르다
   현실 세계로부터 단순한 관찰이나 측정을 통해 수집된
   사실이나 개념의 값들 또는 그 값들의 집합

     ↓

○ 자료구조
   자료 처리를 위한 자료의 표현, 저장, 관계, 관리 및
   이용에 관한 방법 등의 개념을 이해하여 프로그램에 사용하고
   컴퓨터에 의해 처리되는 과정에서 적절한 자료의 표현, 구성, 저장 및
   처리를 위한 알고리즘의 작성 및 선택과 이용 방법을 연구하는 분야.
  
○ 컬렉션 프레임워크(Collection Framework)
   컬렉션(모아놓은 데이터들)의 표현과 조작을 위한 통일된 아키텍처로
   컬렉션 프레임워크를 구성하는 요소는 다음과 같다. (세 가지)

   1. 인터페이스(Interface)		List, Set, Map
	  // List는 출석부를 떠올리길..
	  // Set은 약간 랜덤 주머니 같은.. Map은 Set과 비슷하게 생겼는데 
		 내용물들에 끈+번호표가(밸류+키) 달려있어서 
		 주머니 밖에서 번호표를 뽑아서 공을 꺼낼 수 있는 것.. 
		 순서는 없지만 식별이 가능해지는 것. 밸류는 중복 있어도 되지만 키는 안돼..
      기본적으로 컬렉션에 필요한 데이터 관리 기능을 제공한다.
	  에를 들어, list 는 추가, 삭제, 검색 등의 기능을 제공하는
	  컬렉션 인터페이스가 존재하며
	  각 컬렉션마다 고유의 인터페이스가 정의되어 있다.
	  

   2. 구현(Implementation)
	  인터페이스를 구현한 클래스로 각 컬렉션을
	  실제 어떤 자료구조를 이용하여 표현했느냐에 따라
	  컬렉션의 종류가 달라지게 된다.

   3. 알고리즘(Algorithms)
      각 컬렉션들마다 유용하게 사용할 수 있는 메소드를 의미한다.

※ 자바 컬렉션은 견고한 컬렉션 프레임워크 기반 위에 정의되어 있으므로
   각 컬렉션 종류마다 제공되는 메소드의 일관성이 있기 떄문에
   한 가지 컬렉션을 익혀두면 다른 컬렉션을 사용하는 데 용이하다.
*/

/*
○ 스택(Stack)

	Stack 클래스는 오브젝트 후입선출(LIFO) 구조의 Stack을 나타낸다.
	이는 벡터(Vector)를 스택으로 처리하는 5개의 메소드로
	벡터(Vector) 클래스를 확장하게 된다.

	통상의 push() 메소드와 pop() 메소드가 제공되는 것 외에
	스택의 선두 항목으로 peek() 을 실시하는 메소드,
	스택이 비어있는지의 여부를 확인하는 메소드 isEmpty()
	스택으로 항목을 찾아서 선두로부터 몇 번째인지를 찾아내는 메소드 등이 제공된다.

	스택이 처음으로 작성되었을 때, 항목은 존재하지 않는다.

	- boolean empty()
	  스택이 비어있는지 확인한다.

	- E Object peek()
	  스택의 맨 위의 객체를 스택에서 제거하지 않고 반환한다.

	- E Object pop()
	  스택의 맨 위의 객체를 반환하고 스택에서 제거한다.

	- E Object push(E item)
	  객체를 스택 자료구조에 저장한다.

	- int search(Object o)
	  스택의 맨 위에서부터 파라미터 값으로 넘겨받은 객체까지의 거리를 반환한다.
	  맨 위의 객체의 경우 1을 반환하고, 그 아래 객체는 2를 반환하는 형식.

	// 운영체제 메모리 관리 기본 구조가 스택~!
	// 
*/

import java.util.Stack;

public class Test149
{
	public static void main(String[] args)
	{
		// Stack 자료구조 생성
		Stack <Object> myStack = new Stack<Object>();
		// 스택 안에 뭐가 들어있는지 보이지 않는 통
		// 그래서 안정성 위한 장치를 제공
		// 나는 stack이라는 구조를 만들건데 그 안의 요소들은 object로 쓸거야..

		String str1 = "김철수";
		String str2 = "곽철용";
		String str3 = "오윤희";
		String str4 = "김치환";

		// myStack이라는 Stack 자료구조 안에 str1 ~ str4 까지 담아내기

		myStack.add(str1);	//(object)str로 넣어도 됨... // object 담아쓴다고 했으니까 여기 있는 인수들은 object형이 됨
		myStack.add(str2);	// 업캐스팅!!! 된다는 것!!!
		myStack.add(str3);
		myStack.add(str4);

		// 『peek()』 : 스택 맨 위의 객체 반환, 제거하지 않는다.
		String val = (String)myStack.peek();
							//-- 즉 얘가 반환하는건 object형

		System.out.println("val : " + val);
		//--==>> val : 김치환


		/*
		class Stack<T>
		{
			...
				add(<T> obj)
				{}

				<T> myStack.peek();
				--- 반환형도 <T>가 된다는 것
		}
		*/

		val = (String)myStack.peek();
		System.out.println("val : " + val);
		//--==>> val : 김치환

		val = (String)myStack.peek();
		System.out.println("val : " + val);
		//--==>> val : 김치환
		
		System.out.println();
		// myStack 이라는 이름을 가진 Stack 자료구조에
		// 데이터가 비어있지 않은 상황이라면... (채워져 있는 상태라면...)
		while (!myStack.isEmpty()) // is : ~인지 아닌지.. 불린으로 반환.. 
		{
			// 『pop』 : 스택 맨 위의 객체 반환, 제거한다.
			val = (String)myStack.pop();
			System.out.println("val : " + val);
		}
	}
}


/*
val : 김치환
val : 김치환
val : 김치환

val : 김치환
val : 오윤희
val : 곽철용
val : 김철수
계속하려면 아무 키나 누르십시오 . . .
*/