package kr.or.iei.controller;

import kr.or.iei.point.Silver;
import java.util.Scanner;

public class PointMgr {

	Scanner sc = new Scanner(System.in);
	Silver[] user = new Silver[30];
	int index;

	public void main() {
		while (true) {
			System.out.println("====== ����Ʈ ���� =====");
			System.out.println("1. ȸ�� ����");
			System.out.println("2. ȸ�� ���� ���(��ü)");
			System.out.println("3. ȸ�� ���� ���(1��)");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� Ż��");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� > ");

			int select = sc.nextInt();

			switch (select) {
			case 1:
				inserUser();
				break;
			case 2:
				printAllUser();
				break;
			case 3:
				printOneUser();
				break;
			case 4:
				modifyUser();
				break;
			case 5:
				deleteUser();
				break;
			case 0:
				return;
			default:
				System.out.println("0~5 ������ ���ڸ� �Է��ϼ���.");
			}
		}
	}

	public void inserUser() {

		System.out.println("\n===== ȸ�� ��� =====");
		String name;
		String rank;
		int point;

		int searchUser;

		while (true) {
			System.out.print("�̸��� �Է��ϼ���. : ");
			name = sc.next();
			searchUser = searchUser(name);

			if (searchUser == -1) {
				break;
			} else {
				System.out.println("�ߺ��� ȸ���� �����մϴ�. �ٽ� �Է��ϼ���.");
			}
		}

		System.out.print("����� �Է��ϼ���. : ");
		rank = sc.next();

		System.out.print("����Ʈ ������ �Է��ϼ���. : ");
		point = sc.nextInt();

		user[index] = new Silver(name, rank, point);
		System.out.println("ȸ�� ����� �Ϸ�Ǿ����ϴ�.");
		index++;
		delay();
	}

	public void printAllUser() {

		System.out.println("\n===== ȸ�� ���� ���(��ü) =====");
		System.out.println("�̸�\t���\t����Ʈ\t���ʽ� ����Ʈ");

		for (int i = 0; i < index; i++) {
			System.out.println(user[i].getName() + "\t" + user[i].getRank() + "\t" + user[i].getPoint() + "\t" + user[i].bonusPoint());
		}

		delay();
	}

	public void printOneUser() {

		System.out.println("\n===== ȸ�� ���� ���(1��) =====");
		System.out.print("�˻��� ȸ���� �̸��� �Է��ϼ���. : ");
		String name = sc.next();

		int searchUser = searchUser(name);

		if (searchUser == -1) {
			System.out.println("�ش� ȸ���� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("�̸� : " + user[searchUser].getName());
			System.out.println("��� : " + user[searchUser].getRank());
			System.out.println("����Ʈ ���� : " + user[searchUser].getPoint());
			System.out.println("���ʽ� ����Ʈ : " + user[searchUser].bonusPoint());
		}

		delay();
	}

	public void modifyUser() {

		String name;
		String rank;
		int point;

		System.out.println("\n===== ȸ�� ���� ���� =====");
		System.out.print("������ ȸ���� �̸��� �Է��ϼ���. : ");
		name = sc.next();

		int searchUser1 = searchUser(name);

		if (searchUser1 == -1) {
			System.out.println("�ش� ȸ���� �������� �ʽ��ϴ�.");
		} else {
			while (true) {
				System.out.print("�̸��� �Է��ϼ���. : ");
				name = sc.next();
				int searchUser2 = searchUser(name);

				if (searchUser2 == -1) {
					break;
				} else {
					System.out.println("�ߺ��� ȸ���� �����մϴ�. �ٽ� �Է��ϼ���.");
				}
			}

			System.out.print("����� �Է��ϼ���. : ");
			rank = sc.next();

			System.out.print("����Ʈ ������ �Է��ϼ���. : ");
			point = sc.nextInt();

			user[searchUser1].setName(name);
			user[searchUser1].setRank(rank);
			user[searchUser1].setPoint(point);

			System.out.println("ȸ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
		}

		delay();
	}

	public void deleteUser() {

		System.out.println("\n===== ȸ�� Ż�� =====");
		System.out.print("Ż���� ȸ���� �̸��� �Է��ϼ���. : ");
		String name = sc.next();

		int searchUser = searchUser(name);

		if (searchUser == -1) {
			System.out.println("�ش� ȸ���� �������� �ʽ��ϴ�.");
		} else {
			for (int i = searchUser; i < index - 1; i++) {
				user[i] = user[i + 1];
			}

			user[index - 1] = null;
			index--;
			System.out.println("ȸ�� Ż�� �Ϸ�Ǿ����ϴ�.");
		}

		delay();
	}

	public int searchUser(String name) {

		for (int i = 0; i < index; i++) {
			if (user[i].getName().equals(name)) {
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
