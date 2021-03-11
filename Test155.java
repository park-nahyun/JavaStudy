/*=================================
  ■■■ 컬렉션(Collection) ■■■ 
===================================*/

import java.util.Vector;
import java.util.Collections;

public class Test155
{

	// 정적 문자열 배열 선언 및 초기화
	public static final String[] colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};

	public static void main(String[] args)
	{
		// v 라는 Vector 자료구조 생성
		Vector<String> v = new Vector<String>();

		// v 라는 Vector 자료구조에 colors 요소 추가
		for (String color : colors)
			v.add(color);
		
		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("두 번째 요소 : " + v.get(1));
		System.out.println("마지막 번째 요소 : " + v.lastElement());
		System.out.println("요소의 개수 : " + v.size());
		//--==>>
		/*
		첫 번째 요소 : 검정
		두 번째 요소 : 노랑
		마지막 번째 요소 : 연두
		요소의 개수 : 6
		*/

		// ○ 첫 번째 요소를 『하양』으로 변.경.  → set()
		v.set(0, "하양");

		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("두 번째 요소 : " + v.get(1));
		System.out.println("요소의 개수 : " + v.size());
		//--==>>
		/*
		첫 번째 요소 : 하양				// 검정이 하양으로 대체됐을 뿐 나머진 같음
		두 번째 요소 : 노랑
		요소의 개수 : 6
		*/

		// ○ 첫 번째 요소에 『주황』 추.가.     → insertElementAt()
		v.insertElementAt("주황", 0);

		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("두 번째 요소 : " + v.get(1));
		System.out.println("요소의 개수 : " + v.size());
		//--==>>
		/*
		첫 번째 요소 : 주황
		두 번째 요소 : 하양
		요소의 개수 : 7
		*/

		// ○ 전체 출력
		System.out.print("전체 출력 : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println("\n");
		//--==>> 전체 출력 : 주황 하양 노랑 초록 파랑 빨강 연두

		// ○ 오름차순 정렬
		Collections.sort(v);

		// ○ 오름차순 정렬 이후 다시 전체 출력
		System.out.print("오름차순 정렬 이후 다시 전체 출력 : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println("\n");
		//--==>> 오름차순 정렬 이후 다시 전체 출력 : 노랑 빨강 연두 주황 초록 파랑 하양  (가나다 순)

		// ○ 검색
		// 『Collections.binarySearch();』
		//  검색 기능 수행. 단, 오름차순 정렬된 자료에서만 사용 가능.
		// 검색 결과가 존재하지 않을 경우... 음수를 반환한다.		

		int idxBlue = Collections.binarySearch(v, "파랑");
		System.out.printf("파랑 : %d번째 인덱스에 위치하고 있다.\n", idxBlue);
		System.out.println();
		//--==>> 파랑 : 5번째 인덱스에 위치하고 있다.

		int idxPurple = Collections.binarySearch(v, "보라");
		System.out.printf("보라 : %d번째 인덱스에 위치하고 있다.\n", idxPurple);
		System.out.println();
		//--==>> 보라 : -2번째 인덱스에 위치하고 있다. → 검색 결과 없음.

		// ○ 내림차순 정렬
		Collections.sort(v, Collections.reverseOrder()); // sort는 오름차순만, 내림차순은 없어. 대신 내림차순 옵션을 건네주면 됨..

		// ○ 내림차순 정렬 이후 다시 전체 출력
		System.out.print("내림차순 정렬 이후 다시 전체 출력 : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println("\n");
		//--==>> 내림차순 정렬 이후 다시 전체 출력 : 하양 파랑 초록 주황 연두 빨강 노랑

		// ○ 내림차순 정렬 이후 파랑 검색
		idxBlue = Collections.binarySearch(v, "파랑");
		System.out.printf("파랑 : %d번째 인덱스에 위치하고 있다.\n", idxBlue);
		System.out.println();
		//--==>> 파랑 : -8번째 인덱스에 위치하고 있다.  → 검색 결과 없음. (사실은 존재) 

		idxBlue = Collections.binarySearch(v, "파랑", Collections.reverseOrder());
		System.out.printf("파랑 : %d번째 인덱스에 위치하고 있다.\n", idxBlue);
		System.out.println();
		//--==>> 파랑 : 1번째 인덱스에 위치하고 있다.
	}
}