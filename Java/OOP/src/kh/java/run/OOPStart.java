package kh.java.run;

import kh.java.vo.*;
import java.util.Scanner;

public class OOPStart {

	public static void main(String[] args) {

		TV tv = new TV();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===== TV ��û ���̵� =====");
			System.out.println("1. ���� on/off");
			System.out.println("2. ���� ä�� �� ���� Ȯ��");
			System.out.println("3. ä�� +1");
			System.out.println("4. ä�� -1");
			System.out.println("5. ���� +1");
			System.out.println("6. ���� -1");
			System.out.println("7. ä�� �Է�");
			System.out.print("���� > ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1 :
				if (tv.power()) {
					System.out.println("������ �������ϴ�.");
				} else {
					System.out.println("������ �������ϴ�.");
				}
				break;
			case 2 :
				if (tv.power) {
					System.out.println("ä�� : " + tv.channel);
					System.out.println("���� : " + tv.volume);
				} else {
					System.out.println("������ ���ּ���.");
				}
				break;
			case 3 :
				if (tv.power) {
					tv.channelUp();
					System.out.println("���� ä�� : " + tv.channel);
				} else {
					System.out.println("������ ���ּ���.");
				}
				break;
			case 4 :
				if (tv.power) {
					tv.channelDown();
					System.out.println("���� ä�� : " + tv.channel);
				} else {
					System.out.println("������ ���ּ���.");
				}
				break;
			case 5 :
				if (tv.power) {
					tv.volumeUp();
					System.out.println("���� ���� : " + tv.volume);
				} else {
					System.out.println("������ ���ּ���.");
				}
				break;
			case 6 :
				if (tv.power) {
					tv.volumeDown();
					System.out.println("���� ���� : " + tv.volume);
				} else {
					System.out.println("������ ���ּ���.");
				}
				break;
			case 7 :
				if (tv.power) {
					System.out.print("ä���� �Է��ϼ��� : ");
					int chNum = sc.nextInt();
					tv.channelChange(chNum);
					System.out.println("���� ä�� : " + tv.channel);
				} else {
					System.out.println("������ ���ּ���.");
				}
				break;
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.err.println(ie);
			}
		}
	}

}
