/*=====================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Random 클래스
=====================================*/
/*
○ java.util.Random 클래스는

   여러 형태의 난수를 발생시켜 제공하는 클래스이다.
   Math 클래스의 정적 메소드인 random() 메소드도 난수를 제공하는 메소드이지만
   0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
   필요한 여러 형태의 난수를 만들어내기 위해서는 추가적인 연산들을 수행해야 한다.
   그래서 자바는 여러 형태의 난수를 발생시켜주는 
   전용 클래스 Random 클래스를 별도로 제공하고 있다.
*/

// 로또 번호 생성기(난수 발생 프로그램)

// 프로그램이 실행되면 기본적으로 로또를 5개임 수행하는 프로그램을 구현한다.

// 실행 예)
// 1 3 4 17 23 44
// 1 2 8 16 21 42
//		:
// 계속하려면 아무 키나...

import java.util.Random;
import java.util.Arrays;

class Lotto
{
	// 배열 변수 선언 및 할당 → 로또 번호를 담아둘 배열방 6개
	private int[] num = new int[6];		// 사용자가 이 방에 로또 번호를 넣을수도 가져다 쓰지도 못하는 상황

	// getter
	public int[] getNum()
	{
		return num;		// num은 못쓰지만 getNum을 이용하면 쓸 수 있다는 것~!
	}

	// 6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		int cnt = 0;
		Random rd = new Random();
		int n;

		jump:				// 여기로 와도 cnt가 초기화 되진 않음
		while (cnt<6)		// cnt → 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;	// 1 ~ 45	→ // 27 3 14 <-- 그냥 들어가는게 아니라 앞의 것들과 비교했을 때 중복되지 않으면 넣게 해야함
			for (int  i=0; i<cnt; i++)
			{
				// 확인(테스트)
				// System.out.println("i : " + i + ", cnt : " + cnt);

				if(num[i] == n)
					continue jump;
				// 되도록 쓰지 말라고 했던.. continue lable
			}
			
			num[cnt++] = n;		// num[0] 27  num[1] 3  ...  num[5] 30

			
		}

		// 정렬 메소드 호출
		sorting();
	}// end start()

	// 정렬 메소드 정의
	private void sorting()
	{
		Arrays.sort(num);
	}

	/*
	Random rd = new Random();
	int[] num = new int[6];
	void number()
	{
		for (int i=0;i<num.length;i++)
		{
			 num[i] = rd.nextInt(45)+1;

			// 중복 제거
			 for (int j=0;j<i;j++)
			 {
				 if (num[j] == num[i])
					i--;				
			 }


			 // 처음 내가 했던 것
			 for (int j=0;j<i;j++)
			 {
				 if (num[j] == num[i])
					num[i] = rd.nextInt(45)+1;
			 }
			 -->> 만약에 또 똑같은 게 나온다면? 처리 못하고 넘어감 
			 


			 // 오름차순
			 for (int j=0;j<num.length;j++)
			 {
				 if (num[i] < num[j])
				 {
					 num[i] = num[i]^num[j];
					 num[j] = num[j]^num[i];
					 num[i] = num[i]^num[j];
				 }
			 }

		
		}	

	
	}

    void print()
	{
		for (int i=0;i<num.length ;i++ )
			System.out.print(num[i] + " ");
		
	}
	*/
}
public class Test141
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();
	
		// 결과 출력
		

		for (int i=1;i<=5;i++)
		{
			// 확인(테스트)
			lotto.start();

			for (int n : lotto.getNum())
				System.out.printf("%4d", n);

			/*
			lotto.number();
			lotto.print();
			System.out.println();
			*/
			System.out.println();
		}
	
	}
}

/*
   3  13  15  26  29  33
   7  22  38  39  40  45
   6   8  16  26  29  41
  17  19  25  29  33  40
   5   7  11  18  20  32
*/