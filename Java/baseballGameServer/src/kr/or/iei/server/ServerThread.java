package kr.or.iei.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread {

	ArrayList<Integer> num = new ArrayList<Integer>();
	Server server = null;
	Socket socket = null;

	// ������. �Ű������� ���� �迭�� Server ��ü, Ŭ���̾�Ʈ�� Socket ��ü�� �޴´�.
	public ServerThread(ArrayList<Integer> num, Server server, Socket socket) {

		this.num = num;
		this.server = server;
		this.socket = socket;
	}

	@Override
	public void run() {

		try {
			//Ŭ���̾�Ʈ�� �޽����� �ޱ� ���� dis�� Ŭ���̾�Ʈ�� �޽����� �����ϱ� ���� dos
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream dis = new DataInputStream(socket.getInputStream());

			while (true) {
				int strike = 0, ball = 0;
				int insertNum[] = new int[3];
				//readInt �޼ҵ带 ���� 3���� ���ڸ� ���۹޴´�.
				insertNum[0] = dis.readInt();
				insertNum[1] = dis.readInt();
				insertNum[2] = dis.readInt();

				System.out.println("Ŭ���̾�Ʈ�� �Է��� �� -> " + insertNum[0] + " " + insertNum[1] + " " + insertNum[2]);

				//���� ���� �ڸ��� ���ڰ� �����ϴٸ� strike�� 1 ������Ų��.
				for (int i = 0; i < 3; i++) {
					if (num.get(i) == insertNum[i]) {
						strike++;
					}
				}

				//Ŭ���̾�Ʈ���� �Է¹��� ���ڸ� contains �޼ҵ带 ���� ����Ʈ�� �ִ��� Ȯ���ϰ� ���� �ִٸ� ball�� 1 ������Ų��.
				for (int i = 0; i < 3; i++) {
					if (num.contains(insertNum[i])) {
						ball++;
					}
				}
				
				//�������� ball�� ���� strike�� �� ���̴�.
				//������ ball�� �����ϱ� ���� contains �޼ҵ�� ���� ��ġ�� ���� true�� �����ϱ⿡ strike�� ��쿡�� ball�� �߰��ϱ� �����̴�. 
				ball -= strike;

				System.out.println(strike + " ��Ʈ����ũ " + ball + " ��");

				//Ŭ���̾�Ʈ�� ���� strike�� ball�� �����Ѵ�.
				dos.writeInt(strike);
				dos.writeInt(ball);

				System.out.println();

				//���� strike�� 3�̸� Server��ü�� print �޼ҵ带 ȣ���Ѵ�.
				if (strike == 3) {
					server.print(dos);
					break;
				}
			}

			//Ŭ���̾�Ʈ���� ��Ʈ���� Socket�� �ݴ´�.
			dis.close();
			dos.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
