package sub02;

public class Account {

	//속성
	private String bank;
	private String id;
	private String name;
	private int belence;
	
	//생성자
	
	public Account(String bank,String id,String name,int belence) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.belence = belence;
	}
	
	
	//기능
	public void deposit(int money) {
		this.belence+= money;
	}
	public void withdraw(int money) {
		this.belence -= money;
	}
	public void show() {
		System.out.println("-----------------------");
		System.out.println("은행명 :" + bank);
		System.out.println("계좌번호 :" + id);
		System.out.println("입금주 :" + name);
		System.out.println("현재 잔액 :" +belence);
		System.out.println("-----------------------");
		
	}
	
}
