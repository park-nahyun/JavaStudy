/*=====================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 실수형 데이터타입 정밀도 테스트
=====================================*/
public class Test021
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		float a = 0;
		double b = 0;

		// 연산 및 처리  --> 지금은 그냥 관찰
		for (int i=1; i<=100000; i++)  // 반복 연산(10만 번)
		{
			a += 100000;   //a를 10만만큼 증가시켜라
			b += 100000;   //b를 10만만큼 증가시켜라
		}
		// 결과 출력
		System.out.println("float : " + (a/100000));
		System.out.println("double : " + (b/100000));

		// float : 99996.055    눈꼽만큼의 오차도 반복되면 더 커진다. 오차가 생긴다. 
		// double : 100000.0
	}
}