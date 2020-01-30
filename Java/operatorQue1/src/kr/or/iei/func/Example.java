package kr.or.iei.func;

import java.util.Scanner;

public class Example {
	Scanner sc = new Scanner(System.in);

	public void exam1() {
		
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.println("========== ��� ===========");
		System.out.println("�� ���� ���� �� : " + (num1 + num2));
		System.out.println("�� ���� �� �� : " + (num1 - num2));
		System.out.println("�� ���� ���� �� : " + (num1 * num2));
		System.out.printf("�� ���� ���� �� : %.2f\n", ((double)num1 / num2));
		
		System.out.println("=========================");
	}
	
	public void exam2() {
		int a = 40, b = 20;
		
		a += b;	//a = a + b = 40 + 20 = 60
		//a = 60, b = 20
		System.out.printf("a�� �� : %d, b�� �� : %d\n", a, b);
		
		a -= b;	//a = a - b = 60 - 20 = 40
		//a = 40, b = 20
		System.out.printf("a�� �� : %d, b�� �� : %d\n", a, b);
		
		b *= a; //b = b * a = 20 * 40 = 800
		//a = 40, b = 800 
		System.out.printf("a�� �� : %d, b�� �� : %d\n", a, b);
		
		b /= a;	//b = b / a = 800 / 40 = 20
		//a = 40, b = 20
		System.out.printf("a�� �� : %d, b�� �� : %d\n", a, b);

		System.out.println("=========================");
	}
	
	public void exam3() {
		int a = 10, b = 20, c = 30, d = 40;
		boolean result1, result2;
		
		result1 = ((a < 20 && b > 10) && (c == 20 || d == 40));
		/*result1 = ((10 < 20) && (20 > 10)) && ((30 == 20) || (40 == 40))
		= (true && true) && (false || true) = true && true = true*/
		
		result2 = ((a == 10 && b != 2 * 10) || (c == 30 && d != 40));
		/*result2 = ((10 == 10) && (20 != 20)) || ((30 == 30) && (40 != 40))
		 * = (true && false) || (true && false) = false || false = false*/
		
		System.out.printf("ù��° ����� : %b\n", result1);
		System.out.printf("�ι�° ����� : %b\n", result2);
		System.out.println("=========================");
	}
	
	public void exam4() {
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		String str = age > 19 ? "�����Դϴ�. �������" : "�̼����ڴ� ����Ұ��Դϴ�.";
		System.out.println(str);
		System.out.println("=========================");
		
	}
}
