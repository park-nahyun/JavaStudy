/*=================================
  ■■■ 컬렉션(Collection) ■■■ 
===================================*/

// Map - Hashtable, HashMap

// - java.util.Map 인터페이스는
//   키(key)를 값(value)에 매핑(mapping)하며
//   동일한 키를 등록할 수 없고 유일해야 하며,
//   각 키는 한 개의 값만을 매핑해야 한다.
//   즉, 하나의 키에 대응하는 하나의 값을 갖는 자료구조이다.

/*
○ Hashtable<K, V> 클래스
	
	- 해시테이블 구조를 객체 모델링화 한 클래스로
	  검색이 용이하기 때문에 사용 빈도가 높은 편에 속한다.

	- 해시테이블이란 키(key)와 그에 상응하는 데이터(value)로 
	  구분된 데이터 구조이다.

	- 데이터를 저장하고, 검색하기 위해서 키로 접근하며,
	  이 구조에서는 키 값을 부여하면 해당 데이터가 변환된다.

	- 또한, Hashtable 클래스는 key 또는 value 의 값으로 null을 허용하지 않는다.
	
	// 단일값이 아니라 한 쌍으로 움직인다!!!
*/

import java.util.Hashtable;

public class Test164
{
	private static final String[] names
		= {"김아별", "심혜진", "조은선", "김서현", "소서현", };
	private static final String[] tels
		= {"010-1231-3525", "010-4643-4532", "010-2342-3543", "010-5643-1646", "010-3426-4632"};
	public static void main(String[] args)
	{
		// Hashtable 자료구조 인스턴스 생성
		Hashtable<String, String> ht = new Hashtable<String, String>();

		// ht 라는 Hashtable 자료구조에 배열(names, tels)에 담겨있는
		// 데이터를 요소로 추가하기(담아내기) → put(k, v)
		// ex) ht.put("홍길동", "010-1111-1111");
		//			   ------	-----------------
		//              key			value
		//

		for (int i=0; i<names.length ;i++)
		{
			ht.put(names[i], tels[i]);
		}
		// ~~ 여기까지 key value 적재 ~~~
		// ht 라는 해시테이블의 요소 중 값을 검색
		String findName1 = "조은선";
		String str = ht.get(findName1);			// get(키) → 값
		if (str != null)						// null이면 키 값이 없다
		{
			System.out.println(findName1 + " 전화번호 : " + str);
		}
		System.out.println();
		//--==>> 조은선 전화번호 : 010-2342-3543

		// ht 라는 해시테이블 자료구조에... key 가 존재하는지의 여부 확인
		// → containsKey()
		String findName2 = "박정준";
		if(ht.containsKey(findName2))
			System.out.println(findName2 + " 데이터가 존재합니다.");
		else
			System.out.println(findName2 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>> 박정준 데이터가 존재하지 않습니다.

		String findName3 = "김서현";
		if(ht.containsKey(findName3))
			System.out.println(findName3 + " 데이터가 존재합니다.");
		else
			System.out.println(findName3 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>> 김서현 데이터가 존재합니다.

		// ht 라는 해시테이블 자료구조에... value 가 존재하는지의 여부 확인
		// → contains()
		String findTel1 = "010-2342-3543";
		if (ht.contains(findTel1))
			System.out.println(findTel1 + " 데이터가 존재합니다.");
		else
			System.out.println(findTel1 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>> 010-2342-3543 데이터가 존재합니다.

		String findTel2 = "010-2366-3543";
		if (ht.contains(findTel2))
			System.out.println(findTel2 + " 데이터가 존재합니다.");
		else
			System.out.println(findTel2 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>> 010-2366-3543 데이터가 존재하지 않습니다.

		// ht 라는 해시테이블 자료구조에서 『심혜진』 데이터 삭제
		// → remove()
		ht.remove("심혜진");

		// 삭제(→ remove()) 이후 key 가 존재하는지 확인
		if (ht.containsKey("심혜진"))
			System.out.println("혜진이가 존재합니다.");
		else
			System.out.println("혜진이 어디갔어?");
		System.out.println();
		//--==>> 혜진이 어디갔어?

		// 삭제(→ remove()) 이후 Value 가 존재하는지 확인
		if (ht.contains("010-4643-4532"))
			System.out.println("010-4643-4532 가 존재합니다.");
		else
			System.out.println("010-4643-4532 가 존재하지 않습니다.");
		System.out.println();
		//--==>> 010-4643-4532 가 존재하지 않습니다.
		// 키만 지웠는데 연결된 value도 같이 지워진다!!

		// null 입력 시도			
		// ht.put(null, null);					//-- key, value 모두 null → (X)
		//--==>> 에러 발생(런타임 에러)
		// java.lang.NullPointerException

		// ht.put("선혜연", null);				//-- value 가 null → (X)
		//--==>> 에러 발생(런타임 에러)
		// java.lang.NullPointerException

		// ht.put(null, "010-2242-2352");		//-- key 가 null → (X)
		//--==>> 에러 발생(런타임 에러)
		// java.lang.NullPointerException

		// 중복된 key 값 입력
		ht.put("김아별", "010-7777-5456");
		
		System.out.println(ht.get("김아별"));
		System.out.println();
		//--==>> 010-7777-5456
		//-- 기존 "010-1231-3525" 에서 "010-7777-5456"으로 변경되었음을 화인
		//   (→ 덮어쓰기, 갱신)

		// 중복된 value 값 입력
		ht.put("박민지", "010-3426-4632");

		System.out.println(ht.get("소서현"));
		System.out.println(ht.get("박민지"));
		System.out.println();
		//--==>> 010-3426-4632
		//		 010-3426-4632
		//-- 기존 데이터에 아무런 영향을 미치지 않음을 확인
			
	}
}

