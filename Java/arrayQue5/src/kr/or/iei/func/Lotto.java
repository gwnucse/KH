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
				} else if (select == 3) {
					break;
				} else {
					System.out.println("1~3 ������ ���ڸ� �Է��� �ּ���.");
				}

			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			}
		}
	}

	//1���� ���ϴ� �ζ� ���α׷�
	private void lottoOne() {
		while (true) {
			System.out.println("========== �ζ� ���α׷� ==========");

			int count = 0;
			int userNum[] = new int[6];
			int comNum[] = new int[6];
			int number, i, temp;

			//����� ���� �Է�
			while (count != 6) {
				System.out.print((count + 1) + "��° ��ȣ �Է�(1~45) : ");
				number = sc.nextInt();

				if (number < 1 || number > 45) {
					//����ڰ� �Է��� ���ڰ� 1~45 ���̰� �ƴ� ���
					System.out.println("�߸��Է��ϼ̽��ϴ�. 1~45�� �Ѱ��� �Է����ּ���.");
				} else {
					//����ڰ� �Է��� ���ڰ� 1~45 ������ ��� �ߺ� üũ
					for (i = 0; i < count; i++) {
						//������ ���ڰ� �����ϴ� ��� break
						if (userNum[i] == number) {
							System.out.println("�̹� �ߺ��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
							break;
						}
					}

					//count�� i�� ��� ��, count������ ������ ���ڰ� �ƴ� ��� userNum[count]�� ���ڸ� �Է��ϰ� count�� 1 ������Ų��.
					if (i == count) {
						userNum[count] = number;
						count++;
					}
				}
			}

			//���� ������ �̿��Ͽ� ���� ����
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

			//��ǻ�� ���� �Է�
			while (count != 6) {
				//������ �̿��Ͽ� ���ڸ� �Է��Ѵ�.
				number = rand.nextInt(45) + 1;

				for (i = 0; i < count; i++) {
					//������ ���ڰ� �����ϴ� ��� break
					if (comNum[i] == number) {
						break;
					}
				}

				//count�� i�� ��� ��, count������ ������ ���ڰ� �������� �ʴ� ��� comNum[count]�� ���ڸ� �Է��ϰ� count�� 1 ������Ų��.
				if (i == count) {
					comNum[count] = number;
					count++;
				}
			}

			//���� ������ �̿��Ͽ� ���� ����
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

			//������ ���ڰ� �����ϴ� ������ ����� �����ϱ� ���� ����
			int collect = 0;

			//���� for���� �̿��Ͽ� ������ ���ڰ� �����ϸ� collect�� ���Ѵ�.
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
				System.out.println("3��");
				break;
			case 4:
				System.out.println("4��");
				break;
			case 3:
				System.out.println("5��");
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

	//�ζǰ� 3�� �̻���� ��÷�� �� ���� ���ѷ����� ���� ���α׷�
	private void lottoLoop() {
		System.out.println("========== �ζ� ���α׷� ==========");

		int count = 0;
		//loop Ƚ���� �����ϱ� ���� ����
		int loop = 1;
		int userNum[] = new int[6];
		int comNum[] = new int[6];
		int clearArray[] = new int[6];
		int number, i, temp;

		//6���� ���� �Է�
		while (count != 6) {
			System.out.print((count + 1) + "��° ��ȣ �Է�(1~45) : ");
			number = sc.nextInt();

			if (number < 1 || number > 45) {
				//�Է¹��� ���ڰ� 1~45 ������ ���ڰ� �ƴ� ���
				System.out.println("�߸��Է��ϼ̽��ϴ�. 1~45�� �Ѱ��� �Է����ּ���.");
			} else {
				//�Է¹��� ���ڰ� 1~45 �����ΰ�� �ߺ� üũ
				for (i = 0; i < count; i++) {
					//�ߺ�üũ�� 0���� count���� üũ�Ѵ�. ������ ���ڰ� �����ϴ� ��� break�� for���� �������´�.
					if (userNum[i] == number) {
						System.out.println("�̹� �ߺ��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
						break;
					}
				}

				//i���� count + 1�ΰ�� ��, count��° ���ڱ��� ��ġ�� ���ڰ� ���� ��� userNum[count]�� �����Ѵ� 
				if (i == count) {
					userNum[count] = number;
					count++;
				}
			}
		}

		//���������� �̿��Ͽ� ���� ����
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
			
			//��ǻ���� 6���� ���ڸ� �����Ѵ�
			while (count != 6) {
				//������ �̿��Ͽ� ���ڸ� �Է��Ѵ�.
				number = rand.nextInt(45) + 1;

				for (i = 0; i < count; i++) {
					//�ߺ�üũ�� 0���� count���� üũ�Ѵ�. ������ ���ڰ� �����ϴ� ��� break�� for���� �������´�.
					if (comNum[i] == number) {
						break;
					}
				}

				//i���� count + 1�ΰ�� ��, count��° ���ڱ��� ��ġ�� ���ڰ� ���� ��� userNum[count]�� �����Ѵ�
				if (i == count) {
					comNum[count] = number;
					count++;
				}
			}

			//���������� �̿��Ͽ� ���� ����
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
			
			//������ ���ڰ� �����ϴ� ������ ����� �����ϱ� ���� ����
			int collect = 0;

			//���� for���� �̿��Ͽ� ������ ���ڰ� �����ϸ� collect�� 1 ����
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
				System.out.println("3��");
				break;
			case 4:
				System.out.println("4��");
				break;
			case 3:
				System.out.println("5��");
				break;
			default:
				System.out.println("��");
			}
			
			if (collect > 4) {
				//collect�� 4���� ū ��� ��, 3�� �̻��� ��� ���� ������ ����������.
				break;
			} else {
				//collect�� 4������ ��� loop�� 1 ������Ų��.
				loop++;
			}
		}
		
	}
}
