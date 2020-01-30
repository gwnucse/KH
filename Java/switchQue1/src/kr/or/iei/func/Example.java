package kr.or.iei.func;

import java.util.Scanner;

public class Example {

	Scanner sc = new Scanner(System.in);

	public void exam1() {

		System.out.print("�ϼ��� �˰���� ���� �Է��ϼ��� : ");
		int month = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("12������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println("2������ 28�ϱ��� �ֽ��ϴ�.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("11������ 30�ϱ��� �ֽ��ϴ�.");
			break;
		}

		System.out.println();
	}

	public void exam2() {
		System.out.println("���б� ���� �ý����Դϴ�");
		System.out.print("������ �Է��ϼ���(A, B, C, D, F) : ");
		char ch = sc.next().charAt(0);

		switch (ch) {
		case 'A':
			System.out.println("�����ϼ̽��ϴ�. ���б��� 100% �����ص帮�ڽ��ϴ�.");
			break;
		case 'B':
			System.out.println("�����ϼ̽��ϴ�. ���б��� 50% �����ص帮�ڽ��ϴ�.");
			break;
		case 'C':
			System.out.println("���б��� �ٶ�ø� �� �� ������ ���ּ���.");
			break;
		case 'D':
			System.out.println("ũ��.......");
			break;
		case 'F':
			System.out.println("�л����Դϴ�!!!!");
			break;
		}

		System.out.println();
	}

	public void exam3() {
		System.out.println("========= ���� ���α׷� =========");

		System.out.print("�����ڸ� �Է��ϼ���(+, -, *, /) : ");
		char oper = sc.next().charAt(0);

		System.out.print("ù��° ������ �Է� �ϼ��� : ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ������ �Է� �ϼ��� : ");
		int num2 = sc.nextInt();

		switch (oper) {
		case '+':
			System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
			break;
		case '-':
			System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
			break;
		case '*':
			System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
			break;
		case '/':
			System.out.printf("%d / %d = %f\n", num1, num2, ((double) num1 / num2));
			break;
		}

		System.out.println();
	}

	public void exam4() {

		System.out.print("�����Է� : ");
		int score = sc.nextInt();

		if (score < 0 || score > 100) {
			System.out.println("�߸��� �Է�(0~100 ���� �Է�)");
		} else {
			int grade = score / 10;
			switch (grade) {
			case 10:
			case 9:
				System.out.println(score + "�� ==> A ���");
				break;
			case 8:
				System.out.println(score + "�� ==> B ���");
				break;
			case 7:
				System.out.println(score + "�� ==> C ���");
				break;
			case 6:
				System.out.println(score + "�� ==> D ���");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println(score + "�� ==> F ���");
				break;
			}
		}
		System.out.println();

	}
}
