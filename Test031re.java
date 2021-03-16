/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - if문 실습
=====================================*/

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 다음과 같은 형태로 출력하는 프로그램을 구현한다.
// 단, BufferedReader의 readLine()을 통해 입력받을 수 있도록 하며,
// printf()를 통해 출력할 수 있도록 한다.

// 실행 예)
// 이름 입력 : 박수수
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// >> 당신의 이름은 박수수입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70,
// >> 총점은 240이고, 평균은 80입니다.
// >> 등급은 B 입니다.

// ※ 이 때, 등급은 평균 점수를 기준으로 처리한다.
// 90점 이상			 : A		
// 80점 이상 ~ 90점 미만 : B
// 70점 이상 ~ 80점 미만 : C		
// 60점 이상 ~ 70점 미만 : D
// 60점 미만			 : F

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031re
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nKor,nEng, nMat, nTot;
		double aver;
		String strName, strGrade;

		System.out.print("이름 입력 : ");
		strName = br.readLine();

		System.out.print("국어 점수 : ");
		nKor = Integer.parseInt(br.readLine());
		
		System.out.print("영어 점수 : ");
		nEng = Integer.parseInt(br.readLine());
		
		System.out.print("수학 점수 : ");
		nMat = Integer.parseInt(br.readLine());

		nTot = (nKor + nEng + nMat);
		
		aver = nTot/3.0;             //이렇게 해야함!!
		//aver = nTot/3;             이렇게 하면 몫만 남는다!!

		if(aver<60)
		strGrade = "F";

		else if(aver>=60 && aver<70)
		strGrade = "D";

		else if(aver>=70 && aver<80)
		strGrade = "C";
				 
		else if(aver>=80 && aver<90)
		strGrade = "B";

		else
		strGrade = "A";
		

		System.out.printf("\n>> 당신의 이름은 %s입니다.\n", strName);
		System.out.printf(">> 국어 점수는 %d,\n", nKor);
		System.out.printf(">> 영어 점수는 %d,\n", nEng);
		System.out.printf(">> 수학 점수는 %d,\n", nMat);
		System.out.printf(">> 총점은 %d이고, 평균은 %.2f입니다.\n", nTot, aver);   //aver은 실수다
		System.out.printf(">> 등급은 %s입니다.", strGrade);

	}
}