/*=====================================
  ■■■ 배열(array) ■■■
  - 배열의 배열(2차원 배열)
=====================================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5x5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
 1  2  3  4  5			→ i = 0
 2  3  4  5  6			→ i = 1	
 3  4  5  6  7			→ i = 2
 4  5  6  7  8			→ i = 3
 5  6  7  8  9			→ i = 4
*/


public class Test088
{
	public static void main(String[] args)
	{

		// 배열의 배열 선언 및 메모리 할당
		int arr[][] = new int[5][5];

		int n=1;

		// 웅~~
		for (int i=0;i<arr.length;i++)				// i → 0 1 2 3 4
		{
			// 쑝~~
			n = i + 1; 
			for (int j=0;j<arr[i].length ;j++)		// j → 0 1 2 3 4 / 0 1 2 3 4 / 0 1 2 3 4 / 0 1 2 3 4 / 0 1 2 3 4 
			{
				arr[i][j] = n;
				n++;
			}
		}

		// 배열의 배열 요소 전체 출력

		 for (int i=0;i<arr.length ;i++)
		 {
			 for (int j=0;j<arr[i].length;j++ )
			 {
				 System.out.printf("%3d", arr[i][j]);
			 }
			 System.out.println();
		 }
		 System.out.println();
	}
}


/*
public class Test088
{
	public static void main(String[] args)
	{
		int arr[][] = new int[5][5];

		int n=1;
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length ;j++)
			{
				arr[i][j] = i+n+j;
			}
		}

		 for (int i=0;i<arr.length ;i++)
		 {
			 for (int j=0;j<arr[i].length;j++ )
			 {
				 System.out.printf("%3d", arr[i][j]);
			 }
			 System.out.println();
		 }
		 System.out.println();
	}
}

*/