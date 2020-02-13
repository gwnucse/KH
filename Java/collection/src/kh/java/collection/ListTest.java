package kh.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest {

	public void listTest() {
		String[] arr = new String[3];
		arr[0] = "Hello";
		arr[1] = "Hi";
		arr[2] = "�ȳ��ϼ���";
//		arr[3] = "�߰���"; => ���� �߻�(ArrayIndexOutOfBoundsException)
		
		System.out.println("�迭 ���");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		ArrayList<String> al = new ArrayList<String>();	//���� ������ �ʿ伺�� ����
		al.add("Hello");
		al.add("Hi");
		al.add("�ȳ��ϼ���");
		al.add("�߰���");
		
		System.out.println("ArrayList ���");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("=========");
		al.remove(1);

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("=========");
		al.add(1, "Hi");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("=========");
		al.set(1, "HiHi");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("=========");
		al.clear();

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

	public void listTest2() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(4);
		al.add(42);
		al.add(71);
		al.add(6);
		al.add(11);
		al.add(1);
		al.add(120);
		
		Collections.sort(al);
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("=========");
		Collections.reverse(al);

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
	
}
