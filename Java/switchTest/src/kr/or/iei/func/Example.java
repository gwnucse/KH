package kr.or.iei.func;

import java.util.Scanner;

public class Example {

	Scanner sc = new Scanner(System.in);

	public void test1() {
		System.out.print("1~3������ �� �Է� : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("1�� �Է�");
			break;
		case 2:
			System.out.println("2�� �Է�");
			break;
		case 3:
			System.out.println("3�� �Է�");
			break;
		default:
			System.out.println("�߸� �Է�");
		}
	}
}
