package kr.or.iei.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import kr.or.iei.point.Gold;
import kr.or.iei.point.Grade;
import kr.or.iei.point.Silver;
import kr.or.iei.point.Vip;
import kr.or.iei.point.Vvip;

public class PointMgrMap {
	HashMap<String, Grade> members = new HashMap<String, Grade>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void main() {

		while (true) {

			System.out.println("\n===== ����Ʈ ���� �ý��� =====");
			System.out.println("1. ȸ�� ���");
			System.out.println("2. ȸ�� ��ü ���� ���");
			System.out.println("3. ȸ�� 1�� ���� ���");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� > ");

			try {
				int select = Integer.parseInt(br.readLine());

				switch (select) {
				case 1:
					insertMember();
					break;
				case 2:
					printAllMember();
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
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			} finally {
				delay();
			}
		}
	}

	public void insertMember() {

		String nGrade, nName;
		int nPoint;

		System.out.println("\n----- ȸ�� ��� -----");

		while (true) {

			System.out.print("����� �Է��ϼ��� [Silver/Gold/VIP/VVIP] : ");

			try {
				nGrade = br.readLine().toLowerCase();

				if (nGrade.equals("silver") || nGrade.equals("gold") || nGrade.equals("vip") || nGrade.equals("vvip")) {
					break;
				} else {
					System.out.println("[Silver/Gold/VIP/VVIP] �� �ϳ��� �Է��ϼ���.");
					continue;
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

		while (true) {

			System.out.print("�̸��� �Է��ϼ��� : ");

			try {
				nName = br.readLine().toLowerCase();

				if (!members.containsKey(nName)) {
					break;
				} else {
					System.out.println("������ ����ڰ� �����մϴ�.");
					continue;
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

		while (true) {

			System.out.print("����Ʈ�� �Է��ϼ��� : ");

			try {
				nPoint = Integer.parseInt(br.readLine());

				if (nPoint < 0) {
					System.out.println("0�̻��� ���ڸ� �Է��ϼ���.");
					continue;
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
				delay();
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

		switch (nGrade) {
		case "silver":
			members.put(nName, new Silver(nGrade, nName, nPoint));
			break;
		case "gold":
			members.put(nName, new Gold(nGrade, nName, nPoint));
			break;
		case "vip":
			members.put(nName, new Vip(nGrade, nName, nPoint));
			break;
		case "vvip":
			members.put(nName, new Vvip(nGrade, nName, nPoint));
			break;
		}

		System.out.println("ȸ�� ����� �Ϸ�Ǿ����ϴ�.");
	}

	public void printAllMember() {

		if (members.isEmpty()) {
			System.out.println("��ϵ� ȸ���� �����ϴ�.");
			return;
		}

		System.out.println("\n----- ȸ�� ��ü ���� ��� -----");
		System.out.println("�̸�\t���\t����Ʈ\t���ʽ� ����Ʈ");

		for (Grade member : members.values()) {
			System.out.println(member);
		}
	}

	public void printOneMember() {

		if (members.isEmpty()) {
			System.out.println("��ϵ� ȸ���� �����ϴ�.");
			return;
		}

		System.out.println("\n----- ȸ�� 1�� ���� ��� -----");
		System.out.print("��ȸ�� �̸��� �Է��ϼ��� : ");

		try {
			String name = br.readLine();

			if (!members.containsKey(name)) {
				System.out.println("��ϵ� ȸ���� �ƴմϴ�.");
				return;
			} else {
				System.out.println("�̸� : " + members.get(name).getName());
				System.out.println("��� : " + members.get(name).getGrade());
				System.out.println("����Ʈ : " + members.get(name).getPoint());
				System.out.println("���ʽ� ����Ʈ : " + members.get(name).getBonus());
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		}

	}

	public void modifyMember() {

		if (members.isEmpty()) {
			System.out.println("��ϵ� ȸ���� �����ϴ�.");
			return;
		}

		String nName, nGrade;
		int nPoint;

		System.out.println("\n----- ȸ�� ���� ���� -----");
		System.out.print("������ �̸��� �Է��ϼ��� : ");

		try {
			String name = br.readLine();

			if (!members.containsKey(name)) {
				System.out.println("��ϵ� ȸ���� �ƴմϴ�.");
				return;
			} else {

				while (true) {

					System.out.print("����� �Է��ϼ��� [Silver/Gold/VIP/VVIP] : ");

					try {
						nGrade = br.readLine().toLowerCase();

						if (nGrade.equals("silver") || nGrade.equals("gold") || nGrade.equals("vip")
								|| nGrade.equals("vvip")) {
							break;
						} else {
							System.out.println("[Silver/Gold/VIP/VVIP] �� �ϳ��� �Է��ϼ���.");
							continue;
						}
					} catch (IOException ie) {
						ie.printStackTrace();
					}

				}

				while (true) {

					System.out.print("�̸��� �Է��ϼ��� : ");

					try {
						nName = br.readLine().toLowerCase();

						if (!members.containsKey(nName) || name.equals(nName)) {
							break;
						} else {
							System.out.println("������ ����ڰ� �����մϴ�.");
							continue;
						}
					} catch (IOException ie) {
						ie.printStackTrace();
					}

				}

				while (true) {

					System.out.print("����Ʈ�� �Է��ϼ��� : ");

					try {
						nPoint = Integer.parseInt(br.readLine());

						if (nPoint < 0) {
							System.out.println("0�̻��� ���ڸ� �Է��ϼ���.");
							continue;
						} else {
							break;
						}
					} catch (NumberFormatException ne) {
						System.err.println("���ڸ� �Է��� �ּ���.");
						delay();
					} catch (IOException ie) {
						ie.printStackTrace();
					}

				}

				members.remove(name);
				
				switch (nGrade) {
				case "silver":
					members.put(nName, new Silver(nGrade, nName, nPoint));
					break;
				case "gold":
					members.put(nName, new Gold(nGrade, nName, nPoint));
					break;
				case "vip":
					members.put(nName, new Vip(nGrade, nName, nPoint));
					break;
				case "vvip":
					members.put(nName, new Vvip(nGrade, nName, nPoint));
					break;
				}

				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public void deleteMember() {

		if (members.isEmpty()) {
			System.out.println("��ϵ� ȸ���� �����ϴ�.");
			return;
		}

		System.out.println("\n----- ȸ�� ���� ���� -----");
		System.out.print("������ �̸��� �Է��ϼ��� : ");

		try {
			String name = br.readLine();

			if (!members.containsKey(name)) {
				System.out.println("��ϵ� ȸ���� �ƴմϴ�.");
				return;
			} else {
				members.remove(name);
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public void delay() {

		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
