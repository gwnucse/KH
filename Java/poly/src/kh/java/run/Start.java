package kh.java.run;

import kh.java.test.Animal;
import kh.java.test.Tiger;

public class Start {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.crying();
		
		Tiger tiger = new Tiger();
		tiger.crying();
		tiger.hunting();
		
		Animal animalTiger = new Tiger();	//up-casting�� ���� �ڽ� Ŭ������ ��ü ���� ����
		((Tiger)animalTiger).hunting();		//down-casting�� ���� �ڽ� Ŭ������ ��� ��� ����
	}

}
