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
		System.out.println("----------------------------------------");
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
				// ���ʿ��� ���������� �����ϴ� ���, ���� ����, ���� ����. ���� ���� ����.
				for (i = startColumn; i > startColumn - count; i--) {
					arr[startRow][i] = num;
					// System.out.println("arr[" + startRow + "][" + i + "] = " + num);
					num++;
				}
				startColumn = i + 1;
				startRow++;
				count--;
				break;
			case 1:
				// ���ʿ��� �Ʒ������� �����ϴ� ���, ���� ����, �ุ ����. ���� ���� ����.
				for (i = startRow; i < startRow + count; i++) {
					arr[i][startColumn] = num;
					// System.out.println("arr[" + i + "][" + startColumn + "] = " + num);
					num++;
				}
				startRow = i - 1;
				startColumn++;
				break;
			case 2:
				// �����ʿ��� �������� �����ϴ� ���, ���� ����, ���� ����. ���� ���� ����.
				for (i = startColumn; i < startColumn + count; i++) {
					arr[startRow][i] = num;
					// System.out.println("arr[" + startRow + "][" + i + "] = " + num);
					num++;
				}
				startColumn = i - 1;
				startRow--;
				count--;
				break;
			case 3:
				// �Ʒ��ʿ��� �������� �����ϴ� ���, ���� ����, �ุ ����. ���� ���� ����.
				for (i = startRow; i > startRow - count; i--) {
					arr[i][startColumn] = num;
					// System.out.println("arr[" + i + "][" + startColumn + "] = " + num);
					num++;
				}
				startRow = i + 1;
				startColumn--;
				break;
			}

			// System.out.println("caseCheck : " + caseCheck);
			caseCheck = (caseCheck + 1) % 4;
		}

		// ���
		for (i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
	}

	public void exam5() {

		System.out.print("2���� �迭 ũ�� �Է�(������) > ");
		int insert = sc.nextInt();

		int arr[][] = new int[insert][insert];
		// ���� ���¸� �����ϱ� ���� ����. 1�̸� ����, -1�̸� ���� �����̴�.
		int course = 1;
		// ���� ��� ���� �����ϱ� ���� ����.
		int row = 0;
		int column = 0;
		// 1����Ŭ���� ��ȸ ����� �����ؾ� �ϴ��� �����ϱ� ���� ����.
		int count = arr.length * 2 - 1;
		int i, j;
		int num = 1;

		while (true) {

			for (i = 0; i < count / 2 + 1; i++) {
				// System.out.println("arr[" + row + "][" + column + "] = " + num);
				arr[row][column] = num;
				// course�� 1�̸� column�� 1 ����, -1�̸� column�� 1 �����Ѵ�.
				column = (column * course + 1) * course;
				num++;
			}

			column = (column * course - 1) * course;

			for (i = count / 2 + 1; i < count; i++) {
				// System.out.println("arr[" + row + "][" + column + "] = " + num);
				row = (row * course + 1) * course;
				arr[row][column] = num;
				num++;
			}

			count -= 2;

			if (count < 0) {
				break;
			} else {
				course *= -1;
			}

			column = (column * course + 1) * course;
		}

		// ���
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
	}

	public void exam6() {

		System.out.print("2���� �迭 ũ�� �Է�(������) > ");
		int insert = sc.nextInt();

		int arr[][] = new int[insert][insert];
		// ���� ���¸� �����ϱ� ���� ����. 1�̸� ����, -1�̸� ���� �����̴�.
		int course = -1;
		// ���� ��� ���� �����ϱ� ���� ����.
		int row = 0;
		int column = insert - 1;
		// 1����Ŭ���� ��ȸ ����� �����ؾ� �ϴ��� �����ϱ� ���� ����.
		int count = arr.length * 2 - 1;
		int i, j;
		int num = 1;

		while (true) {

			for (i = 0; i < count / 2 + 1; i++) {
				// System.out.println("arr[" + row + "][" + column + "] = " + num);
				arr[row][column] = num;
				// course�� 1�̸� column�� 1 ����, -1�̸� column�� 1 �����Ѵ�.
				column = (column * course + 1) * course;
				num++;
			}

			column = (column * course - 1) * course;
			course *= -1;

			for (i = count / 2 + 1; i < count; i++) {
				// System.out.println("arr[" + row + "][" + column + "] = " + num);
				row = (row * course + 1) * course;
				arr[row][column] = num;
				num++;
			}

			count -= 2;

			if (count < 0) {
				break;
			}

			column = (column * course + 1) * course;
		}

		// ���
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");

	}

	public void exam7() { // �����̹迭
		System.out.print("2���� �迭 ũ�� �Է�(������) > ");
		int size = sc.nextInt();
		int[][] arr = new int[size][size]; // �Է¹���ũ���� ������ �迭 ����
		int k = 1; // �迭���� ä�� �� ����
		int inc = 1; // �ε�����ȣ ������ ����
		int r = 0; // 2�����迭 �� �ε�����ȣ
		int c = -1; // 2�����迭 �� �ε�����ȣ
		while (size > 0) {
			for (int i = 0; i < size; i++) {
				c = c + inc;
				arr[r][c] = k;
				k++;
			}
			size--;
			for (int i = 0; i < size; i++) {
				r = r + inc;
				arr[r][c] = k;
				k++;
			}
			inc = -inc;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exam8() {
		System.out.print("2���� �迭 ũ�� �Է�(������) > ");
		int size = sc.nextInt();
		int[][] arr = new int[size][size]; // �Է¹���ũ���� ������ �迭 ����
		int k = 1; // �迭���� ä�� �� ����
		int inc = -1; // �ε�����ȣ ������ ����
		int r = 0; // 2�����迭 �� �ε�����ȣ
		int c = size; // 2�����迭 �� �ε�����ȣ
		while (size > 0) {
			for (int i = 0; i < size; i++) {
				c = c + inc;
				arr[r][c] = k;
				k++;
			}
			size--;
			inc = -inc;
			for (int i = 0; i < size; i++) {
				r = r + inc;
				arr[r][c] = k;
				k++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
