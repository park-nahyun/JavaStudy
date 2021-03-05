/*=====================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - StringBuffer 클래스
=====================================*/


public class Test134
{
	public static void main(String[] args)
	{
		String s1 = "123456789";
		s1 = (s1 + "123").replace('2', 'A');
		System.out.println(s1);
		// 123456789
		// 123456789123
		//--==>> 1A34567891A3

		StringBuffer s2 = new StringBuffer("123456789");
		s2.delete(0, 3).replace(1, 3, "24").delete(4, 6);
		System.out.println(s2);
		// 123456789
		// 456789
		// 424789
		//--==>> 4247

		StringBuffer s3 = new StringBuffer("123456789");
		String s4 = s3.substring(3, 6);
		// 이게 돌아가면 substring이 SB 클래스에도 있군~ 하는 것
		// 123456789
		// 123456789.substring(3, 6);
		// 456

		System.out.println(s4);
		//--==>> 456


		StringBuffer s5 = new StringBuffer("123456789");
		s5.delete(0, 3).delete(1, 3).delete(2, 5).insert(1, "24");
		System.out.println(s5);
		// 123456789
		// 456789
		// 4789 --> 5까진데 에러가 왜 안나..?
		// 47
		//--==>> 4247
		// delete 과정에서는 outof 어쩌구(인덱스 벗어났다는 에러) 안뜸~!!

		
		StringBuffer s6 = new StringBuffer("123456789");
		s6.delete(3, 20);
		System.out.println(s6);
		//--==>> 123
		

	}
}