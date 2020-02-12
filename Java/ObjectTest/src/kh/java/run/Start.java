package kh.java.run;

import kh.java.test.Test1;

public class Start {

	public static void main(String[] args) {

		//toString()
		Test1 t1 = new Test1();
		System.out.println(t1);
		System.out.println(t1.toString());
		
		//clone()
		Test1 t2 = (Test1)t1.clone();	
		//������ clone() �޼ҵ�� protected�̱� ������ �ٷ� ��� �Ұ�, Test1���� clone() �޼ҵ��� Override�� �ʿ���.
		//���� Ÿ���� Object�� clone() �޼ҵ�� Test1���� Object�� ���� �� ���⿡ ����� ����ȯ�� �ʿ���.
		
		//equals()
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		//str1�� str2�� �ּҸ� ���ϱ� ������ �������� ���ڿ��� ��� �񱳰� �Ұ�����.
		if (str1 == str2) {
			System.out.println("�����ϴ�.");
		} else {
			System.out.println("�ٸ��ϴ�.");
		}
		
		//�� ���빰�� ���Ͽ� boolean�� ����.
		if (str1.equals(str2)) {
			System.out.println("�����ϴ�.");
		} else {
			System.out.println("�ٸ��ϴ�.");
		}
		
		//new�� �̿��� ���� ""�� �̿��� ���� ���� �ٸ��� �۵��� �Ѵ�.
		str1 = "Hello";
		str2 = "Hello";
		
		//�ٸ� Ŭ������ ���� ������ String���� Ư���� ����̱⿡ ���ٰ� ����� �ȴ�.
		if (str1 == str2) {
			System.out.println("�����ϴ�.");
		} else {
			System.out.println("�ٸ��ϴ�.");
		}
		
		//�� ���빰�� ���Ͽ� boolean�� ����.
		if (str1.equals(str2)) {
			System.out.println("�����ϴ�.");
		} else {
			System.out.println("�ٸ��ϴ�.");
		}
	}

}
