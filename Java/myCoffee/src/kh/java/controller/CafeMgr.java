package kh.java.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import kh.java.vo.Coffee;
import kh.java.vo.Dessert;
import kh.java.vo.Goods;
import kh.java.vo.Juice;

public class CafeMgr {

	int totalPrice = 100000;

	// size = false : smll, ture : large
	// temp = false : hot, true : cold
	Coffee[] c = new Coffee[20];
	Coffee[] c1 = new Coffee[20];
	Coffee[] c2 = new Coffee[20];
	int cIndex;

	Juice[] j = new Juice[10];
	Juice[] j1 = new Juice[10];
	Juice[] j2 = new Juice[10];
	int jIndex;

	Dessert[] d = new Dessert[10];
	Dessert[] d1 = new Dessert[10];
	Dessert[] d2 = new Dessert[10];
	int dIndex;

	Goods[] etc = new Goods[20];
	Goods[] etc1 = new Goods[20];
	Goods[] etc2 = new Goods[20];
	int eIndex;

	Goods[] cart = new Goods[20];

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public CafeMgr() {

		c[cIndex] = new Coffee("�Ƹ޸�ī��", 2000, 20, false, false);
		c1[cIndex] = new Coffee("�Ƹ޸�ī��", 1000, 0, false, false);
		c2[cIndex++] = new Coffee("�Ƹ޸�ī��", 1000, 100, false, false);
		c[cIndex] = new Coffee("�Ƹ޸�ī��", 2000, 20, false, true);
		c1[cIndex] = new Coffee("�Ƹ޸�ī��", 1000, 0, false, true);
		c2[cIndex++] = new Coffee("�Ƹ޸�ī��", 1000, 100, false, true);
		c[cIndex] = new Coffee("�Ƹ޸�ī��", 2500, 20, true, false);
		c1[cIndex] = new Coffee("�Ƹ޸�ī��", 1250, 0, true, false);
		c2[cIndex++] = new Coffee("�Ƹ޸�ī��", 1250, 100, true, false);
		c[cIndex] = new Coffee("�Ƹ޸�ī��", 2500, 20, true, true);
		c1[cIndex] = new Coffee("�Ƹ޸�ī��", 1250, 0, true, true);
		c2[cIndex++] = new Coffee("�Ƹ޸�ī��", 1250, 100, true, true);

		c[cIndex] = new Coffee("ī���", 2500, 20, false, false);
		c1[cIndex] = new Coffee("ī���", 1250, 0, false, false);
		c2[cIndex++] = new Coffee("ī���", 1250, 100, false, false);
		c[cIndex] = new Coffee("ī���", 2500, 20, false, true);
		c1[cIndex] = new Coffee("ī���", 1250, 0, false, true);
		c2[cIndex++] = new Coffee("ī���", 1250, 100, false, true);
		c[cIndex] = new Coffee("ī���", 3000, 20, true, false);
		c1[cIndex] = new Coffee("ī���", 1500, 0, true, false);
		c2[cIndex++] = new Coffee("ī���", 1500, 100, true, false);
		c[cIndex] = new Coffee("ī���", 3000, 20, true, true);
		c1[cIndex] = new Coffee("ī���", 1500, 0, true, true);
		c2[cIndex++] = new Coffee("ī���", 1500, 100, true, true);

		c[cIndex] = new Coffee("ī��Ḷ���ƶ�", 3000, 20, false, false);
		c1[cIndex] = new Coffee("ī��Ḷ���ƶ�", 1500, 0, false, false);
		c2[cIndex++] = new Coffee("ī��Ḷ���ƶ�", 1500, 100, false, false);
		c[cIndex] = new Coffee("ī��Ḷ���ƶ�", 3000, 20, false, true);
		c1[cIndex] = new Coffee("ī��Ḷ���ƶ�", 1500, 0, false, true);
		c2[cIndex++] = new Coffee("ī��Ḷ���ƶ�", 1500, 100, false, true);
		c[cIndex] = new Coffee("ī��Ḷ���ƶ�", 3500, 20, true, false);
		c1[cIndex] = new Coffee("ī��Ḷ���ƶ�", 1750, 0, true, false);
		c2[cIndex++] = new Coffee("ī��Ḷ���ƶ�", 1750, 100, true, false);
		c[cIndex] = new Coffee("ī��Ḷ���ƶ�", 3500, 20, true, true);
		c1[cIndex] = new Coffee("ī��Ḷ���ƶ�", 1750, 0, true, true);
		c2[cIndex++] = new Coffee("ī��Ḷ���ƶ�", 1750, 100, true, true);

		j[jIndex] = new Juice("������ �ֽ�", 3000, 15, false);
		j1[jIndex] = new Juice("������ �ֽ�", 1500, 0, false);
		j2[jIndex++] = new Juice("������ �ֽ�", 1500, 100, false);
		j[jIndex] = new Juice("������ �ֽ�", 3500, 15, true);
		j1[jIndex] = new Juice("������ �ֽ�", 1750, 0, true);
		j2[jIndex++] = new Juice("������ �ֽ�", 1750, 100, true);

		j[jIndex] = new Juice("���� �ֽ�", 3000, 15, false);
		j1[jIndex] = new Juice("���� �ֽ�", 1500, 0, false);
		j2[jIndex++] = new Juice("���� �ֽ�", 1500, 100, false);
		j[jIndex] = new Juice("���� �ֽ�", 3500, 15, true);
		j1[jIndex] = new Juice("���� �ֽ�", 1750, 0, true);
		j2[jIndex++] = new Juice("���� �ֽ�", 1750, 100, true);

		j[jIndex] = new Juice("�ٳ��� �ֽ�", 3000, 15, false);
		j1[jIndex] = new Juice("�ٳ��� �ֽ�", 1500, 0, false);
		j2[jIndex++] = new Juice("�ٳ��� �ֽ�", 1500, 100, false);
		j[jIndex] = new Juice("�ٳ��� �ֽ�", 3500, 15, true);
		j1[jIndex] = new Juice("�ٳ��� �ֽ�", 1750, 0, true);
		j2[jIndex++] = new Juice("�ٳ��� �ֽ�", 1750, 100, true);

		d[dIndex] = new Dessert("ġ�� ����ũ", 3000, 15, false, "2020-02-11");
		d1[dIndex] = new Dessert("ġ�� ����ũ", 1500, 0, false, "2020-02-11");
		d2[dIndex++] = new Dessert("ġ�� ����ũ", 1500, 100, false, "2020-02-11");
		d[dIndex] = new Dessert("ġ�� ����ũ", 5000, 15, true, "2020-02-11");
		d1[dIndex] = new Dessert("ġ�� ����ũ", 2500, 0, true, "2020-02-11");
		d2[dIndex++] = new Dessert("ġ�� ����ũ", 2500, 100, true, "2020-02-11");

		d[dIndex] = new Dessert("���ݸ� ����ũ", 3000, 15, false, "2020-02-11");
		d1[dIndex] = new Dessert("���ݸ� ����ũ", 1500, 0, false, "2020-02-11");
		d2[dIndex++] = new Dessert("���ݸ� ����ũ", 1500, 100, false, "2020-02-11");
		d[dIndex] = new Dessert("���ݸ� ����ũ", 5000, 15, true, "2020-02-11");
		d1[dIndex] = new Dessert("���ݸ� ����ũ", 2500, 0, true, "2020-02-11");
		d2[dIndex++] = new Dessert("���ݸ� ����ũ", 2500, 100, true, "2020-02-11");

		d[dIndex] = new Dessert("���� ����ũ", 3000, 15, false, "2020-02-11");
		d1[dIndex] = new Dessert("���� ����ũ", 1500, 0, false, "2020-02-11");
		d2[dIndex++] = new Dessert("���� ����ũ", 1500, 100, false, "2020-02-11");
		d[dIndex] = new Dessert("���� ����ũ", 5000, 15, true, "2020-02-11");
		d1[dIndex] = new Dessert("���� ����ũ", 2500, 0, true, "2020-02-11");
		d2[dIndex++] = new Dessert("���� ����ũ", 2500, 100, true, "2020-02-11");

		etc[eIndex] = new Goods("�Һ�", 5000, 15);
		etc1[eIndex] = new Goods("�Һ�", 2500, 0);
		etc2[eIndex++] = new Goods("�Һ�", 2500, 100);
		etc[eIndex] = new Goods("�ӱ���", 5000, 15);
		etc1[eIndex] = new Goods("�ӱ���", 2500, 0);
		etc2[eIndex++] = new Goods("�ӱ���", 2500, 100);
	}

	public void main() {
		while (true) {
			System.out.println("===== GS25 =====");
			System.out.println("1. �˹�");
			System.out.println("2. �մ�");
			System.out.println("3. ��ǰ��ü");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� > ");

			try {
				int select = Integer.parseInt(br.readLine());

				System.out.println();

				switch (select) {
				case 1:
					alba();
					break;
				case 2:
					client();
					break;
				case 3:
					server();
					break;
				case 0:
					return;
				default:
					System.out.println("0~3 ������ ���ڸ� �Է��� �ּ���.");
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void alba() {
		while (true) {
			System.out.println("===== ���ض� �˹پ� =====");
			System.out.println("1. �� ��ǰ ���");
			System.out.println("2. ���� ��� ��Ȳ ����");
			System.out.println("3. ��� ��û");
			System.out.println("4. ��ǰ ����");
			System.out.println("0. �ڷΰ���");
			System.out.print("���� > ");

			try {
				int select = Integer.parseInt(br.readLine());

				switch (select) {
				case 1:
					insertProduct();
					break;
				case 2:
					printCoffee();
					printJuice();
					printDesert();
					printEtc();
					delay();
					break;
				case 3:
					break;
				case 4:
					break;
				case 0:
					return;
				default:
					System.out.println("0~4 ������ ���ڸ� �Է��� �ּ���.");
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void insertProduct() {
		while (true) {
			System.out.println("===== ��ǰ ��� ======");
			System.out.println("1. Ŀ�� ���");
			System.out.println("2. ���� �ֽ� ���");
			System.out.println("3. ����Ʈ ���");
			System.out.println("4. ��Ÿ ���");
			System.out.println("0. ��������");
			System.out.print("���� > ");

			try {
				int select = Integer.parseInt(br.readLine());

				if (select == 0) {
					System.out.println("���� �������� ���ư��ϴ�.");
					delay();
					return;
				} else if (select > 0 && select < 5) {
					System.out.print("��ǰ���� �Է��ϼ���. : ");
					String name = br.readLine();

					System.out.print("��ǰ ������ �Է��ϼ���. : ");
					int price = Integer.parseInt(br.readLine());

					System.out.print("��ǰ ������ �Է��ϼ���. : ");
					int stock = Integer.parseInt(br.readLine());

					switch (select) {
					case 1:
						System.out.print("ũ��[1. Small/2. Large] : ");
						boolean size = (Integer.parseInt(br.readLine()) == 1) ? false : true;

						System.out.print("�µ�[1. Hot/2. Cold] : ");
						boolean temp = (Integer.parseInt(br.readLine()) == 1) ? false : true;

						c[cIndex] = new Coffee(name, price, stock, size, temp);
						c1[cIndex] = new Coffee(name, price / 2, 0, size, temp);
						c2[cIndex++] = new Coffee(name, price / 2, 100, size, temp);
						break;
					case 2:
						System.out.print("ũ��[1. Small/2. Large] : ");
						size = (Integer.parseInt(br.readLine()) == 1) ? false : true;

						j[jIndex] = new Juice(name, price, stock, size);
						j1[jIndex] = new Juice(name, price / 2, 0, size);
						j2[jIndex++] = new Juice(name, price / 2, 100, size);
						break;
					case 3:
						System.out.print("ũ��[1. Small/2. Large] : ");
						size = (Integer.parseInt(br.readLine()) == 1) ? false : true;

						System.out.print("�������(yyyy-mm-dd) : ");
						String expired = br.readLine();

						d[dIndex] = new Dessert(name, price, stock, size, expired);
						d1[dIndex] = new Dessert(name, price / 2, 0, size, expired);
						d2[dIndex++] = new Dessert(name, price / 2, 100, size, expired);
						break;
					case 4:
						etc[eIndex] = new Goods(name, price, stock);
						etc1[eIndex] = new Goods(name, price / 2, 0);
						etc2[eIndex++] = new Goods(name, price / 2, 100);
						break;
					}
					System.out.println("��ǰ ����� �Ϸ�Ǿ����ϴ�.");
				} else {
					System.out.println("0~4 ������ ���ڸ� �Է��ϼ���.");
				}
				delay();
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void printCoffee() {

		System.out.println("===== Ŀ�� =====");
		System.out.println("No.\t�̸�\t\t\t����\t���");

		for (int i = 0; i < cIndex; i++) {
			String name = (c[i].getTemp() ? "���̽�" : "�߰ſ�") + " " + c[i].getName() + " "
					+ (c[i].getSize() ? "Large" : "Small") + "\t";
			for (int k = 0; k < (23 - name.length()) / 8; k++) {
				name += "\t";
			}
			System.out.println((i + 1) + "\t" + name + c[i].getPrice() + "\t" + c[i].getStock());
		}

	}

	public void printJuice() {
		System.out.println("===== ���� �ֽ� =====");
		System.out.println("No.\t�̸�\t\t����\t���");

		for (int i = 0; i < jIndex; i++) {
			String name = j[i].getName() + " " + (j[i].getSize() ? "Large" : "Small") + "\t";
			for (int k = 0; k < (15 - name.length()) / 8; k++) {
				name += "\t";
			}
			System.out.println((i + 1) + "\t" + name + j[i].getPrice() + "\t" + j[i].getStock());
		}
	}

	public void printDesert() {
		System.out.println("===== ����Ʈ =====");
		System.out.println("No.\t�̸�\t\t����\t���\t�������");

		for (int i = 0; i < dIndex; i++) {
			String name = d[i].getName() + " " + (d[i].getSize() ? "Large" : "Small") + "\t";
			for (int k = 0; k < (15 - name.length()) / 8; k++) {
				name += "\t";
			}
			System.out.println(
					(i + 1) + "\t" + name + d[i].getPrice() + "\t" + d[i].getStock() + "\t" + d[i].getExpired());
		}
	}

	public void printEtc() {
		System.out.println("===== ��Ÿ =====");
		System.out.println("No.\t�̸�\t����\t���");

		for (int i = 0; i < eIndex; i++) {
			System.out.println((i + 1) + "\t" + etc[i].getName() + "\t" + etc[i].getPrice() + "\t" + etc[i].getStock());
		}
	}

	public void client() {

	}

	public void server() {

	}

	public void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
