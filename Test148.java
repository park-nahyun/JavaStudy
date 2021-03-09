/*=====================================
  ■■■ 예외(Exception) 처리 ■■■ 
  - 다른 예외 다시 던지기
=====================================*/

public class Test148
{
	public int getValue(int value) throws Exception		//-- 예외 던지기 → ⓑ 유형의 파란 폭탄
	{
		int a;

		try
		{
			a = getData(-4);
			//-- 던져진 예외 → ⓐ 유형의 빨간 폭탄 
		}
		catch (Exception e)	//-- 예외 잡아내기 → ⓐ 유형의 빨간 폭탄
		{
			// 예외 처리 → ⓐ 유형의 빨간 폭탄 처리
			System.out.println("printStackTrace.....");
			e.printStackTrace();

			// 예외 발생 → ⓑ 유형의 파란 폭탄
			throw new Exception("value가 음수입니다.");
		}

		return a;
		
	}

	public int getData(int data) throws Exception	//-- 예외 던지기 → ⓐ 유형의 빨간 폭탄
	{
		if (data<0)
			throw new Exception("data가 0보다 작습니다.");	
			//-- 예외 발생 → ⓐ 유형의 빨간 폭탄

		return data + 10;
	}

	public static void main(String[] args)
	{
		Test148 ob = new Test148();

		try
		{
			int a = ob.getValue(-4);
			//-- 던져진 예외 → ⓑ 유형의 파란 폭탄
			System.out.println(a);
		}
		catch (Exception e) //-- 예외 잡아내기 → ⓑ 유형의 파란 폭탄
		{
			// 예외 처리 → ⓑ 유형의 파란 폭탄
			System.out.print("printStackTrace....(main)");
			e.printStackTrace();
		}
		
	}
}