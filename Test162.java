/*=================================
  ■■■ 컬렉션(Collection) ■■■ 
===================================*/

// Set → HashSet, TreeSet
// - 순서 (의미) 없음
// - 중복을 허용하지 않는 구조(기본)

/*
○ HashSet<E> 클래스

   - java.util.HashSet<E> 클래스는
     Set 인터페이스를 구현하는 클래스로
	 순서의 개념이 아니라 집합의 개념으로 이해해야 하는 구조이다.
   - 이로 인해 데이터의 중복을 허용하지 않는다.
   - 또한, 동기화를 지원하지 않는다.

*/

import java.util.Set;
import java.util.HashSet;

public class Test162
{
	public static void main(String[] args)
	{
		// Set<String> dogs = new Set<String>(); 인터페이스니까 이렇게 안됨
		 Set<String> dogs = new HashSet<String>();	// 업캐스팅

		 // dogs 라는 HashSet 자료구조에 요소 추가
		 dogs.add("푸들");
		 dogs.add("시바견");
		 dogs.add("리트리버");
		 dogs.add("치와와");

		 System.out.print("기존 데이터 Set : ");
		 for (String str : dogs)
			 System.out.print(str + " ");
		 System.out.println();
		 //--==>> 기존 데이터 Set : 리트리버 푸들 시바견 치와와
		 //-- 순서가 의미 없는 자료구조이기 때문에
		 //   데이터 입력 순서(자료구조의 요소 격납 순서)와
		 //   상관없이 구성되어 있는 것을 확인

		 // 데이터(요소) 추가
		 dogs.add("말티즈");
		 dogs.add("똥개");
		 dogs.add("똥개");
		 dogs.add("똥개");
		 dogs.add("똥개");
		 dogs.add("말티즈");
		 dogs.add("말티즈");
		 dogs.add("리트리버");				// ※ 중복 데이터를 추가한다고 해서
		 dogs.add("말티즈");				//    데이터 삽입 과정에서
		 dogs.add("리트리버");				//    오류가 발생하는 것은 아니다.
		 dogs.add("리트리버");
		 dogs.add("리트리버");
		 dogs.add("리트리버");
		 dogs.add("리트리버");
		 dogs.add("리트리버");
		 dogs.add("리트리버");
		 dogs.add("진돗개");
		 dogs.add("풍산개");
		 dogs.add("풍산개");
		 dogs.add("풍산개");

		 System.out.print("추가 후 데이터 Set : ");
		 for (String str : dogs)
			 System.out.print(str + " ");
		 System.out.println();
		 //--==>> 추가 후 데이터 Set : 리트리버 똥개 진돗개 푸들 시바견 치와와 말티즈 풍산개

		 // ※ 데이터 추가되는 순서와 상관없이 목록이 구성되어 있으며
		 //    같은 데이터 여러 번 반복되어 추가될 경우(중복 데이터)
		 //    하나만 유효한 데이터로 구성되어 있는 것을 확인할 수 있다.
		 //    (아무리 추가해도 한 번만 출력됨)
	}
}