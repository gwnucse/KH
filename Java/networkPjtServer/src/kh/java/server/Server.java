package kh.java.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public void main() {

		// PORT��ȣ ����
		// 0~65535
		// 60000 ���
		Scanner sc = new Scanner(System.in);
		try {
			// 1. ������ ���� ��ü ����
			ServerSocket server = new ServerSocket(60000);
			// 2. Ŭ���̾�Ʈ�� ���� ��û�� ��ٸ�
			// 3. ��û�� ���� ����
			System.out.println("Ŭ���̾�Ʈ�� ��ٸ���.");
			// 4. Ŭ���̾�Ʈ ������ ����
			Socket client = server.accept();
			System.out.println("Ŭ���̾�Ʈ ����");

			// 5. Ŭ���̾�Ʈ ������ ���ؼ� OutputStream ����
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			// 6. Ŭ���̾�Ʈ ������ ���ؼ� InputStream ����
			DataInputStream dis = new DataInputStream(client.getInputStream());

			while (true) {
				System.out.print("�޼��� �Է� : ");
				String msg = sc.nextLine();

				dos.writeUTF(msg);
				
				if (msg.equals("exit")) {
					break;
				}

				String clientMsg = dis.readUTF();

				System.out.println("client > " + clientMsg);
				
				if (clientMsg.equals("exit")) {
					break;
				}
			}
			
			System.out.println("Ŭ���̾�Ʈ�� ������ ���������ϴ�.");

			dis.close();
			dos.close();
			client.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}

	}
}
