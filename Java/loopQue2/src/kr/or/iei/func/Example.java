package kr.or.iei.func;

import java.util.Scanner;

public class Example {

	Scanner sc = new Scanner(System.in);
	
	public void exam1() {
		
		int i = 0;
		
		while(i < 5) {
			System.out.println("�ȳ��ϼ���");
			i++;
		}
		
		System.out.println();
	}
	
	public void exam2() {
		
		System.out.print("��� ����Ͻðڽ��ϱ�? ");
		int count = sc.nextInt();
		
		int i = 0;
		
		while(i < count) {
			System.out.println("�ȳ��ϼ���");
			i++;
		}
		
		System.out.println();
	}
	
	public void exam3() {
		
		System.out.println("2�� �Դϴ�.");
		
		int i = 1;
		
		while(i <= 9) {
			System.out.println("2 * " + i + " = " + (2 * i));
			i++;
		}
		
		System.out.println();
	}
	
	public void exam4() {
		
		System.out.print("����� ����Ͻðڽ��ϱ�? ");
		int goo = sc.nextInt();
		
		System.out.println(goo + "�� �Դϴ�.");
		int i = 1;
		
		while(i <= 9) {
			System.out.println(goo + " * " + i + " = " + (goo * i));
			i++;
		}
		
		System.out.println();
	}
	
	public void exam5() {
		int sum = 0;
		int i = 0;
		
		while (i < 5) {
			System.out.print("���� ���� �Է��Ͻÿ� : ");
			sum += sc.nextInt();
			i++;
		}
		
		System.out.println("�Է��� 5�� ������ �� : " + sum);
		
		System.out.println();
	}
	
	public void exam6() {
		
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		int i;
		
		if (num1 > num2) {
			i = num2;
			while (i <= num1) {
				sum += i;
				i++;
			}
			System.out.println(num2 + " ~ " + num1 + "�� ������ �� : " + sum);
		} else {
			i = num1;
			while (i <= num2) {
				sum += i;
				i++;
			}
			System.out.println(num1 + " ~ " + num2 + "�� ������ �� : " + sum);
		}
		
		System.out.println();
	}
	
	public void exam7() {
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		
		while(i <= num) {
			if (i % 2 == 0)
				sum += i;
			i++;
		}
		
		System.out.print("¦������ ���� : " + sum);
		System.out.println();
	}
}
