package kh.java.wrap;

public class Wrap {

	public void wrapTest() {
		
		//�⺻�ڷ���
		//boolean, char, byte, short, int, long, float, double
		Boolean bool = new Boolean(true);
		Character ch = new Character('A');
		Byte bNum = new Byte((byte)1);
		Short sNum = new Short((short)2);
		Integer num = new Integer(4);
		Long lNum = new Long(8);
		Float fNum = new Float(3.14f);
		Double dNum = new Double(3.14);
		
		//���� 10�� Integer Ŭ������ �ڽ�
		Integer iNum = new Integer(10);
		int n = iNum.intValue();
		System.out.println(n);
		
		Double dd = new Double(3.14);
		double d = dd.doubleValue();
		System.out.println(d);
		
		//���� �ڽ�, ��ڽ�
		Integer num1 = 100;
		int n1 = num1;
		
		//���ڿ� -> �⺻ �ڷ���
		String data = "9991";
		int num2 = Integer.parseInt(data);
		
		String data1 = "3.14";
		double num3 = Double.parseDouble(data1);
		
		String data3 = "ABCD";
		char ch1 = data3.charAt(0);
		
		//�⺻ �ڷ��� -> ���ڿ�
		int num4 = 999;
		String data4 = String.valueOf(num4);
		String data5 = Integer.valueOf(num4).toString();
		
		double num6 = 3.14;
		String data6 = Double.valueOf(num6).toString();
		String data7 = String.valueOf(num6);
		
		char ch2 = 'a';
		String data8 = Character.valueOf(ch2).toString();
		String data9 = String.valueOf(ch2);
	}
}
