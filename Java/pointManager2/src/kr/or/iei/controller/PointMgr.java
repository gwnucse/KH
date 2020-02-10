package kr.or.iei.controller;

import java.util.Scanner;
import kr.or.iei.point.Gold;
import kr.or.iei.point.Silver;
import kr.or.iei.point.Vip;

public class PointMgr {

	Scanner sc = new Scanner(System.in);
	Silver[] silver = new Silver[10];
	int sIndex;

	Gold[] gold = new Gold[10];
	int gIndex;

	Vip[] vip = new Vip[10];
	int vIndex;

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

		while (true) {

			System.out.print("����� �Է��ϼ���.[Silver/Gold/Vip] : ");
			rank = sc.next().toLowerCase(); // �빮�ڷ� �Էµ� ���� �ҹ��ڷ� ��ȯ

			if (rank.equals("silver") || rank.equals("gold") || rank.equals("vip")) {
				break;
			} else {
				System.out.println("�ǹ�/��� �� �ϳ��� �Է��� �ּ���.");
			}
		}

		System.out.print("����Ʈ ������ �Է��ϼ���. : ");
		point = sc.nextInt();

		switch (rank) {
		case "silver":
			silver[sIndex++] = new Silver(name, rank, point);
			break;
		case "gold":
			gold[gIndex++] = new Gold(name, rank, point);
			break;
		case "vip":
			vip[vIndex++] = new Vip(name, rank, point);
			break;
		}

		System.out.println("ȸ�� ����� �Ϸ�Ǿ����ϴ�.");
		delay();
	}

	public void printAllUser() {

		System.out.println("\n===== ȸ�� ���� ���(��ü) =====");
		System.out.println("�̸�\t���\t����Ʈ\t���ʽ� ����Ʈ");

		for (int i = 0; i < sIndex; i++) {
			System.out.println(silver[i].getName() + "\t" + silver[i].getRank().toUpperCase() + "\t"
					+ silver[i].getPoint() + "\t" + silver[i].getBonus());
		}

		for (int i = 0; i < gIndex; i++) {
			System.out.println(gold[i].getName() + "\t" + gold[i].getRank().toUpperCase() + "\t" + gold[i].getPoint()
					+ "\t" + gold[i].getBonus());
		}

		for (int i = 0; i < vIndex; i++) {
			System.out.println(vip[i].getName() + "\t" + vip[i].getRank().toUpperCase() + "\t" + vip[i].getPoint()
					+ "\t" + vip[i].getBonus());
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
		} else if (searchUser - silver.length < 0) {
			System.out.println("�̸� : " + silver[searchUser].getName());
			System.out.println("��� : " + silver[searchUser].getRank().toUpperCase());
			System.out.println("����Ʈ ���� : " + silver[searchUser].getPoint());
			System.out.println("���ʽ� ����Ʈ : " + silver[searchUser].getBonus());
		} else if (searchUser - (silver.length + gold.length) < 0) {
			searchUser = searchUser - silver.length;
			System.out.println("�̸� : " + gold[searchUser].getName());
			System.out.println("��� : " + gold[searchUser].getRank().toUpperCase());
			System.out.println("����Ʈ ���� : " + gold[searchUser].getPoint());
			System.out.println("���ʽ� ����Ʈ : " + gold[searchUser].getBonus());
		} else {
			searchUser = searchUser - silver.length - gold.length;
			System.out.println("�̸� : " + vip[searchUser].getName());
			System.out.println("��� : " + vip[searchUser].getRank().toUpperCase());
			System.out.println("����Ʈ ���� : " + vip[searchUser].getPoint());
			System.out.println("���ʽ� ����Ʈ : " + vip[searchUser].getBonus());
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
		} else if (searchUser1 - silver.length < 0) {
			//���� ������ Silver�� ���

			while (true) {
				System.out.print("�̸��� �Է��ϼ���. : ");
				name = sc.next();
				if (!name.equals(silver[searchUser1].getName())) {
					int searchUser2 = searchUser(name);

					if (searchUser2 == -1) {
						break;
					} else {
						System.out.println("�ߺ��� ȸ���� �����մϴ�. �ٽ� �Է��ϼ���.");
					}
				}
			}

			System.out.print("����� �Է��ϼ���.[Silver/Gold/Vip] : ");
			rank = sc.next().toLowerCase();

			System.out.print("����Ʈ ������ �Է��ϼ���. : ");
			point = sc.nextInt();

			if (rank.equals("silver")) {
				silver[searchUser1].setName(name);
				silver[searchUser1].setRank(rank);
				silver[searchUser1].setPoint(point);
			} else {
				for (int i = searchUser1; i < sIndex - 1; i++) {
					silver[i] = silver[i + 1];
				}

				silver[sIndex - 1] = null;
				sIndex--;

				switch (rank) {
				case "gold":
					gold[gIndex++] = new Gold(name, rank, point);
					break;
				case "vip":
					vip[vIndex++] = new Vip(name, rank, point);
					break;
				}
			}

		} else if (searchUser1 - (silver.length + gold.length) < 0) {
			//���� ������ Gold�� ���
			searchUser1 = searchUser1 - silver.length;

			while (true) {
				System.out.print("�̸��� �Է��ϼ���. : ");
				name = sc.next();
				if (!name.equals(gold[searchUser1].getName())) {
					int searchUser2 = searchUser(name);

					if (searchUser2 == -1) {
						break;
					} else {
						System.out.println("�ߺ��� ȸ���� �����մϴ�. �ٽ� �Է��ϼ���.");
					}
				}
			}

			System.out.print("����� �Է��ϼ���.[Silver/Gold/Vip] : ");
			rank = sc.next().toLowerCase();

			System.out.print("����Ʈ ������ �Է��ϼ���. : ");
			point = sc.nextInt();

			if (rank.equals("gold")) {
				gold[searchUser1].setName(name);
				gold[searchUser1].setRank(rank);
				gold[searchUser1].setPoint(point);
			} else {
				for (int i = searchUser1; i < gIndex - 1; i++) {
					gold[i] = gold[i + 1];
				}

				gold[gIndex - 1] = null;
				gIndex--;

				switch (rank) {
				case "silver":
					silver[sIndex++] = new Silver(name, rank, point);
					break;
				case "vip":
					vip[vIndex++] = new Vip(name, rank, point);
					break;
				}
			}

		} else {
			//���� ������ Vip�� ���
			searchUser1 = searchUser1 - silver.length - gold.length;

			while (true) {
				System.out.print("�̸��� �Է��ϼ���. : ");
				name = sc.next();

				if (!name.equals(vip[searchUser1].getName())) {
					int searchUser2 = searchUser(name);

					if (searchUser2 == -1) {
						break;
					} else {
						System.out.println("�ߺ��� ȸ���� �����մϴ�. �ٽ� �Է��ϼ���.");
					}
				}
			}

			System.out.print("����� �Է��ϼ���.[Silver/Gold/Vip] : ");
			rank = sc.next().toLowerCase();

			System.out.print("����Ʈ ������ �Է��ϼ���. : ");
			point = sc.nextInt();

			if (rank.equals("vip")) {
				vip[searchUser1].setName(name);
				vip[searchUser1].setRank(rank);
				vip[searchUser1].setPoint(point);
			} else {
				for (int i = searchUser1; i < vIndex - 1; i++) {
					vip[i] = vip[i + 1];
				}

				vip[vIndex - 1] = null;
				vIndex--;

				switch (rank) {
				case "silver":
					silver[sIndex++] = new Silver(name, rank, point);
					break;
				case "gold":
					gold[gIndex++] = new Gold(name, rank, point);
					break;
				}
			}

		}

		System.out.println("ȸ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
		delay();
	}

	public void deleteUser() {

		System.out.println("\n===== ȸ�� Ż�� =====");
		System.out.print("Ż���� ȸ���� �̸��� �Է��ϼ���. : ");
		String name = sc.next();

		int searchUser = searchUser(name);

		if (searchUser == -1) {
			System.out.println("�ش� ȸ���� �������� �ʽ��ϴ�.");
		} else if (searchUser - silver.length < 0) {

			for (int i = searchUser; i < sIndex - 1; i++) {
				silver[i] = silver[i + 1];
			}

			silver[sIndex - 1] = null;
			sIndex--;
			System.out.println("ȸ�� Ż�� �Ϸ�Ǿ����ϴ�.");

		} else if (searchUser - (silver.length + gold.length) < 0) {
			searchUser = searchUser - silver.length;

			for (int i = searchUser; i < gIndex - 1; i++) {
				gold[i] = gold[i + 1];
			}

			gold[gIndex - 1] = null;
			gIndex--;

			System.out.println("ȸ�� Ż�� �Ϸ�Ǿ����ϴ�.");
		} else {
			searchUser = searchUser - silver.length - gold.length;

			for (int i = searchUser; i < vIndex - 1; i++) {
				vip[i] = vip[i + 1];
			}

			vip[vIndex - 1] = null;
			vIndex--;

			System.out.println("ȸ�� Ż�� �Ϸ�Ǿ����ϴ�.");
		}

		delay();
	}

	public int searchUser(String name) {

		for (int i = 0; i < sIndex; i++) {
			if (silver[i].getName().equals(name)) {
				return i;
			}
		}

		for (int i = 0; i < gIndex; i++) {
			if (gold[i].getName().equals(name)) {
				return i + silver.length;
			}
		}

		for (int i = 0; i < vIndex; i++) {
			if (vip[i].getName().equals(name)) {
				return i + silver.length + gold.length;
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
