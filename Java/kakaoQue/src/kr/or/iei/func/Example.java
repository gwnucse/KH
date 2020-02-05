package kr.or.iei.func;

import java.io.*;

public class Example {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void exam() {
		
		try {
			System.out.print("2���� �迭 ũ�� �Է� : ");
			int num = Integer.parseInt(br.readLine());
			boolean map1[][] = new boolean[num][num];
			boolean map2[][] = new boolean[num][num];
			boolean map3[][] = new boolean[num][num];
			
			int mapNum;
			int max = (int)Math.pow(2, num) - 1;
			
			System.out.println("���� 1");
			for (int i = 0; i < num; i++) {
				
				while (true) {
					System.out.print("����" + (i + 1) + " : ");
					mapNum = Integer.parseInt(br.readLine());
					
					if (mapNum > max) {
						System.out.println("���� ���� ���ڸ� �Է��ϼ���.");
					} else {
						break;
					}
				}
				
				for (int j = 0; j < map1[i].length; j++) {
					if (mapNum % 2 == 1) {
						map1[i][j] = true;
					} else {
						map1[i][j] = false;
					}
					mapNum /= 2;
				}
			}
			
			System.out.println("���� 2");
			for (int i = 0; i < num; i++) {
				
				while (true) {
					System.out.print("����" + (i + 1) + " : ");
					mapNum = Integer.parseInt(br.readLine());
					
					if (mapNum > max) {
						System.out.println("���� ���� ���ڸ� �Է��ϼ���.");
					} else {
						break;
					}
				}
				
				for (int j = 0; j < map1[i].length; j++) {
					if (mapNum % 2 == 1) {
						map2[i][j] = true;
					} else {
						map2[i][j] = false;
					}
					mapNum /= 2;
				}
				
			}

			for (int i = 0; i < num; i++) {
				System.out.print("\"");
				for (int j = num - 1 ; j >= 0; j--) {
					if (map1[i][j] || map2[i][j]) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("\"");
			}
			
		} catch (IOException ie) {
			System.err.println(ie);
		} catch (NumberFormatException ne) {
			System.err.println("���ڸ� �Է��ϼ���.");
		}
	}
}
