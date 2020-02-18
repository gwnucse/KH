package kh.java.test;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.omg.Messaging.SyncScopeHelper;

public class ImageStream2 {

	public void imageTest() {
		// quiz.txt ������ ������ �о���� ���� ������Ʈ��
		BufferedReader br = null;
		// �̹��� ���Ϸ� �������� ���� �ֽ�Ʈ��
		FileOutputStream fos = null;
		// �̹��� ���Ϸ� �������� ���� ������Ʈ��
		BufferedOutputStream bos = null;
		
		try {

			// 1�ٷ� �Ǿ� �ִ� ����
			// 16���� ���� 1�� ������ �ݺ��ǰ� �ִ� ����
			// quiz.txt ������ �о���� ���� �ֽ�Ʈ�� ������ �ӵ� ������ ���� ������Ʈ�� ����
			br = new BufferedReader(new FileReader("quiz.txt"));
			
			// ���� ������ 1�ٷ� �Ǿ� �ֱ� ������ ���Ͽ��� 1�� �о��
			String str = br.readLine();
			// 16������ 1���� �����ϱ� ���� ������ �����ڷ� �߶󳽴�
			StringTokenizer sT = new StringTokenizer(str, " ");
			// String Ÿ������ �и�, 16������ �߶� �����͸� �����ϱ� ���� ArrayList ����
			ArrayList<Byte> al = new ArrayList<Byte>();
			
			// ����Ʈ ��Ʈ������ �����͸� �������� ���� 16������ ��ȯ�Ͽ� ����Ʈ�� ����
			while(sT.hasMoreTokens()) {
				byte b = (byte)Integer.parseInt(sT.nextToken(), 16);
				al.add(b);
			}
			
			System.out.println(al.size());
			
			// quiz.gif�� ������ �����ϱ� ���� �ֽ�Ʈ�� ����
			fos = new FileOutputStream("quiz3.gif");
			
			long start = System.currentTimeMillis();
			
			for (int i : al) {
				fos.write(i);
			}
			
			long end = System.currentTimeMillis();
			System.out.println("���� ���� �Ϸ� : " + (end - start));

			// quiz2.gif�� ������ �����ϱ� ���� ������Ʈ�� ����
			bos = new BufferedOutputStream(new FileOutputStream("quiz4.gif"));
			
			start = System.currentTimeMillis();
			
			for (int i : al) {
				bos.write(i);
			}
			
			bos.flush();
			end = System.currentTimeMillis();
			System.out.println("���� ���� �Ϸ� : " + (end - start));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fos.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
