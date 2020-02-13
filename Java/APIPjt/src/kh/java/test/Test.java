package kh.java.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
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

	public void mathTest() {
		System.out.println(Math.abs(-20));		//���밪 ���
		System.out.println(Math.ceil(3.14));	//�Ҽ��� �Ʒ� �ø�
		System.out.println(Math.floor(3.9));	//�Ҽ��� �Ʒ� ����
		System.out.println(Math.round(3.5));	//�Ҽ��� �Ʒ� �ݿø�
		System.out.println(Math.random());		//0.0 ~ 1.0 ������ ������ �� ����
		System.out.println(Math.max(1, 2));		//�� ���� �� �� ū �� ����
		System.out.println(Math.min(1, 2));		//�� ���� �� �� ���� �� ����	
	}

	public void calendarTest() {
		Calendar today = Calendar.getInstance();
		//GregorianCalendar ��ü ����
		
		System.out.println(today.get(Calendar.YEAR));		//���� ���
		System.out.println(today.get(Calendar.MONTH));		//�� ���(0������ ����Ѵ�)
		System.out.println(today.get(Calendar.DATE));		//�� ���
		System.out.println(today.get(Calendar.AM_PM));		//���� ���� ���(���� : 0, ���� : 1)
		System.out.println(today.get(Calendar.HOUR));		//�� ���
		System.out.println(today.get(Calendar.MINUTE));		//�� ���
		System.out.println(today.get(Calendar.SECOND));		//�� ���
		System.out.println(today.get(Calendar.DAY_OF_WEEK));//�������� ���° �������� ���(1 : �Ͽ���, 7 : �����)
		
		//set �޼ҵ带 ���� ��¥�� �����Ͽ� ��� ����
		today.set(Calendar.YEAR, 2050);
		System.out.println(today.get(Calendar.YEAR));
		
		System.out.println(today.getTimeInMillis());		//���� �ð�, ������ : 1970�� 1�� 1�� 9�� 0�� 00�ʺ��� ���ݱ��� ���� �ð��� ms������ ���
	}
	
	public void calendarTest2() {

		Calendar day1 = Calendar.getInstance();
		Calendar day2 = Calendar.getInstance();
		
		day2.set(Calendar.YEAR, 2021);
		long day11 = day1.getTimeInMillis();
		long day22 = day2.getTimeInMillis();
		long day = day22 - day11;
		day /= (1000 * 86400);
		System.out.println(day);
	}
	
	public void dateTest() {
		//Date
		Date date1 = new Date();
		Calendar today = Calendar.getInstance();
		today.set(Calendar.YEAR, 2021);
		long testDate = today.getTimeInMillis();
		Date date2 = new Date(testDate);
		
		System.out.println(date1);
		System.out.println(date2);
	}

	public void dateFormatTest() {
		
		Date today = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		System.out.println(sdf2.format(today));
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		int num = 0;
		String str = sc.next();
		
		//int number = (int)str; => �������̱⿡ �Ұ���
		//str = 100
		//���ڿ� ���� ���� = 3
		//������ �迭 �����Ͽ� �ѱ��ھ� �Է� 
		//char[] arr = new char[3];
		//{'1', '0', '0'}
		//'1'- > 49, '0' -> 48
		//(arr[0] - 48) * 100 + (arr[1] - 48) * 10 + (arr[2] - 48)
		
		char[] arr = new char[str.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			if (arr[i] < '0' || arr[i] > '9') {
				System.out.println("���ڰ� �ƴմϴ�.");
				return;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			num *= 10;
			num += (arr[i] - 48);
		}
		
		System.out.println(num);
		System.out.println(Integer.parseInt(str));
	}
	
}
