package kh.java.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestClass {

	Scanner sc = new Scanner(System.in);

	public void test1() {

		System.out.println("������ ���α׷�");
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();

		try {
			int result = num1 / num2;

			System.out.println("��� : " + result);

		} catch (ArithmeticException ae) {
			System.err.println("0���δ� ���� �� �����ϴ�.");
		}
	}

	public void div(int num1, int num2) {
		if (num1 == 0 || num2 == 0) {

			throw new ExceptionTest2("0���� ���� �� �����ϴ�.");
			// try {
			// throw new ExceptionTest1("0���� ���� �� �����ϴ�.");
			// } catch (ExceptionTest1 e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
		}

		System.out.println(num1 / num2);
	}

	public void start() {
		int choice = 0;

		menuPrint();

		try {
			choice = sc.nextInt();
			test2(choice);
		} catch (InputMismatchException ie) {
			System.err.println("���ڸ� �Է��ϼ���.");
			delay();
		} finally {
			System.out.println("���α׷��� ����˴ϴ�.");
		}

	}

	public void menuPrint() {

		System.out.println("����");
		System.out.println("1. ������ ����");
		System.out.println("2. �������� ����?");
		System.out.println("3. �ȿ͵�... ũ��");
		System.out.print("�Է� : ");

	}

	public void test2(int choice) {
		switch (choice) {
		case 1:
			System.out.println("������ ����");
			break;
		case 2:
			System.out.println("�������� ����?");
			break;
		case 3:
			System.out.println("�ȿ͵�... ũ��");
			break;
		default:
			System.out.println("1~3���� �����ϼ���");
			break;
		}
	}

	public void test3() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("test.txt");
	}

	public void test4() throws FileNotFoundException {
		test3();
	}

	public void test5() {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("test.txt");

			// ������ �о���� ����
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void test6() {
		try (FileInputStream fis = new FileInputStream("test.txt")) {

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delay() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
