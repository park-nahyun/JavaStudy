/*=================================
  ■■■ 컬렉션(Collection) ■■■ 
===================================*/

// List → Vector, ArrayList
// - 순서 있음
// - 배열과 유사
// - 중복 가능

/*
○ ArrayList 클래스 

   - ArrayList 와 Vector 클래스는 
     List 를 크기 변경이 가능한 배열로 구현한 것으로
	 차이점은 Vector 클래스의 객체는 기본적으로 동기화되지만,
	 ArrayList 는 그렇지 않다는 점이다.

   - 비동기화 컬렉션은 동기화된 컬렉션보다 더 나은 성능을 제공하며
     스레드들이 컬렉션을 공유하지 않는 프로그램에서는
	 일반적으로 ArrayList 를 Vector 보다 더 선호하며,
	 ArrayList 를 동기화를 고려하지 않은 Vector 처럼 동작함으로써
	 스레드 동기화에 따르는 부담을 갖지 않기 때문에
	 Vector 보다 더 빠르게 실행된다.

   - null 을 포함한 모든 요소를 허용하며
     List 인터페이스를 구현하는 것 외에 리스트에 격납하기 위해
	 내부적으로 사용되는 배열의 사이즈를 조작하는 메소드를 제공한다.

	 // 추가적인 기능이 있을수록 성능이 떨어짐
	 // 벡터는 원래 기본자료형 지원 안하고 레퍼만 지원하는데 오토박싱, 언박싱 덕에 사용 가능

*/

import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
import java.util.ListIterator;

public class Test160
{
	public static void main(String[] args)
	{
		// List<String> list = new List<String>();
		// ------------------- 리스트는 인터페이스라 직접 생성자 생성 안됨

		// ArrayList<String> list = new ArrayList<String>();
		// Vector<String> list = new Vector<String>();
		// List<String> list = new Vector<String>();
		List<String> list1 = new ArrayList<String>();		// ArrayList를 만들어 업캐스팅

		// list1에 요소 추가 → add()
		list1.add("불한당");
		list1.add("소울");
		list1.add("미나리");

		// 이번 인스턴스 생성은... 생성 과정에서 list1 을 생성자에게 넘겨줌
		List<String> list2 = new ArrayList<String>(list1);		// check~!!!

		// list2 에 요소 추가 → add()
		list2.add("광해");	

		List<String> list3 = new ArrayList<String>();

		// list3 에 list2 의 전체 요소 추가 → addAll()
		list3.addAll(list2);

		// "소울" 앞에 "해리포터" 추가
		//-- ① "소울" 찾기 → indexOf() → 위치값 인덱스 반환
		int n = list3.indexOf("소울");	
		//-- ② "소울" 찾은 인덱스 위치에 "해리포터" 투입
		list3.add(n, "해리포터");
		

		// 출력 → 더미 데이터 확인
		System.out.println("===================================");
		System.out.println(list1);
		//--==>> [불한당, 소울, 미나리]
		System.out.println(list2);
		//--==>> [불한당, 소울, 미나리, 광해]
		System.out.println(list3);
		//--==>> [불한당, 해리포터, 소울, 미나리, 광해]

		// 출력 → ListIterator를 활용하여 출력 → listIterator() 메소드 활용
		System.out.println("===================================");
		ListIterator<String> li = list3.listIterator();
		while (li.hasNext())
			System.out.print(li.next() + " ");
		System.out.println("\n");
		//--==>> 불한당 해리포터 소울 미나리 광해

		// 출력 → 역순으로 출력 → ListIterator를 활용하여 출력
		// → hasPrevious() / previous() 메소드 활용
		System.out.println("===================================");
		while (li.hasPrevious())	// 이전 값이 있는지 없는지 확인(맨 끝에서 출발)
			System.out.print(li.previous() + " ");
		System.out.println("\n");	// 실제로 커서 움직이면서 데려오는 애
		//--==>> 광해 미나리 소울 해리포터 불한당

	}
}