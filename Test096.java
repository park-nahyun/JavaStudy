/*======================================================
	���� �޼ҵ� �ߺ�����(Method Overloading) ����
	- �޼ҵ� �����ε��� ������ ���¿� �Ұ����� ����
======================================================*/



public class Test096
{
	public static void main(String[] args)
	{
		print();
		print(10);

		double result = print(10.1); // �ڹٴ� ���Կ����� ���� �������� ���� ó���ϱ� ������ ȣ���� �� ������ ��
		print(10.1)
		String temp = print(2.34);2021-02-23
	}

	public static void print(){}
	public static void print(int i){}
	//public static void print(int j){}					//--(X)
	public static void print(char c){}					//-- �� �ڵ� �� ��ȯ ��Ģ check!
	public static void print(int i, int j){}
	public static void print(int i, double d){}			//-- �� �ڵ� �� ��ȯ ��Ģ check!
	public static void print(double d, int k){}			//-- �� �ڵ� �� ��ȯ ��Ģ check!
	public static double print(double d){return 3.14};	//-- �� �ڵ� �� ��ȯ ��Ģ check!
	public static void print(double d){}				//-- (X)
	public static String print(double d){}				//-- (X)

}