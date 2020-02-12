package kr.or.iei.control;

import java.util.Scanner;
import kr.or.iei.vo.Student;

public class StudentMgr {
	// �̸� �迭, ���� �迭, �ּ� �迭, ��ĳ��, �ε���

	private final static int ARRAYMAX = 10;

	Student[] students = new Student[ARRAYMAX];
	Scanner sc = new Scanner(System.in);
	int index;

	public void main() {
		while (true) {

			System.out.println("====== �л� ���� ���α׷� v1.1 =====");
			System.out.println("1. �л� ���� �Է�");
			System.out.println("2. �л� ���� ���(��ü)");
			System.out.println("3. �л� ���� ���(1��)");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� > ");

			int select = sc.nextInt();

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
				modifyStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�ٽ� �Է��� �ּ���!!");
			}
		}
	}

	public void insertStudent() {

		if (index == ARRAYMAX) {
			System.out.println("\n�л� ������ �ʰ��Ͽ����ϴ�.");
			return;
		}

		System.out.println("\n===== �л� ���� �Է� =====");
		System.out.print("�л� �̸� �Է� : ");
		String name = sc.next();

		System.out.print("�л� ���� �Է� : ");
		int age = sc.nextInt();

		sc.nextLine();

		System.out.print("�л� �ּ� �Է� : ");
		String addr = sc.nextLine();

		// //�⺻ �����ڸ� ���ؼ� ��ü ���� �� setter�� �̿��� �� ����
		// Student stu = new Student();
		// //stu �̸� = null, ���� = 0, �ּ� = null
		// stu.setName(name);
		// stu.setAge(age);
		// stu.setAddr(addr);

		// �Ű����� ������ �̿�
		Student stu = new Student(name, age, addr);

		students[index] = stu;
		index++;
	}

	public void printAllStudent() {

		System.out.println("\n===== �л� ��ü ���� ��� =====");
		System.out.println("�̸�\t����\t�ּ�");

		for (int i = 0; i < index; i++) {
			System.out.println(students[i]);
		}
	}

	public void printOneStudent() {

		System.out.println("\n===== �л� ���� ��� =====");
		System.out.print("����� �л��� �̸��� �Է��ϼ���. : ");
		String name = sc.next();

		int searchIndex = searchIndex(name);

		if (searchIndex == -1) {
			System.out.println("�л��� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("�̸� : " + students[searchIndex].getName());
			System.out.println("���� : " + students[searchIndex].getAge());
			System.out.println("�ּ� : " + students[searchIndex].getAddr());
		}
	}

	public void modifyStudent() {

		System.out.println("\n===== �л� ���� ���� =====");
		System.out.print("������ �л��� �̸��� �Է��ϼ���. : ");
		String name = sc.next();

		int searchIndex = searchIndex(name);

		if (searchIndex == -1) {
			System.out.println("�л��� �������� �ʽ��ϴ�.");
		} else {
			System.out.print("�л� �̸� �Է� : ");
			String mName = sc.next();

			System.out.print("�л� ���� �Է� : ");
			int mAge = sc.nextInt();

			sc.nextLine();

			System.out.print("�л� �ּ� �Է� : ");
			String mAddr = sc.nextLine();
			
			students[searchIndex].setName(mName);
			students[searchIndex].setAge(mAge);
			students[searchIndex].setAddr(mAddr);

			System.out.println("�л� ������ �����߽��ϴ�.");
		}
	}

	public void deleteStudent() {

		System.out.println("\n===== �л� ���� ���� =====");
		System.out.print("������ �л��� �̸��� �Է��ϼ���. : ");
		String name = sc.next();

		int searchIndex = searchIndex(name);

		if (searchIndex == -1) {
			System.out.println("�л��� �������� �ʽ��ϴ�.");
		} else {
			for (int i = searchIndex; i < index - 1; i++) {
				students[i] = students[i + 1];
			}
			students[index - 1] = null;
			System.out.println("�л��� ������ �����߽��ϴ�.");
			index--;
		}
	}

	public int searchIndex(String name) {
		for (int i = 0; i < index; i++) {
			if (students[i].getName().equals(name)) {
				return i;
			}
		}

		return -1;
	}
}
