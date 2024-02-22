package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;
import entities.Rectangle;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number of exercícies do you'll see: \n"
				+ "1 - Product\n"
				+ "2 - Triangle\n"
				+ "3 - Rectangle\n"
				+ "4 - Employee\n"
				+ "5 - Student\n"
				+ "0 - Exit");
		int number = sc.nextInt();
		sc.nextLine();
		
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
			Triangle x, y;
			x  = new Triangle();
			y  = new Triangle();
			
			System.out.println("Enter the measures of triangle X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();
			System.out.println("Enter the measures of triangle Y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
			
			System.out.printf("Triangle x area: %.4f%n", x.area());
			System.out.printf("Triangle y area: %.4f%n", y.area());
			
			if (x.area() > y.area()) {
				System.out.println("Larger area: X");
			} 
			else {
				System.out.println("Larger area: Y");
			}
			break;
			
		case 3:
			
			System.out.println("Enter rectangle width and height: ");
			Rectangle rec = new Rectangle();
			rec.width = sc.nextDouble();
			rec.height = sc.nextDouble();
			System.out.println(rec);
			break;
		}
		
		

		
		sc.close();
	}

}
