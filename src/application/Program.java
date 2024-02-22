package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Product;
import entities.Rectangle;
import entities.Student;
import entities.Triangle;
import util.Calculator;

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
				+ "6 - Calculator\n"
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
			
			System.out.println("Triangle X area: " + x.area());
			System.out.println("Triangle Y area: " + y.area());
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
			
		case 4:
			Employee employee = new Employee();
			System.out.println("Enter Employee data: ");
			System.out.print("Name: ");
			employee.name = sc.nextLine();
			System.out.print("Gross Salary: ");
			employee.grossSalary = sc.nextDouble();
			System.out.print("Tax: ");
			employee.tax = sc.nextDouble();
			System.out.println("Employee: " + employee);
			System.out.println("Which percentage to increase salary?");
			employee.increaseSalary(sc.nextDouble());
			System.out.println("Updated data: "+ employee);
			break;
			
		case 5:
			Student student = new Student();
			System.out.println("Enter Student data: ");
			System.out.print("Name: ");
			student.name = sc.nextLine();
			for (int i = 0;i < 3; i++) {
				System.out.print("#"+ (i+1) + " season grade");
				student.sumGrade += sc.nextDouble();
			}
			if (student.sumGrade < 60.0) {
				System.out.println("FAILED");
				System.out.printf("MISSING %.2f POINTS%n", student.isPassed());
				}
				else {
				System.out.println("FINAL GRADE = "+ String.format("%.2f", student.sumGrade));
				System.out.println("PASS");
				}
		
		case 6:		
			System.out.println("Enter radius: ");
			double radius = sc.nextDouble();
			System.out.printf("Circumference: %.2f%n", Calculator.circumference(radius));
			System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
			System.out.printf("PI Value:: %.2f%n", Calculator.PI);
		
		default:
			System.exit(0);
			
		}
		
		sc.close();
	}
	

}				