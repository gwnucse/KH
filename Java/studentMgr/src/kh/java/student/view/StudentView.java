package kh.java.student.view;

import java.util.ArrayList;
import java.util.Scanner;

import kh.java.student.model.vo.Student;

public class StudentView {

	Scanner sc = new Scanner(System.in);

	public int mainMenu() {
		System.out.println("\n===== �л� ���� ���α׷� =====");
		System.out.println("1. �л� ���� ���");
		System.out.println("2. �л� ��ü ���� ����");
		System.out.println("3. �л� 1�� ���� ����");
		System.out.println("4. �л� ���� ����");
		System.out.println("5. �л� ���� ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� > ");

		int select = sc.nextInt();

		return select;
	}

	public Student insertStudent() {

		System.out.println("\n----- �л� ���� ��� ------");
		System.out.print("�̸� �Է� : ");
		String name = sc.next();

		System.out.print("���� �Է� : ");
		int age = sc.nextInt();

		sc.nextLine();

		System.out.print("�ּ� �Է� : ");
		String addr = sc.nextLine();

		Student stu = new Student(name, age, addr);

		return stu;

	}

	public void printAllStudent(ArrayList<Student> students) {

		System.out.println("\n----- �л� ��ü ���� ��� -----");
		System.out.println("�̸�\t����\t�ּ�");

		for (Student stu : students) {
			System.out.println(stu);
		}

	}

	public void printOneStudent(Student stu) {

		System.out.println();

		System.out.println("�̸� : " + stu.getName());
		System.out.println("���� : " + stu.getAge());
		System.out.println("�ּ� : " + stu.getAddr());

	}
	
	public Student modifyStudent() {
		
		System.out.print("������ �̸� �Է� : ");
		String name = sc.next();

		System.out.print("������ ���� �Է� : ");
		int age = sc.nextInt();

		sc.nextLine();

		System.out.print("������ �ּ� �Է� : ");
		String addr = sc.nextLine();

		Student stu = new Student(name, age, addr);
		
		return stu;
	}

	public String getName() {

		System.out.print("�л� �̸� �Է� : ");

		String name = sc.next();

		return name;
	}

	public void printMsg(String msg) {

		System.out.println(msg);
		
	}

}
