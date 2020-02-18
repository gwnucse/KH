package kh.java.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamTest {

	Scanner sc = new Scanner(System.in);

	// FileWriter�� �̿��� ���� ���
	public void primaryStream() {

		FileWriter fw = null;

		System.out.print("������ ���� �� : ");
		String fileName = sc.next();

		sc.nextLine();

		try {
			fw = new FileWriter(fileName);

			System.out.println("[" + fileName + "] ���Ͽ� ����� ���� �Է�");
			System.out.println("����� exit");

			int lineNumber = 1;

			while (true) {

				System.out.print((lineNumber++) + " : ");
				String str = sc.nextLine() + "\r\n";

				if (str.equals("exit\r\n")) {
					break;
				} else {
					fw.write(str);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// ���� ��Ʈ�� BufferedWriter�� �̿��� ���� ���
	public void subStream() {

		BufferedWriter bw = null;

		System.out.print("������ ���ϸ� �Է� : ");
		String fileName = sc.next();

		sc.nextLine();

		try {
			bw = new BufferedWriter(new FileWriter(fileName));

			System.out.println("[" + fileName + "] ���Ͽ� ����� ���� �Է�");
			System.out.println("����� exit");

			int lineNumber = 1;

			while (true) {
				System.out.print((lineNumber++) + " : ");
				String str = sc.nextLine();

				if (str.equals("exit")) {
					break;
				} else {
					bw.write(str);
					bw.newLine();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// ���� ��Ʈ�� BufferedReader�� ����� ���� �о����
	public void reader() {
		System.out.print("�ε��� ���ϸ� �Է� : ");
		String fileName = sc.next();

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(fileName));

			int lineNumber = 1;

			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				
				System.out.println((lineNumber++) + ".\t" + str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
