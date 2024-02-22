package entities;

import java.text.SimpleDateFormat;

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	public Triangle() {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double area () {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p- a) * (p - b) * (p - c));
	}
	
	
}
