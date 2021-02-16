/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - 반복문 실습(for 문 실습)
  - 별찍기 실습
=====================================*/

// ○ 과제
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

/*
    *
   ***
  *****	
 ********
**********
 ********
  *****	
   ***
    *
*/

public class Test063
{
	public static void main(String[] args)
	{
		for (int i=1;i<=9;i++)
		{
			if (i>5)
			{
				for (int j=0;j<i-5;j++)
					System.out.print(' ');
				for (int j=1;j<=9-2*(i-5);j++)
					System.out.print('*');
				for (int j=1;j<i-5;j++)
					System.out.print(' ');
			}

			else
			{
				for (int j=1;j<=(9-(2*i-1))/2;j++)
					System.out.print(' ');
				for (int k=1;k<=2*i-1;k++)
					System.out.print('*');
				for (int j=1;j<=(9-(2*i-1))/2;j++)
					System.out.print(' ');
			}
			System.out.println();
		}
	}
}

/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
계속하려면 아무 키나 누르십시오 . . .
*/