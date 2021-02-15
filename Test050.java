/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - 반복문 실습(while문 실습)
=====================================*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가... 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 10
// 10 → 소수 아님
// 계속하려면 아무 키나..

// 임의의 정수 입력 : 11
// 11 → 소수 
// 계속하려면 아무 키나..

// ※ 소수 : 1 또는 자기 자신의 값 이외의 어떤 수로도 나눌 수 없는 값.
//			단, 1은 소수 아님.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test050
{
	public static void main(String[] args) throws IOException
	{

		// ○ 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int num;			//-- 사용자가 입력하는 임의의 정수를 담아둘 변수

		// ○ 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		int n=2;										//-- 사용자의 입력값을 대상으로
														//   나눗셈 연산을 수행할 변수(1씩 증가 예정)

		// 여기까지 연산해도 소순지 아닌지 알 수 ㄴㄴ 1인지 아닌지를 따져야
		// 그렇지만 여기까지 왔을 때 '너는 소수일 수 있다'고 암시할 수는 있음.

		// String temp = "소수다~!!!" 라고 하면 편하겠지만 우리는 문자열 비교를 못해
		boolean flag = true;  // 그래서 flag로 암시를 해주는 것. 소수다~~!!!

		while (n<num)
		{
			if(num%n==0)
			{
				flag = false;  //-- 소수 아니다~~!!
				// System.out.println(n) 뭘로 나눠지는지 확인 가능. 
				break;
				// But 2로만 나눠지면 나머지 연산(3,4,5로 나누기..) 굳이 할 필요 없지 않을까?
				// 그래서 2를 만나서 소수 아닌 것이 나오면 break를 통해 while문 탈출하는 것!
				// break --> 가장 가까운 조건문을 탈출한다!
			}
			n++;
		}
		
		// ○ 결과 출력
		//		(출력 전에 수행해야 할 추가 확인 → 1인지 여부에 대한 확인)
		//		소수다 && 1이 아니다
		//			→ 최족적인 결론으로 소수다.
	    //		그렇지 않으면
		//			→ 최종적인 결론으로 소수가 아니다.


		if (flag && num!=1)   // 1일 경우 확인 안하면 1은 조건문에 들어가지 않아서 소수로 나옴
			System.out.printf("%d → 소수\n", num);	
		else
			System.out.printf("%d → 소수 아님\n", num);

/*
임의의 정수 입력 : 1
1 → 소수 아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 37
37 → 소수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 40
40 → 소수 아님
계속하려면 아무 키나 누르십시오 . . .

*/



/*
		int n;
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		while(0<n)
		{
			if(n==1 || n%2==0 || n%3==0 || n%5==0)
			{
				System.out.println(n + " → 소수 아님");      
				break;
			}

			else
			{
				System.out.println(n + " → 소수");
				break;
			}
		}

		*/
		
	}
}

