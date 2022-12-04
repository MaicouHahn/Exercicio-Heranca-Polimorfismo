package entities;

public class Product {
	
	protected String name;
	protected Double value;
	
	
	public Product(String name,Double value) {
		this.name=name;
		this.value=value;
		
	}
	
	public String getName() {
		return name;	
	}
	
	public Double getValue() {
		return value;
	}
	public String priceTag() {
		return name+" $"+value;
	}
}
