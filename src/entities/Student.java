package entities;

public class Student {

	public String name;
	public double sumGrade;
	
	public double isPassed() {
		if (sumGrade < 60) {
			return	(sumGrade -= 60) * -1;
		}
		return 0.0;
	}
	
}
