/*=====================================
	���� Ŭ������ �ν��Ͻ� ����
	- Ŭ������ �ν��Ͻ� Ȱ��
=====================================*/

// �� �ǽ� ����
// 1 ~ 3 ������ ���� ������ ������ �߻�����
// ����, ����, �� ���� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ������ �� 1:����, 2:����, 3:��

// ���� ��)
// 1:����, 2:����, 3:�� �� �Է�(1~3) : 4
// 1:����, 2:����, 3:�� �� �Է�(1~3) : -10
// 1:����, 2:����, 3:�� �� �Է�(1~3) : 2
// - ���� : ����
// - ��ǻ�� : ��
// >> �º�������� : ��ǻ�Ͱ� �̰���ϴ�~!!!
// ����Ϸ��� �ƹ� Ű��...

import java.util.Random;
import java.util.Scanner;

class RpsGame
{
	// ���� Ǯ���� ����
	/*
	int user;
	int com;
	String[] g = {"����" , "����", "��"};


	void start()
	{
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		com = rd.nextInt(3)+1;

		do
		{
			System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);

		System.out.printf("-����   : %s\n", g[user-1]);
		System.out.printf("-��ǻ�� : %s\n", g[com-1]);

		System.out.print(">> �º�������� : ");

		if (user == com)
			System.out.println("�����ϴ�.");
		else if(user-1 == com)
			System.out.println("������ �̰���ϴ�.");
		else if(user==1 && com==3)
			System.out.println("������ �̰���ϴ�.");
		else 
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
	
	}
	*/
	
	// �Բ� Ǯ���� ����
	int user;
	int com;

	private void runCom() // �������� com�� �����ϴ� �޼ҵ�
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;		// 0 1 2 �� 1 2 3
	}
	
	public void input() // ����� �Է� �޴� �޼ҵ�
	{
		runCom(); // ����� �� �Է¹ޱ� ���� com�� ������ �̸� ����

		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	}

	public void middleCalc() // �Է� ���� �迭 ���·� �ٲ��ִ� �޼ҵ�
	{
		String[] str = {"����", "����", "��"};

		System.out.println("- ����   : " + str[user-1]);
		System.out.println("- ��ǻ�� : " + str[com-1]);
	}

	public String resultCalc() // ���� ��� ��� �޼ҵ� 
	{
		String result ="���º�";

		if((user==1&&com==3) || (user==2&&com==1) || (user==3&&com==2))
			result = "������ �̰���ϴ�";

		if((user==1&&com==2) || (user==2&&com==3) || (user==3&&com==1))
			result = "��ǻ�Ͱ� �̰���ϴ�.";

		return result;
	}

	public void print(String result) // ��� �޼ҵ�
	{
		System.out.println(">> �º�������� : " + result); 
	}



}

public class Test095
{
	public static void main(String[] args)
	{
		// ���� Ǯ���� ����
		/*
		RpsGame rps = new RpsGame();

		rps.start();
		*/

		// �Բ� Ǯ���� ����
		RpsGame ob = new RpsGame();
		
		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);
	}
}

/* [���� ���]
1:����, 2:����, 3:�� �� �Է�(1~3) : 1
-����   : ����
-��ǻ�� : ����
>> �º�������� : �����ϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
1:����, 2:����, 3:�� �� �Է�(1~3) : 2
-����   : ����
-��ǻ�� : ��
>> �º�������� : ��ǻ�Ͱ� �̰���ϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


/*
1:����, 2:����, 3:�� �� �Է�(1~3) : 2
-����   : ����
-��ǻ�� : ����
>> �º�������� : ������ �̰���ϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/




// ��� ����� �� 
/*
if(user==1)
{
	if(com==1)
		System.out.println("�����ϴ�.");
	else if(com==2)
		System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
	else if(com==3)
		System.out.println("������ �̰���ϴ�.");
}
else if(user==2)
{
	if(com==1)
		System.out.println("������ �̰���ϴ�.");
	else if(com==2)
		System.out.println("�����ϴ�.");
	else if(com==3)
		System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
}
else if (user==3){
	if(com==1)
		System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
	else if(com==2)
		System.out.println("������ �̰���ϴ�.");
	else if(com==3)
		System.out.println("�����ϴ�.");
}
*/