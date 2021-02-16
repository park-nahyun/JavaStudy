/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - continue
    → (뒷부분 무시하고) + 계속한다
=====================================*/

// 실행 예)
/*
1 : 1
3 : 4
5 : 9
7 : 16
	:
	:
99 : 2500
결과 : 2500
*/

/*

public class Test065
{
	public static void main(String[] args)
	{
		int n, sum=0;
		for(n=1;n<=100;n++)
		{
			if (n%2==0)
			{
				continue;
			}
			sum+=n;
			System.out.printf("%d : %d%n", n, sum);
		}
		System.out.println("결과 : " + sum);
	}
}
*/

public class Test065
{
	public static void main(String[] args)
	{
		int n=0, s=0;
		while (n<100)								// 0 ~ 99
		{
			n++;									// 1 ~ 100

			if(n%2==0)								// 짝수라면...
				continue;							// (뒷부분 무시하고 +) 계속해라

			s+=n;									// 뒷부분
			System.out.println(n + " : " + s);		// 뒷부분
		}
		System.out.println("결과 : " + s);
	}
}
		