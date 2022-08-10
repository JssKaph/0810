import java.util.Comparator;

public class Product implements Comparator<Product>{
	public int price;
	private String name;
	public Product(String name, int price) {
		this.price = price;
		this.name = name;
	}
	@Override
	public int compare(Product front, Product back) {
		return front.price - back.price;
	}
	
	@Override
	public String toString() {
		return "이름 = " + this.name+ ", 가격 = " + this.price;
	}
}
