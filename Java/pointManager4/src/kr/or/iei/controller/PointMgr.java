package kr.or.iei.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import kr.or.iei.point.Gold;
import kr.or.iei.point.Grade;
import kr.or.iei.point.Silver;
import kr.or.iei.point.Vip;
import kr.or.iei.point.Vvip;

public class PointMgr {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	Grade[] members = new Grade[30];
	int index;

	public PointMgr() {

	}

	public void main() {

		int select;

		while (true) {
			System.out.println("===== ����Ʈ ���� �ý��� =====");
			System.out.println("1. ȸ�� ����");
			System.out.println("2. ȸ�� ���� ���(��ü)");
			System.out.println("3. ȸ�� ���� ���(1��)");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� > ");

			try {
				select = Integer.parseInt(br.readLine());

				switch (select) {
				case 1:
					insertMember();
					break;
				case 2:
					printAllMemeber();
					break;
				case 3:
					printOneMember();
					break;
				case 4:
					modifyMember();
					break;
				case 5:
					deleteMember();
					break;
				case 0:
					return;
				default:
					System.out.println("0~5 ������ ���ڸ� �Է��ϼ���.");
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��ϼ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}
	}

	public void insertMember() {

		System.out.println("\n===== ȸ�� ���� =====");

		String mGrade, mName;
		int mPoint;

		while (true) {
			System.out.print("ȸ�� ����� �Է��ϼ���. [Silver/Gold/VIP/VVIP] : ");
			try {
				mGrade = br.readLine().toLowerCase();

				if (mGrade.equals("silver") || mGrade.equals("gold") || mGrade.equals("vip") || mGrade.equals("vvip")) {
					break;
				} else {
					System.out.println("Silver, Gold, Vip �� �ϳ��� �Է��ϼ���.");
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
		while (true) {
			try {
				System.out.print("�̸��� �Է��ϼ���. : ");

				mName = br.readLine();

				int searchMember = searchMember(mName);

				if (searchMember == -1) {
					break;
				} else {
					System.out.println("�ߺ��� ȸ���� �����մϴ�.");
					continue;
				}

			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		while (true) {
			try {
				System.out.print("����Ʈ�� �Է��ϼ���. : ");
				mPoint = Integer.parseInt(br.readLine());
				break;
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��ϼ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		switch (mGrade) {
		case "silver":
			members[index++] = new Silver(mName, mGrade, mPoint);
			break;
		case "gold":
			members[index++] = new Gold(mName, mGrade, mPoint);
			break;
		case "vip":
			members[index++] = new Vip(mName, mGrade, mPoint);
			break;
		case "vvip":
			members[index++] = new Vvip(mName, mGrade, mPoint);
		}

		System.out.println("ȸ���� ��ϵǾ����ϴ�.");
		delay();
	}

	public void printAllMemeber() {

		System.out.println("\n===== ȸ�� ���� ���(��ü) =====");

		System.out.println("�̸�\t���\t����Ʈ\t���ʽ�");

		for (int i = 0; i < index; i++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n", members[i].getName(), members[i].getGrade().toUpperCase(),
					members[i].getPoint(), members[i].getBonus());
		}

		delay();
	}

	public void printOneMember() {

		String name;

		System.out.println("\n===== ȸ�� ���� ���(1��) =====");

		System.out.print("�˻��� ȸ���� �̸��� �Է����ּ���. : ");

		try {
			name = br.readLine();

			int searchMember = searchMember(name);

			if (searchMember == -1) {
				System.out.println("��ϵ� ȸ���� �ƴմϴ�.");
			} else {
				System.out.println("�̸� : " + members[searchMember].getName());
				System.out.println("��� : " + members[searchMember].getGrade().toUpperCase());
				System.out.println("����Ʈ : " + members[searchMember].getPoint());
				System.out.printf("���ʽ� : %.2f\n", members[searchMember].getBonus());
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}

		delay();
	}

	public void modifyMember() {

		String name;
		String mName, mGrade;
		int mPoint;

		System.out.println("\n===== ȸ�� ���� ���� =====");

		System.out.print("������ ȸ���� �̸��� �Է����ּ���. : ");

		try {
			name = br.readLine();

			int searchMember = searchMember(name);

			if (searchMember == -1) {
				System.out.println("��ϵ� ȸ���� �ƴմϴ�.");
			} else {

				while (true) {
					System.out.print("ȸ�� ����� �Է��ϼ���. [Silver/Gold/VIP/VVIP] : ");
					try {
						mGrade = br.readLine().toLowerCase();

						if (mGrade.equals("silver") || mGrade.equals("gold") || mGrade.equals("vip") || mGrade.equals("vvip")) {
							break;
						} else {
							System.out.println("Silver, Gold, Vip �� �ϳ��� �Է��ϼ���.");
						}
					} catch (IOException ie) {
						ie.printStackTrace();
					}
				}
				while (true) {
					try {
						System.out.print("�̸��� �Է��ϼ���. : ");

						mName = br.readLine();

						int searchMember2 = searchMember(mName);

						if (searchMember2 == -1 || name.equals(mName)) {
							break;
						} else {
							System.out.println("�ߺ��� ȸ���� �����մϴ�.");
							continue;
						}

					} catch (IOException ie) {
						ie.printStackTrace();
					}
				}

				while (true) {
					try {
						System.out.print("����Ʈ�� �Է��ϼ���. : ");
						mPoint = Integer.parseInt(br.readLine());
						break;
					} catch (NumberFormatException ne) {
						System.err.println("���ڸ� �Է��ϼ���.");
					} catch (IOException ie) {
						ie.printStackTrace();
					}
				}

				switch (mGrade) {
				case "silver":
					members[searchMember] = new Silver(mName, mGrade, mPoint);
					break;
				case "gold":
					members[searchMember] = new Gold(mName, mGrade, mPoint);
					break;
				case "vip":
					members[searchMember] = new Vip(mName, mGrade, mPoint);
					break;
				case "vvip" : 
					members[searchMember] = new Vvip(mName, mGrade, mPoint);
					break;
				}

				System.out.println("ȸ�� ������ �����Ǿ����ϴ�.");
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}

		delay();
	}

	public void deleteMember() {

		String name;

		System.out.println("\n===== ȸ�� ���� =====");

		System.out.print("������ ȸ���� �̸��� �Է����ּ���. : ");

		try {
			name = br.readLine();

			int searchMember = searchMember(name);

			if (searchMember == -1) {
				System.out.println("��ϵ� ȸ���� �ƴմϴ�.");
			} else {
				for (int i = searchMember; i < index - 1; i++) {
					members[i] = members[i + 1];
				}

				members[--index] = null;

				System.out.println("ȸ�� ������ �����Ǿ����ϴ�.");
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}

		delay();
	}

	public int searchMember(String name) {

		for (int i = 0; i < index; i++) {
			if (members[i].getName().equals(name)) {
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
