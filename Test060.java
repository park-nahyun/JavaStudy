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
   **
  ***
 ****
*****

*/

//풀이 2

public class Test060
{
	public static void main(String[] args)
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=5-i;j>=0;j--)
				System.out.print(' ');
			for(int k=1;k<=i;k++)
				System.out.print('*');
			System.out.println();
		}
	}
}

/* 풀이 1
public class Test060
{
	public static void main(String[] args)
	{
		char ch = '*';

		System.out.print("    ");
		for (int i=1;i<=5;i++)
		{

			System.out.printf("%c%n", ch);
			for(int k=4;k>i;k--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				if(i==5)
					break;
				System.out.printf("%c", ch);
			}
		}
	}
}
*/

/*
     *
    **
   ***
  ****
 *****
계속하려면 아무 키나 누르십시오 . . .
*/

/*
풀이1
실행순서

1. 
i=1 

*
 (개행)

j=1 

()()()()*
()()()*

i=2 

*
**
(개행)

j=1
*
**
*

j=2
*
**
**

i=3
*
**
***
(개행)

j=1

*
**
***
*

j=2

*
**
***
**

j=3

*
**
***
***

i=4

*
**
***
****
(개행)

j=1

*
**
***
****
*

j=2 ~ j=4

*
**
***
****
****

i=5

*
**
***
****
*****
(개행)

*/
