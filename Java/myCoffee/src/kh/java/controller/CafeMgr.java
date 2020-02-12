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
	int clientMoney = 0;

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
	int cartIndex;

	Coffee oc = new Coffee();
	Juice oj = new Juice();
	Dessert od = new Dessert();
	Goods oe = new Goods();

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
			System.out.println("===== CAFFE BENE =====");
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
			System.out.println("���� �ݾ� : " + totalPrice);
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
					printCoffee(c);
					printJuice(j);
					printDessert(d);
					printEtc(etc);
					delay();
					break;
				case 3:
					updateProduct();
					break;
				case 4:
					deleteProduct();
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

	public void printCoffee(Coffee[] c) {

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

	public void printJuice(Juice[] j) {
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

	public void printDessert(Dessert[] d) {
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

	public void printEtc(Goods[] e) {
		System.out.println("===== ��Ÿ =====");
		System.out.println("No.\t�̸�\t����\t���");

		for (int i = 0; i < eIndex; i++) {
			System.out.println((i + 1) + "\t" + etc[i].getName() + "\t" + etc[i].getPrice() + "\t" + etc[i].getStock());
		}
	}

	public void deleteProduct() {
		while (true) {

			System.out.println("===== ��ǰ ���� ======");
			System.out.println("1. Ŀ�� ����");
			System.out.println("2. ���� �ֽ� ����");
			System.out.println("3. ����Ʈ ����");
			System.out.println("4. ��Ÿ ����");
			System.out.println("0. ��������");
			System.out.print("���� > ");

			try {
				int select = Integer.parseInt(br.readLine());

				switch (select) {
				case 1:
					printCoffee(c);
					cIndex = deleteProduct(c, c1, c2, cIndex, oc);
					break;
				case 2:
					jIndex = deleteProduct(j, j1, j2, jIndex, oj);
					printJuice(j);
					break;
				case 3:
					dIndex = deleteProduct(d, d1, d2, dIndex, od);
					printDessert(d);
					break;
				case 4:
					eIndex = deleteProduct(etc, etc1, etc2, eIndex, oe);
					printEtc(etc);
					break;
				case 0:
					System.out.println("���� �������� ���ư��ϴ�.");
					delay();
					return;
				default:
					System.out.println("0~4 ������ ���ڸ� �Է��ϼ���.");
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

			delay();
		}
	}

	public int deleteProduct(Goods[] product, Goods[] product1, Goods[] product2, int index, Object ojt) {
		int selDelete;
		String name = "";
		while (true) {
			try {
				System.out.print("���� > ");
				selDelete = Integer.parseInt(br.readLine()) - 1;

				if (selDelete >= 0 && selDelete < index) {
					break;
				} else {
					System.out.println("1~" + index + "������ ���ڸ� �Է��� �ּ���.");
					continue;
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		if (ojt instanceof Coffee) {
			name = (((Coffee) product[selDelete]).getTemp() ? "���̽�" : "�߰ſ�") + " " + product[selDelete].getName() + " "
					+ (((Coffee) product[selDelete]).getSize() ? "Large" : "Small");
		} else if (ojt instanceof Juice) {
			name = product[selDelete].getName() + " " + (((Juice) product[selDelete]).getSize() ? "Large" : "Small");
		} else if (ojt instanceof Dessert) {
			name = product[selDelete].getName() + " " + (((Dessert) product[selDelete]).getSize() ? "Large" : "Small");
		} else if (ojt instanceof Goods) {
			name = product[selDelete].getName();
		}

		System.out.print("[" + name + "]��(��) �����Ͻðڽ��ϱ�?[y/n] : ");
		try {
			char ch = br.readLine().charAt(0);

			if (ch == 'y') {
				for (int i = selDelete; i < index - 1; i++) {
					product[i] = product[i + 1];
					product1[i] = product1[i + 1];
					product2[i] = product2[i + 1];
				}

				product[--index] = null;
				product1[index] = null;
				product2[index] = null;
				System.out.println("��ǰ�� �����Ǿ����ϴ�.");
			} else {
				System.out.println("��ǰ ������ ����Ͽ����ϴ�.");
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		}
		return index;
	}

	public void updateProduct() {
		while (true) {

			System.out.println("===== ��� ��û ======");
			System.out.println("1. Ŀ�� ��û");
			System.out.println("2. ���� �ֽ� ��û");
			System.out.println("3. ����Ʈ ��û");
			System.out.println("4. ��Ÿ ��û");
			System.out.println("0. ��������");
			System.out.print("���� > ");

			try {
				int select = Integer.parseInt(br.readLine());

				switch (select) {
				case 1:
					printCoffee(c);
					updateProduct(c, c1, cIndex, oc);
					break;
				case 2:
					printJuice(j);
					updateProduct(j, j1, jIndex, oj);
					break;
				case 3:
					printDessert(d);
					updateProduct(d, d1, dIndex, od);
					break;
				case 4:
					printEtc(etc);
					updateProduct(etc, etc1, eIndex, oe);
					break;
				case 0:
					System.out.println("���� �������� ���ư��ϴ�.");
					delay();
					return;
				default:
					System.out.println("0~4 ������ ���ڸ� �Է��ϼ���.");
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

			delay();
		}
	}

	public void updateProduct(Goods[] product, Goods[] product1, int index, Object ojt) {

		String name = "";
		int select;

		while (true) {
			try {
				System.out.print("���� > ");
				select = Integer.parseInt(br.readLine()) - 1;

				if (select >= 0 && select < index) {
					break;
				} else {
					System.out.println("1~" + index + "������ ���ڸ� �Է��� �ּ���.");
					continue;
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		if (ojt instanceof Coffee) {
			name = (((Coffee) product[select]).getTemp() ? "���̽�" : "�߰ſ�") + " " + product[select].getName() + " "
					+ (((Coffee) product[select]).getSize() ? "Large" : "Small");
		} else if (ojt instanceof Juice) {
			name = product[select].getName() + " " + (((Juice) product[select]).getSize() ? "Large" : "Small");
		} else if (ojt instanceof Dessert) {
			name = product[select].getName() + " " + (((Dessert) product[select]).getSize() ? "Large" : "Small");
		} else if (ojt instanceof Goods) {
			name = product[select].getName();
		}
		while (true) {
			try {
				System.out.print("[" + name + "]��(��) � ��û�Ͻðڽ��ϱ� : ");
				int count = Integer.parseInt(br.readLine());

				if (totalPrice < product1[select].getPrice() * count) {
					System.out.println("�������� �����մϴ�.");
					System.out.println("���� ������ : " + totalPrice);
					continue;
				} else {
					product1[select].setStock(product1[select].getStock() + count);
					System.out.println("��� ��û�� �Ϸ�Ǿ����ϴ�.");
					return;
				}

			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void client() {

		while (true) {
			System.out.println(" ====== myCoffee ====== ");
			System.out.println("���� �� ������ �ݾ� : " + clientMoney + "��");
			System.out.println("1. �����ϱ�");
			System.out.println("2. ��ٱ��� ����");
			System.out.println("3. ��ٱ��� �ʱ�ȭ");
			System.out.println("0. �ڷΰ���");
			System.out.print("���� > ");
			try {
				int sel = Integer.parseInt(br.readLine());

				switch (sel) {
				case 1:
					shopping();
					break;
				case 2:
					shoppingList();
					break;
				case 3:
					shoppingListReset();
					break;
				case 0:
					return;
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void shopping() {
		while (true) {
			System.out.println(" ====== ī�� ���� ��� ====== ");
			System.out.println("1. [Ŀ��]");
			System.out.println("2. [�����꽺]");
			System.out.println("3. [����Ʈ]");
			System.out.println("4. [��Ÿ]");
			System.out.println("0. �ڷΰ���");
			System.out.print("������ ��ǰ ī�װ��� �������ּ��� : ");

			try {
				int sel = Integer.parseInt(br.readLine());

				switch (sel) {
				case 1:
					printCoffee(c);
					buing(c);
					break;
				case 2:
					printJuice(j);
					buing(j);
					break;
				case 3:
					printDessert(d);
					buing(d);
					break;
				case 4:
					printEtc(etc);
					buing(etc);
					break;
				case 0:
					return;
				}
				delay();
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void buing(Goods[] product) {
		while (true) {

			try {
				System.out.print("������ ��ǰ ��ȣ �Է� : ");
				int nIndex = Integer.parseInt(br.readLine()) - 1;
				System.out.print("������ ������ �Է� : ");
				int count = Integer.parseInt(br.readLine());
				if (product[nIndex].getStock() < count) {
					System.out.println("��� �����մϴ�.");
					System.out.println("�����޴��� ���ư��ϴ�.");
					break;
				}
				System.out.println("[" + product[nIndex].getName() + "]��ǰ " + count + "���� ����");
				System.out.print("��ٱ��Ͽ� �����ðڽ��ϱ�[y/n]? : ");
				char sel = br.readLine().charAt(0);
				if (sel == 'y') {
					// ����, ���, ��ǰ�̸�
					int price = product[nIndex].getPrice();
					int stock = count;
					String name = product[nIndex].getName();
					cart[cartIndex++] = new Goods(name, price, stock);
					product[nIndex].setStock(product[nIndex].getStock() - count);
					clientMoney += price * stock;
				} else if (sel == 'n') {
					break;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					continue;
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

			break;
		}
	}

	public void shoppingList() {
		System.out.println(" ====== ��ٱ��� ====== ");
		System.out.println("��ǰ��\t����\t����");
		int totalPrice = 0;
		for (int i = 0; i < cartIndex; i++) {
			System.out.println(cart[i].getName() + "\t" + cart[i].getPrice() + "\t" + cart[i].getStock());

			totalPrice += cart[i].getPrice() * cart[i].getStock();
		}
		System.out.println("�� ���űݾ� : " + totalPrice + "��");

		this.totalPrice += totalPrice;
		delay();
	}

	public void shoppingListReset() {
		cart = new Goods[10];
		cartIndex = 0;
		clientMoney = 0;
		System.out.println("��ٱ��ϰ� �ʱ�ȭ �Ǿ����ϴ�.");
		delay();
	}

	public void server() {
		while (true) {
			System.out.println("===== ��ǰ��ü ======");
			System.out.println("1. ����߰�");
			System.out.println("2. ��ǰ�������");
			System.out.println("3. ����ûȮ��");
			System.out.println("0. ��������");
			System.out.print("���� > ");

			try {
				int sel = Integer.parseInt(br.readLine());
				switch (sel) {
				case 1:
					delivery();
					break;
				case 2:
					printCoffee(c2);
					printJuice(j2);
					printDessert(d2);
					printEtc(etc2);
					delay();
					break;
				case 3:
					requestCoffee();
					break;
				default:
					return;
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void delivery() {
		while (true) {
			System.out.println("===== ��ǰ �߰� ======");
			System.out.println("1. Ŀ�� �߰�");
			System.out.println("2. ���� �ֽ� �߰�");
			System.out.println("3. ����Ʈ �߰�");
			System.out.println("4. ��Ÿ �߰�");
			System.out.println("0. ��������");
			System.out.print("���� > ");

			try {

				int sel = Integer.parseInt(br.readLine());
				switch (sel) {
				case 1:
					printCoffee(c2);
					insertProduct(c);
					break;
				case 2:
					printJuice(j2);
					insertProduct(j);
					break;
				case 3:
					printDessert(d2);
					insertProduct(d);
					break;
				case 4:
					printEtc(etc2);
					insertProduct(etc);
					break;
				default:
					return;
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	public void insertProduct(Goods[] product) {

		try {
			System.out.println("===== ��ǰ �߰�=====");

			System.out.print("�߰��� ��ǰ ��ȣ �Է� : ");
			int index = Integer.parseInt(br.readLine()) - 1;
			System.out.print("�߰��� �� �Է� : ");
			int count = Integer.parseInt(br.readLine());
			System.out.println("[" + (c2[index].getTemp() ? "���̽�" : "�߰ſ�") + " " + c2[index].getName() + " "
					+ (c2[index].getSize() ? "Large" : "Small") + "]��ǰ " + count + "���� �����ϼ̽��ϴ�.");
			System.out.print("�ش� ��ǰ�� �߰��Ͻðڽ��ϱ�[y/n]?");
			char ch = br.readLine().charAt(0);
			if (ch == 'y') {
				count += c2[index].getStock();
				c2[index].setStock(count);
			}
		} catch (NumberFormatException ne) {
			System.err.println("���ڸ� �Է��� �ּ���.");
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public void requestCoffee() {
		System.out.println("===== Ŀ�� =====");
		System.out.println("No.\t�̸�\t\t\t����\t���");

		int count = 1;
		int requestPrice = 0;
		boolean requestCheck = false;

		for (int i = 0; i < cIndex; i++) {
			if (c1[i].getStock() != 0) {
				String name = (c1[i].getTemp() ? "���̽�" : "�߰ſ�") + " " + c1[i].getName() + " "
						+ (c1[i].getSize() ? "Large" : "Small") + "\t";
				for (int k = 0; k < (23 - name.length()) / 8; k++) {
					name += "\t";
				}
				System.out.println((count++) + "\t" + name + c1[i].getPrice() + "\t" + c1[i].getStock());
				requestPrice += c1[i].getPrice() * c1[i].getStock();
				requestCheck = true;
			}
		}

		System.out.println("===== ���� �ֽ� =====");
		System.out.println("No.\t�̸�\t\t����\t���");

		count = 1;

		for (int i = 0; i < jIndex; i++) {
			if (j1[i].getStock() != 0) {
				String name = j1[i].getName() + " " + (j1[i].getSize() ? "Large" : "Small") + "\t";
				for (int k = 0; k < (15 - name.length()) / 8; k++) {
					name += "\t";
				}
				System.out.println((count++) + "\t" + name + j1[i].getPrice() + "\t" + j1[i].getStock());
				requestPrice += j1[i].getPrice() * j1[i].getStock();
				requestCheck = true;
			}
		}

		System.out.println("===== ����Ʈ =====");
		System.out.println("No.\t�̸�\t\t����\t���\t�������");

		count = 1;

		for (int i = 0; i < dIndex; i++) {
			if (d1[i].getStock() != 0) {
				String name = d1[i].getName() + " " + (d1[i].getSize() ? "Large" : "Small") + "\t";
				for (int k = 0; k < (15 - name.length()) / 8; k++) {
					name += "\t";
				}
				System.out.println((count++) + "\t" + name + d1[i].getPrice() + "\t" + d1[i].getStock() + "\t"
						+ d1[i].getExpired());
				requestPrice += d1[i].getPrice() * d1[i].getStock();
				requestCheck = true;
			}
		}

		System.out.println("===== ��Ÿ =====");
		System.out.println("No.\t�̸�\t����\t���");

		count = 1;

		for (int i = 0; i < eIndex; i++) {
			if (etc1[i].getStock() != 0) {
				System.out.println(
						(count++) + "\t" + etc1[i].getName() + "\t" + etc1[i].getPrice() + "\t" + etc1[i].getStock());
				requestPrice += etc1[i].getPrice() * etc1[i].getStock();
				requestCheck = true;
			}
		}

		if (requestCheck) {

			System.out.print("����û�� �³��ϰڽ��ϱ�[y/n]? : ");

			try {
				char ch = br.readLine().charAt(0);

				if (ch == 'y') {
					for (int i = 0; i < cIndex; i++) {
						if (c1[i].getStock() != 0) {
							c[i].setStock(c[i].getStock() + c1[i].getStock());
							c2[i].setStock(c2[i].getStock() - c1[i].getStock());
							c1[i].setStock(0);
						}
					}

					for (int i = 0; i < jIndex; i++) {
						if (j1[i].getStock() != 0) {
							j[i].setStock(j[i].getStock() + j1[i].getStock());
							j2[i].setStock(j2[i].getStock() - j1[i].getStock());
							j1[i].setStock(0);
						}
					}

					for (int i = 0; i < dIndex; i++) {
						if (d1[i].getStock() != 0) {
							d[i].setStock(d[i].getStock() + d1[i].getStock());
							d2[i].setStock(d2[i].getStock() - d1[i].getStock());
							d1[i].setStock(0);
						}
					}

					for (int i = 0; i < eIndex; i++) {
						if (etc1[i].getStock() != 0) {
							etc[i].setStock(etc[i].getStock() + etc1[i].getStock());
							etc2[i].setStock(etc2[i].getStock() - etc1[i].getStock());
							etc1[i].setStock(0);
						}
					}

					totalPrice -= requestPrice;
					System.out.println("��� �߰��� �Ϸ�Ǿ����ϴ�.");
					System.out.println("�� �ݾ� : " + requestPrice);
				} else {
					System.out.println("����Ͽ����ϴ�.");
					System.out.print("��� ��û�� �����Ͻðڽ��ϱ�[y/n]? : ");
					ch = br.readLine().charAt(0);

					if (ch == 'y') {
						for (int i = 0; i < cIndex; i++) {
							if (c1[i].getStock() != 0) {
								c1[i].setStock(0);
							}
						}

						for (int i = 0; i < jIndex; i++) {
							if (j1[i].getStock() != 0) {
								j1[i].setStock(0);
							}
						}

						for (int i = 0; i < dIndex; i++) {
							if (d1[i].getStock() != 0) {
								d1[i].setStock(0);
							}
						}

						for (int i = 0; i < eIndex; i++) {
							if (etc1[i].getStock() != 0) {
								etc1[i].setStock(0);
							}
						}

						System.out.println("��� ��û�� �����Ͽ����ϴ�.");
					}
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		} else {
			System.out.println("��� ��û�� �����ϴ�.");
		}

		delay();
	}

	public void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
