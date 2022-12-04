package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.UsedProduct;
import entities.ImportedProduct;

public class App {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scanString = new Scanner(System.in);
		Scanner scanNumber = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> prod = new ArrayList<>();

		System.out.println("Enter the number of products");
		int n = scanNumber.nextInt();
		
		for (int i = 0; i < n; i++) {

			System.out.println("Product #" + (i + 1));
			System.out.println("Name ");
			String name = scanString.nextLine();
			System.out.println("Price");
			Double value = scanNumber.nextDouble();
			System.out.println("Common, used or imported? c/u/i");
			String Tag = scanString.nextLine();

			if (Tag.equals("c")) {

				prod.add(new Product(name, value));

			} else if (Tag.equals("u")) {

				System.out.println("Manufacture Date (DD/MM/YYYY)");
				Date date = sdf.parse(scanString.nextLine());
				prod.add(new UsedProduct(name, value, date));
				
			} else {
				
				System.out.println("Customs fee ");
				Double customFee=scanNumber.nextDouble();
				prod.add(new ImportedProduct(name, value,customFee));
			}
		}
		
		for(Product c: prod) {
			System.out.println(c.priceTag());
		}

	}
}