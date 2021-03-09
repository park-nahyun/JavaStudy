/*=================================
  ■■■ 컬렉션(Collection) ■■■ 
===================================*/

import java.util.Queue;
import java.util.LinkedList;	// 배열이랑 비슷한데 이어진 모양..

public class Test152
{
	// 정적 문자열 배열 선언 및 초기화
	public static final String[] colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};
	
	public static void main(String[] args)
	{
		String val;
		// Queue 자료구조 생성
		//-- Queue 인터페이스 기반의 인스턴스를 생성하기 위해서는
		//   new 연산자를 이용하여 Que 인터페이스를 implements 한
		//   하위 클래스의 생성자를 호출해야 한다.
		Queue<String> myQue = new LinkedList<String>(); 

		// myQue라는 해당 자료구조에 colors 의 데이터 입력 → offer()
		for (String color : colors)
			myQue.offer(color);
		
		// myQue 라는 해당 자료구조(Queue)의 모든 데이터 출력
	
		/*
		while (true)
		{
			val = (String)myQue.poll();
			if (val == null)
				break;
			else
				System.out.println(val);
		}
		*/

		while (myQue.peek() != null)
			System.out.print(myQue.poll() + " ");
		
		System.out.println();
		//--==>> 검정 노랑 초록 파랑 빨강 연두
	}
}

// 여기서는 <object>로 해도됨. 근데 데이터 안정성을 위해 String으로 가기~!