package kh.java.vo;

public class TV {
	
	//ũ��, ����, ä��, ���� ����
	//����, ä��, ���� ���
	private int inch;
	private boolean power;
	private int channel;
	private int volume;
	
	//�������� �����ε�
	public TV() {
		//�⺻ ������
	}
	
	public TV(int inch, boolean power, int channel, int volume) {
		//�Ű����� ������
		this.inch = inch;
		this.power = power;
		this.channel = channel;
		this.volume = volume;
	}
	
	public boolean power() {
		System.out.println("�������");
		power = !power;
		return power;
	}
	
	public boolean getPower() {
		return power;
	}
	
	public int getInch() {
		return inch;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
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
