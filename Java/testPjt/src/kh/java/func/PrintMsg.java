package kh.java.func;

public class PrintMsg {

	public PrintMsg() {
		System.out.println("Make Class!");
	}
	
	public void printHello() {
		System.out.println("Hello Class!");
	}
	
	public void printHi() {
		System.out.println("Hi Class!");
	}
	
	public void test() {
//		System.out.println(1+1);	//2
//		System.out.println(1.1+1.1);//2.2
//		System.out.println('1'+'1');//11(X), 98(O) - ASCII �ڵ� ���� 
//		System.out.println("1"+"1");//11

		System.out.println(1+1.1);	//���� + �Ǽ��� �Ǽ��� ���
		System.out.println(1+'1');//���� -> ASCII �ڵ� ��ȯ �� ���� + ������ ������ ���
		System.out.println(1.1+'1');//���� -> ASCII �ڵ� ��ȯ �� �Ǽ� + ������ �Ǽ��� ���
		System.out.println("Hi"+1);//���ڿ��� �켱������ ���� ������ ���ڿ��� ���
	}
}
