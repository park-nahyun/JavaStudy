/*=====================================
  ■■■ 배열(array) ■■■
  - 배열과 난수 처리 
=====================================*/

// 사용자로부터 임의의 정수를 입력받아
// 그 정수의 개수만큼 난수(1~100)를 발생시켜서 배열에 담고
// 배열에 담겨있는 데이터들 중
// 가장 큰 값과 가장 작은 값을 선택하여 출력하는 프로그램을 구현한다.

// 실행 예)
// 발생시킬 난수의 개수 입력 : 3
// (51 21 17 → 무작위로 발생한 정수들... → 배열에 담아내기(배열구성))
// 가장 큰 값 : 52, 가장 작은 값 : 17
// 계속하려면 아무 키나...


import java.util.Scanner;
import java.util.Random;

public class Test090
{
	public static void main(String[] args)
	{
		// Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 안내 메시지 출력
		System.out.print("발생시킬 난수의 개수 입력 : ");
		int size = sc.nextInt();
		 
		// size 변수에 담아낸 수 만큼의 배열방 만들기
		// (배열 선언 및 매모리 할당)

		int[] arr = new int[size];
		
		// 원래는 Math라는 클래스를 썼는데 사용 가능 폭이 좁아서.. 새로 만들어진 Random을 씀
		
		// 무작위 숫자(난수)를 발생시키기 위해서는 
		// 난수 발생 전용 객체가 필요하다.
		// → 『java.util.Random』
		Random rd = new Random();

		// 테스트
		System.out.println("발생한 난수 : " + rd.nextInt(100));  // 메소드 이름이 같아도 다른 클래스에 있으면 식별이 가능하다! ~ 스코프가 다르므로 (sc.nextInt)
		// 0부터 괄호 안의 숫자 '개수' 만큼 난수가 발생한다. 즉 100을 입력하면 0부터 99까지 난수..
		// ※ 『Random』 클래스의 『nextInt()』 메소드
		//		0~ 매개변수로 넘겨받은 정수-1 까지의 수 중
		//		무작위 정수(난수) 1개를 발생시킨다.

		
		for (int i=0; i<size; i++)   // for(int i=0; i<arr.length; i++)
		{
			arr[i] = rd.nextInt(100)+1;
			System.out.printf("%4d", arr[i]);

		}

		System.out.println();

		int max, min;
		max = min = arr[0];
		for (int i=1 ;i<arr.length ;i++) // i를 굳이 0으로 할 필요가 없음 --> 자기 자신과 자기 자신을 비교 할 필요 없으니까
		{
			// max와 i번째 요소의 크기 비교 → i가 더 큰 상황 → max에 i 대입
			if(max < arr[i]) 
				max = arr[i];
			// min과 i번째 요소의 크기 비교 → i가 더 작은 상황 → min에 i 대입
			if(min > arr[i])
				min = arr[i];
		}
	
		// 결과 출력
		System.out.println();
		System.out.println("가장 큰 값 : " + max + ", 가장 작은 값 : " + min);
	}
}

/*
발생시킬 난수의 개수 입력 : 10
발생한 난수 : 6
  27   4  85  20  10   8  18  16  71  83

가장 큰 값 : 85, 가장 작은 값 : 4
계속하려면 아무 키나 누르십시오 . . .
*/



/*
import java.util.Scanner;
import java.util.Random;

public class Test090
{
	public static void main(String[] args)
	{
		// Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 안내 메시지 출력
		System.out.print("발생시킬 난수의 개수 입력 : ");
		int size = sc.nextInt();
		 
		int[] arr = new int[size];

		Random rd = new Random();

		// 테스트
		System.out.println("발생한 난수 : " + rd.nextInt(100));  

		int max=1, min=100;
		for (int i=0; i<size; i++)   // for(int i=0; i<arr.length; i++)
		{
			arr[i] = rd.nextInt(100)+1;
			System.out.printf("%4d", arr[i]);

			if(max < arr[i]) 
				max = arr[i];
			if(min > arr[i])
				min = arr[i];
		}
		
		System.out.println();
		System.out.println("가장 큰 값 : " + max + ", 가장 작은 값 : " + min);
	}
}
*/