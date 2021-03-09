/*=================================
  ■■■ 컬렉션(Collection) ■■■ 
===================================*/

import java.util.Stack;

public class Test150
{
	// 정적 문자열 배열 선언 및 초기화
	public static final String[] colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};
	
	// 생성자
	public Test150()
	{
		// st 라는 Stack 자료구조 생성
		// 제네릭을 활용하여 자료구조에 담기는 데이터 표현 → 『<String>』
		Stack<String> st = new Stack<String>();

		// st 라는 Stack 자료구조에 데이터 담기
		// colors 라는 문자열 배열 요소를 모두 담아내기
		for(String color : colors)	
			st.push(color);	// 적재하는 메소드.. 옛날 메소드.. 새로나온 건 add

		// 데이터 추가
		st.push("보라");

		// 데이터 추가
		st.push("하늘");

		// 데이터 추가
		st.push(10.0);
		// 제네릭 때문에 에러남. 자료구조에 여러 종류 담을 순 있지만
		// <String> 담기로 약속 했으므로..
		//-- 제네릭 표현식을 통해 선언하고 있는
		//   String 이 아닌 다른 자료형(double)을 스택에 push() 하려고 했기 때문...

		// 출력 메소드 호출
		popStack(st);
	}

	// 출력 메소드
	public void popStack(Stack<String> st)
	{
		System.out.print("pop : ");
		while (!st.empty())		//옛날 메소드
		{
			System.out.print(st.pop() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		new Test150();
	}
}