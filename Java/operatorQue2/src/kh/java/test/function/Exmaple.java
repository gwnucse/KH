package kh.java.test.function;

import java.util.Scanner;

public class Exmaple {
	
	Scanner sc = new Scanner(System.in);

	public void exam1() {
		int kor, eng, math;
		
		System.out.print("���� ���� �Է� : ");
		kor = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("�հ� : " + sum);
		System.out.printf("��� : %.2f\n", avg);
		
		boolean result = ((kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60));
		String str = result ? "�հ�" : "���հ�";
		System.out.println(str);

		System.out.println("=========================");
	}
	
	public void exam2() {
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		String str = num % 2 == 0 ? "¦��!" : "Ȧ��!";
		
		System.out.println(str);
	}
}
