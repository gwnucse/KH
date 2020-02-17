package kr.or.iei.point.view;

import java.util.ArrayList;
import java.util.Scanner;

import kr.or.iei.point.controller.PointController;
import kr.or.iei.point.model.vo.Gold;
import kr.or.iei.point.model.vo.Grade;
import kr.or.iei.point.model.vo.Silver;
import kr.or.iei.point.model.vo.Vip;
import kr.or.iei.point.model.vo.Vvip;

public class PointView {

	Scanner sc = new Scanner(System.in);

	public int mainMenu() {

		System.out.println("\n===== ����Ʈ ���� ���α׷� =====");
		System.out.println("1. ȸ�� ���");
		System.out.println("2. ȸ�� ��ü ���");
		System.out.println("3. ȸ�� 1�� ���");
		System.out.println("4. ȸ�� ����");
		System.out.println("5. ȸ�� ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� > ");

		int select = sc.nextInt();

		return select;
	}

	public Grade insertMember(PointController pointCon) {

		String grade, name;
		int point;

		while (true) {

			System.out.print("����� �Է��ϼ���[Silver/Gold/VIP/VVIP] : ");
			grade = sc.next().toLowerCase();

			if (grade.equals("silver") || grade.equals("gold") || grade.equals("vip") || grade.equals("vvip")) {
				break;
			} else {
				System.out.println("[Silver/Golde/VIP/VVIP] �� �ϳ��� �Է��ϼ���.");
			}
		}

		while (true) {

			System.out.print("�̸��� �Է��ϼ��� : ");
			name = sc.next();

			if (pointCon.searchName(name)) {
				System.out.println("�ߺ��� �̸��Դϴ�. �ٽ� �Է��ϼ���.");
			} else {
				break;
			}
		}

		while (true) {

			System.out.print("����Ʈ�� �Է��ϼ��� : ");
			point = sc.nextInt();

			if (point < 0) {
				System.out.println("0�̻��� ���ڸ� �Է��ϼ���.");
			} else {
				break;
			}
		}

		switch (grade) {
		case "silver":
			return new Silver(grade, name, point);
		case "gold":
			return new Gold(grade, name, point);
		case "vip":
			return new Vip(grade, name, point);
		case "vvip":
			return new Vvip(grade, name, point);
		default:
			return null;
		}

	}

	public void printAllMember(ArrayList<Grade> members) {
		System.out.println("\n----- ȸ�� ��ü ��� -----");
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ� ����Ʈ");
		
		for (Grade member : members) {
			System.out.println(member);
		}
	}
	
	public void printOneMember(Grade member) {
		
		System.out.println("��� : " + member.getGrade().toUpperCase());
		System.out.println("�̸� : " + member.getName());
		System.out.println("����Ʈ : " + member.getPoint());
		System.out.println("���ʽ� ����Ʈ : " + member.getBonus());
	}
	
	public Grade modifyMember(PointController pointCon, String name) {
		
		String nGrade, nName;
		int nPoint;

		while (true) {

			System.out.print("����� �Է��ϼ���[Silver/Gold/VIP/VVIP] : ");
			nGrade = sc.next().toLowerCase();

			if (nGrade.equals("silver") || nGrade.equals("gold") || nGrade.equals("vip") || nGrade.equals("vvip")) {
				break;
			} else {
				System.out.println("[Silver/Golde/VIP/VVIP] �� �ϳ��� �Է��ϼ���.");
			}
		}

		while (true) {

			System.out.print("�̸��� �Է��ϼ��� : ");
			nName = sc.next();

			if (pointCon.searchName(nName) && !nName.equals(name)) {
				System.out.println("�ߺ��� �̸��Դϴ�. �ٽ� �Է��ϼ���.");
			} else {
				break;
			}
		}

		while (true) {

			System.out.print("����Ʈ�� �Է��ϼ��� : ");
			nPoint = sc.nextInt();

			if (nPoint < 0) {
				System.out.println("0�̻��� ���ڸ� �Է��ϼ���.");
			} else {
				break;
			}
		}

		switch (nGrade) {
		case "silver":
			return new Silver(nGrade, nName, nPoint);
		case "gold":
			return new Gold(nGrade, nName, nPoint);
		case "vip":
			return new Vip(nGrade, nName, nPoint);
		case "vvip":
			return new Vvip(nGrade, nName, nPoint);
		default:
			return null;
		}
		
	}
	
	public String getName() {
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		
		return name;
	}
	
	public void printMsg(String msg) {
		System.out.println(msg);
	}

}
