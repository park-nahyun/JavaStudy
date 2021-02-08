/*=======================================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 변수와 자료형
  - 자바의 기본 입출력 : BufferedReader 클래스
=======================================================*/

// 사용자로부터 반지름을 임의의 정수 형태로 입력받아
// 그 입력받은 반지름을 통해
// 원의 넓이와 둘레를 구하는 프로그램을 구현한다.

// 실행 예)
// 원의 반지름 입력 : 120
// 넓이 : xxxx.xx
// 둘레 : xxxx.xx
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader 클래스 인스턴스 생성
		// 컴퓨터 본체에 키보드 장착 → 문자 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 주요 변수 선언
		int r;			//-- 반지름
		double a, b;	//-- 넓이, 둘레

		// 연산 및 처리
		// ① 사용자에게 안내 메세지 출력
		//System.out.println("원의 반지름 입력 : ");
		System.out.print("원의 반지름 입력 : ");

		// ② 사용자가 입력한 값(문자열)을	→ br.readLine()
		//    숫자형(정수형)으로 변환 후	→ Integer.parseInt()
		//    반지름 변수 r 에 담아내기
		r = Integer.parseInt(br.readLine());
		// r = Integer.parseInt("50");
		// r = 50;

		// ③ 넓이 및 둘레 연산
		// 원의 넓이 = 반지름 * 반지름 * 3.141592
		// 원의 둘레 = 반지름 * 2 * 3.141592
		a = r * r * 3.141592;
		b = r * 2 * 3.141592;

		// 결과 출력
		//System.out.println(">> 넓이 : " + a);
		//System.out.println(">> 둘레 : " + b);

		//System.out.printf(">> 넓이 : %f\n", a);
		//System.out.printf(">> 둘레 : %f\n", b);

		System.out.printf(">> 넓이 : %.2f\n", a);
		System.out.printf(">> 둘레 : %.2f\n", b);
		//-- 『%f』 10진수 실수형을 담아내는 옵션문자
		//   『%.2f』는 소숫점 이하 둘째자리까지 표현하겠다는 의미의 추가 옵션

		
	}
}

/* [실행 결과]
원의 반지름 입력 : 20
>> 넓이 : 1256.64
>> 둘레 : 125.66
계속하려면 아무 키나 누르십시오 . . .
*/