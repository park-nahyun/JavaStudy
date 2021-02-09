/*=====================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 자바의 기본 입출력 : System.in.read    // 우리가 최종적으로 read 메쏘드를 쓰는 것. system 상자 안의 in 상자안의..
=====================================*/    // readLine은 한 줄을 통째로 읽는 것. read는 문자 하나를 읽는 것.

/*
※ 『System.in.read()』메소드는 한 문자만 가져온다.
	단, 하나의 문자를 입력받아 입력받은 문자의 
	ASCII Code 값을 반환하게 된다.
*/

// 실행 예)
// 한 문자 입력 : G
// 한 자리 정수 입력 : 7

// >> 입력한 문자 : G
// >> 입력한 정수 : 7

// 계속하려면 아무 키나 누르세요...


import java.io.IOException;

public class Test015
{
	public static void main(String[] args) throws IOException
	{	

/*
		System.out.print("한 문자 입력 : ");
		strA = System.in.read();
	

		System.out.print("한 자리 정수 입력 : ");
		intB = System.in.read();

		System.out.println(">> 입력한 문자 : strA");
		System.out.println(">> 입력한 정수 : intB");

*/


// ○ 주요 변수 선언

		char ch;  //-- 입력받은 문자를 담을 변수
		int n;    //-- 입력받은 정수를 담을 변수

		System.out.print("한 문자 입력 : ");  //G-->7
		

		// 사용자 입력값을 문자형으로 변환한 후 변수 ch에 담아내기
		// ch=71; 바로 ch에 담아내지지 않겠지? 자동형변환 규칙에도 맞지 않아! 
		// 그래서 명시적 형변환 필요!
		// 한 문자 입력 : 'G' + 엔터 이 엔터!!에서 개행이 이뤄짐
		// 엔터키 모양은 \n + \r이 합쳐져있는 모양. ← + ↓

// ○ 연산 및 처리
		ch = (char)System.in.read();
		System.in.skip(2);
		// 사용자에게 안내 메세지 출력
		System.out.print("한 자리 정수 입력 : ");
		
		
		// 사용자 입력값을 변수 n에 담아내기
		n = System.in.read();      //--> 여기서도 아스키 코드로 출력이 되겠지?
									// 아스키코드 숫자 - 48 빼면 되렉싲..
		n -= 48;                  // 복합 대입 연산자 사용해서 빼주기


// ○ 결과 출력
		
		System.out.println();
		System.out.println(">> 입력한 문자 : " + ch);
		System.out.println(">> 입력한 정수 : " + n);
		System.out.println();
		
		// Input/Output --> Stack 우리가 자바를 통해 뭘 넣고 나오는 건 하나의 입구.
		// 한 문자 입력 : 'G' + 엔터
		//                       -----------
		//					    ← + ↓  ==>>   \r \n
		// G + \r + \n 자바는 항상 대기중(우리가 멈추라고 안했는데 한 문자 입력 : 하고 커서 깜빡거리면서 기다리는 이유)
		// 회로값이 G가 입력되면 바로 \r+\n으로 넘어감
		// 그럼 두 번쨰 입력 전에 커서를 맨 뒤로 보내면 되겠지? 그럼 대기 하겠지?
		// 입력 대기열에 남아있는 \r 과 \n 을 스킵(건너뛰기, 버리기)
		// 버퍼드 리드는 나중에 만들어져서 이런게 좀 생략된듯..

		

		//-- 두 글자를 읽지 않고 건너 뛴다.

/* 에러
Test015.java:31: error: incompatible types: int cannot be converted to String
                strA = System.in.read();
                                     ^
Test015.java:35: error: cannot find symbol
                intB = System.in.read();
                ^
  symbol:   variable intB
  location: class Test015
*/


/* 결과 출력
	한 문자 입력 : G
	한 자리 정수 입력 : 7

	>> 입력한 문자 : G
	>> 입력한 정수 : 7

	계속하려면 아무 키나 누르십시오 . . .
*/


	}
}