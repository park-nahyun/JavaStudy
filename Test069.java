/*=====================================
  ■■■ 지역변수와 전역변수 ■■■
  - 전역 변수의 초기화 테스트
=====================================*/

// Test068.java 와 비교~!!!


public class Test069
{
	// 전역 변수 선언
	int a;
	//-- 전역 변수는 사용하는 과정에서 초기화를 수행하지 않았을 경우
	//   자동으로 0으로 초기화 지원
	
	boolean b;

	char c;
	
	double d;

	public static void main(String[] args)
	{	
		// Test069 인스턴스 생성
		Test069 ob = new Test069(); // 클래스는 설계도기 때문에  뭘 못함.. 메모리를 할당 받기 위해 인스턴스 생성. 변수를 선언해서 참조할 수 있도록..

		System.out.println("ob.a : " + ob.a);  // ob가 갖고 있는 a에 접근하겠다는 뜻
		
		System.out.println("ob.b : " + ob.b); 

		System.out.println("ob.c : " + ob.c); 

		System.out.println("ob.d : " + ob.d); 
	}
}

/* 실행 결과
ob.a : 0
ob.b : false
ob.c :
ob.d : 0.0
계속하려면 아무 키나 누르십시오 . . .
*/