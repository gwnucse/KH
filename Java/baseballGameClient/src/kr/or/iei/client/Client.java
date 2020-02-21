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
		
		//Local host
		String ipAddress = "127.0.0.1";
		int portNumber = 60001;
		
		try {
			//������ ���� ��û
			Socket socket = new Socket(ipAddress, portNumber);
			
			System.out.println("Ŭ���̾�Ʈ ������ �����߽��ϴ�");
			System.out.println("�Ʊ� ������ �����մϴ�");
			
			//������ �޽����� �ޱ� ���� dis�� ������ �޽����� �����ϱ� ���� dos
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			
			while (true) {
				System.out.println("�� ���� �Է��� �ּ���(ex: 1 2 3)");
				System.out.print(" -->");
				//Scanner�� ���� 3���� ���ڸ� �Է¹޴´�.
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int num3 = sc.nextInt();
				
				//writeInt �޼ҵ带 ���� 3���� ���ڸ� �����Ѵ�.
				dos.writeInt(num1);
				dos.writeInt(num2);
				dos.writeInt(num3);
				
				//3���� ���ڸ� �����ϸ� �������� strike�� ball���� ���۹޴´�.
				int strike = dis.readInt();
				int ball = dis.readInt();
				
				//ȭ�鿡 strike�� ball�� ���۹޴´�.
				System.out.println(": " + strike + " ��Ʈ����ũ " + ball + "��");
				System.out.println();
				
				//���� strike�� 3�� ���
				if (strike == 3) {
					System.out.println("3 ��Ʈ����ũ!! ���α׷��� �����մϴ�..\n");
					//�������� rank�� �����ϹǷ� rank�� ���۹޴´�.
					int rank = dis.readInt();
					System.out.println(rank + " ���Դϴ�.");
					System.out.println("\n���α׷��� �����մϴ�");
					
					//�޽����� ����ϰ� �������� ��Ʈ���� Socket�� ���� �� ���� ������ ���� ���´�.
					dis.close();
					dos.close();
					socket.close();
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
