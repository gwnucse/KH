package kr.or.iei.func;

import java.util.Scanner;
import java.util.Random;

public class Example {

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	public void exam() {
		int num[] = new int[10000];
		int num2[] = new int[10000];
		int num3[] = new int[10000];
		int temp, index, remember;
		int i, j;
		
		//���� �ð� ������ ���� ����
		long start[] = new long[3];
		long end[] = new long[3];

		try {
			for (i = 0; i < num.length; i++) {
				System.out.print((i + 1) + "��° ���� �Է� : ");
//				num[i] = Integer.parseInt(sc.next());
				num[i] = rand.nextInt(1000000);
				System.out.println(num[i]);
				num2[i] = num[i];
				num3[i] = num[i];
			}

			start[0] = System.currentTimeMillis();
			
			//��������
			for (i = 0; i < num.length - 1; i++) {
				//1����Ŭ �� 0���� �迭 ���� - i��ŭ �ٷ� ���� �װ� ���Ͽ� �����Ѵ�.
				for (j = 0; j < num.length - 1 - i; j++) {
					if (num[j] > num[j + 1]) {
						temp = num[j];
						num[j] = num[j + 1];
						num[j + 1] = temp;
					}
				}
			}
			
			end[0] = System.currentTimeMillis();

			for (i = 0; i < num.length; i++) {
				System.out.print(num[i] + "\t");
			}

			System.out.println();
			
			start[1] = System.currentTimeMillis();

			//��������
			for (i = 0; i < num.length; i++) {
				//1����Ŭ�� index�� i�� �����Ͽ� index���� ���ϴ� �׺��� Ʈ�� index���� �����Ѵ�.
				index = i;
				for (j = i + 1; j < num.length; j++) {
					if (num2[index] > num2[j]) {
						index = j;
					}
				}
				
				//���� index�� i�� �ٸ� ��� ��, index�� �� ���� ������ index�� �ٸ��� ��ȯ�Ѵ�.
				if (i != index) {
					temp = num2[i];
					num2[i] = num2[index];
					num2[index] = temp;
				}
			}
			
			end[1] = System.currentTimeMillis();

			for (i = 0; i < num2.length; i++) {
				System.out.print(num2[i] + "\t");
			}

			System.out.println();
			
			start[2] = System.currentTimeMillis();

			//��������
			for (i = 0; i < num.length - 1; i++) {
				remember = num3[i + 1];

				for (j = i; j >= 0; j--) {
					if (remember < num3[j]) {
						num3[j + 1] = num3[j];
					} else {
						break;
					}
				}
				
				num3[j + 1] = remember;
			}
			
			end[2] = System.currentTimeMillis();

			for (i = 0; i < num3.length; i++) {
				System.out.print(num3[i] + "\t");
			}

			System.out.println();
			
			for (i = 0; i < 3; i++) {
				System.out.println((i + 1) + "�� ���� �ҿ� �ð� : " + (end[i] - start[i]));
			}
			
		} catch (NumberFormatException ne) {
			System.err.println("���ڸ� �Է��� �ּ���.");
		}
	}
}
