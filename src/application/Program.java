package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number of exercícies do you'll see: "
				+ "1 - Product"
				+ "2 - Triangle"
				+ "3 - Rectangle"
				+ "4 - Employee"
				+ "5 - Student"
				+ "0 - Exit");
		int number = sc.nextInt();
		
		switch(number) {
			
		case 1:
			
			Product product = new Product();
			
			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			product.name = sc.nextLine();
			System.out.print("Price: ");
			product.price = sc.nextDouble();
			System.out.print("Quantity in Stock: ");
			product.quantity = sc.nextInt();
			
			System.out.println();
			System.out.println("Product data: " + product);
			
			
			System.out.println();
			System.out.println("Enter the number of products to be added in stock: ");
			int quantity = sc.nextInt();
			product.addProducts(quantity);
			
			System.out.println();
			System.out.println("Updated data: " + product);
			
			System.out.println();
			System.out.println("Enter the number of products to be removed from stock: ");
			quantity = sc.nextInt();
			product.removeProducts(quantity);
			
			System.out.println();
			System.out.println("Updated data: " + product); 
			
			break;
		
		case 2:
			
		}
		
		

		
		sc.close();
	}

}
