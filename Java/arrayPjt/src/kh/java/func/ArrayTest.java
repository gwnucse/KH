package kh.java.func;

import java.util.Scanner;

public class ArrayTest {

	Scanner sc = new Scanner(System.in);

	public void arrayTest1() {

		// ������ ���� 10���� ������ �Ѵٸ�?
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
		// �迭�� �����Ѵٸ�
		int num[] = new int[10];

		for (int i = 0; i < num.length; i++) {
			System.out.println("Num" + i + " : " + num[i]);
			num[i] = i + 1;
			System.out.println("->Num" + i + " : " + num[i]);
			num[i] = (int) (Math.random() * 100);
			System.out.println("--> Num" + i + " : " + num[i]);
		}

		String arr[] = new String[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			arr[i] = sc.next();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arr[" + i + "] : " + arr[i]);
		}
	}

	public void arrayTest2() {
		int arr1[] = { 1, 2, 3, 4, 5 };
		// ���� ����
		int arr2[] = arr1;

		// �� �迭�� �ּҰ� ���
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());

		// arr1 �迭 ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println();

		// arr2 �迭 ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		arr1[2] = 100;
		arr2[1] = 300;

		System.out.println();

		// arr1 �迭 ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println();

		// arr2 �迭 ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println();

		System.out.println("----------------------");
	}

	public void arrayTest3() {
		int arr1[] = { 1, 2, 3, 4, 5 };
		
//		//1. for���� �̿��� ���� ����
//		int arr2[] = new int[arr1.length];
//
//		for (int i = 0; i < arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
		
//		//2. arraycopy�� �̿��� ���� ����
//		int arr2[] = new int[arr1.length];
//		//System.arraycopy(������ �迭 �̸�, ������ �迭�� ���� ��ȣ, ����� �迭�� �̸�, ����� �迭�� ���� ��ȣ, ������ ũ��) 
//		System.arraycopy(arr1, 0, arr2, 1, 4);
		
		//3. clone�� �̿��� ���� ����
		int arr2[] = new int[arr1.length];
		arr2 = arr1.clone();

		// �� �迭�� �ּҰ� ���
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());

		// arr1 �迭 ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println();

		// arr2 �迭 ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		arr1[2] = 100;
		arr2[1] = 300;

		System.out.println();

		// arr1 �迭 ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println();

		// arr2 �迭 ���
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println();

		System.out.println("----------------------");
	}
	
	public void arrayTest4() {
		int arr[][] = new int[3][5];

		int k = 1;
		
		//������� �� ����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k;
				k++;
			}
		}
		
		//���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
	}
}
