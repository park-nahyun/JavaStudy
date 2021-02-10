/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - if문 실습 ~ else문 실습
=====================================*/

// ○ 과제
//		사용자로부터 임의의 알파벳 한 문자를 입력받아서 이를 판별하여
//		소문자를 입력받았을 경우... 대문자로 변환하고
//		대문자를 입력받았을 경우... 소문자로 변환하는
//		프로그램을 구현한다.

// 실행 예)
// 알파벳 한 문자 입력 : T
// >> t
// 계속하려면 아무 키나...

// 알파벳 한 문자 입력 : c
// >> C
// 계속하려면 아무 키나...

// 알파벳 한 문자 입력 : 6
// >> 입력 오류~!!!
// 계속하려면 아무 키나...


import java.io.IOException;

public class Test039
{
	public static void main(String[] args) throws IOException
	{
		char alph;
		System.out.print("알파벳 한 문자 입력 : ");
		alph = (char)System.in.read();

		if(65<=alph&&alph<=90 || 97<=alph&&alph<=122)
		{
			if(65<=alph&&alph<=90)
			{
				alph = (char)(alph + 32);
				System.out.println(">> " + alph);
			}

			else
			{
				alph = (char)(alph - 32);
				System.out.println(">> " + alph);
			}
		}
		else
			System.out.println("입력 오류~!!!");
	}
}

/*실행결과
알파벳 한 문자 입력 : T
>> t
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : c
>> C
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : 6
입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .
*/