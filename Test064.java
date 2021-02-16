/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - break
   → 멈춘다 + (그리고 빠져 나간다)
=====================================*/

// 다음과 같은 처리가 이루어지는 프로그램을 구현한다.
// 단, 입력받는 정수는 1 ~ 1000 범위 안에서만
// 가능하도록 작성한다.

// 실행 예)
// 임의의 정수 입력(1~1000) : -10
// 임의의 정수 입력(1~1000) : 0
// 임의의 정수 입력(1~1000) : 2021
// 임의의 정수 입력(1~1000) : 10
// >> 1 ~ 10 까지의 합 : 55
// 계속하시겠습니까?(Y/N) : y

// 임의의 정수 입력(1~1000) : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하시겠습니까(Y/N) : N
// 계속하려면 아무 키나...


/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test064
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, m, sum;
		char a;
		sum = 0;
		
		while(true)
		{
			do
			{
				System.out.print("임의의 정수 입력(1~1000) : ");
				n = Integer.parseInt(br.readLine());
				
			}
			while (n<1 || n>1000);
			
			for(m=1;m<=n;m++)
				sum+=m;

			System.out.printf(">> 1 ~ %d 까지의 합 : %d%n", n, sum);
			System.out.print("계속하시겠습니까(Y/N) : ");
			a = (char)System.in.read();
			if(a == 'n' || a == 'N')
			break;
		}
	}
}

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test064
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, s, i;           //-- 사용자 입력값
		char ch;				 //-- 계속 여부 입력값

		while(true)				 //-- 무한 루프(반복)
		{

			do				 // 입력을 한 번은 받아야 하니까 do ~while이 적합
			{
				System.out.print("임의의 정수 입력(1~1000) : ");
				n = Integer.parseInt(br.readLine());				// 에러가 여기서 남.. \r \n는 숫자가 아냐..
			}
			while (n<1 || n>1000);		// 반복을 수행할 조건
			// System.out.println("입력한 정수 : " + n);

			// 반복문을 또 수행할 때 누적합을 초기화
			s=0;

			for(i=1;i<=n;i++)
			{
				s+=i;
			}
			// System.out.println("누적합 : " + s);
			System.out.printf("\n>> 1 ~ %d 까지의 합 : %d%n", n, s);

				
			System.out.print("계속하시겠습니까(Y/N) : ");
			ch = (char)System.in.read();		// y + \r + \n
			
			// System.out.println("계속여부 : " + ch);

			// 일반적으로 긍정에서 Y, y만 필터링. 아무거나 치면 부정..

			// 입력값이 소문자 y가 아니다. 입력값이 대문자 Y가 아니다.
			// → ch!='Y'					ch!='y'
			
			if (ch!= 'y' && ch!='Y')
			{
				// 반복문 → 『while(true)』빠져나갈 수 있는 코드 작성 필요
				//-- 위와 같은 의사 표현을 했다면
				//	 그동안 수행했던 반복문을 멈추고 빠져나가야 한다.
				break;
				//-- 멈춘다. (+ 그리고 빠져나간다) check~!!!

				//  근데 왜 Y를 입력하면 문제가 생길까?
			}
			// 엔터값(\r\n) 추가 처리
			System.in.skip(2);
				
		}//end while(true)
	}
	
}



/*
임의의 정수 입력(1~1000) : 24

>> 1 ~ 24 까지의 합 : 300
계속하시겠습니까(Y/N) : y
임의의 정수 입력(1~1000) : 10

>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까(Y/N) : Y
임의의 정수 입력(1~1000) : 35

>> 1 ~ 35 까지의 합 : 630
계속하시겠습니까(Y/N) : n
계속하려면 아무 키나 누르십시오 . . .

*/