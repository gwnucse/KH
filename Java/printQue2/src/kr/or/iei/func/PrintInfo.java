package kr.or.iei.func;

public class PrintInfo {
	
	public void printInfo() {
		String name = "���±�";
		int age = 27;
		char sex = '��';
		String address = "����";
		String phone = "01041555693";
		String email = "tg5693@gmail.com";
		
		System.out.println("�̸�\t����\t����\t����\t��ȭ��ȣ\t\t�̸���");
		System.out.println("------------------------------------------------------------------------");
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s\n", name, age, sex, address, phone, email);
		System.out.println("------------------------------------------------------------------------");
		
		name = "�赿��";
		age = 25;
		sex = '��';
		address = "��õ";
		phone = "01049179188";
		email = "practice968426@gmail.com";
		
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s\n", name, age, sex, address, phone, email);
	}
}
