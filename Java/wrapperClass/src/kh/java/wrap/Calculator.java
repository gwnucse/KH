package kh.java.wrap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator implements Calc {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	@Override
	public void start() {

		int result;
		double dResult;

		while (true) {
			try {
				System.out.print("�����ڸ� �Է��ϼ���[+, -, *, /] : ");
				char oper = br.readLine().charAt(0);

				if (oper != '+' && oper != '-' && oper != '*' && oper != '/') {

					System.out.println("[+, -, *, /] �� �ϳ��� �Է��ϼ���.");
					continue;
				}

				System.out.print("1��° ���ڸ� �Է��ϼ��� : ");
				String num1 = br.readLine();

				System.out.print("2��° ���ڸ� �Է��ϼ��� : ");
				String num2 = br.readLine();

				switch (oper) {
				case '+':
					result = add(num1, num2);
					System.out.println("��� ��� : " + result);
					break;
				case '-':
					result = sub(num1, num2);
					System.out.println("��� ��� : " + result);
					break;
				case '*':
					result = multi(num1, num2);
					System.out.println("��� ��� : " + result);
					break;
				case '/':
					dResult = div(num1, num2);
					System.out.printf("��� ��� : %.2f\n", dResult);
					break;
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��ϼ���.");

				try {
					Thread.sleep(100);
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}

				continue;
			}

			break;
		}
	}

	@Override
	public int add(String num1, String num2) {

		int iNum1 = Integer.parseInt(num1);
		int iNum2 = Integer.parseInt(num2);

		return iNum1 + iNum2;
	}

	@Override
	public int sub(String num1, String num2) {

		int iNum1 = Integer.parseInt(num1);
		int iNum2 = Integer.parseInt(num2);

		return iNum1 - iNum2;
	}

	@Override
	public int multi(String num1, String num2) {

		int iNum1 = Integer.parseInt(num1);
		int iNum2 = Integer.parseInt(num2);

		return iNum1 * iNum2;
	}

	@Override
	public double div(String num1, String num2) {

		int iNum1 = Integer.parseInt(num1);
		int iNum2 = Integer.parseInt(num2);

		return (double) iNum1 / iNum2;
	}

}
