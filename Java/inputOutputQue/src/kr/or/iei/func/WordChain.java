package kr.or.iei.func;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class WordChain {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int count[] = new int[2];
	Random rand = new Random();
	ArrayList<String> wordList = new ArrayList<String>();

	public WordChain() {

		BufferedReader brWord = null;

		try {
			brWord = new BufferedReader(new FileReader("words.txt"));

			while (true) {
				String word = brWord.readLine();

				if (word == null) {
					break;
				}

				wordList.add(word);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				brWord.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void main() {

		while (true) {

			System.out.println("===== �����ձ� ���� =====");
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� > ");

			try {

				int select = Integer.parseInt(br.readLine());
				switch (select) {
				case 1:
					wordChain();
					break;
				case 2:
					displayRecord();
					break;
				case 0:
					br.close();
					return;
				}
			} catch (NumberFormatException e) {
				System.err.println("���ڸ� �Է��ϼ���.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				delay();
			}

		}
	}

	public void wordChain() {

		boolean first = true;
		String userStr = null, comStr = null;
		ArrayList<String> useList = new ArrayList<String>();

		while (true) {

			try {
				while (true) {
					System.out.print("�ܾ� �Է� : ");
					userStr = br.readLine();

					if (userStr.length() == 1) {
						//�Է��� �ܾ 1���� ������ ��� �ٽ� �Է�
						System.out.println("�ٽ� �Է��ϼ���(1���� �̻�)");
						continue;
					}

					// �ܾ� �Է��� ó�� ���� ��� ���� ������ �ٷ� ���� ���´�.
					if (first) {
						first = false;
						break;

					} else {
						// �ܾ� �Է��� 2��° �̻��� ���
						if (comStr.charAt(comStr.length() - 1) != userStr.charAt(0)) {
							// ���� �ܾ��� �� ���ڿ� �Է� �ܾ��� ���� ���ڰ� �ٸ� ��� �ٽ� �Է�
							System.out.println("�ٽ� �Է��ϼ���('" + comStr.charAt(comStr.length() - 1) + "'�� ����)");
							continue;
						} else if (useList.contains(userStr)) {
							// ������ �Է��ߴ� �ܾ� �� �ϳ��� ���
							System.out.println("�ٽ� �Է��ϼ���(�̹� �Է��� �ܾ��Դϴ�)");
							continue;
						} else {
							// ���� ������ ��� ������ ��� ���� ������ ���� ���´�.
							break;
						}
					}
				}

				if (!wordList.contains(userStr)) {
					// �ش� �ܾ �ܾ��忡 ���� ��� �й踦 ����ϰ� ���� �޴��� ���ư���.
					System.out.println("�й�!");
					count[1]++;
					break;
				}

				// ����� �ܾ ����Ʈ�� �߰��Ѵ�.
				useList.add(userStr);

				// ��ǻ�Ͱ� �Է� ������ �ܾ� ����Ʈ �ʱ�ȭ
				ArrayList<String> comList = new ArrayList<String>();

				for (String comWord : wordList) {
					// �ܾ����� ��ȸ�ϸ� ����� �ܾ� ����Ʈ�� �ش� �ܾ �����鼭 ����ڰ� �Է��� �ܾ��� �� ���ڿ� ��ȸ���� �ܾ��� ù ���ڰ� ���� ���
					// comList�� �ܾ �߰��Ѵ�.
					if (userStr.charAt(userStr.length() - 1) == comWord.charAt(0) && !useList.contains(comWord)) {
						comList.add(comWord);
					}
				}

				if (comList.size() == 0) {
					// ���� comList�� �ܾ �ϳ��� ������ �¸��� ����ϰ� ���� �޴��� ���ư���.
					System.out.println("�¸�!");
					count[0]++;
					break;
				} else {
					// �ƴѰ�� comList �� �ϳ��� �������� ȭ�鿡 ����Ѵ�.
					int ranNum = rand.nextInt(comList.size());
					comStr = comList.get(ranNum);
					System.out.println("��ǻ�� : " + comStr);
				}

				// ����� �ܾ ����Ʈ�� �߰��Ѵ�.
				useList.add(comStr);

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public void displayRecord() {
		System.out.println("�¸� : " + count[0]);
		System.out.println("�й� : " + count[1]);
	}

	public void delay() {

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
