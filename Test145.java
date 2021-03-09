/*=====================================
  ■■■ 예외(Exception) 처리 ■■■ 
=====================================*/

// Test146.java 파일과 비교~!!!

class Demo1
{
	// 주요 속성 구성
	private int value;		// 자동 초기화 지원

	// setter
	public void setValue(int value)
	{
		if (value<=0)
			return;			// 종료 ㅁ

		this.value = value;
	}

	// getter
	public int getValue()
	{
		return value;

	}
}


// 자바 bean 규약에 대한 약속!!! 익숙해질 것~!

public class Test145
{
	public static void main(String[] args)
	{
		Demo1 ob = new Demo1();
		ob.setValue(-10); 
		int result = ob.getValue();
		System.out.println(result);
	}
}


