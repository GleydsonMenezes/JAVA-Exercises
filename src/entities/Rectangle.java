package entities;

public class Rectangle {

	public double width;
	public double height;
	
	
	public double area() {
		return height * width;
	}
	
	public double perimeter() {
		return (height + width) * 2;
	}
	
	public double diagonal() {
		return Math.sqrt((height * height) + (width * width));
	}
	
	@Override
	public String toString() {
		return "AREA = "
				+ String.format("%.2f", area())
				+ "\nPERIMETER = "
				+ String.format("%.2f", perimeter())
				+ "\nDIAGONAL = "
				+ String.format("%.2f", diagonal());
	}
	
}
