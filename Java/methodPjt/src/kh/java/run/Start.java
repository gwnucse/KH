package kh.java.run;

import kh.java.func.MethodTest;
import kh.java.func.Exam;
import kh.java.func.BR;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Exam e = new Exam();
		
		System.out.print("������ �Է� : ");
		char ch = sc.next().charAt(0);
		
		System.out.println("==== ��ȯ ====");
		char ch2 = e.changeChar(ch);
		System.out.println(ch + "-->" + ch2);
		
		int arr[] = {1,2,3,4,5};
		System.out.println(arr[2]);
		
		//arr[2] ������ ���� �����ؼ� ����
		e.testFunction(arr[2]);
		System.out.println(arr[2]);
		
		//arr �迭�� �ּҸ� ����
		e.testFunction2(arr);
		System.out.println(arr[2]);
		
		MethodTest mTest = new MethodTest();
		mTest.main();
		System.out.println(mTest.sum(21, 7));
		System.out.println(mTest.sum(1, 2, 3));
		
		BR br = new BR();
		br.main();
	}

}
