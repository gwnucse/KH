package kh.java.practice;

import java.util.Scanner;

public class Sample {
	
	Scanner sc = new Scanner(System.in);

	public void sample1() {
		
		System.out.print("���� �Է� : ");
		char ch = sc.next().charAt(0);
		
		System.out.printf("%c�� �����ڵ� �� : %d\n", ch, (int)ch);
		System.out.println();
	}
	
	public void sample2() {
		
		System.out.print("���� ���� �Է� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� ���� �Է� : ");
		int math = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		int eng = sc.nextInt();

		System.out.println("========== ��� ==========");
		int sum = kor + math + eng;
		int avg = sum / 3;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
	}
}
