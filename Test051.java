/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - 반복문 실습(while문 실습)
=====================================*/

// 사용자로부터 임의의 두 정수를 입력받아
// 작은 수 부터 큰 수 까지의 합을 구하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 20
// >> 10 ~ 20 까지의 합 : xxxx
// 계속하려면 아무 키나...

// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 2
// >> 2 ~ 10 까지의 합 : xxx
// 계속하려면 아무 키나...

// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 10
// >> 10 ~ 10 까지의 합 : 10
// 계속하려면 아무 키나...



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{

		// ○ 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, su1, su2, result =0;
		//-- 루프변수, 첫 번재 입력값, 두 번째 입력값, 결과값(누적합 연산 결과)


		// ○ 연산 및 처리
		// ·사용자에게 안내 메세지 출력 및 입력값 담아내기
		System.out.print("첫 번째 정수 입력 : ");
		su1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		su2 = Integer.parseInt(br.readLine());
		
		// · 누적합 연산에 들어가기 앞서
		//	  입력받은 두 수의 크기 비교 및 자리 바꿈
		//    즉, su1이 su2보다 클 경우 두 수의 자리를 바꿀 수 있도록 처리

		if (su1>su2)
		{
			// 두 수의 자리 바꿈
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}

		n = su1;			 // su1값을 보존하기 위해 n을 씀(출력할 때 su1 써야하니까)			

		while(n<=su2)
		{
			result += n;
			n++;
			
		}

		// ○ 결과 출력

		System.out.printf(">> %d ~ %d 까지의 합 : %d\n", su1, su2, result);
		
/*
		int a, b, n, sum;
		n=sum=0;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		while(n<a||n<b)
		{
			if(a<b)
				sum = a + (a+n);

			else if(a==b)
				sum == a;
				
			else                 // b가 a보다 작을 경우엔 a와 b의 값을 서로 바꿔서 연산한다~
			{
				a=a^b;             
				b=b^a;
				a=a^b;                      
				sum = a + (a+n);  
			}                             
						
			n++;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.printf("%d ~ %d까지의 합 : %d%n", a, b, sum);

		*/
		
	}
}