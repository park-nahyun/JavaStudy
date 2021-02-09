/*=====================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 자바의 기본 입출력 : java.util.Scanner
=====================================*/

//	※ java.util.Scanner
//	단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//	디폴트(default)로 사용되는 단락 문자는 공백이다.
//	작성된 다음 토큰은 next() 메소드를 사용,
//	다른 형태의 값으로 변환할 수 있다. 

import java.util.Scanner;

public class Test017
{
	public static void main(String[] args)
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// ○ 주요 변수 선언

		String name;				//-- 이름
		int kor, eng, mat;			//-- 국어, 영어, 수학 점수

		// ○ 연산 및 처리
		System.out.print("이름을 입력하세요 : ");
		//name = br.readLine();
		name = sc.next(); // 스캐너 안에  next라는 메쏘드가 있다. 버퍼드 리더의 리드라인과 유사.

		System.out.print("국어 점수 입력 : ");
		//kor = Integer.parseInt(sc.next());
		kor = sc.nextInt();  // 메쏘드가 자료형별로 존재한다고 보면 됨ㅎ 갸꿀~!

		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();

		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();

		// ○ 결과 출력

		System.out.println("\n이름 : " + name);
		System.out.printf("총점 : %d\n", (kor+eng+mat));

		/*
		이름을 입력하세요 : 박낳ㅕㄴ
			국어 점수 입력 : 19
		영어 점수 입력 : 09
		수학 점수 입력 : 80

		이름 : 박낳ㅕㄴ
		총점 : 108
		계속하려면 아무 키나 누르십시오 . . .
*/
	}
}