package kh.java.test;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamTest {

	Scanner sc = new Scanner(System.in);

	//FileOutputStream�� �̿��� ���� ���
	public void primaryStream() {
		FileOutputStream fos = null;	//finally���� ����� ���ϱ⿡ ������ �̸� �ؾ� �Ѵ�.

		System.out.print("������ ���� �� �Է� : ");
		String filename = sc.next();

		sc.nextLine();

		try {
			fos = new FileOutputStream(filename);

			System.out.println("[" + filename + "] ���Ͽ� �Է��� ���� �Է�");
			System.out.println("����� exit �Է�");

			int lineNumber = 1;

			while (true) {
				System.out.print((lineNumber++) + " : ");
				String str = sc.nextLine() + "\r\n";

				if (str.equals("exit\r\n")) {
					break;
				}

				fos.write(str.getBytes());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	//���� ��Ʈ�� DataOutputStream�� �̿��� ���� ���
	public void subStream() {
		
		DataOutputStream dos = null;
		
		System.out.print("������ ���ϸ� �Է� : ");
		String filename = sc.next();
		
		sc.nextLine();
		
		try {
			dos = new DataOutputStream(new FileOutputStream(filename));
			
			System.out.println("[" + filename + "] ���Ͽ� �Է��� ���� �Է�");
			System.out.println("����� exit �Է�");

			int lineNumber = 1;

			while (true) {
				System.out.print((lineNumber++) + " : ");
				String str = sc.nextLine();

				if (str.equals("exit")) {
					break;
				}

				dos.writeChars(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
