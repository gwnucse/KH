package kh.java.student.controller;

import java.util.ArrayList;

import kh.java.student.model.vo.Student;
import kh.java.student.view.StudentView;

public class StudentController {

	StudentView view = new StudentView();
	ArrayList<Student> students = new ArrayList<Student>();

	public void main() {
		while (true) {
			int select = view.mainMenu();

			switch (select) {
			case 1:
				insertStudent();
				break;
			case 2:
				view.printAllStudent(students);
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
				view.printMsg("0~5������ ���ڸ� �Է��ϼ���.");
			}
			
			delay();
		}
	}

	public void insertStudent() {

		Student stu = view.insertStudent();
		students.add(stu);
		view.printMsg("�л� ������ ��ϵǾ����ϴ�.");
	}

	public void printOneStudent() {

		view.printMsg("\n-----�л� 1�� ���� ��� -----");
		
		String name = view.getName();
		int searchIndex = searchStudent(name);

		if (searchIndex == -1) {
			view.printMsg("�л��� �������� �ʽ��ϴ�.");
		} else {
			view.printOneStudent(students.get(searchIndex));
		}
	}
	
	public void modifyStudent() {
	
		view.printMsg("\n----- �л� ���� ���� -----");
		
		String name = view.getName();
		int searchIndex = searchStudent(name);
		
		if (searchIndex == -1) {
			view.printMsg("�л��� �������� �ʽ��ϴ�.");
		} else {
			Student stu = view.modifyStudent();
			students.set(searchIndex, stu);
			view.printMsg("�л� ������ �����Ǿ����ϴ�.");
		}
	}
	
	public void deleteStudent() {

		view.printMsg("\n----- �л� ���� ���� -----");
		
		String name = view.getName();
		int searchIndex = searchStudent(name);
		
		if (searchIndex == -1) {
			view.printMsg("�л��� �������� �ʽ��ϴ�.");
		} else {
			students.remove(searchIndex);
			view.printMsg("�л� ������ �����Ǿ����ϴ�.");
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

	private void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	
}
