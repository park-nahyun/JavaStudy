/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - 반복문 실습(for 문 실습)
  - 다중 for문(반복문의 중첩)을 활용한 구구단 출력 실습
=====================================*/

/*
2 * 1 = 2	3 * 1 = 3
2 * 2 = 4	3 * 2 = 6
2 * 3 = 6	3 * 3 = 9
2 * 4 = 8	3 * 4 = 12
2 * 5 = 10	3 * 5 = 15
2 * 6 = 12	3 * 6 = 18
2 * 7 = 14	3 * 7 = 21
2 * 8 = 16	3 * 8 = 24
2 * 9 = 18	3 * 9 = 27 ...

□□□□
□□□□

2 3 4 5
6 7 8 9 
*/

// 반복문 3중첩 쓰기
// 2중첩 2번 써도 됨


public class Test059
{
	public static void main(String[] args)
	{

		/*
		int i, j;
		for(i=1;i<=9;i++)
		{
			for(j=2;j<=5;j++)
			{
				System.out.printf("%3d * %d = %2d", j, i, (i*j));
			}
			
			System.out.println();				
		}

		System.out.println();
		for(i=1;i<=9;i++)
		{
			for(j=6;j<=9;j++)
			{
				System.out.printf("%3d * %d = %2d", j, i, (i*j));
			}
			
			System.out.println();				

		*/

		int dan;		// 구구단의 '단'을 처리하는 변수
		int i, j, k;	// 각 for 문의 루프 변수
		int g;			// 각 곱셈 연산에 대한 결과값을 담을 변수

		for(i=0;i<=1;i++)				// 문단 구성(1~2)
		{
			for (j=1; j<=9 ; j++ )		// 곱해지는 수 구성(1~9)
			{
				for (k=2;k<=5 ; k++)	// 단 구성(2~9) → (2~5)
				{
					dan = i * 4 + k;	// i가 0일 경우... 2345/ i가 1일 경우 6789
					g = dan*j;

					System.out.printf("%4d * %d = %2d", dan, j, g);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}