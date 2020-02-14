package kh.java.collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import kh.java.collection.vo.Student;

public class StudentMgrMap {

	HashMap<String, Student> students = new HashMap<String, Student>();
	Scanner sc = new Scanner(System.in);

	public void main() {
		while (true) {
			System.out.println("\n===== �л� ���� ���α׷� ======");
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
				System.out.println("0~5������ ���ڸ� �Է��ϼ���.");
			}
		}
	}

	public void insertStudent() {
		
		System.out.println("\n----- �л� ���� ��� ------");
		String name;
		
		while (true) {
			System.out.print("�̸� �Է� : ");
			name = sc.next();
			
			if (students.containsKey(name)) {
				System.out.println("�ߺ��� �̸��Դϴ�.");
			} else {
				break;
			}
		}
		
		System.out.print("���� �Է� : ");
		int age =sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("�ּ� �Է� : ");
		String addr = sc.nextLine();
		
		students.put(name, new Student(name, age, addr));
		
		System.out.println("�л� ������ ��ϵǾ����ϴ�.");
	}
	
	public void printAllStudent() {
		
		System.out.println("\n----- �л� ��ü ���� ��� -----");
		System.out.println("�̸�\t����\t�ּ�");
		
		Set<String> keys = students.keySet();
	
		for(String key : keys) {
			System.out.println(students.get(key));
		}
	}
	
	public void printOneStudent() {
		
		System.out.println("\n----- �л� 1�� ���� ��� -----");
		System.out.print("��ȸ�� �л� �̸� : ");
		
		String name = sc.next();
		
		if (students.containsKey(name)) {
			Student st = students.get(name);
			System.out.println("�̸� : " + st.getName());
			System.out.println("���� : " + st.getAge());
			System.out.println("�ּ� : " + st.getAddr());
		} else {
			System.out.println("�л��� �������� �ʽ��ϴ�.");
		}
	}
	
	public void modifyStudent() {
		
		System.out.println("\n----- �л� ���� ���� -----");
		System.out.print("������ �л� �̸� : ");
		
		String name = sc.next();
		String nName;
		
		if (students.containsKey(name)) {
			while (true) {
				System.out.print("�̸� �Է� : ");
				nName = sc.next();
				
				if (students.containsKey(nName) && !name.equals(nName)) {
					System.out.println("�ߺ��� �̸��Դϴ�.");
				} else {
					break;
				}
			}
			
			System.out.print("���� �Է� : ");
			int age =sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("�ּ� �Է� : ");
			String addr = sc.nextLine();
			
			students.remove(name);
			students.put(nName, new Student(nName, age,addr));
			
			System.out.println("�л� ������ �����Ǿ����ϴ�.");
		} else {
			System.out.println("�л��� �������� �ʽ��ϴ�.");
		}
	}
	
	public void deleteStudent() {
		
		System.out.println("\n----- �л� ���� ���� -----");
		System.out.print("������ �л� �̸� : ");
		
		String name = sc.next();

		if (students.containsKey(name)) {
			students.remove(name);
			System.out.println("�л� ������ �����Ǿ����ϴ�.");
		} else {
			System.out.println("�л��� �������� �ʽ��ϴ�.");
		}
	}
	
}
