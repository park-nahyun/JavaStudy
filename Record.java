public class Record
{
	// 멤버 변수만 가지고 있는 클래스
	// 학생 1명을 표현할 수 있는 속성들로 구성

	// int kor, math, eng, sum;

	String name;						//-- 이름
	int[] score = new int[3];			//-- 국어, 영어, 수학 점수
	int tot;							//-- 총점
	double avr;							//-- 평균
	int rank;							//-- 석차
	


	/*
	// 위 변수들을 전부 private화 하고
	// setter
	void setName(String name)
	{
		this.name = name;
	}

	// getter
	String getName()
	{
		return name;
	}

	// 이렇게 하면 Recard라는 클래스를 데이터타입으로 쓸 수 있음.
	*/
}