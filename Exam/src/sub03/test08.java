package sub03;

class Product{
	
	protected String category;
	protected int price;
	
	public Product(String category, int price) {
		this.category = category;
		this.price = price;
	}
	public void info() {}
	
}

class Televisoin extends Product{
	public Televisoin(String category, int price) {
		super(category, price);
	}
	
	#override
	public void info() {
		System.out.println("제품분류 :" +category);
		System.out.println("제품가격 :" +price);
	}
}


public class test08 {

}
