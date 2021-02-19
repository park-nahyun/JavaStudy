/*=====================================
  ■■■ 배열(array) ■■■
  - 배열의 배열(2차원 배열)
=====================================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5x5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
 1  2  3  4  5			→ i == 0
 5  1  2  3  4			→ i == 1			
 4  5  1  2  3			→ i == 2			 
 3  4  5  1  2			→ i == 3			 
 2  3  4  5  1			→ i == 4			
*/


public class Test089
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언 및 메모리 할당
		int arr[][] = new int[5][5];

	
		// ★★초기화★★ 이 개념을 잘 이해해야지..
		// 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5 
		for (int i=0;i<arr.length ;i++)			//  i  → 0 1 2 3 4
		{
			for(int j=i, n=1 ;n<=5; n++)	// j 배열을 0이 아닌 i항(j값과 같은)부터 시작하겠다는 뜻  // 여기에 왜 b++이 못오나..?(수식2에 조건 더하면 안되나..?)
				{
				arr[i][j] = n;      // 0 → 00 = 1 / 01 = 2 / 02 = 3 / 03 = 4 / 04 = 5  
				j++;				// 1 → 10 = 5 / 11 = 1 / 12 = 2 / 13 = 3 / 14 = 4 
									// 2 → 20 = 4 / 21 = 5 / 22 = 4 / 23 = 3 / 24 = 2 
				if(j==5)			// b가 5가 되면 0으로 초기화 해줘~!
					j=0;
				}
		}

		for (int i=0;i<arr.length ;i++)			// 출력 순서는 못바꿔 고대로한다~!
		{
			for(int j=0;j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}

/*
public class Test089
{
	public static void main(String[] args)
	{
		int arr[][] = new int[5][5];

		int n=1;
		for (int i=0;i<arr.length ;i++)
		{
			for(int j=0;j<arr[i].length; j++)
				{
				arr[i][j] = j+n;
				
				if(i<4 && j<4)
					arr[i+1][j+1] = arr[i][j];
				}
		}

		for (int i=0;i<arr.length ;i++)
		{
			for(int j=0;j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
*/