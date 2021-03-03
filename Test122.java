/*=====================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Object 클래스
=====================================*/

// ※ Test121.java 와 비교~!!!
// import java.lang.*;


public class Test122 // extends Object
{
	/*
	Object 멤버들 상속
	*/

	// Object 클래스로부터 물려받은 toString() 메소드 재정의

	
	@Override
	public String toString()
	{
		// return 클래스명@해시코드; (원래 Object가 갖고 있는 것)
		//        ------------------- String
		
		return "재정의한 toString()...";
		

	}

	
	public static void main(String[] args)
	{
		Test122 ob = new Test122();

		System.out.println("ob.toString : " + ob.toString());
		//--==>> ob.toString : Test122@15db9742

		System.out.println("ob		: " + ob);
		//--==>> ob              : Test122@15db9742

		// 메소드 재정의후
		//--==>>
		/*
		 ob.toString : 재정의한 toString()...
		 ob              : 재정의한 toString()...
		 계속하려면 아무 키나 누르십시오 . . .
		*/
	}
}