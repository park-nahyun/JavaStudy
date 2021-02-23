/*=====================================
	■■■ 배열(Array) ■■■
	- 배열의 복사
=====================================*/

// Test098.java 와 비교

// ※ 배열 변수의 복사는 데이터 복사, 주소값 복사 두 가지 형태가 존재한다.

//    주소값 복사 → 얕은 복사 → 원본을 수정하면 복사본에 영향을 미치게 되는 복사 방법.
//								  (배열 뿐 아니라 모든 참조형 데이터에 해당하는 복사)
//    데이터 복사 → 깊은 복사 → 실제 요소로 들어있는 값에 대한 복사로
//								  원본을 수정해도 복사본에 영향을 미치지 않는 복사 방법.

// 주소값 복사

public class Test097
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};			//-- 배열 원본
		int[] copies;								//-- 복사본으로 만들 배열

		int temp;									//-- 실습 진행(테스트)을 위한 임시 변수

		// check!
		copies = nums;								//-- 복사 (주소값을 넘겨주게됨)

		temp = nums[0];								//-- 배열의 특정 값을 넣어줌 

		nums[0] = 1500;

		for (int i=0; i<copies.length; i++)
		{
			System.out.printf("%d\t", copies[i]); 
		}
		System.out.println();
		//--==>> 1500    20      30      40      50

		System.out.println("temp : " + temp);
		//--==>> temp : 10
	}
}