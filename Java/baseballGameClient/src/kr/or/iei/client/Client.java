package kr.or.iei.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public void main() {

		Scanner sc = new Scanner(System.in);
		
		String ipAddress = "127.0.0.1";
		int portNumber = 60001;
		
		try {
			Socket socket = new Socket(ipAddress, portNumber);
			
			System.out.println("Ŭ���̾�Ʈ ������ �����߽��ϴ�");
			System.out.println("�Ʊ� ������ �����մϴ�");
			
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			
			while (true) {
				System.out.println("�� ���� �Է��� �ּ���(ex: 1 2 3)");
				System.out.print(" -->");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int num3 = sc.nextInt();
				
				dos.writeInt(num1);
				dos.writeInt(num2);
				dos.writeInt(num3);
				
				int strike = dis.readInt();
				int ball = dis.readInt();
				
				System.out.println(": " + strike + " ��Ʈ����ũ " + ball + "��");
				System.out.println("");
				
				if (strike == 3) {
					System.out.println("3 ��Ʈ����ũ!! ���α׷��� �����մϴ�..\n");
					int rank = dis.readInt();
					System.out.println(rank + " ���Դϴ�.");
					System.out.println("\n���α׷��� �����մϴ�");
					break;
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
