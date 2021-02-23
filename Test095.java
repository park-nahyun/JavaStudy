/*=====================================
	■■■ 클래스와 인스턴스 ■■■
	- 클래스와 인스턴스 활용
=====================================*/

// ○ 실습 문제
// 1 ~ 3 사이의 정수 형태의 난수를 발생시켜
// 가위, 바위, 보 게임 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 배열을 활용하여 처리할 수 있도록 한다.

// 기준 데이터 → 1:가위, 2:바위, 3:보

// 실행 예)
// 1:가위, 2:바위, 3:보 중 입력(1~3) : 4
// 1:가위, 2:바위, 3:보 중 입력(1~3) : -10
// 1:가위, 2:바위, 3:보 중 입력(1~3) : 2
// - 유저 : 바위
// - 컴퓨터 : 보
// >> 승부최종결과 : 컴퓨터가 이겼습니다~!!!
// 계속하려면 아무 키나...

import java.util.Random;
import java.util.Scanner;

class RpsGame
{
	// 내가 풀이한 내용
	/*
	int user;
	int com;
	String[] g = {"가위" , "바위", "보"};


	void start()
	{
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		com = rd.nextInt(3)+1;

		do
		{
			System.out.print("1:가위, 2:바위, 3:보 중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);

		System.out.printf("-유저   : %s\n", g[user-1]);
		System.out.printf("-컴퓨터 : %s\n", g[com-1]);

		System.out.print(">> 승부최종결과 : ");

		if (user == com)
			System.out.println("비겼습니다.");
		else if(user-1 == com)
			System.out.println("유저가 이겼습니다.");
		else if(user==1 && com==3)
			System.out.println("유저가 이겼습니다.");
		else 
			System.out.println("컴퓨터가 이겼습니다.");
	
	}
	*/
	
	// 함께 풀이한 내용
	int user;
	int com;

	private void runCom() // 랜덤으로 com값 생성하는 메소드
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;		// 0 1 2 → 1 2 3
	}
	
	public void input() // 사용자 입력 받는 메소드
	{
		runCom(); // 사용자 값 입력받기 전에 com의 랜덤값 미리 생성

		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("1:가위, 2:바위, 3:보 중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	}

	public void middleCalc() // 입력 값을 배열 형태로 바꿔주는 메소드
	{
		String[] str = {"가위", "바위", "보"};

		System.out.println("- 유저   : " + str[user-1]);
		System.out.println("- 컴퓨터 : " + str[com-1]);
	}

	public String resultCalc() // 최종 결과 얻는 메소드 
	{
		String result ="무승부";

		if((user==1&&com==3) || (user==2&&com==1) || (user==3&&com==2))
			result = "유저가 이겼습니다";

		if((user==1&&com==2) || (user==2&&com==3) || (user==3&&com==1))
			result = "컴퓨터가 이겼습니다.";

		return result;
	}

	public void print(String result) // 출력 메소드
	{
		System.out.println(">> 승부최종결과 : " + result); 
	}



}

public class Test095
{
	public static void main(String[] args)
	{
		// 내가 풀이한 내용
		/*
		RpsGame rps = new RpsGame();

		rps.start();
		*/

		// 함께 풀이한 내용
		RpsGame ob = new RpsGame();
		
		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);
	}
}

/* [실행 결과]
1:가위, 2:바위, 3:보 중 입력(1~3) : 1
-유저   : 가위
-컴퓨터 : 가위
>> 승부최종결과 : 비겼습니다.
계속하려면 아무 키나 누르십시오 . . .
*/

/*
1:가위, 2:바위, 3:보 중 입력(1~3) : 2
-유저   : 바위
-컴퓨터 : 보
>> 승부최종결과 : 컴퓨터가 이겼습니다.
계속하려면 아무 키나 누르십시오 . . .
*/


/*
1:가위, 2:바위, 3:보 중 입력(1~3) : 2
-유저   : 바위
-컴퓨터 : 가위
>> 승부최종결과 : 유저가 이겼습니다.
계속하려면 아무 키나 누르십시오 . . .
*/




// 모든 경우의 수 
/*
if(user==1)
{
	if(com==1)
		System.out.println("비겼습니다.");
	else if(com==2)
		System.out.println("컴퓨터가 이겼습니다.");
	else if(com==3)
		System.out.println("유저가 이겼습니다.");
}
else if(user==2)
{
	if(com==1)
		System.out.println("유저가 이겼습니다.");
	else if(com==2)
		System.out.println("비겼습니다.");
	else if(com==3)
		System.out.println("컴퓨터가 이겼습니다.");
}
else if (user==3){
	if(com==1)
		System.out.println("컴퓨터가 이겼습니다.");
	else if(com==2)
		System.out.println("유저가 이겼습니다.");
	else if(com==3)
		System.out.println("비겼습니다.");
}
*/