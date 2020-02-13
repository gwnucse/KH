package kh.java.run;

import kh.java.test.AnimalMgr;
import kh.java.test.AnimalMgr2;
import kh.java.test.Bear;
import kh.java.test.GenericEx;
import kh.java.test.GenericEx2;
import kh.java.test.Tiger;

public class Start {

	public static void main(String[] args) {

		GenericEx<String> ge = new GenericEx<String>();
		
		ge.setData("test");
		System.out.println(ge.getData());

		GenericEx<Integer> ge1 = new GenericEx<Integer>();
		
		ge1.setData(14214);
		System.out.println(ge1.getData());
		
		//hp�� 100�� Tiger ��ü�� �ּҰ� t�� ����
		Tiger t = new Tiger(1000);
		Bear b = new Bear(2000);
		
		//AnimalMgr �������� �Ű����� Ÿ���� Object
		//�������� ���ؼ� Tiger ��ü�� �ּҰ� Object Ÿ�� ������ ����
		AnimalMgr am1 = new AnimalMgr(t);
		AnimalMgr am2 = new AnimalMgr(b);
		
		Object obj = am1.getData();
		//�ش� ��ü�� Tiger ��ü�̹Ƿ� getHp() �޼ҵ� ȣ��
		//�θ�Ÿ�� Object���� getHp()�޼ҵ尡 �������� �ʴ´�.
		//obj.getHp(); => ����
		
		//Tiger��ü���� ������ �ִ� �޼ҵ带 ȣ���ϱ� ���ؼ��� down-casting�� �ʿ�
		((Tiger)am1.getData()).getHp();
		((Bear)am2.getData()).getHp();
		
		//���׸� ����
		AnimalMgr2<Tiger> am3 = new AnimalMgr2<Tiger>(t);
		//AniamlMgr2�� ���׸��� ������ �ɾ��� ������ Bear�� ��� �Ұ�
//		AnimalMgr2<Bear> am4 = new AnimalMgr2<Bear>(b);
		
		//���׸��� �����߱⿡ down-casting�� �ʿ䰡 ����
		am3.getData().getHp();
//		am4.getData().getHp();
		
		GenericEx2<String, Integer> ge2 = new GenericEx2<String, Integer>();
	}

}
