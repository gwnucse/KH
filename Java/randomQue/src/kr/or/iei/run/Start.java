package kr.or.iei.run;

import kr.or.iei.func.*;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		Game game = new Game();
		int select;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				
				System.out.println("--------------���� �ǽ����� ��������--------------");
				System.out.println("1. �ǽ����� 4��(UpAndDown)");
				System.out.println("2. �ǽ����� 5��(BaskinRobbins)");
				System.out.println("3. �ǽ����� 6��(Dice)");
				System.out.println("0. ���α׷� ����");
				System.out.print("���� > ");
				select = Integer.parseInt(sc.next());
				
				if (select == 0) {
					break;
				} else if (select == 1) {
					game.game1();
				} else if (select == 2) {
					game.game2();
				} else if (select == 3) {
					game.game3();
				} else {
					System.out.println("�ٽ� �Է����ּ���.");
				}
								
			} catch (NumberFormatException ne) {
				System.err.println("�߸� �Է��߽��ϴ�. �������� ���ư��ϴ�.");
			}
		}
	}

}
