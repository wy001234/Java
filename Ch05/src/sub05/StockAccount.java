package sub05;

public class StockAccount extends Account {
	
	private String stock;
	private int amount;
	private int price;
	
	public StockAccount(String bank, String id, String name, int belence, String stock, int amount,int price) {
		super(bank, id, name, belence);
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}
	
	public void sell(int amount, int price) {
		this.amount -= amount;
		this.belence += amount * price;

	}
	
	public void buy(int amount, int price) {
		this.amount += amount;
		this.belence -= amount* price;
	}
	
	public void show() {
		System.out.println("증권사 :" + bank);
		System.out.println("계좌번호 :" + id);
		System.out.println("예금주 :" + name);
		System.out.println("예수금 :" + belence);
		System.out.println("주식종목 :" + bank);
		System.out.println("주식수량 :" + bank);
		System.out.println("현재가격 :" + bank);
		
	}

}
