/*=====================================
  ■■■ 배열 ■■■
  - 배열의 선언과 초기화
  - 배결의 기본적인 활용
=====================================*/

// ○ 실습 문제
// 임의의 정수들이 들어있는 배열의 숫자 데이터들 중
// 짝수인 요소만 골라서 출력하고
// 3의 배수인 요소만 골라서 출력하는 프로그램을 구현한다.

// ※ 배열을 구성하는 임의의 정수
//    → 4 7 9 1 3 2 5 6 8

// 실행 예)
// 배열 요소 전체 출력
// 4 7 9 1 3 2 5 6 8
// 짝수 선택적 출력
// 4 2 6 8
// 3의 배수 선택적 출력
// 9 3 6
// 계속하려면 아무 키나...

public class Test081
{
	public static void main(String[] args)
	{

		// 배열 선언 및 초기화
		// 방법 ①
		/*
		int arr[] = new int[9];
		arr[0] = 4;
		arr[1] = 7;
		arr[2] = 9;
		arr[3] = 1;
		arr[4] = 3;
		arr[5] = 2;
		arr[6] = 5;
		arr[7] = 6;
		arr[8] = 8;
		*/

		// 방법 ②
	    int[] arr = {4, 7, 9, 1, 3, 2, 5, 6, 8};


		System.out.println(arr);
		//--==>> [I@15db9742
		// ※ 일반적인 변수에 담긴 내용을 출력하는 방식(형식)으로는
		//	  배열에 담긴 데이터들을 철력 할 수 없다. 

		/*
		System.out.println("배열 요소 전체 출력");
		for(int i=0;i<9;i++)							// 배열 반복문 대부분은 0부터 시작.. 0번 방부터 시작하니까!
		{
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		//--==>> 배열 요소 전체 출력
		//		 4 7 9 1 3 2 5 6 8

		*/
		// ※ 배열 arr 의 길이(방의 갯수) 확인
		//	  『arr.length』
		
		System.out.println("배열 arr의 길이 : " + arr.length);
		//--==>> 배열 arr의 길이 : 9

		System.out.println("배열 요소 전체 출력");
		for(int i=0;i<arr.length;i++)		
			System.out.print(arr[i] + " ");
		System.out.println();
		//--==>> 배열 요소 전체 출력
		//		 4 7 9 1 3 2 5 6 8

		System.out.println("짝수 선택적 출력");

		
		for(int i=0 ; i<arr.length ; i++ )
		{
			/*
			if (i%2==0)			//-- i가 짝수라면...
								//   → 짝수 번째에 해당하는 요소라면..(즉 방 번호가 짝수라면)
			{
				System.out.print(arr[i] + " ");
			}
			*/

			if (arr[i]%2==0) //-- i번째에 해당하는 그 값이 짝수라면...
			{
				System.out.print(arr[i] + " ");
			}

		}
		System.out.println();

		System.out.println("3의 배수 선택적 출력");
		
		for(int i=0; i<arr.length;i++)
		{
			if (arr[i]%3==0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}

/*
[I@15db9742
배열 arr의 길이 : 9
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8
짝수 선택적 출력
4 2 6 8
3의 배수 선택적 출력
9 3 6
계속하려면 아무 키나 누르십시오 . . .
*/

/*
public class Test081
{
	public static void main(String[] args)
	{
		int arr[] = {4, 7, 9, 1, 3, 2, 5, 6, 8};

		System.out.println("배열 요소 전체 출력");
		for(int i=0;i<9;i++)
		{
			System.out.printf("%-2d", arr[i]);
		}

		System.out.println();
		System.out.println("짝수 선택적 출력");
		System.out.println(arr[0] + " " + arr[5] + " " + arr[7] + " " + arr[8]);
		System.out.println("홀수 선택적 출력");
		System.out.println(arr[2] + " " + arr[4] + " " + arr[7]);
	}
}
*/