package kr.or.iei.point;

public class Gold extends Silver {
	//grand ����, name ����, point ����
	//getter, setter, bonusPoint �޼ҵ� ��� ���
	
	public Gold() {
		super(); //<-- �ڵ����� ��
	}
	
	public Gold(String name, String rank, int point) {
		//super()�� ù�ٿ����� ȣ�� ����. ���� �ٸ� �ڵ尡 ������ ������ ����.
		super(name, rank, point);
	}

	//�������̵�
	@Override
	public double getBonus() {
		double bonus = getPoint() * 0.05;
		return bonus;
	}
}
