package kh.java.ve;

//�Ｎ��ǰ
public class InstantFood extends Goods {

	private String expired;
	private int kcal;
	
	public InstantFood() {
		
	}
	
	public InstantFood(int price, int stock, String name, boolean adult, String expired, int kcal) {
		super(price, stock, name, adult);
		
		this.expired = expired;
		this.kcal = kcal;
	}
	
	public String getExpired() {
		return expired;
	}
	
	public int getKcal() {
		return kcal;
	}
	
	public void setExpired(String expired) {
		this.expired = expired;
	}
	
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	@Override
	public String toString() {
		//��ǰ��\t����\t���\t���ο���\t�������\t\tĮ�θ�
		String str = getName() + "\t" + getPrice() + "\t" + getStock() + "\t" + (getAdult() ? "O" : "X") + "\t" + expired + "\t" + kcal;
		return str;
	}
}
