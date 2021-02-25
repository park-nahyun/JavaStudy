/*====================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
  - 향상된 버블 정렬(Bubble Sort : 거픔 정렬)
=====================================*/

/*
리소스 횟수가 적다 = 반복이 적다
버블과 셀렉트는 반복은 같아~! 그러므로 성능은 같다.
사실 정렬끼리 지금 성능차이는 크게없음.
But 어떤 걸 썼을 때 데이터 구조 케바케로 효율이 좋을 수는 있음. 

※ 앞서 공부한 Selection Sort나 Bubble Sort의 성능은 같다. (반복의 횟수로 추정)
   하지만, 향상된 Bubble Sort는 대상이 되는 데이터의 구조에 따라
   일반 Bubble Sort나 Selection Sort보다 성능이 좋을 수 있다.

원본 데이터 = 61 15 20 22 30
			  15 20 22 30 61		-- 1회전(스왑 발생) → 다음 회전 ○
			  15 20 22 30 61        -- 2회전(스왑 발생 안함) → 다음 회전 X

==> 1회전 수행... 2회전 수행... 을 해 보았떠니...
	2회전을 수행하는 과정에서 스왑(자리바꿈)이 전혀 일어나지 않았기 때문에
	불필요한 추가 연산(회전:반복)을 수행하지 않는다.
	즉, 더 이상의 반복은 무의미한 것으로 판단한다.
*/

/*
	10, 50, 20, 33, 40			→ 0 1
	======

	10, 20, 50, 33, 40			→ 1 2
		======

	10, 20, 33, 50, 40			→ 2 3
			======
	
	10, 20, 33, 40, 50			→ 3 4
				======
---------------------------------------------- 1회전

	10, 20, 33, 40, 50			→ 0 1
	======
		======
			======

---------------------------------------------- 2회전
	X
	X

	X
	*/



public class Test104
{
	public static void main(String[] args)
	{
		int a[] = {10, 50, 20, 33, 40};

		System.out.print("Source Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
	
		// 향상된 Bubble Sort 구현
		int pass=0;		// 이전 문제에서 i 하나씩 빼던걸 pass가 할듯
		boolean flag;	// 자리 바꿈이 있었다, 없었다 확인하기 위함

		// 아까 거를 do while로 바꾼 것 뿐. while에서 조건 확인하기 위해.
		// 할까말까 고민하고 나가야 하니까!!

		do
		{
			pass++;
			flag = false; // ????

			for (int i=0;i<a.length-pass;i++ )	
			{		
				
				if (a[i] > a[i+1])
				{
					// 자리 바꾸기
					a[i] = a[i]^a[i+1];
					a[i+1] = a[i+1]^a[i];
					a[i] = a[i]^a[i+1];     // 이까지 수행하고 flag에 true를 넣는다

					flag = true;			// 자리 바꿈이 일어났다는 사실 확인

				}
			}

		}
		while (flag);
		// 회전이 구분적으로 발생하는 동안(웅~) 스왑(자리바꿈)이 일어나지 않는 경우로
		// 더 이상의 반복문 수행은 무의미한 것으로 판단
		// 자리 바꾸기 안일어나면 false가 되어 반복문 멈추겠지?
	

		System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();


/* 실패..

public class Test104
{
	public static void main(String[] args)
	{
		int a[] = {10, 50, 20, 33, 40};

		System.out.print("Source Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
	
		for (int i=1;i<a.length ;i++ )	
		{			
			System.out.println("웅");
			for (int j=0;j<a.length-i;j++) 
			{	
				for (int k=0;k<a.length;k++ )
				{
					if (a[k] < a[k+1])
						continue;
						
				}
			
				if (a[j] > a[j+1])	
				{	
					System.out.println("쑝");
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
				}
			}
		}


		System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
	}	
}

*/