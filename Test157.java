/*=================================
  ■■■ 컬렉션(Collection) ■■■ 
===================================*/

// 벡터 자료구조 객체 선언 및 생성 시 사용자 정의 자료형 클래스 활용
// → 자료형으로 활용~!!!

import java.util.Vector;

// 사용자 정의 클래스 설계 → 자료형처럼 활용
class MyData
{
	// 주요 속성 구성 → 주요 변수 선언(멤버 변수)
	private String name;			//-- 이름
	private int age;				//-- 나이

	// getter / setter 구성 (bean 규약의 약속)
	public String getName()			// 이름 주세요~!
	{
		return name;
	}
	public void setName(String name)				// 내가 이름 받아서 name에게 전해줘야함
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;		// this.age 하든 age 하든 13구문의 age
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}

	// 생성자(인자 없는 생성자)
	public MyData()
	{
		name = "";
		age = 0;
	}

	// 생성자(인자 2개인 생성자)
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

}

public class Test157
{
	public static void main(String[] args)
	{
		// 벡터 자료구조 인스턴스 생성
		Vector<MyData> v = new Vector<MyData>();		
		//-- MyData 기반으로 생성된 인스턴스만
		//	 Vector 자료구조 v에 적재하는 것이 가능~!!!

		// 벡터 자료구조 v에
		// 김일만 16세 / 김이만 14세 / 김삼만 86세
		// 담아내기

		// ①

		/*
		MyData st1 = new MyData();
		st1.setName("김일만");
		st1.setAge(16);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("김이만");
		st2.setAge(14);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("김삼만");
		st3.setAge(86);
		v.add(st3);
		*/


		// ②
		
		MyData st1 = new MyData("김일만", 16);
		v.add(st1);
		MyData st2 = new MyData("김이만", 14);
		v.add(st2);
		MyData st3 = new MyData("김삼만", 86);
		v.add(st3);
	

		// ③
		/*
		v.add(new MyData("김일만", 16));
		v.add(new MyData("김이만", 14));
		v.add(new MyData("김삼만", 86));	
		*/

		// 벡터 자료구조 v 에 담긴 내용(요소) 전체 출력하기
		// 실행 예)
		// 이름:김일만, 나이:16
		// 이름:김이만, 나이:14
		// 이름:김삼만, 나이:86

		// ①
		for (MyData obj : v)
			System.out.printf("이름:%s 나이:%d%n", obj.getName(), obj.getAge());
		System.out.println();

		// ②
		for (int i=0;i<v.size();i++)
			System.out.printf("이름:%s 나이:%d%n", v.elementAt(i).getName(), v.elementAt(i).getAge());
		System.out.println();

		// ③
			// v가 업캐스팅 돼서 Object로 들어간 것
		for (Object temp : v)
			System.out.printf("이름:%s, 나이:%d%n", ((MyData)temp).getName(), ((MyData)temp).getAge());
													// temp.getName() 안됨. 얜 Object에 있는 getName
	}
}

/*
이름:김일만 나이:16
이름:김이만 나이:14
이름:김삼만 나이:86

이름:김일만 나이:16
이름:김이만 나이:14
이름:김삼만 나이:86

이름:김일만, 나이:16
이름:김이만, 나이:14
이름:김삼만, 나이:86
*/