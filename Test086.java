/*=====================================
  ■■■ 배열(array) ■■■
  - 배열의 배열(2차원 배열)
=====================================*/

public class Test086
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언과 초기화
		// 방법 ①
		// int[] arr1 = new int[3];
		int[][] arr1 = new int[3][3];  // 3x3 형태의 배열, 3층 짜리 건물에 한 층에 방이 3개, 그런데 이제 0층 0호부터 시작하는..

		//arr[0] = 1;
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		arr1[2][0] = 7;
		arr1[2][1] = 8;
		arr1[2][2] = 9;

		// 방법 ②
		// int[] arr2 = {1, 2, 3}
		int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		// 방법 ③
		int[][] arr3 = new int[3][3];
		int n=1;
		for (int i=0; i<arr3.length ; i++) //  arr3.length==3
		{
			for (int j=0; j<arr3[i].length ; j++)	 // arr[0].length == 3
			{										 // arr[1].length == 3
					arr3[i][j] = n;					 // arr[2].length == 3	
					n++;									 
			}										 
		}

		// 배열의 배열 요소 전체 출력
		
		for (int i=0; i<arr3.length ; i++) 
		{	
			for (int j=0; j<arr3[i].length ; j++)	
			{										 
					System.out.printf("%2d", arr3[i][j]);							 
			}										 
		}
		System.out.println();

	}
}