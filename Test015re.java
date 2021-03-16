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

public class Test015re
{
	public static void main(String[] args) throws IOException
	{	
		char A;
		int B;

		System.out.print("한 문자 입력 : ");
		A = (char)System.in.read();
		

		System.out.print("한 자리 정수 입력 : ");
		B = System.in.read();

		System.out.println(">> 입력한 문자 : " + A);
		System.out.println(">> 입력한 정수 : " + B);

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
	}
}