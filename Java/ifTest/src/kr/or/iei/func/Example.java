package kr.or.iei.func;

import java.util.Scanner;

public class Example {

	Scanner sc = new Scanner(System.in);
	
	public void exam1() {
		
		System.out.println("========= ���� ���α׷� =========");

		System.out.print("�����ڸ� �Է��ϼ���(+, -, *, /) : ");
		char oper = sc.next().charAt(0);
		
		System.out.print("ù��° ������ �Է� �ϼ���. : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ������ �Է� �ϼ���. : ");
		int num2 = sc.nextInt();
		
		if (oper =='+') {
			System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
		}
		if (oper =='-') {
			System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
		}
		if (oper =='*') {
			System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
		}
		if (oper =='/') {
			System.out.printf("%d / %d = %f\n", num1, num2, ((double)num1 / num2));
		}
	}
	
	public void exam2() {
		
		System.out.println("======== ���� ���� ���α׷� ========");
		
		System.out.print("������ ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.printf("����� �Է��� �� %d��(��) ����Դϴ�.\n", num);
		}
		if (num == 0) {
			System.out.printf("����� �Է��� �� %d��(��) 0�Դϴ�.\n", num);
		}
		if (num < 0) {
			System.out.printf("����� �Է��� �� %d��(��) �����Դϴ�.\n", num);
		}
	}
	
	public void exam3() {
		
		System.out.println("========= �μ� �� ���α׷� ========");
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.printf("%d > %d\n", num1, num2);
			System.out.println("ù��° ���� �� Ů�ϴ�");
		}
		if (num1 == num2) {
			System.out.printf("%d = %d\n", num1, num2);
			System.out.println("�� ���� �����ϴ�");
		}
		if (num1 < num2) {
			System.out.printf("%d < %d\n", num1, num2);
			System.out.println("�ι�° ���� �� Ů�ϴ�");
		}
	}
}
