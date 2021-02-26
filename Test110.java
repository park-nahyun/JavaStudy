/*=====================================
  ■■■ 클래스 고급 ■■■
  - 추상 클래스(Abstract)
=====================================*/
// 미완성된 클래스 따라서 온전히 객체 생성 못해..
// 내가 만든 차를 이걸 상속받은 내 새끼가 맘에 안들어해서 다 뜯어 고친다면..
// 내 노고는 어떻게 보상받나..
// 그래서 완벽한 설계도를 준 게 아니라 종이 한 장 주면서.. '니 맘대로 해..'하는 것..

// 정렬을 물려줬는데 누구는 선택 쓰고 누구는 버블 쓰고 이러면..
// 그냥 내가 정렬 만들어서 주지 않을게..^^ 니가 알아서 골라 써..

// 미완성?
/*
↓ 이 키워드로 표시해줘야 함
abstract class Test110	// 추상 메소드가 하나라도 있으면 추상 클래스
{
	public void input(int n);  // 추상 메소드

	원래는 ; 없고 {}로 정의해야하는데 여기선 그냥
	이런게 있어~!하고 끝내는 것. 
}
*/

/*
○ 추상 클래스(abstract)는
   선언만 있고 정의{}가 없는 하나 이상의 메소드(추상 메소드)를 갖는 클래스로
   하위 클래스에서 오버라이딩(Overriding)할 것으로 예상되는 메소드에 대해
   메모리 낭비 없이 미리 호출 계획을 세워두기 위해 만든다.

○ 형식 및 구조
   [접근제어지시자] abstract class 클래스명
   {
	   [접근제어지시자] abstract 자료형 메소드명([매개변수], ...);
   }

○ 특징 
   클래스가 적어도 하나 이상의 추상 메소드를 포함할 때
   그 클래스는 클래스 이름 앞에 『abstract』 키워드를 붙여
   추상 클래스로 명시해야 하며,
   추상 클래스로 명시해서 선언한 경우에는
   불완전한 형태의 클래스이므로 객체를 생성할 수 없다.
   추상 메소드가 존재하지 않는 이상 추상 클래스마저도
   객체를 생성할 수 없는 것이다.

   즉, 추상 클래스는 독립적으로 존재할 수 없기 때문에
   상속을 위해서만 존재하며,
   추상 클래스에서 상속받은 하위 클래스에서는
   반드시 추상 메소드를 오버라이딩(Overriding)해야 한다.

   // 부모가 abstract이면 이를 물려받은 자식 클래스도 abstract
   // 오버라이딩 해야 추상의 고리를 끊을 수 있음..
 
※ 『abstract』 키워드는
	클래스와 메소드에서만 사용할 수 있으며
	멤버 변수나 로컬 변수에서는 사용 불가능하다.

	// 실제로 추상 메소드가 전혀 존재하지 않고 모두 정의되었더라도
	// 클래스 앞에 abstract가 있으면 인스턴스 생성 불가
*/

abstract class SortInt
{
	private int[] value; // 배열이 하나 있다.
 
	protected void sort(int[] value) // 이 메소드를 통해서 결과를 내겠다
	{
		this.value = value;
		sorting();
	}

	// 추상 메소드(abstract)
	protected abstract void sorting();	// 어떤 정렬 알고리즘을 쓸 지 모르는 상황

	protected int dataLength()
	{
		return value.length;
	}

	// compare() 메소드는 크기 비교 메소드
	// 『final』 키워드로 인해 이 클래스(SortInt)를 상속받는 클래스에서
	// 이 메소드를 재정의할 수 없다.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;

		else if (x>y)
			return 1;
		else
			return -1;
	}

	// swap() 메소드는 자리 바꿈 메소드
	// 『final』 키워드로 인해 이 클래스(SortInt)를 상속받는 클래스에서
	// 적어도 이 메소드만큼은 Overriding해서 사용하지 말아라~!!!
	// 라는 의미 전달

	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
}


// SortInt(추상클래스)를 상속받은 클래스 → 추상클래스 → 추상메소드재정의(오버라이딩) → 일반정상클래스
// public class Test110 extends SortInt
public class Test110 extends SortInt
{

	/* 상속 받은 것
 
	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}


	protected abstract void sorting();	

	protected int dataLength()
	{
		return value.length;
	}


	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;

		else if (x>y)
			return 1;
		else
			return -1;
	}

	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}

	*/
	
	int i, j; // 루프 활용
	static int[] data = {7, 10, 3, 8, 7};
	
	//------------------------------------
	// 빈칸 채워넣기~!!!
	
	@Override

	// protected abstract void sorting()

	protected void sorting() // 메 소 드 활 용 해 !!!!!!!!!!!!!!!!!!
	{
		// Selection Sort
		for (i=0;i<dataLength()-1 ;i++ )
		{
			for (j=i+1;j<dataLength();j++)
			{
				if (compare(i,j) > 0)	// 크기 비교(정렬 기준)
					swap(i,j);			// 자리 바꿈
			}

			// 추가
			System.out.print((i+1) + "Round Data : ");
			for (int n : data)
				System.out.print(n + " ");
			System.out.println();
		}
	}




	/* 
	@Override
	protected void sorting()
	{
		int pass=0;		
		boolean flag;	

		do
		{
			pass++;
			flag = false; 

			for (int i=0;i<data.length-pass;i++ )	 //dataLength() 메소드 활용해^^;;;
			{		
				
				if (data[i] > data[i+1])
				{
					// 자리 바꾸기
					data[i] = data[i]^data[i+1];
					data[i+1] = data[i+1]^data[i];
					data[i] = data[i]^data[i+1];    

					flag = true;	
				}
			}

		}
		while (flag);
	}

	*/
	//------------------------------------

	public static void main(String[] args)
	{

		System.out.print("Source Data : ");
		for (int n : data)
			System.out.print(n + " ");
		System.out.println();

		Test110 ob = new Test110();
		ob.sort(data);

		System.out.print("Sorted Data : ");
		for (int n : data)
			System.out.print(n + " ");
		System.out.println();
	
	}
	
}
