package jr.or.iei.run;

import java.util.Scanner;

public class PrintScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		String address;
		double height;
		double weight;
		char sex;
		
		System.out.print("�̸��� �Է��ϼ���. : ");
		name = sc.next();
		
		System.out.print("���̸� �Է��ϼ���. : ");
		age = sc.nextInt();

		sc.nextLine();
		System.out.print("�ּҸ� �Է��ϼ���. : ");
		address = sc.nextLine();
		
		System.out.print("Ű�� �Է��ϼ���. : ");
		height = sc.nextDouble();
		
		System.out.print("�����Ը� �Է��ϼ���. : ");
		weight = sc.nextDouble();
		
		System.out.print("������ �Է��ϼ���. : ");
		sex = sc.next().charAt(0);
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
		System.out.println("Ű : " + (int)height);
		System.out.printf("������ : %.1f\n", weight);
		System.out.println("���� : " + sex);
		
		int kor, math, eng;
		
		System.out.print("�������� �Է� : ");
		kor = sc.nextInt();
		
		System.out.print("�������� �Է� : ");
		math = sc.nextInt();
		
		System.out.print("�������� �Է� : ");
		eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = (double)sum / 3;
		
		System.out.printf("��� ������ �� ���� %d���̰� ����� %.2f�Դϴ�!", sum, avg);
	}

}
