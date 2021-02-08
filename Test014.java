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

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//import java.io.*;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		// InputStreamReader 인스턴스 생성 + BufferedReader 인스턴스 생성
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// 주요 변수 선언
		String strName;				//-- 이름 변수
		int nKor, nEng, nMat, nTot;	//-- 국어, 영어, 수학, 총점 변수

		// 추가 변수 선언
		String strTemp;				//-- 문자열 데이터 임시 저장 변수

		// 연산 및 처리
		// ①-① 사용자에게 안내 메세지 출력(이름 입력 안내)
		System.out.print("이름을 입력하세요: ");

		// ①-② 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strName = br.readLine();

		// ②-① 사용자에게 안내 메세지 출력(국어점수 입력 안내)
		System.out.print("국어 점수 입력: ");

		// ②-② 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();			//--문자열 임시 저장
		nKor = Integer.parseInt(strTemp);	//--임시 저장 데이터 형 변환 후 국어점수 변수에 담아내기

		// ③-① 사용자에게 안내 메세지 출력(영어점수 입력 안내)
		System.out.print("영어 점수 입력: ");

		// ③-② 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();			//--문자열 임시 저장(새로 입력한 데이터가 덮어쓰기 됨)
		nEng = Integer.parseInt(strTemp);	//--임시 저장 데이터 형 변환 후 영어점수 변수에 담아내기

		// ④-① 사용자에게 안내 메세지 출력(수학점수 입력 안내)
		System.out.print("수학 점수 입력: ");

		// ④-② 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();			//--문자열 임시 저장
		nMat = Integer.parseInt(strTemp);	//--임시 저장 데이터 형 변환 후 수학점수 변수에 담아내기

		// ⑤ 입력된 데이터들(nKor, nEng, nMat)을 종합하여 총점 산출하기
		nTot = nKor + nEng + nMat;

		// 결과 출력
		System.out.println();
		System.out.println("====[결과]====");
		System.out.println("이름: "+strName);
		System.out.println("총점: "+nTot);
		System.out.println("==============");
	}
}


/* 실행결과

이름을 입력하세요: 박수수
국어 점수 입력: 90
영어 점수 입력: 80
수학 점수 입력: 70

====[결과]====
이름: 박수수
총점: 240
==============
계속하려면 아무 키나 누르십시오 . . .

*/