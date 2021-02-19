/*=====================================
  ■■■ 배열 ■■■
  - 배열의 기본적인 활용
=====================================*/

// ○ 과제
// 사용자로부터 임의의 정수를 임의의 개수만큼 입력받아
// 입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 구현한다.
// 단, 배열을 활용하여 처리할 수 있도록 한다.

// 실행 예)

// 입력할 데이터의 개수 : 10
// 데이터 입력(공백구분) : 47 92 73 11 2 61 23 62 88 15   // 배열 구성
// >> 가장 큰 수 → 92
// 계속하려면 아무 키나...


import java.util.Scanner;

public class Test084
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("입력할 데이터의 개수 : ");
		n = sc.nextInt();

		int arr[] = new int[n];

		System.out.print("데이터 입력(공백구분) : ");
		
		int max = arr[0];

		for (int i=0;i<arr.length ;i++ )
		{
			arr[i] = sc.nextInt(); 
			
			if(arr[i]>max)
				max = arr[i];
		}
		
		System.out.println(">> 가장 큰 수 → " + max);
	}
}

/*
입력할 데이터의 개수 : 10
데이터 입력(공백구분) : 53 64 16 27 37 43 54 76 34 2
>> 가장 큰 수 → 76
계속하려면 아무 키나 누르십시오 . . .
*/