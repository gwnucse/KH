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

		BufferedReader brWord = null;
		boolean first = false;
		String userStr = null, comStr = null;
		ArrayList<String> wordList = new ArrayList<String>();

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

		while (true) {

			try {
				while (true) {
					System.out.print("�ܾ� �Է� : ");
					userStr = br.readLine();
					
					if (userStr.length() == 1) {
						System.out.println("�ٽ� �Է��ϼ���(1���� �̻�)");
						continue;
					}
					
					if (first) {
						if (comStr.charAt(comStr.length() - 1) == userStr.charAt(0)) {
							break;
						} else {
							System.out.println("�ٽ� �Է��ϼ���('" + comStr.charAt(comStr.length() - 1) + "'�� ����)");
							continue;
						}
					} else {
						first = true;
						break;
					}
				}

				if (!wordList.contains(userStr)) {
					System.out.println("�й�!");
					count[1]++;
					break;
				}

				ArrayList<String> comList = new ArrayList<String>();

				for (String comWord : wordList) {
					if (userStr.charAt(userStr.length() - 1) == comWord.charAt(0)) {
						comList.add(comWord);
					}
				}
				
				if (comList.size() == 0) {
					System.out.println("�¸�!");
					count[0]++;
					break;
				} else {
					int ranNum = rand.nextInt(comList.size());
					comStr = comList.get(ranNum);
					System.out.println("��ǻ�� : " + comStr);
				}

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
