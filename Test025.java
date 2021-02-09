/*=====================================
  ■■■ 연산자(Operator) ■■■
  - 논리 연산자 
=====================================*/

public class Test025
{
	public static void main(String[] args)
	{
		boolean a=true, b=false;

		System.out.printf("a && b : %b\n", (a&&b));
		System.out.printf("a || b : %b\n", (a||b));
		System.out.printf("!a     : %b\n", !a);
		System.out.printf("!b     : %b\n", !b);
	}
}

/*
a && b : false
a || b : true
!a     : false
!b     : true
계속하려면 아무 키나 누르십시오 . . .
*/