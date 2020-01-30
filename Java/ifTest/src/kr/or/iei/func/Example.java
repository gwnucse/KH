package kr.or.iei.func;

import java.util.Scanner;

public class Example {

	Scanner sc = new Scanner(System.in);
	
	public void exam1() {
		
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
	
	public void exam2() {
		
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
	
	public void exam3() {
		
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
	
	public void exam4() {
		System.out.println("========= ���̰��� ���α׷� =========");
		
		System.out.print("�����Ͻ� �� �ο��� ����Դϱ�? : ");
		int people = sc.nextInt();
		
		System.out.print("��� ����Դϱ�?(1�δ� 15000��) : ");
		int adult = sc.nextInt();
		
		System.out.print("���� ����Դϱ�?(1�δ� 5000��) : ");
		int child = sc.nextInt();
		
		if (people == adult + child) {
			System.out.printf("�����Ͻ� �� �ݾ��� %d�� �Դϴ�.\n", (adult * 15000 + child * 5000));
		} else {
			System.out.println("�ο����� ���� �ʽ��ϴ�.");
		}
		
		System.out.println();
	}
	
	public void exam5() {
		System.out.println("========= ���� ���α׷� =========");
		
		int collect = 0;
		
		System.out.println("ù��° ����");
		System.out.print("����� ����� �����ϱ��(1. apple, 2. ��Ƽ�� �⽺)? : ");
		int answer = sc.nextInt();
		if (answer == 1) {
			System.out.println("����!!!");
			collect++;
		} else {
			System.out.println("��!!");
		}
		
		System.out.println("�ι�° ����");
		System.out.print("�ٳ����� ��� ������ ���� ������  (1. ���, 2. ����)? : ");
		answer = sc.nextInt();
		if (answer == 2) {
			System.out.println("����!!");
			collect++;
		} else {
			System.out.println("��!!");
		}
		
		System.out.println("�� " + collect + "������ ������ϴ�.");
		System.out.println();
	}
	
	public void exam6() {
		System.out.println("======== �ɸ��׽�Ʈ ========");
		
		int answer;
		
		System.out.print("����� ���� �����Ͻʴϱ�(1. yes, 2. no)? : ");
		answer = sc.nextInt();
		
		if (answer == 1) {
			System.out.print("����� ��踦 �ǿ�ϱ�(1.yes, 2. no)? : ");
			answer = sc.nextInt();
			
			if (answer == 1) {
				System.out.println("���� �ǰ��� ���� �ʽ��ϴ�.");
			} else {
				System.out.println("���� ���� ���� �ʽ��ϴ�.");
			}
		} else {
			System.out.print("����� �̼�ģ���� �ֽ��ϱ�(1. yes, 2. no)? : ");
			answer = sc.nextInt();
			
			if (answer == 1) {
				System.out.println("��..��");
			} else {
				System.out.println("������ �Ф�");
			}
		}
		
		System.out.println();
	}
	
	public void exam7() {
		System.out.println("========= ��/�ҹ��� ��ȯ ���α׷� =========");
		
		System.out.print("�����Է� : ");
		char ch = sc.next().charAt(0);
		
		System.out.println("===== ��� =====");
		
		if (ch >= 97 && ch <= 122) {
			System.out.println("�ҹ��ڸ� �Է��Ͽ����ϴ�.");
			System.out.printf("�빮�ڷ� ��ȯ : %c\n", ch^32);
		} else if (ch >= 65 && ch <= 90) {
			System.out.println("�빮�ڸ� �Է��Ͽ����ϴ�.");
			System.out.printf("�ҹ��ڷ� ��ȯ : %c\n", ch^32);
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�. �����ڸ� �Է����ּ���.");
		}
		
		System.out.println();
	}
	
	public void exam8() {
		
		System.out.print("�����Է� : ");
		int num = sc.nextInt();
		
		System.out.println("===== ��� =====");
		
		if (num == 0) {
				System.out.printf("[%d]��(��) 3�� ����� 4�� ����� �ƴմϴ�.", num);
		}else if (num % 3 == 0 && num % 4 == 0) {
			System.out.printf("[%d]��(��) 3�� ����鼭 4�� ����Դϴ�.\n", num);
		} else if(num % 3 == 0) {
			System.out.printf("[%d]��(��) 3�� ����Դϴ�.\n", num);
		} else if(num % 4 == 0) {
			System.out.printf("[%d]��(��) 4�� ����Դϴ�.\n", num);
		} else {
			System.out.printf("[%d]��(��) 3�� ����� 4�� ����� �ƴմϴ�.", num);
		}
	}
	
	public void test1() {
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
//		if (num % 2 != 0) {
//			System.out.println("Ȧ���Դϴ�.");
//		}
	}
	
	public void test2() {
		System.out.print("1~3 ���� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num == 1) {
			System.out.println("One");
		} else if (num == 2) {
			System.out.println("Two");
		} else if (num == 3) {
			System.out.println("Three");
		} else {
			System.out.println("�߸��Է��߽��ϴ�.");
		}
	}
}
