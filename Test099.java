/*=====================================
  ■■■ 배열 (Array) ■■■
  - 배열의 복사
=====================================*/

// ○ 실습 문제
// 임의의 배열(a, b)에 들어있는 숫자들의 합집합을 출력하는 프로그램을 구현한다.
// 단, 중복이 제거된 상태의 합집합을 출력할 수 있도록 한다.
// 또한 배열 복사 개념을 적용시켜 할 수 있도록 한다.

// ex) 임의의 두 배열
// int[] a = {2, 3, 7, 10, 11}
// int[] b = (3, 6, 10, 14}


// 실행 예)
// 첫 번째 배열 요소를 입력하세요(공백 구분) : 2 3 7 10 11
// 두 번째 배열 요소를 입력하세요(공백 구분) : 3 6 10 14
// 2 3 7 10 11 6 1

import java.util.Scanner;


public class Test099
{
	public static void main(String[] args)
	{
		// 임의의 두 배열
		int[] a = {2, 3, 7, 10, 11};
		int[] b = {3, 6, 10, 14};


		/*
		// 방법 ①
		// - 집합 a의 전체 요소 출력
		for (int i=0;i<a.length ;i++)
		{
			System.out.printf("%3d", a[i]);
		}

		// - 집합 b의 요소 출력
		//	 단, 집합 b는 집합 a의 요소와 중복되는 데이터를
		//	 제거하면서 출력

		for (int i=0;i<b.length ;i++ )					// 4회전 → 3 6 10 14 (선택적 출력)
		{
			boolean flag = false;

			for (int j=0;j<a.length ;j++ )				// 5회전 → 2 3 7 10 11
			{
				if(b[i] == a[j])
				{
					flag = true;						// 같은 값이 있으면 반복문 멈추고 나간다.
					break;								
				}
			}

			if (flag)									// flag가 true라면, 즉.. 같은 값이 있으면 
				continue;

			System.out.printf("%3d\n", b[i]);				// 뒷부분(출력) 무시해라~!
		}
		*/

		/*
		  2  3  7 10 11  6
			14  와이라노..
		*/
		// 방법 ②
		// - 임시 배열을 만들고
		// int[] temp = new int[????];
		int[] temp = new int[a.length + b.length];

		// - 만들어진 임시 배열에 중복되지 않은 배열 요소를 채운 다음
		// check~!!!
		int n;								//-- 변수의 선언 위치 중요~!!!
		for (n=0;n<a.length ;n++ )
		{
			temp[n] = a[n];					// 방법 1에서 a 출력한다~와 비슷
		}

		// n 선언을 포문 안에서 하면 포문 밖에서 n 안보입니다~!
		// 테스트
		// System.out.println(n);

		for (int k=0;k<b.length; k++ )
		{
			boolean flag = false;
			
			for (int m = 0; m<a.length ;m++ )
			{
				if (b[k] == a[m])
				{
					flag = true;
					break;
				}
			}

			if(flag)
				continue;	 // 뒷부분 무시해~!

			temp[n] = b[k];  // n은 5인 상태로 위에서 멈췄고 반복문 도는동안..  n은 증가 안하므로
			n++;

		}
		


		// - 그렇게 구성된 임시 배열을 출력(채워진만큼...)
		for (int h=0;h<n ;h++ ) // temp.length로 하면 빈방들도 출력됨
		{
			System.out.printf("%3d", temp[h]);
		}
		System.out.println();

	}

}

/*
  2  3  7 10 11  6 14
계속하려면 아무 키나 누르십시오 . . .

*/


/*
public class Test099
{
	public static void main(String[] args)
	{
		int[] a = {2, 3, 7, 10, 11};
		int[] b = {3, 6, 10, 14};


		int[] temp = new int[a.length+b.length];


		for (int i=0;i<a.length;i++) // 비교 기준
		{
			for (int j=0;b.length;j++) // 비교 대상
			{
				if (a[i]=b[j])
				{
					a[i] =  a[i] 
				}
			}
		}
		for (int i=0;i<temp.length;i++)
		{
			
				if (i<a.length)
					temp[i] = a[i];
				else if(i>=a.length)
					temp[i] = b[i-5];
				
					
*/
	 /*
	 for (int i=0;i<temp.length;i++)[
	   temp[i] = a[i];
	  그냥 이렇게 하면 a 배열의 길이가 temp 길이보다 짧아서 에러남
	 */
	 // b[i]로 하면 --==  2 3 7 10 11 14 14 14 14 이렇게 나옴.. 웅~ 쑝쑝쑝을 기억해!
		
			
