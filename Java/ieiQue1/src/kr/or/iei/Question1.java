package kr.or.iei;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		int temp;
		
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է� : ");
			num[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		
		int sum = num[0] + num[num.length - 1];
		
		System.out.print("���ĵ� ��� : ");
		
		for (int i = 0 ; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		System.out.println("\n���� �� ù��° ���� ���������� �� : " + sum);
	}

}
