package kh.java.test;

import java.util.StringTokenizer;

public class Test {

	public void bufferTest() {
		StringBuffer sb = new StringBuffer();
		//����� ���ڿ��� ���� ���
		System.out.println(sb.length());
		
		//���� ���ڿ� ���� �߰�
		sb.append("�ȳ��ϼ��� ");
		System.out.println(sb);
		
		sb.append("Hello");
		System.out.println(sb);
		System.out.println(sb.length());
		
		//3�� �ڸ��� ���ڿ� ����
		sb.insert(3, "������");
		System.out.println(sb);
		
		//0��°���� 3��° �ձ��� hi�� ����
		sb.replace(0, 3, "hi");
		System.out.println(sb);
		
		//���۸� �Ųٷ�
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//���� ����
		sb.delete(2, 5);
		System.out.println(sb);
		
		//�ʱ�ȭ
		sb.setLength(0);
		System.out.println(sb);
		
		System.out.println(sb.capacity());
	}
	
	public void tokenTest() {
		
		String str = "���±�/27/����";
		
		StringTokenizer st = new StringTokenizer(str, "/");	//str�� "/"�� �������� �ڸ��� ��
		System.out.println(st.countTokens());	//���� Token�� ������ ���
		
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());		
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());
		
		//�����ִ� ��ū�� �ִ��� Ȯ��(true/false)
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

	public void stringTest() {
		String str = "J a v a P r o g r a m";
		//���ڿ� ���� ��������� Tockenó���Ͽ� char[] �����Ͽ� ���
		//��� �빮�ڷ� ��ȯ�Ͽ� ���ڿ� ���� �� ���
		
		StringTokenizer st = new StringTokenizer(str, " ");
		char[] chars = new char[st.countTokens()];
		int i = 0;
		StringBuffer sb = new StringBuffer();
		
		while(st.hasMoreTokens()) {
			chars[i++] = st.nextToken().charAt(0);
		}
		
		for (i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
			if (chars[i] >= 97 && chars[i] <= 122) {
				sb.append((char)(chars[i] ^ 32));
			} else {
				sb.append(chars[i]);
			}
		}
		
		System.out.println();
		
		System.out.println(sb);
	}
}
