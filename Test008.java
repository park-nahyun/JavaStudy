/*===========================================
  ■■■ 변수와 자료형 ■■■
  - 변수와 자료형 실습 및 테스트 : char
===========================================*/

public class Test008
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		char ch1, ch2, ch3;
		int a;

		// 연산 및 처리
		ch1 = 'A';
		ch2 = '\n';		// 개행
		ch3 = '대';
		a = (int)'A';


		// 결과 출력
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		System.out.println("a : " + a);
	}
}

/* [실행 결과]
ch1 : A
ch2 :

ch3 : 대
a : 65
계속하려면 아무 키나 누르십시오 . . .
*/