/*=====================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스
=====================================*/

import java.math.BigDecimal;
import java.math.MathContext;

public class Test128
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789");

		// movePointLeft() : 소수점을 왼쪽으로 이동
		BigDecimal b = a.movePointLeft(3);
		System.out.println("결과 확인 : " + b);
		//--==>> 결과 확인 : 123456.789123456789

		BigDecimal t1 = new BigDecimal("400.0");
		BigDecimal t2 = new BigDecimal("6.0");

		BigDecimal t3 = t1.divide(t2, 3);		// 세 번째 자리에서 유효하게 만들어라~!
		BigDecimal t4 = t1.divide(t2, 2);
		System.out.println("t3 : " + t3);
		System.out.println("t4 : " + t4);
		//--==>> t3 : 66.6
		//		 t4 : 66.7
		// t2로 나누는 건 똑같다.
		// 나눗셈 (대체 속성 확인, 반올림 하지 않는다. → 절삭)
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);			// R_D 반올림 하지 말아라~!
		// → 『BigDecimal c = a.divide(b, 1);』와 동일한 구문
		System.out.println("c : " + c);
		//--==>> c : 1000.000000000

		System.out.println(BigDecimal.ROUND_DOWN);
		//--==>> 1
		// RD는 static final이다.. final은 알겠는데 왜 static이지?(클래스 변수)
		// 객체생성 없이 사용가넝했으므로
		
		BigDecimal d = a.divide(b, 5);	// 소수점 이하 5번째까지.. 즉 6번째에서 반올림해라..!
		System.out.println("d : " + d);
		//--==>> d : 1000.000000000

		// 유효 자리 : 소수점 이하 5번째 자리(두 번째 인자값 5)
		BigDecimal e = a.divide(b, 5, BigDecimal.ROUND_DOWN);
		// BigDecimal e = a.divide(b, 5, 1);
		System.out.println("e : " + e);
		//--==>> e : 1000.00000

		System.out.println(BigDecimal.ROUND_CEILING);
		System.out.println(BigDecimal.ROUND_FLOOR);
		//--==>> 2
		//		 3


		// 추가 보충 정리~!!!


		// BigDecimal result = t1.divide(t2);
		// System.out.println("result : " + result);
		//--==>> 런타임 에러 .ArithmeticException:(x.33333333.... 에러남)

		System.out.println(MathContext.DECIMAL32);
		//--==>> precision=7 roundingMode=HALF_EVEN
		//	   --전체자리수 		--반올림인지뭔지..
		

		System.out.println(MathContext.DECIMAL64);
		//--==>> precision=16 roundingMode=HALF_EVEN

		System.out.println(MathContext.DECIMAL128);
		//--==>> precision=34 roundingMode=HALF_EVEN


		// t1.divide(t2);			// t1을 t2로 나눈 몫 → 나눗셈
									// 단, 몫이 떨어지지 않을 경우 예외 발생
		// t1.divide(t2, b);		// t1을 t2로 나눈 몫 → 나눗셈
									// 단, b 방식(모드)로 처리해라(roungdingMode)
									// 올림 / 버림(절삭) / 반올림  그런데 얘네를 상수화 해 놓음
		// t1.divide(t2. 반올림);




		System.out.println("BigDecimal.ROUND_UP : " + BigDecimal.ROUND_UP);
		System.out.println("BigDecimal.ROUND_DOWN : " + BigDecimal.ROUND_DOWN);
		System.out.println("BigDecimal.ROUND_CEILING : " + BigDecimal.ROUND_CEILING);
		System.out.println("BigDecimal.ROUND_FLOOR : " + BigDecimal.ROUND_FLOOR);
		System.out.println("BigDecimal.ROUND_HALF_UP : " + BigDecimal.ROUND_HALF_UP);
		System.out.println("BigDecimal.ROUND_HALF_DOWN : " + BigDecimal.ROUND_HALF_DOWN);
		System.out.println("BigDecimal.ROUND_HALF_EVEN : " + BigDecimal.ROUND_HALF_EVEN);
		System.out.println("BigDecimal.ROUND_UNNECESSARY : " + BigDecimal.ROUND_UNNECESSARY);

		/*
		BigDecimal.ROUND_UP : 0
		BigDecimal.ROUND_DOWN : 1
		BigDecimal.ROUND_CEILING : 2
		BigDecimal.ROUND_FLOOR : 3
		BigDecimal.ROUND_HALF_UP : 4
		BigDecimal.ROUND_HALF_DOWN : 5
		BigDecimal.ROUND_HALF_EVEN : 6
		BigDecimal.ROUND_UNNECESSARY : 7
		*/

		BigDecimal result;

		result = t1.divide(t2, 0);
		System.out.println("result0 : " + result);
		
		// 이걸 7까지 해봐
		// 7은 에러

		result = t1.divide(t2, MathContext.DECIMAL32);
		System.out.println("result : " + result);
		//--==>> result : 66.66667
		// MathContext가 이미 a, b를 다 갖고 있음
		// 유효한 자리수도 나오고 반올림도 나오고~!
		// MathContext는 전체 자리수~!!

		System.out.println("\n---------------\n");
		
		// t1.divide(t2, a, b);

		result = t1.divide(t2, 5, BigDecimal.ROUND_CEILING);
		System.out.println("result : " + result);
		//--==>> result : 66.66667

	}
}


/*
가.divide(나);
실수, 실수 형태면 딱 나눠떨어진다는 보장이 없다.
그래서 얘 쓸 일 별로 없음.

가.divide(나, 옵션); BigDecimal.. 
옵션으로도 자리수, 옵션 둘 다 숫자로 넘길 수 있음.
근데 둘 다 숫자면 너무 헷갈려. 그래서 그 옵션들을 상수화 한 것들..ㅇ;..
Decimal 안의 라운드 어쩌고들..


가.divide(나, 자리, 옵션);
자리를 세 종류로 정리해둔 것..
자리 수 만큼 보겠다~! 그럼 자리+1에서 반올림 하겠지~!

가.divide(나, 미리설정된옵션);
i어쩌구 표준에 의해 옵션 = 전체 자리 수 + 옵션 으로 설정됨.
두 번째 옵션이랑 미리설정된옵션 다른데.. 생긴게 같아서 헷갈림..
MaxContext..얘네..

*/