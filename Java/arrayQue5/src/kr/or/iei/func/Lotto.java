package kr.or.iei.func;

import java.util.Scanner;
import java.util.Random;

public class Lotto {

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	public Lotto() {
		while (true) {
			try {

				int select;

				while (true) {
					System.out.println("====== ���α׷� ���� ======");
					System.out.println("1. 1ȸ");
					System.out.println("2. ��÷�� �� ����");
					System.out.println("3. ���α׷� ����");
					System.out.print("���� > ");

					select = Integer.parseInt(sc.next());
					if (select == 1 || select == 2 || select == 3) {
						break;
					}
				}

				if (select == 1) {
					lottoOne();
				} else if (select == 2) {
					lottoLoop();
				} else {
					break;
				}

			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			}
		}
	}

	private void lottoOne() {
		while (true) {
			System.out.println("========== �ζ� ���α׷� ==========");

			int count = 0;
			int userNum[] = new int[6];
			int comNum[] = new int[6];
			int number, i, temp;

			while (count != 6) {
				System.out.print((count + 1) + "��° ��ȣ �Է�(1~45) : ");
				number = sc.nextInt();

				if (number < 1 || number > 45) {
					System.out.println("�߸��Է��ϼ̽��ϴ�. 1~45�� �Ѱ��� �Է����ּ���.");
				} else {
					for (i = 0; i < userNum.length; i++) {
						if (userNum[i] == number) {
							System.out.println("�̹� �ߺ��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
							break;
						}
					}

					if (i == userNum.length) {
						userNum[count] = number;
						count++;
					}
				}
			}

			for (i = 0; i < userNum.length - 1; i++) {
				for (int j = 0; j < userNum.length - i - 1; j++) {
					if (userNum[j] > userNum[j + 1]) {
						temp = userNum[j];
						userNum[j] = userNum[j + 1];
						userNum[j + 1] = temp;
					}
				}
			}
			System.out.println("����� ��ȣ");

			for (i = 0; i < userNum.length; i++) {
				System.out.print(userNum[i] + " ");
			}

			System.out.println();

			count = 0;

			while (count != 6) {
				number = rand.nextInt(45) + 1;

				for (i = 0; i < comNum.length; i++) {
					if (comNum[i] == number) {
						break;
					}
				}

				if (i == comNum.length) {
					comNum[count] = number;
					count++;
				}
			}

			for (i = 0; i < comNum.length - 1; i++) {
				for (int j = 0; j < comNum.length - i - 1; j++) {
					if (comNum[j] > comNum[j + 1]) {
						temp = comNum[j];
						comNum[j] = comNum[j + 1];
						comNum[j + 1] = temp;
					}
				}
			}
			System.out.println("��ǻ�� ��ȣ");

			for (i = 0; i < comNum.length; i++) {
				System.out.print(comNum[i] + " ");
			}

			System.out.println();

			int collect = 0;

			for (i = 0; i < userNum.length; i++) {
				for (int j = 0; j < userNum.length; j++) {
					if (userNum[i] == comNum[j]) {
						collect++;
						break;
					}
				}
			}

			System.out.println("���� ���� : " + collect);

			switch (collect) {
			case 6:
				System.out.println("1��");
				break;
			case 5:
				System.out.println("2��");
				break;
			case 4:
				System.out.println("3��");
				break;
			case 3:
				System.out.println("4��");
				break;
			default:
				System.out.println("��");
			}

			System.out.print("�ѹ� �� �Ͻðڽ��ϱ�(1. yes, 2. no)? ");
			int again = sc.nextInt();

			if (again != 1) {
				break;
			}
		}
	}

	private void lottoLoop() {
		System.out.println("========== �ζ� ���α׷� ==========");

		int count = 0;
		int loop = 1;
		int userNum[] = new int[6];
		int comNum[] = new int[6];
		int clearArray[] = new int[6];
		int number, i, temp;

		while (count != 6) {
			System.out.print((count + 1) + "��° ��ȣ �Է�(1~45) : ");
			number = sc.nextInt();

			if (number < 1 || number > 45) {
				System.out.println("�߸��Է��ϼ̽��ϴ�. 1~45�� �Ѱ��� �Է����ּ���.");
			} else {
				for (i = 0; i < userNum.length; i++) {
					if (userNum[i] == number) {
						System.out.println("�̹� �ߺ��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
						break;
					}
				}

				if (i == userNum.length) {
					userNum[count] = number;
					count++;
				}
			}
		}

		for (i = 0; i < userNum.length - 1; i++) {
			for (int j = 0; j < userNum.length - i - 1; j++) {
				if (userNum[j] > userNum[j + 1]) {
					temp = userNum[j];
					userNum[j] = userNum[j + 1];
					userNum[j + 1] = temp;
				}
			}
		}

		while (true) {

			count = 0;
			System.out.println("========== " + loop + "ȸ�� ==========");
			
			comNum = clearArray.clone();
			
			while (count != 6) {
				number = rand.nextInt(45) + 1;

				for (i = 0; i < comNum.length; i++) {
					if (comNum[i] == number) {
						break;
					}
				}

				if (i == comNum.length) {
					comNum[count] = number;
					count++;
				}
			}

			for (i = 0; i < comNum.length - 1; i++) {
				for (int j = 0; j < comNum.length - i - 1; j++) {
					if (comNum[j] > comNum[j + 1]) {
						temp = comNum[j];
						comNum[j] = comNum[j + 1];
						comNum[j + 1] = temp;
					}
				}
			}
			
			System.out.println("����� ��ȣ");

			for (i = 0; i < userNum.length; i++) {
				System.out.print(userNum[i] + " ");
			}

			System.out.println();
			
			System.out.println("��ǻ�� ��ȣ");

			for (i = 0; i < comNum.length; i++) {
				System.out.print(comNum[i] + " ");
			}

			System.out.println();

			int collect = 0;

			for (i = 0; i < userNum.length; i++) {
				for (int j = 0; j < userNum.length; j++) {
					if (userNum[i] == comNum[j]) {
						collect++;
						break;
					}
				}
			}

			System.out.println("���� ���� : " + collect);

			switch (collect) {
			case 6:
				System.out.println("1��");
				break;
			case 5:
				System.out.println("2��");
				break;
			case 4:
				System.out.println("3��");
				break;
			case 3:
				System.out.println("4��");
				break;
			default:
				System.out.println("��");
			}
			
			if (collect > 4) {
				break;
			} else {
				loop++;
			}
		}
		
	}
}
