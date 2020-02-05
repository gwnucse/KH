package kr.or.iei.func;

import java.util.Scanner;
import java.util.Random;

public class Example {

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	public void exam1() {

		int arr[][] = new int[5][5];
		int num = 1;

		// 0�� 4������ �� �������� 1�� ����
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				arr[i][j] = num;
				num++;
			}
		}

		// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		num = 1;

		// 0�� 0������ �� �������� 1�� ����
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[j][i] = num;
				num++;
			}
		}

		// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		num = 1;

		// 0�� 4������ ���������� 1�� ����
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = arr.length - 1; j >= 0; j--) {
				arr[j][i] = num;
				num++;
			}
		}

		// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		num = 1;

		// ¦������ �����ʿ��� ��������, Ȧ������ ���ʿ��� ���������� 1�� ����
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = num;
					num++;
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					arr[i][j] = num;
					num++;
				}
			}
		}

		// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		num = 1;

		// ¦������ ���ʿ��� ����������, Ȧ������ �����ʿ��� �������� 1�� ����
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = num;
					num++;
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					arr[i][j] = num;
					num++;
				}
			}
		}

		// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		num = 1;

		// ¦������ ������ �Ʒ���, Ȧ������ �Ʒ����� ���� 1�� ����
		for (int i = 0; i < arr[0].length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					arr[j][i] = num;
					num++;
				}
			} else {
				for (int j = arr.length - 1; j >= 0; j--) {
					arr[j][i] = num;
					num++;
				}
			}
		}

		// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		num = 1;

		// ¦������ �Ʒ����� ����, Ȧ������ ������ �Ʒ��� 1�� ����
		for (int i = 0; i < arr[0].length; i++) {
			if (i % 2 != 0) {
				for (int j = 0; j < arr.length; j++) {
					arr[j][i] = num;
					num++;
				}
			} else {
				for (int j = arr.length - 1; j >= 0; j--) {
					arr[j][i] = num;
					num++;
				}
			}
		}

		// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");
	}

	public void exam2() {
		int row, column;

		// �� �Է�
		while (true) {
			System.out.print("�������� ������ �Է��ϼ���(1~10) ==> ");
			row = sc.nextInt();

			if (row >= 1 && row <= 10) {
				break;
			} else {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
			}
		}

		// �� �Է�
		while (true) {
			System.out.print("���ο��� ������ �Է��ϼ���(1~10) ==> ");
			column = sc.nextInt();

			if (column >= 1 && column <= 10) {
				break;
			} else {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
			}
		}

		char arr[][] = new char[row][column];

		// �������� ���ĺ� �ҹ��� �ֱ�
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char) (rand.nextInt(26) + 97);
			}
		}

		// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%c\t", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");
	}

	public void exam3() {
		// ������ �迭 �ð����

		System.out.print("2���� �迭 ũ�� �Է�(������) > ");
		int row = sc.nextInt();

		int arr[][] = new int[row][row];
		int max = row * row + 1;
		int num = 1;
		int count = row;
		int caseCheck = 0;
		int startRow = 0;
		int startColumn = 0;
		int i;

		while (num != max) {
			switch (caseCheck) {
			case 0:
				// �����ʿ��� �������� �����ϴ� ���, ���� ����, ���� ����. ���� ���� ����.
				for (i = startColumn; i < startColumn + count; i++) {
					arr[startRow][i] = num;
					// System.out.println("arr[" + startRow + "][" + i + "] = " + num);
					num++;
				}
				startColumn = i - 1;
				startRow++;
				count--;
				break;
			case 1:
				// ������ �Ʒ��� �����ϴ� ���, ���� ����, �ุ ����. ���� ���� ����.
				for (i = startRow; i < startRow + count; i++) {
					arr[i][startColumn] = num;
					num++;
				}
				startRow = i - 1;
				startColumn--;
				break;
			case 2:
				// ���ʿ��� �Ʒ��� �����ϴ� ���, ���� ����, ���� ����. ���� ���� ����.
				for (i = startColumn; i > startColumn - count; i--) {
					arr[startRow][i] = num;
					num++;
				}
				startColumn = i + 1;
				startRow--;
				count--;
				break;
			case 3:
				// �Ʒ����� ���� �����ϴ� ���, ���� ����, �ุ ����. ���� ���� ����.
				for (i = startRow; i > startRow - count; i--) {
					arr[i][startColumn] = num;
					num++;
				}
				startRow = i + 1;
				startColumn++;
				break;
			}

			caseCheck = (caseCheck + 1) % 4;
		}

		// ���
		for (i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void exam4() {
		// ������ �迭 ���ð����
		System.out.print("2���� �迭 ũ�� �Է�(������) > ");
		int row = sc.nextInt();

		int arr[][] = new int[row][row];
		int max = row * row + 1;
		int num = 1;
		int count = row;
		int caseCheck = 0;
		int startRow = 0;
		int startColumn = row - 1;
		int i;

		while (num != max) {
			switch (caseCheck) {
			case 0:
				//���ʿ��� ���������� �����ϴ� ���, ���� ����, ���� ����. ���� ���� ����.
				for (i = startColumn; i > startColumn - count; i--) {
					arr[startRow][i] = num;
//					System.out.println("arr[" + startRow + "][" + i + "] = " + num);
					num++;
				}
				startColumn = i + 1;
				startRow++;
				count--;
				break;
			case 1:
				//���ʿ��� �Ʒ������� �����ϴ� ���, ���� ����, �ุ ����. ���� ���� ����.
				for (i = startRow; i < startRow + count; i++) {
					arr[i][startColumn] = num;
//					System.out.println("arr[" + i + "][" + startColumn + "] = " + num);
					num++;
				}
				startRow = i - 1;
				startColumn++;
				break;
			case 2:
				//�����ʿ��� �������� �����ϴ� ���, ���� ����, ���� ����. ���� ���� ����.
				for (i = startColumn; i < startColumn + count; i++) {
					arr[startRow][i] = num;
//					System.out.println("arr[" + startRow + "][" + i + "] = " + num);
					num++;
				}
				startColumn = i - 1;
				startRow--;
				count--;
				break;
			case 3:
				//�Ʒ��ʿ��� �������� �����ϴ� ���, ���� ����, �ุ ����. ���� ���� ����.
				for (i = startRow; i > startRow - count; i--) {
					arr[i][startColumn] = num;
//					System.out.println("arr[" + i + "][" + startColumn + "] = " + num);
					num++;
				}
				startRow = i + 1;
				startColumn--;
				break;
			}

//			System.out.println("caseCheck : " + caseCheck);
			caseCheck = (caseCheck + 1) % 4;
		}

		// ���
		for (i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
	}
}
