package kh.java.vo;

public class TV {
	
	//ũ��, ����, ä��, ���� ����
	//����, ä��, ���� ���
	public int inch = 120;
	public boolean power = false;
	public int channel = 1;
	public int volume = 0;
	
	public boolean power() {
		System.out.println("�������");
		power = !power;
		return power;
	}
	
	public void channelUp() {
		System.out.println("ä�ι�ȣ ����");
		channel++;
	}
	
	public void channelDown() {
		System.out.println("ä�ι�ȣ ����");
		channel--;
	}
	
	public void channelChange(int chNum) {
		System.out.println("ä�ι�ȣ ����");
		channel = chNum;
	}
	
	public void volumeUp() {
		System.out.println("���� ����");
		volume++;
	}
	
	public void volumeDown() {
		System.out.println("���� ����");
		volume--;
	}
	
	public void getTVInfo() {
		
		System.out.println("�� TV�� " + inch + "��ġ �Դϴ�.");

		if (power) {
			System.out.println("���� TV�� �����ֽ��ϴ�.");
		} else {
			System.out.println("���� TV�� �����ֽ��ϴ�.");
		}
		
		System.out.println("���� ä���� " + channel + "�� �Դϴ�.");
		System.out.println("���� ���� ũ��� " + volume + "�Դϴ�.");
	}
}
