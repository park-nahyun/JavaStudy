/*=====================================
  ■■■ 메소드 재귀호출(재귀 메소드) ■■■
=====================================*/

// void 자리..  반환 자료형, return 자료형(자료형 따라 int, double 등으로 쓰면 됨)
// void는 그럼? 아무것도 반환하지 않을 때 쓰는 자료형


public class Test067
{

	public static void main(String[] args)
	{
		showHi(5);
		System.out.println("메인메소드 실행");
	}

	public static void showHi(int cnt)
	{			
		System.out.println("Hi~~~!!!");
		
		if(cnt==1)
			return;	

		System.out.println("--cnt 전 cnt : " + cnt);
		
		showHi(--cnt);
		
		System.out.println("--cnt 후 cnt:" + cnt);
		
	}
}


	// showHi에 3을 담으면 Hi 3번 나오게 하려는 것...



/*
public class Test067
{

	public static void main(String[] args)
	{
		showHi(5);
	}

	public static void showHi(int cnt) // 5
	{			
		System.out.println("Hi~~~!!!"); // 일단 한 번 출력
		showHi(--cnt);  // showHi(5) 그대로 호출임 왜? c--는 다음처리에서 +이니까
		//     cnt-- 를 --cnt로 수정해야  // 수정하고 showHi(1) 되도 이 아래로 수행을 안함.. 왜?
		if(cnt==1)
			return;		
		// 왜 if를 안봐? 다른 메소드를 호출하면 제어권이 호출한 메소드에게 넘어가니까
		// 마지막 if문 확인할 틈이 없이 showHi(1) --> showHi(0) --> showHi(-1).. int가 소화할 수 있는데까지 갈 것.
	}
}
*/

/*
 * 실행 결과
 * 
Hi~~~!!!
--cnt 전 cnt : 5
Hi~~~!!!
--cnt 전 cnt : 4
Hi~~~!!!
--cnt 전 cnt : 3
Hi~~~!!!
--cnt 전 cnt : 2
Hi~~~!!!
--cnt 후 cnt:1
--cnt 후 cnt:2
--cnt 후 cnt:3
--cnt 후 cnt:4
메인메소드 실행

 * */
 