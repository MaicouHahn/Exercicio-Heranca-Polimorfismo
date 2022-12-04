package entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;

	public ImportedProduct(String name, Double value, Double customsFee) {
		
		super(name, value);
		this.customsFee = customsFee;
	}
	public double getCustomsFee() {
		return customsFee;
	}
	public double totalPrice() {
		return value+customsFee;
	}
	
	public String priceTag() {
		
		return name +" "+"$"+String.format("%.2f",totalPrice())+" Custom Fee: "+customsFee+;
	}
}
