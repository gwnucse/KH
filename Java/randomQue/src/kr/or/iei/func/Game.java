package kr.or.iei.func;

import java.util.Scanner;
import java.util.Random;

public class Game {

	Random rand = new Random();
	Scanner sc = new Scanner(System.in);

	public void game1() throws NumberFormatException {
		//���� ī��Ʈ ����� �����ϱ� ���� ����
		int max = 0;

		while (true) {
			System.out.println("== Up & Down Game ==");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("���� > ");
			
			int check = Integer.parseInt(sc.next());
			
			if (check < 1 || check > 3) {
				//�Էµ� ���ڰ� 1~3 ���̰� �ƴϸ� �ٽ�
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				continue;
			} else if (check == 3) {
				//���� ����
				break;
			} else if (check == 2) {
				//���� ��� Ȯ��
				if (max != 0) {
					System.out.println("���� �ְ� ����� " + max + "ȸ �Դϴ�.");
				} else {
					System.out.println("���� ����� �����ϴ�.");
				}
				continue;
			}

			//���� ����
			int randNum = rand.nextInt(99) + 1;
			int userNum;
			int count = 1;

			System.out.println("<< Game Start >>");

			while (true) {
				System.out.print(count + " ȸ�� ��ȣ �Է� : ");
				userNum = Integer.parseInt(sc.next());

				if (userNum < 1 || userNum > 99) {
					//���� ������ ����� ���� �޽��� ���.
					System.out.println("�Է¹��� ����");
				} else if (userNum > randNum) {
					//����ڰ� �Է��� ���ں��� ������ �� ������ down�� ����ϰ� count�� 1�� ���Ѵ�.
					System.out.println("<< DOWN >>");
					count++;
				} else if (userNum < randNum) {
					//����ڰ� �Է��� ���ں��� ������ �� ũ�� up�� ����ϰ� count�� 1�� ���Ѵ�.
					System.out.println("<< UP >>");
					count++;
				} else {
					//���� ����ڰ� ������ �Է��ߴٸ� ������ ����ϰ� max���� 0�̰ų� count���� ũ�� max�� count�� �ٲ۴�.
					System.out.println("<< ���� >>");
					if (count < max || max == 0) {
						max = count;
					}
					break;
				}
			}
		}
	}

	public void game2() throws NumberFormatException {
		//���� ������ ������ ����
		int win = 0;
		int lose = 0;
		//����ڰ� �Է��� ���ڿ� ��ǻ�Ͱ� �Է��� ���ڸ� ������ ����
		int userNum, comNum;

		while (true) {
			//���� ���Ḧ ������ �� �ش� ������ ������ ����
			boolean endGame = false;
			
			System.out.println("Baskin Robbins31 Game");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("���� > ");
			
			int check = Integer.parseInt(sc.next());
			
			if (check < 1 || check > 3) {
				//�Էµ� ���ڰ� 1~3�� �ƴϸ� �ٽ�
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				continue;
			} else if (check == 3) {
				//���� ����
				break;
			} else if (check == 2) {
				//���� ������ Ȯ��
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);

				continue;
			}

			System.out.println("<< Game Start >>");
			//������� �Ҹ� ���ڰ� ������ �����ϱ� ���� ���� 
			int baskin = 0;

			while (true) {
				System.out.print("Input Number(1~3) : ");
				userNum = Integer.parseInt(sc.next());

				System.out.println("<< Your Turn >>");
				if (userNum < 1 || userNum > 3) {
					System.out.println("1~3 ���� ���� �Է����ּ���.");
					continue;
				}
				
				//����ڰ� �Է��� 1~3������ ���ڸ� baskin�� ���ϸ鼭 ȭ�鿡 ����Ѵ�.
				for (int i = 0; i < userNum; i++) {
					baskin++;
					System.out.println(baskin + "!");
					if (baskin == 31) {
						//baskin�� 31�� �� ���� endGame�� true�� �ٲٰ� lose�� 1 �ø� ���� �ݺ����� �����Ѵ�.
						System.out.println("�й�Ф�");
						lose++;
						endGame = true;
						break;
					}
				}

				//endGame�� true ��, ����ڰ� �й��� ��� ���� ȭ������
				if (endGame == true) {
					break;
				}

				System.out.println("<< Computer Turn >>");
				comNum = rand.nextInt(3) + 1;

				//��ǻ�Ͱ� ������ ���� ���ڸ� baskin�� ���ϸ鼭 ȭ�鿡 ����Ѵ�.
				for (int i = 0; i < comNum; i++) {
					baskin++;
					System.out.println(baskin + "!");
					if (baskin == 31) {
						//baskin�� 31�� �� ���� endGame�� true�� �ٲٰ� win�� 1 �ø� ���� �ݺ����� �����Ѵ�.
						System.out.println("�¸�!");
						win++;
						endGame = true;
						break;
					}
				}

				//endGame�� true ��, ����ڰ� �¸��� ��� ���� ȭ������
				if (endGame == true) {
					break;
				}
			}

		}

	}

	public void game3() throws NumberFormatException {

		//������
		int money = 10000;
		//�¹��� Ƚ��
		int win = 0;
		int lose = 0;
		int draw = 0;
		//������� �ֻ����� ��ǻ���� �ֻ����� ���ڸ� ������ ����
		int userDice1, userDice2, userDice3, comDice1, comDice2, comDice3;
		//�ֻ����� ���� ������ ����
		int userSum, comSum;
		//������ ����ϴ����� ���θ� �����ϱ� ���� ����
		boolean endGame = false;

		while (true) {
			endGame = false;
			System.out.println("===== Dice Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("���� > ");
			
			int check = Integer.parseInt(sc.next());
			
			//����ȭ�� ������
			if (check < 1 || check > 3) {
				//���� 1~3�� �Է����� ������ ó������ �ʴ´�.
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				continue;
			} else if (check == 3) {
				//3�� �Է��ϸ� ���� ����
				break;
			} else if (check == 2) {
				//2�� �Է��ϸ� ���� ���� ���
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
				System.out.println("DRAW : " + draw);
				System.out.println("�� ������ : " + money + "��");
				continue;
			} else if (money == 0) {
				//1�� �Է��ߴµ� ���� money�� 0�̸� �ܾ��� ���� ����� �ϰ� ����ȭ������ ���ư���.
				System.out.println("�ܾ��� �����ϴ�. bye~");
				continue;
			}

			while (true) {
				System.out.println("<< Game Start >>");

				userDice1 = rand.nextInt(6) + 1;
				userDice2 = rand.nextInt(6) + 1;
				userDice3 = rand.nextInt(6) + 1;
				userSum = userDice1 + userDice2 + userDice3;
				System.out.println("1��° �ֻ��� �� : " + userDice1);
				System.out.println("2��° �ֻ��� �� : " + userDice2);
				System.out.println("3��° �ֻ��� �� : " + userDice3);
				System.out.println("�� �ֻ��� �� �� : " + userSum);
				System.out.print("���� �Ͻðڽ��ϱ�[y/n] : ");
				//���� ����
				char again = sc.next().charAt(0);

				if (again == 'y') {
					comDice1 = rand.nextInt(6) + 1;
					comDice2 = rand.nextInt(6) + 1;
					comDice3 = rand.nextInt(6) + 1;
					comSum = comDice1 + comDice2 + comDice3;
					while (true) {
						System.out.print("�󸶸� �����Ͻðڽ��ϱ�(���� �� ������ " + money + "��) : ");
						int batting = Integer.parseInt(sc.next());

						if (batting > money) {
							System.out.println("�ݾ��� �����մϴ�. �ٽ� �Է����ּ���.");
							continue;
						} else {
							System.out.println("��ǻ�� 1��° �ֻ��� �� : " + comDice1);
							System.out.println("��ǻ�� 2��° �ֻ��� �� : " + comDice2);
							System.out.println("��ǻ�� 3��° �ֻ��� �� : " + comDice3);
							System.out.println("��ǻ�� �ֻ��� �� �� : " + comSum);
							System.out.println("<< ��� >>");
							
							//���� ���ο� ���� ������ ���� ���� �� win, lose, draw�� ����.
							if (userSum > comSum) {
								System.out.println("�¸�!!!!!");
								System.out.println("+" + batting + "��!!");
								money += batting;
								win++;
							} else if (userSum == comSum) {
								System.out.println("�����ϴ�......");
								draw++;
							} else {
								System.out.println("�й�");
								System.out.println("-" + batting + "��!!");
								money -= batting;
								lose++;
								
								//���� �������� 0���� �Ǹ� ������ �ٽ� �������� �ʰ� �ٷ� ����ȭ������ ���ư���.
								if (money == 0) {
									System.out.println("���� Bye~");
									endGame = true;
									break;
								}
							}
							
							System.out.print("�ѹ� �� �Ͻðڽ��ϱ�[y/n] : ");
							again = sc.next().charAt(0);
							if (again != 'y') { 
								//ȭ�鿡 y�� �Է����� ������ endGame�� true�� �ٲ۴�.
								endGame = true;
							}
							
							break;
						}
					}
				} else {
					System.out.println("�޴��� ���ư��ϴ�.");
					break;
				}
				
				//endGame�� true�� ������ ����ȭ������ ���ư���.
				if (endGame) {
					break;
				}
			}

		}
	}
}
