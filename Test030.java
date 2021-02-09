/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - if문 실습
=====================================*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 짝수인지 홀수인지 판별하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, BufferedReader의 readLine() 메소드를 통해 입력받을 수 있도록 처리하고
// 단일 if문을 활용하여 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 : 37
// 37 → 홀수입니다.
// 계속하려면 아무 키나 누르세요...

// 실행 예)
// 임의의 정수 입력 : 46
// 46 → 짝수입니다.
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("임의의 정수 입력 : ");
		String strData = br.readLine();											// 빼먹지마!!
		int n = Integer.parseInt(strData);                                      // 빼먹지마!!
		
		if(n%2==0)
		{
			System.out.printf("%d → 짝수입니다.\n", n);				// if 조건문 한줄일 때 {} 생략가능
		}
		if(n%2!=0)
		{
			System.out.printf("%d → 홀수입니다.\n", n);
		}
	}
}

/*
임의의 정수 입력 : 37
37 → 홀수입니다.
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 46
46 → 짝수입니다.
계속하려면 아무 키나 누르십시오 . . .
*/