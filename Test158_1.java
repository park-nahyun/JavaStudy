/*=================================
  ■■■ 컬렉션(Collection) ■■■ 
===================================*/

// ○ 실습 문제
//    현재 작성중인 Test158 클래스를 완성하여
//    다음 기능을 가진 프로그램을 구현한다.

/* 
실행 예)

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6):

	1번째 요소 입력 : 이유림
	1번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N) : y

	2번째 요소 입력 : 한혜림
	2번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N) : n

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6): 2

	[벡터 전체 출력]
	    이유림
		한혜림
	벡터 전체 출력 완료~!!!

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6): 3

	검색할 요소 입력 : 이유림

	[검색 결과 출력]
	항목이 존재합니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6): 4

	삭제할 요소 입력 : 이희주

	[삭제 결과 출력]
	항목이 존재하지 않아 삭제할 수 없습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6): 5

	변경할 대상 입력 : 한혜림
	수정할 내용 입력 : 두혜림

	[변경 결과 출력]
	변경이 완료되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6): 6
	계속하려면 아무 키나...
*/


import java.util.Scanner;
import java.util.Vector;

class Gigye
{
	Scanner sc = new Scanner(System.in);
		
	// 주요 변수
	int n; // 사용자가 선택한 번호

	// 벡터 자료구조 인스턴스 생성
	Vector<String> v = new Vector<String>();

	// 사용자 안내문
	void menu()
	{
		do
		{
			System.out.println("[메뉴 선택]");
			System.out.println("1. 요소 추가");
			System.out.println("2. 요소 출력");
			System.out.println("3. 요소 검색");
			System.out.println("4. 요소 삭제");
			System.out.println("5. 요소 변경");
			System.out.println("6. 종료");
			System.out.print(">> 메뉴 선택(1~6): ");
			n = sc.nextInt();
		}
		while (n<1 || n>6);

		
		switch (n)
		{
			case 1:
				add();
			case 2:
				print();
			case 3:
				search();
			case 4:
				delete();
			case 5:
				change();
			case 6: 
				break;
		}
	}

	void add()
	{
		int i=1;
		String yoso;
		char answer;
		do
		{
			System.out.print(i+"번째 요소 입력 : ");
			yoso = sc.next();
			v.add(yoso);
			System.out.println(i+"번째 요소 입력 성공");
			System.out.print("요소 입력 계속(Y/N) : ");
			answer = sc.next().charAt(0);
			i++;
		}
		while (answer == 'y' || answer == 'Y');
		menu();
	}

	void print()
	{
		System.out.println("[벡터 전체 출력]");
		for (String str : v)
			System.out.println(str);
		System.out.println("벡터 전체 출력 완료");
		menu();
	}

	void search()
	{
		String s;
		System.out.print("검색할 요소 입력 : ");
	    s = sc.next();
		int sw = v.indexOf(s);
		if (sw>=0)
		{
			System.out.println("[검색 결과 출력]");
			System.out.println("인덱스 번호 : " + sw);
			System.out.println("항목이 존재합니다");
			menu();
		}
		else
			System.out.println("항목이 존재하지 않습니다.");
		menu();
		
	}

	void delete()
	{
	}

	void change()
	{
	}
		
}

public class Test158_1
{
	public static void main(String[] args)
	{
		Gigye gg = new Gigye();
		gg.menu();
	}
}

// 클래스 생성부터~!
// 메소드 적극 활용할 것~!!!!