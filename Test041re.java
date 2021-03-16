/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - switch문 실습
=====================================*/

// 1부터 3까지의 정수 중 하나를 사용자로부터 입력받아
// 입력받은 정수만큼 별문자(★)가 출력되는 프로그램을 작성한다.
// 단, 두 가지 방법으로 구현할 수 있도록 한다.

// ① switch 문의 일반 모델을 활용한다.
// ② switch 문의 기본 모델을 활용하되,
//		『break』를 딱 한 번만 사용할 수 있도록 한다. (입력 오류 내용때문에)

// 실행 예)
// 임의의 정수 입력(1~3) : 3
// ★★★
// 계속하려면 아무 키나...

// 임의의 정수 입력(1~3) : 1
// ★
// 계속하려면 아무 키나...

// 임의의 정수 입력(1~3) : 7
// 입력 오류~!!!
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041re
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		String star;
		System.out.print("임의의 정수 입력(1~3) : ");
		n = Integer.parseInt(br.readLine());
		
		switch(n)
		{
			case 1: star = "★"; break;
			case 2: star = "★★"; break;
			case 3: star = "★★★"; break;
			default: star = "입력 오류~!!!!";
		}

		System.out.println(star);
	}
}