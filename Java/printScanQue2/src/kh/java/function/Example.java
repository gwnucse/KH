package kh.java.function;

import java.util.Scanner;

public class Example {
	
	Scanner sc = new Scanner(System.in);

	public void exam1() {
		
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.println("========== ��� ==========");
		
		System.out.println("���ϱ� ��� : " + (num1 + num2));
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		System.out.println("������ �� : " + (num1 / num2));
		System.out.println("������ ������ : " + (num1 % num2));
		System.out.println();
	}
	
	public void exam2() {
		
		System.out.print("���� ���� �Է� : ");
		double width = sc.nextDouble();
		
		System.out.print("���� ���� �Է� : ");
		double height = sc.nextDouble();
		
		System.out.println("========== ��� ==========");
		
		System.out.println("���� : " + (width * height));
		System.out.println("�ѷ� : " + (2 * (width + height)));
		System.out.println();
	}
	
	public void exam3() {

		sc.nextLine();
		System.out.print("����ܾ� �Է� : ");
		String str = sc.nextLine();
		
		System.out.println("ù��° ���� : " + str.charAt(0));
		System.out.println("�ι�° ���� : " + str.charAt(1));
		System.out.println("����° ���� : " + str.charAt(2));
	}
}
