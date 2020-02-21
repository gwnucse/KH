package kr.or.iei.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

public class Server {

	ArrayList<Integer> num = new ArrayList<Integer>();
	Random rand = new Random();
	int rank = 1;
	int member = 0;

	public void main() {

		int count = 0;

		//3���� 0~9 ������ ���ڸ� �̱� ���� �ݺ���
		//�ݺ����� count�� 3�� �� �� ���� �ݺ��Ѵ�.
		while (count < 3) {
			int number = rand.nextInt(10);

			//������ ���� ���ڰ� ����Ʈ�� �����ϴ��� Ȯ���Ѵ�.			
			if (!num.contains(number)) {
				//���� ������ ���� ���ڰ� ����Ʈ�� ���ٸ�(false) ����Ʈ�� �ش� ���ڸ� �����ϰ� count�� 1���� ��Ų��.
				num.add(number);
				count++;
			}
		}

		try {
			//ServerSocket ����
			ServerSocket serverSock = new ServerSocket(60001);

			System.out.println("���� ������ ���� �߽��ϴ�.");
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�......");
			System.out.println("�������� -> " + num.get(0) + " " + num.get(1) + " " + num.get(2));

			while (true) {
				//Ŭ���̾�Ʈ�� ���� ��û�� �� �� ���� ��ٸ���, Ŭ���̾�Ʈ�� ������ �Ǹ� ����� 1 ������Ų��.
				Socket client = serverSock.accept();
				member++;

				System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
				System.out.println("���� �� " + member + " �� Ŭ���̾�Ʈ");

				//ServerThread ��ü ����.
				//�Ű������� ���� ����Ʈ�� ���� Server ��ü, �׸��� Ŭ���̾�Ʈ Socket ��ü�� �ѱ��.
				ServerThread serverThread = new ServerThread(num, this, client);
				//������ ����
				serverThread.start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//Ŭ���̾�Ʈ�� ���� ��ũ�� �����ϰ�, member ���ڸ� ���ҽ�Ű�� ���� �޼ҵ�.
	//�Ű������� Ŭ���̾�Ʈ�� OutputStream�� �޴´�.
	public void print(DataOutputStream dos) {
		System.out.println("3 ��Ʈ����ũ ���� Ŭ���̾�Ʈ�� ������ �����մϴ�.");
		member--;
		System.out.println("���� ���ӵ� Ŭ���̾�Ʈ : " + member + "��");
		try {
			dos.writeInt(rank++);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
