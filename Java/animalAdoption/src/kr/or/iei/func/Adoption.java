package kr.or.iei.func;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Adoption {

	ArrayList<Animal> list = new ArrayList<Animal>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Random rand = new Random();

	public Adoption() {
		int select;

		while (true) {
			System.out.println("========== ���� �Ծ��ϱ� ==========");
			System.out.println("1. �Ծ��ϱ�");
			System.out.println("2. �����ϱ�");
			System.out.println("3. �ľ��ϱ�");
			System.out.println("4. ���α׷� ����");

			while (true) {
				System.out.print("���� > ");

				try {
					select = Integer.parseInt(br.readLine());

					if (select < 1 || select > 4) {
						System.out.println("1~4 ������ ���ڸ� �Է��� �ּ���.");
					} else {
						break;
					}
				} catch (NumberFormatException ne) {
					System.err.println("���ڸ� �Է��� �ּ���.");
				} catch (IOException ie) {
					ie.printStackTrace();
				}
			}

			switch (select) {
			case 1:
				selectAnimal();
				break;
			case 2:
				animalCare();
				break;
			case 3:
				abandonment();
				break;
			case 4:
				return;
			}
		}
	}

	public void selectAnimal() {

		String animal[] = { "������", "�����", "�ܽ���", "��" };
		int select;

		while (true) {
			System.out.println("========== ���� �����ϱ� =========");

			for (int i = 0; i < animal.length; i++) {
				System.out.println((i + 1) + ". " + animal[i]);
			}

			System.out.println("5. ����ϱ�");

			System.out.print("���� > ");

			try {
				select = Integer.parseInt(br.readLine());

				if (select < 1 || select > 5) {
					System.out.println("1~4 ������ ���ڸ� �Է��� �ּ���.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

		switch (select) {
		case 1:
			selectDog();
			break;
		case 2:
			selectCat();
			break;
		case 3:
			selectHamster();
			break;
		case 4:
			selectBird();
			break;
		case 5:
			return;
		}
	}

	public void selectDog() {

		String dog[] = { "���޶�Ͼ�", "ġ�Ϳ�", "���ǿ�", "�ڽ���Ʈ", "�����ڱ�", "��� ��Ʈ����", "����� ��Ʈ����", "�׷���Ʈ �Ƿ�����" };
		int select;

		String name;
		String species = "������";
		String category;
		int age;
		String sex;

		while (true) {
			System.out.println("========== ���� �����ϱ� =========");

			for (int i = 0; i < dog.length; i++) {
				System.out.println((i + 1) + ". " + dog[i]);
			}

			System.out.println((dog.length + 1) + ". ����ϱ�");

			System.out.print("���� > ");

			try {
				select = Integer.parseInt(br.readLine());

				if (select < 1 || select > dog.length + 1) {
					System.out.println("1~" + (dog.length + 1) + " ������ ���ڸ� �Է��� �ּ���.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

		if (select == dog.length + 1) {
			return;
		} else {
			category = dog[select - 1];
		}

		age = rand.nextInt(5) + 1;

		sex = (rand.nextInt(2) == 0) ? "��" : "��";

		System.out.println("=====" + species + "�Ծ��ϱ� =====");
		System.out.println("���� : " + category);
		System.out.println("���� : " + age);
		System.out.println("���� : " + sex);

		while (true) {
			try {
				System.out.print("�Ծ��Ͻðڽ��ϱ�? [1. yes / 2. no] ");
				select = Integer.parseInt(br.readLine());

				if (select != 1 && select != 2) {
					System.out.println("1~2 ������ ���ڸ� �Է��� �ּ���.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		if (select == 1) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			try {
				name = br.readLine();
				Animal animal = new Animal(name, species, category, age, sex);
				list.add(animal);
			} catch (IOException ie) {
				ie.printStackTrace();
			}

			try {
				for (int i = 0; i < 5; i++) {
					System.out.println(".");
					Thread.sleep(500);
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

			System.out.println("�Ծ����ּż� �����մϴ�!");

		} else {
			return;
		}
	}

	public void selectCat() {

		String cat[] = { "�丣�þ�", "���þ� ���", "��ġŲ", "�ú����� �����", "�þ� �����", "�Ƹ޸�ĭ ��Ʈ ���", "��ũ��" };
		int select;

		String name;
		String species = "�����";
		String category;
		int age;
		String sex;

		while (true) {
			System.out.println("========== ���� �����ϱ� =========");

			for (int i = 0; i < cat.length; i++) {
				System.out.println((i + 1) + ". " + cat[i]);
			}

			System.out.println((cat.length + 1) + ". ����ϱ�");

			System.out.print("���� > ");

			try {
				select = Integer.parseInt(br.readLine());

				if (select < 1 || select > cat.length + 1) {
					System.out.println("1~" + (cat.length + 1) + " ������ ���ڸ� �Է��� �ּ���.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

		if (select == cat.length + 1) {
			return;
		} else {
			category = cat[select - 1];
		}

		age = rand.nextInt(5) + 1;

		sex = (rand.nextInt(2) == 0) ? "��" : "��";

		System.out.println("=====" + species + "�Ծ��ϱ� =====");
		System.out.println("���� : " + category);
		System.out.println("���� : " + age);
		System.out.println("���� : " + sex);

		while (true) {
			System.out.print("�Ծ��Ͻðڽ��ϱ�? [1. yes / 2. no] ");
			try {
				select = Integer.parseInt(br.readLine());

				if (select != 1 && select != 2) {
					System.out.println("1~2 ������ ���ڸ� �Է��� �ּ���.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		if (select == 1) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			try {
				name = br.readLine();
				Animal animal = new Animal(name, species, category, age, sex);
				list.add(animal);
			} catch (IOException ie) {
				ie.printStackTrace();
			}

			try {
				for (int i = 0; i < 5; i++) {
					System.out.println(".");
					Thread.sleep(500);
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

			System.out.println("�Ծ����ּż� �����մϴ�!");

		} else {
			return;
		}
	}

	public void selectHamster() {

		String hamster[] = { "��� �ܽ���", "����� �ܽ���", "�κ��κ꽺Ű �ܽ���", "ķ�� �ܽ���", "���̴��� �ܽ���" };
		int select;

		String name;
		String species = "�ܽ���";
		String category;
		int age;
		String sex;

		while (true) {
			System.out.println("========== ���� �����ϱ� =========");

			for (int i = 0; i < hamster.length; i++) {
				System.out.println((i + 1) + ". " + hamster[i]);
			}

			System.out.println((hamster.length + 1) + ". ����ϱ�");

			System.out.print("���� > ");

			try {
				select = Integer.parseInt(br.readLine());

				if (select < 1 || select > hamster.length + 1) {
					System.out.println("1~" + (hamster.length + 1) + " ������ ���ڸ� �Է��� �ּ���.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

		if (select == hamster.length + 1) {
			return;
		} else {
			category = hamster[select - 1];
		}

		age = rand.nextInt(5) + 1;

		sex = (rand.nextInt(2) == 0) ? "��" : "��";

		System.out.println("=====" + species + "�Ծ��ϱ� =====");
		System.out.println("���� : " + category);
		System.out.println("���� : " + age);
		System.out.println("���� : " + sex);

		while (true) {
			try {
				System.out.print("�Ծ��Ͻðڽ��ϱ�? [1. yes / 2. no] ");
				select = Integer.parseInt(br.readLine());

				if (select != 1 && select != 2) {
					System.out.println("1~2 ������ ���ڸ� �Է��� �ּ���.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		if (select == 1) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			try {
				name = br.readLine();
				Animal animal = new Animal(name, species, category, age, sex);
				list.add(animal);
			} catch (IOException ie) {
				ie.printStackTrace();
			}

			try {
				for (int i = 0; i < 5; i++) {
					System.out.println(".");
					Thread.sleep(500);
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

			System.out.println("�Ծ����ּż� �����մϴ�!");

		} else {
			return;
		}
	}

	public void selectBird() {

		String bird[] = { "��ѱ�", "ī������", "�з�", "��ī��", "�Ķ�Ŷ" };
		int select;

		String name;
		String species = "��";
		String category;
		int age;
		String sex;

		while (true) {
			System.out.println("========== ���� �����ϱ� =========");

			for (int i = 0; i < bird.length; i++) {
				System.out.println((i + 1) + ". " + bird[i]);
			}

			System.out.println((bird.length + 1) + ". ����ϱ�");

			System.out.print("���� > ");

			try {
				select = Integer.parseInt(br.readLine());

				if (select < 1 || select > bird.length + 1) {
					System.out.println("1~" + (bird.length + 1) + " ������ ���ڸ� �Է��� �ּ���.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

		if (select == bird.length + 1) {
			return;
		} else {
			category = bird[select - 1];
		}

		age = rand.nextInt(5) + 1;

		sex = (rand.nextInt(2) == 0) ? "��" : "��";

		System.out.println("=====" + species + "�Ծ��ϱ� =====");
		System.out.println("���� : " + category);
		System.out.println("���� : " + age);
		System.out.println("���� : " + sex);

		while (true) {
			System.out.print("�Ծ��Ͻðڽ��ϱ�? [1. yes / 2. no] ");
			try {
				select = Integer.parseInt(br.readLine());

				if (select != 1 && select != 2) {
					System.out.println("1~2 ������ ���ڸ� �Է��� �ּ���.");
				} else {
					break;
				}
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		if (select == 1) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			try {
				name = br.readLine();
				Animal animal = new Animal(name, species, category, age, sex);
				list.add(animal);
			} catch (IOException ie) {
				ie.printStackTrace();
			}

			try {
				for (int i = 0; i < 5; i++) {
					System.out.println(".");
					Thread.sleep(500);
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

			System.out.println("�Ծ����ּż� �����մϴ�!");

		} else {
			return;
		}
	}

	public void animalCare() {
		
		int select;
		Animal animal;

		while (true) {

			while (true) {
				System.out.println("========== ���� �����ϱ� =========");
				
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i + 1) + ". " + list.get(i).getName() + " - " + list.get(i).getCategory());
				}
				
				System.out.println((list.size() + 1) + ". ����ϱ�");
				
				while (true) {
					System.out.print("���� > ");
					try {
						select = Integer.parseInt(br.readLine());

						if (select < 1 || select > list.size() + 1) {
							System.out.println("1~" + (list.size() + 1) + " ������ ���ڸ� �Է��� �ּ���.");
						} else {
							break;
						}
					} catch (NumberFormatException ne) {
						System.err.println("���ڸ� �Է��� �ּ���.");
					} catch (IOException ie) {
						ie.printStackTrace();
					}
				}
				
				if (select == list.size() + 1) {
					return;
				} else {
					animal = list.get(select);
				}
				
				careSelect(animal);
			}
		}
	}
	
	public void careSelect(Animal animal) {
		int select;
		
		while (true) {
			System.out.println("===== �����׸� �����ϱ� =====");
			System.out.println("1. �����ֱ�");
			System.out.println("2. �����ϱ�");
			System.out.println("3. ���ڱ�");
			System.out.println("4. ����ֱ��");
			System.out.println("5. ��������");
			System.out.println("6. ���");
			
			while (true) {
				System.out.print("���� > ");
				try {
					select = Integer.parseInt(br.readLine());

					if (select < 1 || select > 6) {
						System.out.println("1~6 ������ ���ڸ� �Է��� �ּ���.");
					} else {
						break;
					}
				} catch (NumberFormatException ne) {
					System.err.println("���ڸ� �Է��� �ּ���.");
				} catch (IOException ie) {
					ie.printStackTrace();
				}
			}
			
			switch(select) {
			case 1 :
				animal.eat();
				break;
			case 2 :
				animal.bath();
				break;
			case 3 :
				animal.sleep();
				break;
			case 4 :
				animal.play();
				break;
			case 5 :
				animal.getInfo();
				break;
			case 6 :
				return;
			}
		}
	}

	public void abandonment() {
		int select;
		int abandSelect;
		Animal animal;

		while (true) {

			while (true) {
				System.out.println("========== ���� �ľ��ϱ� =========");
				
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i + 1) + ". " + list.get(i).getName() + " - " + list.get(i).getCategory());
				}
				
				System.out.println((list.size() + 1) + ". ����ϱ�");
				
				while (true) {
					System.out.print("���� > ");
					try {
						select = Integer.parseInt(br.readLine());

						if (select < 1 || select > list.size() + 1) {
							System.out.println("1~" + (list.size() + 1) + " ������ ���ڸ� �Է��� �ּ���.");
						} else {
							break;
						}
					} catch (NumberFormatException ne) {
						System.err.println("���ڸ� �Է��� �ּ���.");
					} catch (IOException ie) {
						ie.printStackTrace();
					}
				}
				
				if (select == list.size() + 1) {
					return;
				} else {
					animal = list.get(select - 1);
				}
				
				System.out.println(animal.getName() + "��(��) �����ϴ�.");
				
				while (true) {
					System.out.print("������ �����ǰǰ���? [1. yes / 2. no] ");

					try {
						abandSelect = Integer.parseInt(br.readLine());
						
						if (abandSelect != 1 && abandSelect != 2) {
							System.out.println("1~2 ������ ���ڸ� �Է��� �ּ���.");
						} else {
							break;
						}
					}catch (NumberFormatException ne) {
						System.err.println("���ڸ� �Է��� �ּ���.");
					} catch (IOException ie) {
						ie.printStackTrace();
					}
				}
				
				if (abandSelect == 1) {
					while (true) {
						System.out.print("���� ������ �����ǰǰ���? [1. yes / 2. no] ");

						try {
							abandSelect = Integer.parseInt(br.readLine());
							
							if (abandSelect != 1 && abandSelect != 2) {
								System.out.println("1~2 ������ ���ڸ� �Է��� �ּ���.");
							} else {
								break;
							}
						}catch (NumberFormatException ne) {
							System.err.println("���ڸ� �Է��� �ּ���.");
						} catch (IOException ie) {
							ie.printStackTrace();
						}
					}
				} else {
					System.out.println("�߻����ϼ̾��!");
					return;
				}
				
				if (abandSelect == 1) {
					while (true) {
						System.out.print("���� ���� ������ �����ǰǰ���? [1. yes / 2. no] ");

						try {
							abandSelect = Integer.parseInt(br.readLine());
							
							if (abandSelect != 1 && abandSelect != 2) {
								System.out.println("1~2 ������ ���ڸ� �Է��� �ּ���.");
							} else {
								break;
							}
						}catch (NumberFormatException ne) {
							System.err.println("���ڸ� �Է��� �ּ���.");
						} catch (IOException ie) {
							ie.printStackTrace();
						}
					}
				} else {
					System.out.println("�߻����ϼ̾��!");
					return;
				}
				
				if (abandSelect == 1) {
					
					try {
						for (int i = 0; i < 5; i++) {
							System.out.println(".");
							Thread.sleep(500);
						}
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
					
					System.out.println(animal.getName() + "��(��) �����̽��ϴ�.");
					list.remove(select - 1);
				} else {
					System.out.println("�߻����ϼ̾��!");
					return;
				}
			}
		}
	}
}
