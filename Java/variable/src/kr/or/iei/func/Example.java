package kr.or.iei.func;

public class Example {
	
	public void exam1() {
		int num1;
		num1 = 100;
		char ch1 = '1';
		long num2 = 10000L;
		float fNum = 3.14f;
		final double PI = 3.14;
		
		System.out.println("���� ��� : " + (num1 + num1));
		num1 = 300;
		System.out.println("���� ��� : " + (num1 + num1));
		System.out.println("���� ��� : " + (ch1 + ch1));
	}
	
	public void exam2() {
		//���� 4�� ����
		//�� ���� ���� �� ���� ���� �Է� �� ���
		
		String name = "���±�";	//�̸��� ������ ���� -> String
		int age = 27;	//���̸� ������ ���� -> int
		String address = "����� ���α� �õ� 190-146 �߾��������� A�� 302ȣ";	//�ּҸ� ������ ���� -> String
		char sex = '��';	//����(��/��) -> char
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
		System.out.println("���� : " + sex);
	}
}
