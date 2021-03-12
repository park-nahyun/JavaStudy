/*=================================
  ■■■ 컬렉션(Collection) ■■■ 
===================================*/

// Set → HashSet, TreeSet
// - 순서 (의미) 없음
// - 중복을 허용하지 않는 구조(기본)

/*
○ TreeSet<E> 클래스

   - java.util.TreeSet<E> 클래스는
     Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
	 데이터를 추가하면 데이터들이 자동으로 오름차순 정렬된다.
	 // SortedSet의 부모가 Set
*/

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

// VO	→ Value Object
// DTO  → Data Transfer Object  VO랑 사실상 비슷, 실무에선 같은 취급
// DAO  → Data Access Object

class GradeVO	// GradeDTO, 자바 bean 규약만 지키면 됨
{
	// 주요 속성 구성
	private String hak;
	private String name;
	private int kor, eng, mat;

	// getter/setter 정의
	public void setName(String name)
	{ 
		this.name = name;
	}
	 
	public String getName()
	{ 
		return name;
	}
	
	public void setHak(String hak)
	{ 
		this.hak = hak;
	}

	public String getHak()
	{ 
		return hak;
	}

	public void setKor(int kor)
	{ 
		this.kor = kor;
	}

	public int getKor()
	{
		return kor;
	}

	public void setEng(int eng)
	{ 
		this.eng = eng;
	}

	public int getEng()
	{
		return eng;
	}

	public void setMat(int mat)
	{ 
		this.mat = mat;
	}
	
	public int getMat()
	{
		return mat;
	}
	
	

	// 생성자(사용자 정의 생성자 → 5개의 매개변수를 가진 생성자)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// 생성자(사용자 정의 생성자 → 매개변수 없는 기본 생성자)
	GradeVO()
	{
	}

	// 추가 메소드 정의
	int getTot()
	{
		return kor + eng + mat;
	}
}

class MyComparator<T> implements Comparator<T>
{
	@Override
	public int compare(T o1, T o2)
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;
		// 오브젝트를 Grade타입으로 캐스팅

		// 학번 기준 오름차순
		// return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		// 이 결과 값이 양수냐, 0이냐, 음수냐로 크기 비교가 가능하다는 것

		// 총점 기준 오름차순
		// return s1.getTotal() - s2.getTotal();	//-- 오름차순 정렬
		

		// 총점 기준 내림차순
		// return s2.getTotal() - s1.getTotal();

		//  이름 기준 
		// return s1.getName() - s2.getName();
		//--==>> 에러 발생(컴파일 에러)
		// return Integer.parseInt(s1.getName()) - Integer.parseInt(s2.getName());
		//--==>> 에러 발생(컴파일 에러)

		return s1.getName().compareTo(s2.getName());

	}
}


public class Test163
{
	public static void main(String[] args) 
	{
		// TreeSet 자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();
		
		// set 이라는 TreeSet 자료구조에 요소 추가 → add()
		set.add("짱구는못말려");
		set.add("아기공룡둘리");
		set.add("아따맘마");
		set.add("꼬마마법사레미");
		set.add("명탐정코난");
		set.add("심슨");
		set.add("포켓몬스터");
		set.add("은하철도999");
		set.add("미래소년코난");

		// Iterator 를 활용하여 set 요소 전체 출력
		/* Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();*/
		//--==>> 꼬마마법사레미 명탐정코난 미래소년코난 심슨 아기공룡둘리 아따맘마 은하철도999 짱구는못말려 포켓몬스터
		//--     가나다 오름차순 알아서 되어있음

		// TreeSet 자료구조 인스턴스 생성
		// TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());
		// 생성된 자료구조에 요소 추가
		//-- 2103 김가영 90 80 70
		//   2104 장서현 80 70 60
		//   2105 박나현 100 100 100
		//   2106 이새롬 12 23 34
		//   2107 김서현 50 50 50
		// GradeVO vo1 = new GradeVO("2103", "김가영", 90, 80, 70);
		// set2.add(vo1);
		
		set2.add(new GradeVO("2103", "김가영", 90, 80, 70));
		set2.add(new GradeVO("2104", "장서현", 80, 70, 60));
		set2.add(new GradeVO("2105", "박나현", 100, 100, 100));
		set2.add(new GradeVO("2106", "이새롬", 12, 23, 34));
		set2.add(new GradeVO("2107", "김서현", 50, 50, 50));

		// 요소 추가된 자료구조 전체 출력
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n", vo.getHak(), vo.getName(), vo.getKor(), vo.getEng(), vo.getMat(), vo.getTot());
		}

		// ** java.lang.ClassCastException: 
		//    트리셋 ~ 정렬하는 것. 정렬하려면 크 기 비  교 가 필요하다.
		//    지금 트리셋 안에는 객체가 있다. 객체 비교 어떻게 하냐구~!
		//    트리셋은 SortedSet을 implement 

		System.out.println();
	}
}


// 오타 잡느라.. 들여쓰기 잘못하는거 잘못하느라 디지는줄..