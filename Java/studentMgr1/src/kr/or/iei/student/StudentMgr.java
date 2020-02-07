package kr.or.iei.student;

import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class StudentMgr {
	
	String[] names = new String[10];	//�л� �̸� ����� �迭
	int[] ages = new int[10];		//�л� ���� ����� �迭
	String[] addrs = new String[10];	//�л� �ּ� ����� �迭
	int index;						//�迭 �ε��� ����
	Scanner sc = new Scanner(System.in);
	
	public void main() {
		while (true) {
			System.out.println("===== �л� ���� ���α׷� v1.0 =====");
			System.out.println("1. �л����");
			System.out.println("2. �л� ���� ��ȸ(��ü)");
			System.out.println("3. �л� ���� ��ȸ(1��)");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1 :
				insertStudent();
				break;
			case 2 :
				printAllStudnet();
				break;
			case 3 :
				printOneStudnet();
				break;
			case 4 :
				modifyStudent();
				break;
			case 5 :
				deleteStudnet();
				break;
			case 0 :
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default :
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
	}
	
	//1. �л� ���
	private void insertStudent() {
		
		if (index == names.length) {
			System.out.println("�迭�� �� �� �ֽ��ϴ�.");
			return;
		}
		
		System.out.println("\n===== �л� ���� �Է� =====");
		
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		
		sc.nextLine();	//����ó������ ���ſ� �ڵ�
		
		System.out.print("�ּ� �Է� : ");
		String addr = sc.nextLine();
		
		names[index] = name;
		ages[index] = age;
		addrs[index] = addr;
		
		index++;
		
		System.out.println("�л� ���� ��� ����!");
	}
	
	//2. �л� ���� ��ȸ(��ü ����)
	private void printAllStudnet() {
		
		System.out.println("\n===== �л� ��ü ���� ��� ======");
		System.out.println("�̸�\t����\t�ּ�");
		
		for (int i = 0; i < index; i++) {
			System.out.printf("%s\t%d\t%s\n", names[i], ages[i], addrs[i]);
		}
	}
	
	//3. �л� ���� ��ȸ(1��) - �̸� �˻�
	private void printOneStudnet() {
		
		System.out.println("\n===== �л� ���� ���(1��) =====");
		int searchIndex = searchStudent("��ȸ");
		
		if (searchIndex != -1) {
			System.out.println("�̸� : " + names[searchIndex]);
			System.out.println("���� : " + ages[searchIndex]);
			System.out.println("�ּ� : " + addrs[searchIndex]);
		}
	}
	
	//4. �л� ���� ����
	private void modifyStudent() {
		System.out.println("\n===== �л� ���� ���� =====");
		int searchIndex = searchStudent("����");
		
		if (searchIndex != -1) {
			System.out.print("������ �л� �̸� �Է� : ");
			names[searchIndex] = sc.next();
			
			System.out.print("������ ���� �Է� : ");
			ages[searchIndex] = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("������ �ּ� �Է� : ");
			addrs[searchIndex] = sc.nextLine();
			
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}
	}
	
	//5. �л� ���� ����
	private void deleteStudnet() {
		System.out.println("\n===== �л� ���� ���� =====");
		int searchIndex = searchStudent("����");
		
		if (searchIndex != -1) {
			//�迭�� �� �� ���� �� i + 1�� index���� �����ϸ� �迭�� �ʰ��ȴ�.
			for (int i = searchIndex; i < index - 1; i++) {
				names[i] = names[i + 1];
				ages[i] = ages[i + 1];
				addrs[i] = addrs[i + 1];
			}
			
			//���������� ���ʿ��� �ڵ�
			names[index - 1] = null;
			ages[index - 1] = 0;
			addrs[index - 1] = null;
			
			index--;
		}
	}
	
	//6. �̸��� �������� �迭�� ����� �����ϴ��� ã�� �� ��ȣ�� �����ϴ� �޼ҵ�
	private int searchStudent(String msg) {
		System.out.print(msg + "�� �л� �̸��� �Է��ϼ��� : ");
		String name = sc.next();
		
		for (int i = 0; i < index; i++) {
			if (names[i].equals(name)) {
				return i;
			}
		}

		System.out.println("�л� ������ �����ϴ�.");
		return -1;
	}
}
