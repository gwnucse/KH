package kr.or.iei.func;

import java.util.Scanner;

public class Example {

	Scanner sc = new Scanner(System.in);

	public void exam1() {

		System.out.print("�Է°� : ");
		String str = sc.next();
		int count = 0;

		char strArray[] = new char[str.length()];

		// ���ڿ��� �迭�� ����
		for (int i = 0; i < str.length(); i++) {
			strArray[i] = str.charAt(i);
		}

		System.out.print("�˻��� : ");
		char search = sc.next().charAt(0);

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == search) {
				count++;
			}
		}

		System.out.println("��� : �Է��Ͻ� ���ڿ� " + str + "���� ã���ô� ���� " + search + "��(��) " + count + "�� �Դϴ�.");

		System.out.println("==========");
	}

	public void exam2() {

		char phone1[] = new char[13];
		char phone2[] = new char[13];

		System.out.print("��ȭ��ȣ('-'�� �����Ͽ� �Է��ϼ���.) : ");
		String phone = sc.next();

		// ���ڿ��� �迭�� ����
		for (int i = 0; i < phone1.length; i++) {
			phone1[i] = phone.charAt(i);
		}

		// �迭1�� �ٽ� �迭2�� �����ϸ鼭 ��� 4�ڸ� ��, 4, 5, 6, 7�� �ڸ��� *�� ����
		System.arraycopy(phone1, 0, phone2, 0, 4);

		for (int i = 4; i < 8; i++) {
			phone2[i] = '*';
		}

		System.arraycopy(phone1, 8, phone2, 8, 5);

		for (int i = 0; i < phone2.length; i++) {
			System.out.print(phone2[i]);
		}

		System.out.println();
		System.out.println("==========");
	}

	public void exam3() {

		String residentNumber;

		System.out.print("�ֹε�Ϲ�ȣ('-'�� �����Ͽ� �Է��ϼ���.) : ");
		residentNumber = sc.next();

		char residentNumber1[] = new char[residentNumber.length()];
		char residentNumber2[] = new char[residentNumber.length()];

		// ���ڿ��� �迭�� ��ȯ
		for (int i = 0; i < residentNumber1.length; i++) {
			residentNumber1[i] = residentNumber.charAt(i);
		}

		// �迭1�� �迭2�� �����ϸ鼭 ���� ���� �ڸ� ��, 8������ 13������ *�� ����
		System.arraycopy(residentNumber1, 0, residentNumber2, 0, 8);

		for (int i = 8; i < residentNumber2.length; i++) {
			residentNumber2[i] = '*';
		}

		for (int i = 0; i < residentNumber2.length; i++) {
			System.out.print(residentNumber2[i]);
		}

		System.out.println();
		System.out.println("==========");
	}

	public void exam4() {

		int number;

		while (true) {
			System.out.print("Ȧ���� �Է��ϼ��� : ");
			number = sc.nextInt();
			if (number % 2 == 1) {
				break;
			}
		}

		int num[] = new int[number];

		int count = 1;

		for (int i = 0; i < num.length; i++) {
			if (i < num.length / 2) {
				num[i] = count;
				count++;
			} else if (i == num.length / 2) {
				num[i] = count;
			} else {
				count--;
				num[i] = count;
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d\t", num[i]);
		}
	}
}
