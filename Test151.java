/*=================================
  ■■■ 컬렉션(Collection) ■■■ 
===================================*/

/*
○ 큐(Queue)

   큐(Queue)는 FIFO(First Input First Output) 구조로
   먼저 입력된 자료를 먼저 출력하며
   Queue 인터페이스를 구현한 클래스를 큐와 관련된 다양한 기능을 제공한다.

※ 큐(Queue) 인터페이스 인스턴스를 생성하기 위해서는
   new 연산자를 이용하여 Queue 인터페이스를 구현한(implements)
   클래스의 생성자를 호출한다.

   ex) Queue ob = new LinkedLinst();
   // 출구가 헤드~!

○ 주요 메소드
	// 여기서 E는 Element(요소)
   - E element()
     큐의 head 요소를 반환하며 삭제하지 않는다.
   - boolean offer(E o)
	 지정된 요소를 큐에 삽입한다.
   - E peek()
     큐의 head 요소를 반환하고 삭제하지 않으며
	 큐의 자료구조가 empty 인 경우 null을 반환한다.
   - E poll()
     큐의 head 요소를 반환하고 삭제하며
	 큐 자료구조가 empty 인 경우 null 을 반환한다.
   - E remove()
     큐의 head 요소를 반환하고 삭제한다. 
*/


import java.util.Queue;
import java.util.LinkedList;

public class Test151
{
	public static void main(String[] args)
	{
		// Queue 자료구조 생성
		// Queue myQue = new Queue();  이렇게 인스턴스 생성 안된다
		Queue<Object> myQue = new LinkedList<Object>();

		String str1 = "김영일";
		String str2 = "김영이";
		String str3 = "김영삼";
		String str4 = "김영사";

		// myQue라는 Queue 자료구조에 데이터 추가
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		myQue.offer(str4);

		// 『element()』 : 큐 자료구조에서 요소를 제거하지 않고 head 요소 반환
		System.out.println("값1 : " + myQue.element());
		//--==>> 값1 : 김영일

		System.out.println("값2 : " + myQue.element());
		//--==>> 값2 : 김영일

		System.out.println();

		/*
		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("val : " + val);
		}
		*/

		/* 시도해볼것!!
		for (String value : val)
		{
			val = (String)myQue.poll();
			System.out.println("val : " + val);
		}
		*/

		// val += (String)myQue.poll(); 다더한뒤한번에 출력

		// ①
		// 『peek()』 : 큐의 head 요소 반환. 제거 안 함.
		//			    큐가 empty일 경우 null을 반환


		/*
		String val;
		while (myQue.peek() != null)
		{
			// 『poll()』 : 큐의 head 요소 반환. 제거 함.
			//				큐가 empty일 경우 null을 반환
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		//--==>> 요소 : 김영일
		//	     요소 : 김영이
		//       요소 : 김영삼
		//       요소 : 김영사
		*/
		String val;
		/*
		// 테스트(확인)
		
		while (myQue.poll() != null)
		{
			// 『poll()』 : 큐의 head 요소 반환. 제거 함.
			//				큐가 empty일 경우 null을 반환
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		//--==>> 요소 : 김영이
		//		 요소 : 김영사

		*/
		
		/*
		// ② 무한루프~!
		while (true)
		{
			val = (String)myQue.poll();
			if (val==null)
				break;
	
			else
				System.out.println("요소 : " + val);
			

		}
		*/

		// ③
		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
	}
}