package kh.java.func;

import java.util.Scanner;

public class MethodTest {
	
	Scanner sc = new Scanner(System.in);

	public void main() {
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();
		
//		int sum = num1 + num2;	//100���� ���
//		System.out.println("�� ���� ���� : " + sum);
//		//�ҽ��ڵ� �߰� �ۼ�
//		//���� 100��¥�� ������ ������ �ϴ� ��� �� �� �� �ʹ� �����
		
		int sum = sum(num1, num2);
		System.out.println("�� ���� ���� : " + sum);
		
		int sub = sub(num1, num2);
		System.out.println("�� ���� ���� : " + sub);
		
		int mult = multifly(num1, num2);
		System.out.println("�� ���� ���� : " + mult);
		
		double divide = divide(num1, num2);
		System.out.printf("�� ���� �������� : %.2f\n", divide);
		
		System.out.print("�����ڸ� �Է��ϼ���[+, -, *, /] : ");
		char oper = sc.next().charAt(0);
		
		if (oper == '+') {
			sum = sum(num1, num2);
			System.out.println("�� ���� ���� : " + sum);
		} else if (oper == '-') {
			sub = sub(num1, num2);
			System.out.println("�� ���� ���� : " + sub);
		} else if (oper == '*') {
			mult = multifly(num1, num2);
			System.out.println("�� ���� ���� : " + mult);
		} else if (oper == '/') {
			divide = divide(num1, num2);
			System.out.printf("�� ���� �������� : %.2f", divide);
		}
	}
	
	public int sum(int su1, int su2) {
		System.out.println("���� 2���� ���ϴ� �޼ҵ��Դϴ�.");
		int result = su1 + su2;
		return result;
	}
	
	//�޼ҵ� �����ε�
	public int sum(int su1, int su2, int su3) {
		System.out.println("���� 3���� ���ϴ� �޼ҵ��Դϴ�.");
		int result = su1 + su2 + su3;
		return result;
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multifly(int num1, int num2) {
		return num1 * num2;
	}
	
	public double divide(int num1, int num2) {
		return (double)num1 / num2;
	}
}
