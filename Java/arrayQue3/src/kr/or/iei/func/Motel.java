package kr.or.iei.func;

import java.util.Scanner;

public class Motel {
	
	Scanner sc = new Scanner(System.in);
	boolean in[] = new boolean[10];

	public Motel() {
		
		int select;
		boolean out = false;
		
		while(true) {
			
			System.out.println("1. �Խ�\t2. ���\t3. �溸��\t4.����");
			
			select = sc.nextInt();
			
			switch(select) {
			case 1 :
				entering();
				break;
			case 2 : 
				leaving();
				break;
			case 3 : 
				seeing();
				break;
			case 4 :
				out = true;
				break;
			default : System.out.println("�߸� �����ϼ̽��ϴ�."); 
			}
			
			if (out) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			try {
				Thread.sleep(2000);
			} catch(InterruptedException ie) {
				
			}
			System.out.println("���� ���� ���α׷� v1.0");
		}
	}
	
	private void entering() {
		
		System.out.println("��� �濡 �Խ��Ͻðڽ��ϱ�?");
		int select = sc.nextInt() - 1;
		
		if (in[select]) {
			System.out.println((select + 1) + "�� ���� ���� �մ��� �ֽ��ϴ�.");
		} else {
			System.out.println((select + 1) + "�� �濡 �Խ��ϼ̽��ϴ�.");
			in[select] = true;
		}
	}
	
	private void leaving() {
		System.out.println("����濡�� ����Ͻðڽ��ϱ�?");
		int select = sc.nextInt() - 1;
		
		if (in[select]) {
			System.out.println((select + 1) + "�� �濡�� ����ϼ̽��ϴ�.");
			in[select] = false;
		} else {
			System.out.println((select + 1) + "�� ���� ���� �� ���Դϴ�.");
		}
	}
	
	private void seeing() {
		for (int i = 0; i < in.length; i++) {
			if (in[i]) {
				System.out.println((i + 1) + "�� �濡�� ���� �մ��� �ֽ��ϴ�.");
			} else {
				System.out.println((i + 1) + "�� ���� ���� ����ֽ��ϴ�.");
			}
		}
	}
	
}
