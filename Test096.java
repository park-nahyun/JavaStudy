/*======================================================
	■■■ 메소드 중복정의(Method Overloading) ■■■
	- 메소드 오버로딩이 가능한 형태와 불가능한 형태
======================================================*/



public class Test096
{
	public static void main(String[] args)
	{
		print();
		print(10);

		double result = print(10.1); // 자바는 대입연산자 기준 우측부터 먼저 처리하기 때문에 호출할 때 문제가 됨
		print(10.1)
		String temp = print(2.34);2021-02-23
	}

	public static void print(){}
	public static void print(int i){}
	//public static void print(int j){}					//--(X)
	public static void print(char c){}					//-- ※ 자동 형 변환 규칙 check!
	public static void print(int i, int j){}
	public static void print(int i, double d){}			//-- ※ 자동 형 변환 규칙 check!
	public static void print(double d, int k){}			//-- ※ 자동 형 변환 규칙 check!
	public static double print(double d){return 3.14};	//-- ※ 자동 형 변환 규칙 check!
	public static void print(double d){}				//-- (X)
	public static String print(double d){}				//-- (X)

}