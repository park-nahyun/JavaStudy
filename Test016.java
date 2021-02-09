/*=====================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 자바의 기본 입출력 : printf()
=====================================*/
public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");       //-- \n 개행

		// 서식 출력 메소드
		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n");   // -- \n 개행
		System.out.printf("1234567890123467890%n");   //-- %n 개행
		System.out.printf("%d + %d = %d\n", 10, 20, 30);

		//--==>> AAABBBCCC
		//		1234567890123456789012345678901234567890
		//		1234567890123467890
		//		10 + 20 = 30
		//		계속하려면 아무 키나 누르십시오 . . .

		System.out.printf("%d\n", 123);
		System.out.printf("%7d\n", 123);        
		System.out.printf("%10d\n", 123);       // 10칸의 공백을 먼저 확보해놓고 123을 채워라~라는 뜻이 됨
		System.out.printf("%010d\n", 123);
		//--==>> 123
		//        (4칸 공백) 123
		//               (7칸공백)123
		//             00000000123

		System.out.printf("%d\n", 365);
		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);

		/*
		365
		+365
		+365     시각적으로 양수임을 강조하려는 것
		*/

		System.out.printf("%d\n", +365);   // 이렇게 해도 그냥 365만 나옴

		
		// 이번엔 음수!!!

		System.out.printf("%d\n", -365);   //--==   -365
		// System.out.printf("%-d\n", 365);   -- 이거 에러 난다. 다른 에러들은 대부분 컴파일 에러로 나는데, 출력 서식 에러는 대부분~~!!! 런타임 에러로 남. 저 조심히 작성해!
		System.out.printf("-%d\n", 365);   //--==   - 365

		System.out.println();  //  rogod
		System.out.printf("%(d\n", -365);  // check~~!!   음수에만 괄호가 생겨있다!!!!!  회계같은거에 지출 깔끔하게 표시하기 좋음!
		System.out.printf("%(d\n", 365);  // check~~!!

		//--== (365)
		//--== 365

		//System.out.printf("%d\n", 'A');
		//--==>> 에러 발생(런타임 에러)

		System.out.printf("%c\n", 'A');
		// System.out.printf("%c\n", "ABCD");
		//--==>> 에러 발생 (런타임 에러)
		System.out.printf("%s\n", "ABCD");
		//--== A
		//--== ABCD

		System.out.println();  // 개행
		System.out.printf("%h\n", 365); //--- %h 16진수
		System.out.printf("%o\n", 24);  //--- %o 8진수
		//--==>> 16d
		//        30

		System.out.printf("%s\n", "true");
		System.out.printf("%b\n", true);   // 위는 문자열, 아래는 불린형
		//--== true(문자형)
		//--== true(불린형)
		//--== 모든 결과'물'은 문자열임
		//println도 \n \r 생략하게끔 돼있음!

		System.out.println();  //개행
		System.out.printf("%f\n", 123.23);   // 123.230000 으로 나옴
		System.out.printf("%.2f\n", 123.23);
		System.out.printf("%.2f\n", 123.236); // 반올림
		System.out.printf("%.2f\n", 123.231);
		System.out.printf("%8.2f\n", 123.236); // 전체 다 8칸을 준다는 뜻
		System.out.printf("%2.2f\n", 123.1234); // 표현해야 하는 의미보다 더 좁은 공간이 확보되면 그냥 쟤 그대로 나옴.

		/*
		123.230000
		123.23
		123.24
		123.23
		  123.24
		123.12
		*/



/* 최종결과
AAABBBCCC
1234567890123456789012345678901234567890
1234567890123467890
10 + 20 = 30
123
    123
       123
0000000123
365
+365
+365
365
-365
-365

(365)
365
A
ABCD

16d
30
true
true

123.230000
123.23
123.24
123.23
  123.24
123.12
계속하려면 아무 키나 누르십시오 . . .
*/
	}	
}