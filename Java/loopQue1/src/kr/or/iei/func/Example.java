package kr.or.iei.func;

import java.util.Scanner;

public class Example {
	
	Scanner sc = new Scanner(System.in);

	public void exam1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("�ȳ��ϼ���");
		}
		
		System.out.println();
	}
	
	public void exam2() {
		System.out.print("��� ����Ͻðڽ��ϱ�? ");
		int count = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.println("�ȳ��ϼ���");
		}
		
		System.out.println();
	}
	
	public void exam3() {
		System.out.println("2�� �Դϴ�.");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + (2 * i));
		}
		
		System.out.println();
	}
	
	public void exam4() {
		System.out.print("����� ����Ͻðڽ��ϱ�? ");
		
		int goo = sc.nextInt();
		System.out.println(goo + "�� �Դϴ�.");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(goo + " * " + i + " = " + (goo * i));
		}
		
		System.out.println();
	}
	
	public void exam5() {
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("���� ���� �Է��Ͻÿ� : ");
			sum += sc.nextInt();
		}
		System.out.println("�Է��� 5�� ������ �� : " + sum);
		
		System.out.println();
	}
	
	public void exam6() {
		int sum = 0;
		
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				sum += i;
			}
			
			System.out.println(num2 + " ~ " + num1 + "�� ������ �� : " + sum);
		} else {
			for (int i = num1; i <= num2; i++) {
				sum += i;
			}
			
			System.out.println(num1 + " ~ " + num2 + "�� ������ �� : " + sum);	
		}
		
		
		System.out.println();
	}
	
	public void exam7() {
		int sum = 0;
		
		System.out.print("����  �Է� : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) 
				sum += i;
		}
		
		System.out.println("¦������ ���� : " + sum);
		
		System.out.println();
	}
}
