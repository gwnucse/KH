package kh.java.test;

//clone() �޼ҵ带 �ٸ� ��Ű������ ����ϱ� ���ؼ��� Cloneable �������̽��� ������ ���� �ؾ� ��.
public class Test1 extends Object implements Cloneable {

	private int data;
	
	public Test1() {
		
	}
	
	public Test1(int data) {
		
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
