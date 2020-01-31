package kr.or.iei.func;

import java.util.Scanner;

public class Loop {
	Scanner sc = new Scanner(System.in);

	public void forTest() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "��° ���");
		}

		System.out.println();
	}
	
	public void forTest2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println("i = " + i + " / j = " + j);
			}
		}
	}

	public void whileTest() {
		int i = 1;
		while (i <= 5) {
			System.out.println(i + "��° �ݺ��ؼ� ���� ��");
			i++;
		}

		System.out.println();
	}

	public void doWhileTest() {
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		do {
			System.out.println(num % 10);
			num /= 10;
		} while(num != 0);
		System.out.println();
	}
	
	public void loopTest() {
		while(true) {
			System.out.println("�ݺ�");
			System.out.print("�ѹ���[y/n]? ");
			char ch = sc.next().charAt(0);
			if (ch == 'n') {
				break;
			}
		}
		System.out.println("test");
		System.out.println();
	}
	
	public void loopTest2() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ". ���");
			if (i == 5) {
				continue;
			}
			System.out.println("test1");
		}
		System.out.println("test2");
		System.out.println();
	}
}
