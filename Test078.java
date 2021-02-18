/*=====================================
  ■■■ 클래스와 인스턴스 ■■■
  - 생성자(Constructor)
=====================================*/

public class Test078
{
	int val1;
	double val2;

	Test078()
	{
		val1=0;
		val2=0;
		System.out.println("매개변수 없는 생성자 호출~!!!");

	}

	Test078(int val1)
	{
		this.val1=val1;
		val2=0;
		System.out.println("int형 매개변수를 넘겨받는 생성자 호출~!!!");
	}

	Test078(double val2)
	{
		val1=0;
		this.val2=val2;
		System.out.println("double형 매개변수를 넘겨받는 생성자 호출~!!!");
	}
	Test078(int val1, double val2)
	{
		this.val1=val1;
		this.val2=val2;
		System.out.println("int와 double형 매개변수를 넘겨받는 생성자 호출~!!!");
	}
	public static void main(String[] args)
	{ 
		Test078 ob1 = new Test078();
		Test078 ob2 = new Test078(9);
		Test078 ob3 = new Test078(9.0);
		Test078 ob4 = new Test078(9, 9.0);

		System.out.println(ob1.val1 + ", " + ob1.val2);
		System.out.println(ob2.val1 + ", " + ob2.val2);
		System.out.println(ob3.val1 + ", " + ob3.val2);
		System.out.println(ob4.val1 + ", " + ob4.val2);

	}
}

/*
매개변수 없는 생성자 호출~!!!
int형 매개변수를 넘겨받는 생성자 호출~!!!
double형 매개변수를 넘겨받는 생성자 호출~!!!
int와 double형 매개변수를 넘겨받는 생성자 호출~!!!
0, 0.0
9, 0.0
0, 9.0
9, 9.0
계속하려면 아무 키나 누르십시오 . . .

*/