/*=====================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 변수와 자료형
  - 자바의 기본 입출력
=====================================*/

// 사용자로부터 이름과 국어점수, 영어점수, 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름을 입력하세요 : 박나현
// 국어 점수 입력 : 90
// 영어 점수 입력 : 80
// 수학 점수 입력 : 70

// ====[결과]====
// 이름 : 박나현
// 총점 : 240
// ==============
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014re
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k, e, m, sum;
		String strName;
		System.out.print("이름을 입력하세요 : ");
		strName = br.readLine();

		System.out.print("국어 점수 입력 : ");                    // 추가 변수 선언 String strTemp  
		k = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 입력 : ");
		e = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 입력 : ");
		m = Integer.parseInt(br.readLine());
		
		sum = k + e + m;

		System.out.println();
		System.out.println("====[결과]====");
		System.out.println("이름 : " + strName);
		System.out.println("총점 : " + sum);
		System.out.println("==============");


		/* 실행 결과
		이름을 입력하세요 : 박나현
		국어 점수 입력 : 90
		영어 점수 입력 : 80
		수학 점수 입력 : 70
		====[결과]====
		이름 : 박나현
		총점 : 240
		==============
		계속하려면 아무 키나 누르십시오 . . .
		*/
	}
}