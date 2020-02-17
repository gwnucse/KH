package kr.or.iei.point.controller;

import java.util.ArrayList;
import java.util.HashMap;

import kr.or.iei.point.model.vo.Grade;
import kr.or.iei.point.view.PointView;

public class PointController {

	PointView view = new PointView();
	HashMap<String, Grade> members = new HashMap<String, Grade>();

	public void main() {

		while (true) {
			int select = view.mainMenu();

			switch (select) {
			case 1:
				insertMember();
				break;
			case 2:
				view.printAllMember(new ArrayList(members.values()));
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
				view.printMsg("0~5 ������ ���ڸ� �Է��ϼ���.");
			}
			
			delay();
		}
	}

	public void insertMember() {
		Grade member = view.insertMember(members.keySet());
		if (member != null) {
			members.put(member.getName(), member);
			view.printMsg("ȸ���� ��ϵǾ����ϴ�.");
		} else {
			view.printMsg("ȸ�� ����� �����߽��ϴ�.");
		}
	}
	
	public void printOneMember() {
		
		view.printMsg("\n----- ȸ�� 1�� ��� -----");
		String name = view.getName();
		
		if (members.containsKey(name)) {
			view.printOneMember(members.get(name));
		} else {
			view.printMsg("ȸ���� �������� �ʽ��ϴ�.");
		}
	}
	
	public void modifyMember() {
		
		view.printMsg("\n----- ȸ�� ���� ���� -----");
		String name = view.getName();
		
		if (members.containsKey(name)) {
			Grade member = view.modifyMember(members.keySet(), name);
			
			if (member != null) {
				if (member.getName().equals(name)) {
					members.put(name, member);
				} else {
					members.remove(name);
					members.put(member.getName(), member);
				}
				view.printMsg("ȸ�� ������ �����Ǿ����ϴ�.");
			} else {
				view.printMsg("ȸ�� ���� ������ �����߽��ϴ�.");
			}
		} else {
			view.printMsg("ȸ���� �������� �ʽ��ϴ�.");
		}
	}
	
	public void deleteMember() {
		view.printMsg("\n----- ȸ�� ���� ���� -----");
		String name = view.getName();
		
		if (members.containsKey(name)) {
			members.remove(name);
			view.printMsg("ȸ�� ������ �����Ǿ����ϴ�.");
		} else {
			view.printMsg("ȸ���� �������� �ʽ��ϴ�.");
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
