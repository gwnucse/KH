package kr.or.iei.run;

public class Run {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println("------");
		
		System.out.println(b);
		System.out.println(++b);
		System.out.println(b);

		System.out.println("------");
		
		a = 10;
		b = (a--) + 2;	//a--�� ���� �����̹Ƿ� a-1�� ��� ������ ���� �Ŀ� �̷�����.
		
		System.out.println(a);
		System.out.println(b);

		System.out.println("------");
		
		a = 10;
		b = (--a) + 2;
		
		System.out.println(a);
		System.out.println(b);

		System.out.println("------");
		
		a = 10;
		b = 10;
		int c = (a++) + (++b) + a;	//Java ���� (a++) + (++b)�� ���� ����Ͽ� 21�� ������, a���� 11�� �ٲ� ���¿��� ������ a�� ����� ��.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
