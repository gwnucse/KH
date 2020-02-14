package kh.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import kh.java.collection.vo.Student;

public class StudentMgr {

	ArrayList<Student> students = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);

	public void main() {
		while (true) {
			System.out.println("\n---------- �л� ���� ���α׷� ----------");
			System.out.println("1. �л� ���");
			System.out.println("2. �л� ��ü ���� ���");
			System.out.println("3. �л� 1�� ���� ���");
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
				return;
			default:
				System.out.println("0~5 ������ ���ڸ� �Է����ּ���.");
			}

			delay();
		}
	}

	public void insertStudent() {

		System.out.println("\n----- �л� ���� �Է� -----");

		System.out.print("�̸� �Է� : ");
		String name = sc.next();

		System.out.print("���� �Է� : ");
		int age = sc.nextInt();

		sc.nextLine();

		System.out.print("�ּ� �Է� : ");
		String addr = sc.nextLine();

		Student st = new Student(name, age, addr);
		students.add(st);

		System.out.println("�л��� �߰��Ǿ����ϴ�.");

	}

	public void printAllStudent() {

		if (students.isEmpty()) {
			System.out.println("�л� ������ �����ϴ�.");
		} else {

			System.out.println("\n----- �л� ��ü ���� ��� -----");
			System.out.println("�̸�\t����\t�ּ�");

			// Iterator�� �̿��� ��� ���
//			Iterator iter = students.iterator();
//
//			while (iter.hasNext()) {
//				System.out.println(iter.next());
//			}

			// for-each���� �̿��� ��� ���
			for (Student st : students) {
				System.out.println(st);
			}

			// for���� �̿��� ��� ���
//			for (int i = 0; i < students.size(); i++) {
//				System.out.println(students.get(i));
//			}
			
			//ArrayList�� ������ �ִ� forEach�� ���ٽ��� �̿��� �� ���� ����
//			students.forEach(st -> {
//				System.out.print(st);
//				System.out.println("\tHello");
//			});
		}
	}

	public void printOneStudent() {

		System.out.println("\n----- �л� 1�� ���� ��� -----");

		System.out.print("��ȸ�� �л� �̸� �Է� : ");
		String name = sc.next();

		int searchIndex = searchStudent(name);

		if (searchIndex == -1) {
			System.out.println("�л��� �������� �ʽ��ϴ�.");
		} else {
			System.out.println(students.get(searchIndex));
		}
	}

	public void modifyStudent() {

		System.out.println("\n----- �л� ���� ���� -----");

		System.out.print("������ �л� �̸� �Է� : ");
		String name = sc.next();

		int searchIndex = searchStudent(name);

		if (searchIndex == -1) {
			System.out.println("�л��� �������� �ʽ��ϴ�.");
		} else {
			System.out.print("�̸� �Է� : ");
			String nName = sc.next();

			System.out.print("���� �Է� : ");
			int nAge = sc.nextInt();

			sc.nextLine();

			System.out.print("�ּ� �Է� : ");
			String nAddr = sc.nextLine();

			students.get(searchIndex).setName(nName);
			students.get(searchIndex).setAge(nAge);
			students.get(searchIndex).setAddr(nAddr);

			System.out.println("�л� ������ �����Ǿ����ϴ�.");
		}

	}

	public void deleteStudent() {

		System.out.println("\n----- �л� ���� ���� -----");

		System.out.print("������ �л� �̸� �Է� : ");
		String name = sc.next();

		int searchIndex = searchStudent(name);

		if (searchIndex == -1) {
			System.out.println("�л��� �������� �ʽ��ϴ�.");
		} else {
			students.remove(searchIndex);

			System.out.println("�л� ������ �����Ǿ����ϴ�.");
		}
	}

	public int searchStudent(String name) {

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				return i;
			}
		}

		return -1;
	}

	public void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
