package kr.or.iei.func;

public class Example {

	public void exam1() {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	public void exam2() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void exam3() {
		int i, j, start, end;
		
		//Q1. �� ���η� 5��
		for (i = 0; i < 5; i++)
			System.out.print("*");
		
		System.out.println();
		System.out.println();
		
		//Q2. �� ���η� 5��
		for (i = 0; i < 5; i++)
			System.out.println("*");
		
		System.out.println();
		
		//Q3. �� 5X5
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();

		//Q4. 5X5�� �� ���� ���� ���
		for (i = 1; i <= 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Q5. 5X5�� �� ���� ���� ���
		for (i = 0; i < 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();

		//Q6. ��+��-1 ���
		for (i = 0; i < 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Q7. Q6�� �ݴ��
		for (i = 4; i >= 0; i--) {
			for (j = 1; j <= 5; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Q8. �������� ���� ���� �����ﰢ��
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Q9. �������� ���� �Ʒ��� �����ﰢ��
		for (i = 5; i > 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Q10. �������� ������ �Ʒ��� �����ﰢ��
		for (i = 0; i < 5; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Q11. �������� ������ ���� �����ﰢ��
		for (i = 4; i >= 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Q12. �������� ����� �̵ �ﰢ��
		for (i = 0; i <= 5; i++) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 4; i >= 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Q12. �������� ����� �̵ �ﰢ�� �ݺ��� �� ����
		for (i = 0; i <= 10; i++) {
			if (i <= 5) {
				start = 0;
				end = i;
			} else {
				start = i;
				end = 10;
			}
			
			for (j = start; j < end; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Q13. �𷡽ð� ����
		for (i = 5; i > 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 2; i <= 5; i++) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Q13. �𷡽ð� ���� �ݺ��� �� ����
		for (i = 0; i < 9; i++) {
			if (i < 5) {
				start = i;
				end = 5;
			} else {
				start = 3;
				end = i;
			}
			for (j = start; j < end; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
	}
}
