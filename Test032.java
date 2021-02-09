/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - if문 실습
=====================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/*

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;

		System.out.print("임의의 정수 입력 : " );
		n = Integer.parseInt(br.readLine());

		if (n%2==0)
		{
			System.out.println(n + "→ 짝수");
		}
		else if (n==0)
		{
			System.out.println(n + "→ 영");
		}
		else
		{
			System.out.println(n + "→ 홀수");
		}
	}
}

*/



/*
틀린 구문
0이 짝수라고 나옴.
홀,짝, 0 순서도 마찬가지
0도 2로 나누면 나머지가 0이니까!!
*/

// 그래서 논리 순서가 중요하다는 것!!
// 0 논리는 항상 짝수보다 우선해서 와야한다!!

/*
public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;

		System.out.print("임의의 정수 입력 : " );
		n = Integer.parseInt(br.readLine());

		if (n==0)
		{
			System.out.println(n + "→ 영");
		}
		else if (n%2==0)
		{
			System.out.println(n + "→ 짝수");
		}
		else
		{
			System.out.println(n + "→ 홀수");
		}
	}
}

/*
/* 
여기서 홀수 처리 else 빠져도 문제 없음
*/

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		
		System.out.print("아이스크림 종류 선택(1.딸기, 2.포도) : ");
		n = Integer.parseInt(br.readLine());
		
		if(n==1)
		{
			System.out.println("딸기 아이스크림 선택~~!!");
		}
		else if(n==2)
		{
			System.out.println("포도 아이스크림을 선택~~!!");
		}
	}
}

// 그냥 이렇게만 하면 사용자가 다른 잘못된 걸 치더라도 결과가 포도로 나오겠지?
/* 그래서 친절하게 
else 
{
	System.out.println("잘못 뽑으셨습니다~!");
}
더하라는 것
*/