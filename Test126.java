/*=====================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스
=====================================*/

public class Test126
{
	public static void main(String[] args)
	{
		boolean bi = true;
		Boolean wrapBi = new Boolean(bi);	// 불린 설계도 안에는 불린 타입을 매개로 넘겨받는...
		Boolean wBi = bi;		//-- 오토 박싱

		int n = 300;
		Integer wrapN = new Integer(n);
		int n2 = wrapN;			//-- 오토 언박싱

		float f = 300.3f;
		Float wrapF = new Float(f);

		System.out.println(wrapBi.toString());		//--==>> true
		System.out.println(wrapN.toString());		//--==>> 300
		System.out.println(wrapF.toString());		//--==>> 300.3

		// 테스트(비교)
		Object obj = new Object();
		System.out.println(obj);		//--==>> java.lang.Object@15db9742
		System.out.println(obj.toString());		//--==>> java.lang.Object@15db9742
		// String println(Object obj)
		// {
		//		to String() 활용...
		// }

		System.out.println(wrapBi);		//--==>> true
		System.out.println(wrapN);		//--==>> 300
		System.out.println(wrapF);		//--==>> 300.3

		System.out.println(wBi);	//--==>> true
		System.out.println(n2);		//--==>> 300

		System.out.println("\n----------------------------------------------\n");

		// Integer 클래스

		String sn = "12";
		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %d\n", ni);
		//--==>> ni : 12

		ni = Integer.parseInt("0101", 2);
		System.out.printf("ni : %d\n", ni);
		//--==>> ni : 5
		// 0101을 2진수로 처리해서.. 5

		ni = Integer.parseInt("12", 8);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni : 10

		ni = Integer.parseInt("A", 16);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni : 10

		sn = Integer.toBinaryString(20);
		System.out.printf("sn : %s\n", sn);
		//--==>> sn : 10100

		sn = Integer.toHexString(31);
		System.out.printf("sn : %s\n", sn);
		//--==>> sn : 1f

		sn = Integer.toOctalString(31);
		System.out.printf("sn = %s\n", sn);
		//--==>> sn = 37

		Integer num = new Integer(50);
		System.out.println(num.toString());
		//--==>> 50
		
		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println(n4);
		// 일반적 정수를 객채로 반환
		//--==>> 345
	}
}