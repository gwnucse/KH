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
			int rand_num = rand.nextInt(99) + 1;
			int user_num;
			int count = 1;

			System.out.println("<< Game Start >>");

			while (true) {
				System.out.print(count + " ȸ�� ��ȣ �Է� : ");
				user_num = Integer.parseInt(sc.next());

				if (user_num < 1 || user_num > 99) {
					//���� ������ ����� ���� �޽��� ���.
					System.out.println("�Է¹��� ����");
				} else if (user_num > rand_num) {
					//����ڰ� �Է��� ���ں��� ������ �� ������ down�� ����ϰ� count�� 1�� ���Ѵ�.
					System.out.println("<< DOWN >>");
					count++;
				} else if (user_num < rand_num) {
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
		int user_num, com_num;

		while (true) {
			//���� ���Ḧ ������ �� �ش� ������ ������ ����
			boolean end_game = false;
			
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
				user_num = Integer.parseInt(sc.next());

				System.out.println("<< Your Turn >>");
				if (user_num < 1 || user_num > 3) {
					System.out.println("1~3 ���� ���� �Է����ּ���.");
					continue;
				}
				
				//����ڰ� �Է��� 1~3������ ���ڸ� baskin�� ���ϸ鼭 ȭ�鿡 ����Ѵ�.
				for (int i = 0; i < user_num; i++) {
					baskin++;
					System.out.println(baskin + "!");
					if (baskin == 31) {
						//baskin�� 31�� �� ���� end_game�� true�� �ٲٰ� lose�� 1 �ø� ���� �ݺ����� �����Ѵ�.
						System.out.println("�й�Ф�");
						lose++;
						end_game = true;
						break;
					}
				}

				//end_game�� true ��, ����ڰ� �й��� ��� ���� ȭ������
				if (end_game == true)
					break;

				System.out.println("<< Computer Turn >>");
				com_num = rand.nextInt(3) + 1;

				//��ǻ�Ͱ� ������ ���� ���ڸ� baskin�� ���ϸ鼭 ȭ�鿡 ����Ѵ�.
				for (int i = 0; i < com_num; i++) {
					baskin++;
					System.out.println(baskin + "!");
					if (baskin == 31) {
						//baskin�� 31�� �� ���� end_game�� true�� �ٲٰ� win�� 1 �ø� ���� �ݺ����� �����Ѵ�.
						System.out.println("�¸�!");
						win++;
						end_game = true;
						break;
					}
				}

				//end_game�� true ��, ����ڰ� �¸��� ��� ���� ȭ������
				if (end_game == true)
					break;
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
		int user_dice1, user_dice2, user_dice3, com_dice1, com_dice2, com_dice3;
		//�ֻ����� ���� ������ ����
		int user_sum, com_sum;
		//������ ����ϴ����� ���θ� �����ϱ� ���� ����
		boolean end_game = false;

		while (true) {
			end_game = false;
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

				user_dice1 = rand.nextInt(6) + 1;
				user_dice2 = rand.nextInt(6) + 1;
				user_dice3 = rand.nextInt(6) + 1;
				user_sum = user_dice1 + user_dice2 + user_dice3;
				System.out.println("1��° �ֻ��� �� : " + user_dice1);
				System.out.println("2��° �ֻ��� �� : " + user_dice2);
				System.out.println("3��° �ֻ��� �� : " + user_dice3);
				System.out.println("�� �ֻ��� �� �� : " + user_sum);
				System.out.print("���� �Ͻðڽ��ϱ�[y/n] : ");
				//���� ����
				char again = sc.next().charAt(0);

				if (again == 'y') {
					com_dice1 = rand.nextInt(6) + 1;
					com_dice2 = rand.nextInt(6) + 1;
					com_dice3 = rand.nextInt(6) + 1;
					com_sum = com_dice1 + com_dice2 + com_dice3;
					while (true) {
						System.out.print("�󸶸� �����Ͻðڽ��ϱ�(���� �� ������ " + money + "��) : ");
						int batting = Integer.parseInt(sc.next());

						if (batting > money) {
							System.out.println("�ݾ��� �����մϴ�. �ٽ� �Է����ּ���.");
							continue;
						} else {
							System.out.println("��ǻ�� 1��° �ֻ��� �� : " + com_dice1);
							System.out.println("��ǻ�� 2��° �ֻ��� �� : " + com_dice2);
							System.out.println("��ǻ�� 3��° �ֻ��� �� : " + com_dice3);
							System.out.println("��ǻ�� �ֻ��� �� �� : " + com_sum);
							System.out.println("<< ��� >>");
							
							//���� ���ο� ���� ������ ���� ���� �� win, lose, draw�� ����.
							if (user_sum > com_sum) {
								System.out.println("�¸�!!!!!");
								System.out.println("+" + batting + "��!!");
								money += batting;
								win++;
							} else if (user_sum == com_sum) {
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
									end_game = true;
									break;
								}
							}
							
							System.out.print("�ѹ� �� �Ͻðڽ��ϱ�[y/n] : ");
							again = sc.next().charAt(0);
							if (again != 'y') { 
								//ȭ�鿡 y�� �Է����� ������ end_game�� true�� �ٲ۴�.
								end_game = true;
							}
							
							break;
						}
					}
				} else {
					System.out.println("�޴��� ���ư��ϴ�.");
					break;
				}
				
				//end_game�� true�� ������ ����ȭ������ ���ư���.
				if (end_game) break;
			}

		}
	}
}
