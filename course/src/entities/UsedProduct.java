package entities;


import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private Date manufactureDate;
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public UsedProduct(String name,Double value,Date date) {
		super(name,value);
		this.manufactureDate=date;
	}
	
	public Date getManufactoreDate() {
		return manufactureDate;
	}
	
	public String priceTag() {
	
		return name+" (Used) $"+value+" (Manufacture Date: "+sdf1.format(manufactureDate)+")";
	}
}
