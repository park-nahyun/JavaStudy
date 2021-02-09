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

public class Test018
{
	public static void main(String[] args)
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// ○ 주요 변수 선언
		String name;  //-- 이름
		int kor, eng, mat, tot; //-- 국어, 영어, 수학 점수 및 총점

		// ○ 연산 및 처리
		System.out.print("이름 국어 영어 수학 입력(공백 구분): ");
		//-- 이름 국어 영어 수학 입력(공백 구분) : 박나현 90 80 95  ~~ 이런식으로
		// 버퍼드 리드로 읽으면 "박나현 90 80 95"를 통째로 문자열로 받아들임
		// 공백(띄어쓰기)별로 띄어쓰기를 따로 처리한다는 것!!

		// 사용자가 입력한 데이터를 각 변수에 담아내기
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

	   // 총점 산출
	    tot = kor + eng + mat;

		// ○ 결과 출력
		System.out.println();
		System.out.printf("이름 : %s%n", name);
		System.out.printf("총점 : %d%n", tot);

		/* 이름 국어 영어 수학 입력(공백 구분): 박나현 90 80 70

			이름 : 박나현
			총점 : 240
			계속하려면 아무 키나 누르십시오 . . . */
	}
}