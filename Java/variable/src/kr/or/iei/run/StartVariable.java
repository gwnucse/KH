package kr.or.iei.run;

import kr.or.iei.func.*;
import java.util.InputMismatchException;

public class StartVariable {

	public static void main(String[] args) {
		
		Example ex = new Example();
		ex.exam1();
		ex.exam2();
		ex.exam3();
		ex.exam4();
		try {
			ex.scan();
		} catch (InputMismatchException e) {
			System.err.println("Ÿ�Կ� �´� ���� �Է����ּ���.");
//			e.printStackTrace();
		}
	}

}
