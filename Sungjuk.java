import java.util.Scanner;

class Sungjuk
{
	Scanner sc = new Scanner(System.in);

	// 인원 수 입력
	void num()
	{
		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			n = sc.nextInt();
		}
		while (n<1 || n>100);
	}

	// 상세 데이터 입력

	void data()
	{

		for (i=0;i<3;i++ )
		{
			Record ob1 = new Record();
			// 어떤 특정한 학생들의 '값'으로 생성된 것이 아님..
			ob1.name = sc.next();
			ob1.score[0] = sc.nextInt();
			ob1.score[1] = sc.nextInt();
			ob1.score[2] = sc.nextInt();
			ob1.score[3] = sc.nextInt();
		}
				
		ob1.tot = ob1.score[1]+ob1.score[2]+ob1.score[3];
		ob1.avg = ob1.tot/3.0;

		Record[] objArr = new Record[10]


		objArr[0] = ob1;

		System.out.println(objArr[0], score[1]);  --> 영어 점수 
			System.out.printf("%d번째 학생의 이름 입력 : ", n);
			name = sc.next();

			System.out.print("국어 점수 : ");
			kor = sc.nextInt();

			System.out.print("영어 점수 : ");
			eng = sc.nextInt();

			System.out.print("수학 점수 : ");
			math = sc.nextInt();
		}
	}
	
	// 총점, 평균
	void result()
	{
		int result;
		sum = kor + eng + math;
		avr = sum/3.0;
	}

	// 출력
	void print()
	{
		
	}



	
}