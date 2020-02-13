package kr.or.iei.func;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Example {

	public void exam1() {
		Calendar today = Calendar.getInstance();

		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int day = today.get(Calendar.DATE);
		int dayWeek = today.get(Calendar.DAY_OF_WEEK);

		StringBuffer sb = new StringBuffer();
		sb.append(year);
		sb.append("�� ");
		sb.append(month + 1);
		sb.append("�� ");
		sb.append(day);
		sb.append("�� ");

		switch (dayWeek) {
		case 1:
			sb.append("�Ͽ���");
			break;
		case 2:
			sb.append("������");
			break;
		case 3:
			sb.append("ȭ����");
			break;
		case 4:
			sb.append("������");
			break;
		case 5:
			sb.append("�����");
			break;
		case 6:
			sb.append("�ݿ���");
			break;
		case 7:
			sb.append("�����");
			break;
		}

		System.out.println(sb);
	}

	public void exam2() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year, month, day;
		
		System.out.println("========== D-Day ���� ==========");
		
		while (true) {
			try {
				System.out.print("D-Day [�⵵] �Է� : ");
				year = Integer.parseInt(br.readLine());

				break;
				
			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		while (true) {
			try {
				System.out.print("D-Day [��] �Է� : ");
				month = Integer.parseInt(br.readLine());

				if (month > 0 && month < 13) {
					break;
				} else {
					System.out.println("1~12 ������ ���ڸ� �Է��� �ּ���.");
				}

			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
		
		while (true) {
			try {
				System.out.print("D-Day [��] �Է� : ");
				day = Integer.parseInt(br.readLine());

				if (day > 0 && day < 32) {
					break;
				} else {
					System.out.println("1~31 ������ ���ڸ� �Է��� �ּ���.");
				}

			} catch (NumberFormatException ne) {
				System.err.println("���ڸ� �Է��� �ּ���.");
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		Calendar today = Calendar.getInstance();
		Calendar dDay = Calendar.getInstance();
		dDay.set(Calendar.YEAR, year);
		dDay.set(Calendar.MONTH, month - 1);
		dDay.set(Calendar.DATE, day);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� M�� dd��");
		
		System.out.println("���� ��¥ : " + sdf.format(today.getTime()));
		System.out.println("D-Day ��¥ : " + sdf.format(dDay.getTime()));
		
		//������ ���ֱ� ���� ���� 1000�� ������.
		long check = dDay.getTimeInMillis() / 1000 - today.getTimeInMillis() / 1000;
		check /= 86400;
		
		if (check < 0) {
			System.out.println(Math.abs(check) + "�� �������ϴ�.");
		} else if (check == 0) {
			System.out.println("D-Day �Դϴ�.");
		} else {
			System.out.println(check + "�� ���ҽ��ϴ�.");
		}
	}

}
