package kr.or.iei.student;

import java.io.*;

public class StudentMgr2 {

	final static int ARRAYMAX = 10;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String[] names = new String[ARRAYMAX];
	int[] ages = new int[ARRAYMAX];
	String[] sexs = new String[ARRAYMAX];
	String[] addrs = new String[ARRAYMAX];
	int index;

	public StudentMgr2() {
		while (true) {
			System.out.println("===== �л� ���� ���α׷� v1.0 =====");
			System.out.println("1. �л� ���");
			System.out.println("2. �л� ���� ��ȸ(��ü)");
			System.out.println("3. �л� ���� ��ȸ(1��)");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ���� ����");
			System.out.println("0. ���α׷� ����");

			int select;

			while (true) {
				try {
					System.out.print("���� > ");
					select = Integer.parseInt(br.readLine());
					break;
				} catch (NumberFormatException ne) {
					System.err.println("���ڸ� �Է��� �ּ���.");
				} catch (IOException ie) {
					ie.printStackTrace();
				}
			}

			switch (select) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				printOneStudent();
				break;
			case 4:
				modifyStudnet();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("0~5 ������ ���ڸ� �Է����ּ���.");
			}
		}
	}

	private void insertStudent() {

		if (index == ARRAYMAX) {
			return;
		}

		while (true) {
			try {
				System.out.println("\n===== �л� ����ϱ� =====");
				System.out.print("�̸��� �Է����ּ���. : ");
				names[index] = br.readLine();

				System.out.print("���̸� �Է����ּ���. : ");
				ages[index] = Integer.parseInt(br.readLine());

				System.out.print("������ �Է����ּ���.(��/��) : ");
				sexs[index] = br.readLine();

				System.out.print("�ּҸ� �Է����ּ���. : ");
				addrs[index] = br.readLine();

				printInfo(index);
				System.out.println("�л� ������ ��ϵǾ����ϴ�.");
				index++;

				delay();
				return;

			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	private void printAllStudent() {

		System.out.println("\n===== �л� ��ü ���� ��ȸ =====");
		System.out.println("�̸�\t����\t����\t�ּ�");

		for (int i = 0; i < index; i++) {
			System.out.printf("%s\t%d\t%s\t%s\n", names[i], ages[i], sexs[i], addrs[i]);
		}

		delay();
	}

	private void printOneStudent() {

		System.out.println("\n===== �л� ���� ��ȸ =====");
		int searchStudent = searchStudent("��ȸ");

		if (searchStudent != -1) {
			System.out.println("�л� ������ ����մϴ�.");
			printInfo(searchStudent);
		}

		delay();
	}

	private void modifyStudnet() {

		System.out.println("\n===== �л� ���� ���� =====");
		int searchStudent = searchStudent("����");

		if (searchStudent != -1) {
			while (true) {
				try {
					System.out.print("�̸��� �Է����ּ���. : ");
					names[searchStudent] = br.readLine();

					System.out.print("���̸� �Է����ּ���. : ");
					ages[searchStudent] = Integer.parseInt(br.readLine());

					System.out.print("������ �Է����ּ���.(��/��) : ");
					sexs[searchStudent] = br.readLine();

					System.out.print("�ּҸ� �Է����ּ���. : ");
					addrs[searchStudent] = br.readLine();

					printInfo(searchStudent);
					System.out.println("�л� ������ �����Ǿ����ϴ�.");

					delay();
					return;

				} catch (NumberFormatException ne) {
					System.err.println("���ڸ� �Է��� �ּ���.");
				} catch (IOException ie) {
					ie.printStackTrace();
				}
			}
		}

		delay();
	}

	private void deleteStudent() {

		System.out.println("\n===== �л� ���� ���� =====");
		int searchStudent = searchStudent("����");
		printInfo(searchStudent);
		while (true) {
			try {
				System.out.print("�� �л��� ������ �����Ͻðڽ��ϱ�? [1. yes, 2. no] : ");
				int select = Integer.parseInt(br.readLine());
				
				switch(select) {
				case 1 :
					for (int i = searchStudent; i < index - 1; i++) {
						names[i] = names[i + 1];
						ages[i] = ages[i + 1];
						sexs[i] = sexs[i + 1];
						addrs[i] = addrs[i + 1];
					}
					index--;
					System.out.println("�л� ������ �����Ͽ����ϴ�.");
					delay();
					return;
				case 2 :
					System.out.println("����Ͽ����ϴ�.");
					delay();
					return;
				default :
					System.out.println("1~2 ������ ���ڸ� �Է��� �ּ���.");
				}
				
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	private int searchStudent(String msg) {

		System.out.print(msg + "�� �л��� �̸��� �Է��� �ּ���. : ");

		try {

			String name = br.readLine();

			for (int i = 0; i < index; i++) {
				if (names[i].equals(name)) {
					return i;
				}
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		}

		System.out.println("��ϵ� �л��� �ƴմϴ�.");
		return -1;
	}

	private void printInfo(int serachNumber) {

		System.out.println("�̸� : " + names[serachNumber]);
		System.out.println("���� : " + ages[serachNumber]);
		System.out.println("���� : " + sexs[serachNumber]);
		System.out.println("�ּ� : " + addrs[serachNumber]);
	}

	private void delay() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
