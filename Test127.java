/*=====================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스
=====================================*/

import java.math.BigInteger;

public class Test127
{
	public static void main(String[] args)
	{
		// int a1 = 123456789123456789;
		// long b1 = 123456789123456789L;
		// long c1 = 123456789123456789123456789L;

		BigInteger a = new BigInteger("123456789123456789123456789");
		// 왜 문자열? 정수로 저 숫자를 못담으니까!
		BigInteger b = new BigInteger("123456789123456789123456789");

		// System.out.println(a + b);
		// 객체를 산술 연산 할 수 없다.

		// BigInteger c = a+b;
		// System.out.println(c);

		// ※ 일반적인 산술연산자를 통한 연산 불가능

		// 더하기
		// a.add(b);
		// BigInteger에서 제공하는 add라는 메소드를 이용하겠다~!

		BigInteger c = a.add(b);
		System.out.println("덧셈 결과 : " + c);
		//--==>> 덧셈 결과 : 246913578246913578246913578

		// 빼기
		BigInteger d = a.subtract(b);
		System.out.println("뺄셈 결과 : " + d);
		//--==>> 뺄셈 결과 : 0

		// 곱하기
		BigInteger e = a.multiply(b);
		System.out.println("곱셈 결과 : " + e);
		//--==>> 곱셈 결과 : 15241578780673678546105778281054720515622620750190521

		// 나누기
		BigInteger f = a.divide(b);
		System.out.println("나눗셈 결과 : " + f);
		//--==>> 나눗셈 결과 : 1

		// 지수승
		BigInteger g = new BigInteger("2");
		System.out.println("2의 3승 : " + g.pow(3));
		//--==>> 2의 3승 : 8
	}
}