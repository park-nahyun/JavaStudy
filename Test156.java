/*=================================
  ■■■ 컬렉션(Collection) ■■■ 
===================================*/

// 검색 및 삭제

import java.util.Vector;

public class Test156
{
	// 정적 문자열 배열 선언 및 초기화
	public static final String[] colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};	

	public static void main(String[] args)
	{
		// 벡터 자료구조 인스턴스 생성
		Vector<String> v = new Vector<String>();

		// v 라는 벡터 자류구조에 colors 요소 추가
		for (String color : colors)
			v.add(color);

		// 벡터 자료구조 v의 전체 요소 출력
		System.out.print("전체 요소 출력 : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();
		//--==>> 전체 요소 출력 : 검정 노랑 초록 파랑 빨강 연두

		String s1 = "분홍";

		// indexOf()
		int i = v.indexOf(s1);
		System.out.println(s1 + " → index 위치 : " + i);
		System.out.println();
		//--==>> 분홍 → index 위치 : -1
		
		String s2 = "노랑";

		// 『v.contains(s)』 : 벡터 자료구조 v에 s가 포함되어 있다면(true/false)... index 확인
		if (v.contains(s2))
		{
			// 『v.indexOf(s)』 : 벡터 자료구조 v에서 s의 인덱스 위치 반환
			i = v.indexOf(s2);
			System.out.println(s2 + " → index 위치 : " + i);
			
			// 우선 위의 코드를 통해 찾고... 찾았으면 삭제
			v.remove(i);
		}
		//--==>> 노랑 → index 위치 : 1

		// ※ 존재 여부(포함 여부) 확인 → 위치(인덱스) 파악 → 해당 인덱스의 요소 제거

		// 찾아서 삭제한 후 전체 요소 출력
		System.out.print("삭제 후 전체 요소 : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();
		//--==>> 삭제 후 전체 요소 : 검정 초록 파랑 빨강 연두

		// ※ 추가 주의 사항(테스트)
		System.out.println(colors);
		//--==>> [Ljava.lang.String;@15db9742 배열 출력하면 이렇게 됨
		
		// 확인용 더미 데이터 지원
		System.out.println(v);
		//--==>> [검정, 초록, 파랑, 빨강, 연두]
		//		 얘넨 더미일 뿐임. 이 데이터를 활용하면 안돼~! '눈으로만 확인하세요'용 데이터

		// ※ 확인용(테스트용) 더미 데이터는
		//    실제 요소(데이터)가 아니기 때문에
		//    이를 화룡하여 연산을 진행하거나 하면 안된다~!!! check~!!!
	}
}