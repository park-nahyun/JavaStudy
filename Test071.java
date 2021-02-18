/*=====================================
  ■■■ 클래스와 인스턴스 ■■■
=====================================*/

// ○ 실습 문제
// 원의 넓이와 둘레 구하기

// 원의 넓이와 둘레를 구할 수 있는 클래스를 독립적으로(별도로) 생성한다.
// (클래스명 : CircleTest) → CircleTest.java

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : xx

// >> 반지름이 xx인 원의
// >> 넓이 : xxx.xx
// >> 둘레 : xxx.xx
// 계속하려면 아무 키나...

/*

public class Test071
{
	public static void main(String[] args)
	{
		double a, c;

		CircleTest ob = new CircleTest();
		ob.input();
		a = ob.area();
		c = ob.cir();
		ob.print(a,c);
	}
}

*/


//BufferedReader 썼을 때

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
		double a, c;

		CircleTest ob = new CircleTest();
		ob.input();						// br.readLine에서 굴러떨어진 불편한게 여기로 떨어지기 때문에 예외처리 필요~! IOException
		a = ob.area();
		c = ob.cir();   
		ob.print(a,c);
	}
}