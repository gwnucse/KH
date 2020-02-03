package kh.java.fun;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	public void random1() {
		System.out.println(rand.nextInt());
		//0~9 ���� �ȿ��� ���� ���ڸ� ������
		System.out.println(rand.nextInt(10));
		//0~31���� ���� ���� ���� ����
		System.out.println(rand.nextInt(32));
		
		//0~9������ ���� ��
		System.out.println("0 ~ 9������ ���� �� : " + rand.nextInt(10));
		//1~10������ ���� ��
		System.out.println("1 ~ 10������ ���� �� : " + (rand.nextInt(10) + 1));
		//20~35������ ���� ��
		System.out.println("20 ~ 35������ ���� �� : " + (rand.nextInt(16) + 20));
		//0 �Ǵ� 1
		System.out.println("0 �Ǵ� 1 : " + rand.nextInt(2));
	}
	
	public void random2() {
		
		//1�Ǵ� 2�� ���� ���� ������ �� ����ڰ� �Է��� ���� ��		
		int insert, coin;
		
		while (true) {
			System.out.println("=== ���� �� �� ���߱� ===");
			System.out.print("���ڸ� �Է��� �ּ��� (1. �ո� / 2. �޸�) : ");
			
			insert = sc.nextInt();
			coin = rand.nextInt(2) + 1;
			System.out.println();
			
			if (insert == coin) {
				System.out.println("������ϴ�^^");
				System.out.println();
				System.out.println("---------------------------------->restart");
			} else {
				System.out.println("��! Ʋ�Ƚ��ϴ�!");
				System.out.println();
				break;
			}
			
		}
	}
	
	public void random3() {
		
		//���������� ����
		int user, com;
		
		System.out.println("=== ���� ���� �� ���� ===");
		
		System.out.print("���ڸ� �����ϼ���(1. ����/ 2. ����/ 3. ��) : ");
		user = sc.nextInt();
		com = rand.nextInt(3) + 1;
		
		System.out.println("======== ��� ========");

		if (user == 1) {
			System.out.println("����� ������ �½��ϴ�.");
		} else if (user == 2) {
			System.out.println("����� ������ �½��ϴ�.");
		} else if (user == 3) {
			System.out.println("����� ���� �½��ϴ�.");
		}
		
		if (com == 1) {
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
		} else if (com == 2) {
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
		} else if (com == 3) {
			System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
		}
		
		System.out.println("====================");
		
		if (user == com) {
			System.out.println("�����ϴ�.");
		} else if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com ==2)) {
			System.out.println("����� �̰���ϴ�. ��.��");
		} else {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�. ^^");
		}
	}
}
