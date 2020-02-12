package kh.java.controller;

import java.util.Scanner;
import kh.java.ve.Drink;
import kh.java.ve.Goods;
import kh.java.ve.InstantFood;
import kh.java.ve.Medicine;
import kh.java.ve.Snack;

public class ConMgr {

	Scanner sc = new Scanner(System.in);

	Drink[] d = new Drink[10];
	int dIndex;

	InstantFood[] iFood = new InstantFood[10];
	int iIndex;

	Snack[] s = new Snack[10];
	int sIndex;

	Medicine[] m = new Medicine[10];
	int mIndex;

	Goods[] etc = new Goods[10];
	int eIndex;

	// ��ٱ���
	Goods[] cart = new Goods[10];
	int cIndex;

	public ConMgr() {
		d[dIndex++] = new Drink(2000, 100, "��������Ʈ", false, 550, 300);
		d[dIndex++] = new Drink(3000, 50, "���䷹��", false, 500, 250);
		d[dIndex++] = new Drink(3000, 35, "Ŭ����", true, 350, 400);

		iFood[iIndex++] = new InstantFood(4000, 5, "�츮���ö�", false, "2020-02-12", 550);
		iFood[iIndex++] = new InstantFood(1500, 20, "ƴ�����", false, "2021-02-12", 450);
		iFood[iIndex++] = new InstantFood(3000, 10, "ƴ�����", false, "2020-02-19", 400);

		s[sIndex++] = new Snack(1500, 26, "����Ĩ", false, 340, 80);
		s[sIndex++] = new Snack(2000, 17, "Ȩ����", false, 240, 50);
		s[sIndex++] = new Snack(1300, 15, "��Ĩ", false, 315, 75);

		m[mIndex++] = new Medicine(3500, 10, "Ÿ�̷���", false, "2020-07-05");
		m[mIndex++] = new Medicine(1200, 20, "��äǥ!", false, "2020-05-05");

		etc[eIndex++] = new Goods(5000, 27, "���", false);
		etc[eIndex++] = new Goods(2000, 30, "��Ƽ��", false);
	}

	public void main() {
		while (true) {
			System.out.println("===== GS25 =====");
			System.out.println("1. �˹�");
			System.out.println("2. �մ�");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� > ");
			int select = sc.nextInt();

			System.out.println();

			switch (select) {
			case 1:
				alba();
				break;
			case 2:
				client();
				break;
			case 0:
				return;
			default:
				System.out.println("0~2 ������ ���ڸ� �Է��� �ּ���.");
			}
		}
	}

	public void alba() {
		while(true) {
			System.out.println("===== ���ض� �˹پ� =====");
			System.out.println("1. �� ��ǰ ���");
			System.out.println("2. ���� ��� ��Ȳ ����");
			System.out.println("3. ��� ����");
			System.out.println("4. ��ǰ ����");
			System.out.println("0. �ڷΰ���");
			System.out.print("���� > ");
			int select = sc.nextInt();
			
			switch(select) { 
			case 1 : 
				insertProduct();
				break;
			case 2 :
				System.out.println("\n===== ���� =====");
				System.out.println("No.\t��ǰ��\t����\t���\t���ο���\t�뷮\tĮ�θ�");
				printArr(d, dIndex);
				
				System.out.println("\n===== �Ｎ ��ǰ =====");
				System.out.println("No.\t��ǰ��\t����\t���\t���ο���\t�������\t\tĮ�θ�");
				printArr(iFood, iIndex);
				
				System.out.println("\n===== ���� =====");
				System.out.println("No.\t��ǰ��\t����\t���\t���ο���\tĮ�θ�\t����");
				printArr(s, sIndex);
				
				System.out.println("\n===== �Ｎ ��ǰ =====");
				System.out.println("No.\t��ǰ��\t����\t���\t���ο���\t�������");
				printArr(m, mIndex);
				
				System.out.println("\n===== ��Ÿ =====");
				System.out.println("No.\t��ǰ��\t����\t���\t���ο���");
				printArr(etc, eIndex);
//				printDrink();
//				printInstantFood();
//				printSnack();
//				printMedicine();
//				printEtc();
				delay();
				break;
			case 3 :
				updateProduct();
				break;
			case 4 :
				deleteProduct();
				break;
			case 0 :
				return;
			default :
				System.out.println("0~4 ������ ���ڸ� �Է��� �ּ���.");
			}
		}
	}
	
	public void insertProduct() {
		while(true) {
			System.out.println("===== ��ǰ ��� ======");
			System.out.println("1. ���� ���");
			System.out.println("2. �Ｎ ��ǰ ���");
			System.out.println("3. ���� ���");
			System.out.println("4. �Ǿ�ǰ ���");
			System.out.println("5. ��Ÿ ���");
			System.out.println("0. ��������");
			System.out.print("���� > ");
			int select = sc.nextInt();
			
			if (select == 0) {
				return;
			} else if (select > 0 && select < 6) {
				System.out.print("��ǰ���� �Է��ϼ���. : ");
				String name = sc.next();
				
				System.out.print("��ǰ ������ �Է��ϼ��� : ");
				int price = sc.nextInt();
				
				System.out.print("������ �Է��ϼ��� : ");
				int stock = sc.nextInt();
				
				System.out.print("���Դϱ�[y/n]? : ");
				char ch = sc.next().charAt(0);
				boolean adult = (ch == 'y')? true : false;
				
				switch(select) {
				case 1 :
					System.out.print("������ �뷮�� �Է��ϼ���(ml) : ");
					int amount = sc.nextInt();
					
					System.out.print("Į�θ��� �Է��ϼ���(kcal) : ");
					int kcal = sc.nextInt();
					
					d[dIndex++] = new Drink(price, stock, name, adult, amount, kcal);
					break;
				case 2 :
					System.out.print("��������� �Է��ϼ���(yyyy-mm-dd) : ");
					String expired = sc.next();
					
					System.out.print("Į�θ��� �Է��ϼ���(kcal) : ");
					kcal = sc.nextInt();
					
					iFood[iIndex++] = new InstantFood(price, stock, name, adult, expired, kcal);
					break;
				case 3 :
					System.out.print("Į�θ��� �Է��ϼ���(kcal) : ");
					kcal = sc.nextInt();
					
					System.out.print("���Ը� �Է��ϼ���(g) : ");
					int weight = sc.nextInt();
					
					s[sIndex++] = new Snack(price, stock, name, adult, kcal, weight);
					break;
				case 4 :
					System.out.print("��������� �Է��ϼ���(yyyy-mm-dd) : ");
					expired = sc.next();
					
					m[mIndex++] = new Medicine(price, stock, name, adult, expired);
					break;
				case 5 :
					etc[eIndex++] = new Goods(price, stock, name, adult);
					break;
				}
				
				System.out.println("��ǰ�� ��ϵǾ����ϴ�.");
				delay();
			} else {
				System.out.println("0~5 ������ ���ڸ� �Է��� �ּ���.");
				delay();
			}
			
		}
	}
	
	//�پ缺�� �̿��� ��� ��ǰ ��� ���� �޼ҵ�
	public void printArr(Goods[] product, int index) {
		for (int i = 0; i < index; i++) {
			System.out.println((i + 1) + "\t" + product[i]);
		}
	}
	
	public void printDrink() {

		System.out.println("\n===== ���� =====");
		System.out.println("No.\t��ǰ��\t����\t���\t���ο���\t�뷮\tĮ�θ�");
		
		for (int i = 0; i < dIndex; i++) {
//			System.out.println((i + 1) + "\t" + d[i].getName() + "\t" + d[i].getPrice() + "\t" + d[i].getStock() + "\t" + (d[i].getAdult() ? "O" : "X") + "\t" + d[i].getAmount() + "\t" + d[i].getKcal());
			//toString�� �̿��� ���
			System.out.println((i + 1) + "\t" + d[i]);
		}
	}
	
	public void printInstantFood() {
		
		System.out.println("\n===== �Ｎ ��ǰ =====");
		System.out.println("No.\t��ǰ��\t����\t���\t���ο���\t�������\t\tĮ�θ�");
		
		for (int i = 0; i < iIndex; i++) {
			System.out.println((i + 1) + "\t" + iFood[i].getName() + "\t" + iFood[i].getPrice() + "\t" + iFood[i].getStock() + "\t" + (iFood[i].getAdult() ? "O" : "X") + "\t" + iFood[i].getExpired() + "\t" + iFood[i].getKcal());
		}
	}
	
	public void printSnack() {

		System.out.println("\n===== ���� =====");
		System.out.println("No.\t��ǰ��\t����\t���\t���ο���\tĮ�θ�\t����");
		
		for (int i = 0; i < sIndex; i++) {
			System.out.println((i + 1) + "\t" + s[i].getName() + "\t" + s[i].getPrice() + "\t" + s[i].getStock() + "\t" + (s[i].getAdult() ? "O" : "X") + "\t" + s[i].getKcal() + "\t" + s[i].getWeight());
		}
	}
	
	public void printMedicine() {

		System.out.println("\n===== �Ｎ ��ǰ =====");
		System.out.println("No.\t��ǰ��\t����\t���\t���ο���\t�������");
		
		for (int i = 0; i < mIndex; i++) {
			System.out.println((i + 1) + "\t" + m[i].getName() + "\t" + m[i].getPrice() + "\t" + m[i].getStock() + "\t" + (m[i].getAdult() ? "O" : "X") + "\t" + m[i].getExpired());
		}
	}
	
	public void printEtc() {

		System.out.println("\n===== ��Ÿ =====");
		System.out.println("No.\t��ǰ��\t����\t���\t���ο���");
		
		for (int i = 0; i < eIndex; i++) {
			System.out.println((i + 1) + "\t" + etc[i].getName() + "\t" + etc[i].getPrice() + "\t" + etc[i].getStock() + "\t" + (etc[i].getAdult() ? "O" : "X"));
		}
	}
	
	public void updateProduct() {
		System.out.println("===== ��� ���� ======");
		System.out.println("1. ���� ��� ����");
		System.out.println("2. �Ｎ ��ǰ ��� ����");
		System.out.println("3. ���� ��� ����");
		System.out.println("4. �Ǿ�ǰ ��� ����");
		System.out.println("5. ��Ÿ ��ǰ ��� ����");
		System.out.println("0. �ڷΰ���");
		System.out.print("���� > ");
		int select = sc.nextInt();
		
		switch(select) {
		case 1 :
			printDrink();
			updateProduct(d);
			break;
		case 2 :
			printInstantFood();
			updateProduct(iFood);
			break;
		case 3 :
			printSnack();
			updateProduct(s);
			break;
		case 4 :
			printMedicine();
			updateProduct(m);
			break;
		case 5 :
			printEtc();
			updateProduct(etc);
			break;
		case 0 :
			return;
		default :
			System.out.println("0~5 ������ ���ڸ� �Է��� �ּ���.");
		}
		
		delay();
	}
	
	//�����ε� + �پ缺
	public void updateProduct(Goods[] product) {
		
		System.out.print("��� ������ ��ǰ�� No.�� �������ּ��� > ");
		int select = sc.nextInt() - 1;
		System.out.println("[" + product[select].getName() + "]��(��) �����ϼ̽��ϴ�.");
		System.out.println("���� ���� " + product[select].getStock() + "�� �Դϴ�.");
		System.out.print("������ ����� �Է����ּ��� > ");
		int stock = sc.nextInt();
		
		product[select].setStock(stock);
		
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}
	
	public void deleteProduct() {
		while(true) {
			System.out.println("===== ��ǰ ���� =====");
			System.out.println("1. ����");
			System.out.println("2. �Ｎ��ǰ");
			System.out.println("3. ����");
			System.out.println("4. �Ǿ�ǰ");
			System.out.println("5. ��Ÿ");
			System.out.println("0. �ڷΰ���");
			System.out.print("������ ��ǰ ī�װ��� �����ϼ��� > ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 :
				System.out.println("\n===== ���� =====");
				System.out.println("No.\t��ǰ��\t����\t���\t���ο���\t�뷮\tĮ�θ�");
				printArr(d, dIndex);
				dIndex = deleteProduct(d, dIndex);
				break;
			case 2 :
				System.out.println("\n===== �Ｎ ��ǰ =====");
				System.out.println("No.\t��ǰ��\t����\t���\t���ο���\t�������\t\tĮ�θ�");
				printArr(iFood, iIndex);
				iIndex = deleteProduct(iFood, iIndex);
				break;
			case 3 :
				System.out.println("\n===== ���� =====");
				System.out.println("No.\t��ǰ��\t����\t���\t���ο���\tĮ�θ�\t����");
				printArr(s, sIndex);
				sIndex = deleteProduct(s, sIndex);
				break;
			case 4 :
				System.out.println("\n===== �Ｎ ��ǰ =====");
				System.out.println("No.\t��ǰ��\t����\t���\t���ο���\t�������");
				printArr(m, mIndex);
				mIndex = deleteProduct(m, mIndex);
				break;
			case 5 :
				System.out.println("\n===== ��Ÿ =====");
				System.out.println("No.\t��ǰ��\t����\t���\t���ο���");
				printArr(etc, eIndex);
				eIndex = deleteProduct(etc, eIndex);
				break;
			case 0 :
				return;
			}
			
			delay();
		}
	}
	
	//�����ε� + �پ缺
	public int deleteProduct(Goods[] product, int index) {
		System.out.print("������ ��ǰ�� No.�� �Է��ϼ��� > ");
		int seleIndex = sc.nextInt() - 1;

		System.out.println("[" + product[seleIndex].getName() + "]��(��) �����ϼ̽��ϴ�.");
		
		System.out.print("�ش� ��ǰ�� �����Ͻðڽ��ϱ�[y/n]? > ");
		char real = sc.next().charAt(0);
		
		if (real == 'y') {
			for (int i = seleIndex; i < index - 1; i++) {
				product[i] = product[i + 1];
			}
			
			product[--index] = null;
			
			System.out.println("�����Ͽ����ϴ�.");
		} else {
			System.out.println("�����۾��� ����Ͽ����ϴ�.");
		}
		
		return index;
	}
	
	public void client() {
		while(true) {
			System.out.println("===== �մԿ� â�̿ɴϴ� =====");
			System.out.println("1. �����ϱ�");
			System.out.println("2. ��ٱ��� ����");
			System.out.println("0. �ڷΰ���");
			System.out.print("���� > ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 :
				shopping();
				break;
			case 2 :
				shoppingList();
				break;
			case 0 :
				return;
			default :
				System.out.println("0~2 ������ ���ڸ� �Է��� �ּ���.");
			}
		}
	}

	public void shopping() {
		while(true) {
			System.out.println("===== �����ϱ� =====");
			System.out.println("1. ����");
			System.out.println("2. �Ｎ��ǰ");
			System.out.println("3. ����");
			System.out.println("4. �Ǿ�ǰ");
			System.out.println("5. ��Ÿ");
			System.out.println("0. ��������");
			System.out.print("������ ��ǰ ī�װ��� �����ϼ��� > ");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1 :
				printDrink();
				buing(d, dIndex);
				break;
			case 2 :
				printInstantFood();
				buing(iFood, iIndex);
				break;
			case 3 :
				printSnack();
				buing(s, sIndex);
				break;
			case 4 :
				printMedicine();
				buing(m, mIndex);
				break;
			case 5 :
				printEtc();
				buing(etc, eIndex);
				break;
			case 0 :
				return;
			default :
				System.out.println("0~5 ������ ���ڸ� �Է��� �ּ���.");
			}
			
			delay();
		}
	}
	
	//�����ε� + �پ缺
	private void buing(Goods[] product, int getIndex) {
		System.out.print("������ ��ǰ ��ȣ �Է� > ");
		int index = sc.nextInt() - 1;

		if (index >= getIndex) {
			System.out.println("�ش� ��ǰ�� �������� �ʽ��ϴ�.");
			return;
		}
		
		System.out.print("���� ������ �Է� > ");
		int count = sc.nextInt();
		
		if (product[index].getStock() < count) {
			System.out.println("��� �����մϴ�.");
			System.out.println("���� �޴��� ���ư��ϴ�.");
			return;
		}
		
		System.out.println("[" + product[index].getName() + "]��(��) " + count + "�� �����ϼ̽��ϴ�.");
		System.out.print("��ٱ��Ͽ� �����ðڽ��ϱ�[y/n]? > ");
		char sel = sc.next().charAt(0);
		
		if (sel == 'y') {
			//����, ���, ��ǰ�̸�, �������� �ʿ� ����
			cart[cIndex++] = new Goods(product[index].getPrice(), count, product[index].getName(), product[index].getAdult());
			product[index].setStock(product[index].getStock() - count);
			System.out.println("��ٱ��Ͽ� ��ҽ��ϴ�.");
		} else {
			System.out.println("����ϼ̽��ϴ�.");
		}
		
		System.out.println("���� �޴��� ���ư��ϴ�.");
	}

	private void shoppingList() {
		System.out.println("===== ��ٱ��� =====");
		System.out.println("No.\t��ǰ��\t����\t����");
		int totalPrice = 0;
		for (int i = 0; i < cIndex; i++) {
			System.out.println((i + 1) + "\t" + cart[i].getName() + "\t" + cart[i].getPrice() + "\t" + cart[i].getStock());
			
			totalPrice += cart[i].getPrice() * cart[i].getStock();
		}
		
		System.out.println("=================");
		System.out.println("�Ѿ� : " + totalPrice);
		
		delay();
	}
	public void delay() {
		try {
			Thread.sleep(500);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
