package kr.or.iei.func;

public class Animal {

	private String name;
	private String species;
	private String category;
	private int age;
	private String sex;
	
	public Animal(String name, String species, String category, int age, String sex) {
		this.name = name;
		this.species = species;
		this.category = category;
		this.age = age;
		this.sex = sex;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void eat() {
		System.out.println(name + "��(��) �Ļ縦 �մϴ�.");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(".");
				Thread.sleep(500);
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("��");
	}
	
	public void bath() {

		System.out.println(name + "��(��) ����� �մϴ�.");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(".");
				Thread.sleep(500);
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("��");
	}
	
	public void sleep() {
		
		char print = 'z';

		System.out.println(name + "��(��) ���� ��ϴ�.");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(print);
				print = (char)(print ^ 32);
				Thread.sleep(500);
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("!!");
	}
	
	public void play() {
		System.out.println(name + "��(��) ����ݴϴ�.");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(".");
				Thread.sleep(500);
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("��");
	}
	
	public void getInfo() {
		System.out.println("===== " + name + " ���� =====");
		System.out.println("�� : " + species);
		System.out.println("���� : " + category);
		System.out.println("���� : " + age);
		System.out.println("���� : " + sex);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
