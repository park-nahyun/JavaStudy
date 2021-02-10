/*=====================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - switch문 실습
=====================================*/

/*
○ 다중 선택문이라 하며, switch문 수식 값에 따라
   실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.

○ 형식 및 구조
   switch(수식)
   {
	   case 상수1 : 문장1; [break;]       생략이 가능한 구문을 []에 넣은 것
	   case 상수2 : 문장2; [break;]
	   			.
				.
		[default : 문장n+1;] [break]
	}

	switch 문의 『수식』과 case의 『상수』는
	byte, short, int, long 형이어야 한다.

	case 문 뒤에 『break;』 구문이 없는 형태인 경우
	다음의 case 문의 문장을 계속해서 수행하게 된다.(기본 모델)

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
	
public class Test040
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름 입력 : ");
		String name = br.readLine();

		System.out.print("국어 점수 : ");
		int kor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 : ");
		int eng = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 : ");
		int mat = Integer.parseInt(br.readLine());

		int tot = kor + eng + mat;
		// double avg  지금은 편의상 int
		int avg = tot / 3;
		
		char grade;

		/*
		if(avg>=90)
		{			
		}
		else if(avg>=)
		{
		}
		switch문에서는 참/거짓으로 분기되는 것이 아니기 때문에 사용 불가.
		*/

		/*
		switch (avg)
		{
			case 100: case 99: case 98: ... grade = 'A' ;  break;
			case 89: case 88: case 87: ... grade = 'B' ;  break;
				.
				.
			case 0: ...; break;
		}
		*/
		
		/*
		switch (avg/10)
		{
			case 10: grade = 'A'; break;
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			case 5: grade = 'F'; break;
			case 4: grade = 'F'; break;
					.
					.
			case 0: grade = 'F'; break;		


			avg가 정수니까.. /10하면 대충 앞자리만 나오잖아?
			그래서 그걸 가지고 case 나누는 듯...
			95점이면 9.5가 되고 출력은 9.. 그럼 case9 이런식으로..
			90점대, 80점대, 70점대.. 
		}
		*/

		switch (avg/10)
		{
			case 10: grade = 'A'; break;
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default : grade = 'F'; break;  // 여기서 break는 어차피 빠져나가기 때문에 없어도 됨
			//default가 반드시 있어야 하는 건 아님.
			// 다만 여기서는 꼭 필요할 뿐!! if else  생각해봐
			// grade 선언만하고 초기화를 안했기 때문에 default 없으면 에러
			// 만약 기본값이 F로 설정돼있으면 에러 안나겠지?
		}

		System.out.println("grade" + grade);
	}
}

/*
이름 입력 : 박수수
국어 점수 : 89
영어 점수 : 79
수학 점수 : 59
gradeC
계속하려면 아무 키나 누르십시오 . . .
*/