package kh.java.run;

import java.io.FileNotFoundException;

import kh.java.test.TestClass;

public class Start {

	public static void main(String[] args) {

//		new TestClass().test1();
//		new TestClass().start();
//		try {
//			new TestClass().test3();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	//test3() �޼ҵ忡�� FileNotFoundException�� throws�ϱ� ������ ���� ó���� �ؾ� ��.
		
		new TestClass().div(19, 0);
	}

}
