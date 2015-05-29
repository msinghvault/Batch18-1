package jrout.tutorial.classes;

public class Student {
	String name;
	int rollNumber;
	int height;
	int grade;
	
	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public Student(String assignedName, int assignRollNumber, int assignGrade) {
		/*name = assignedName;
		rollNumber = assignRollNumber;*/
		this(assignedName,assignRollNumber);
		grade = assignGrade;
	}
	
	public Student(String assignedName, int assignRollNumber, int assignGrade, int assignedHeight) {
		this(assignedName,assignRollNumber, assignGrade);
		height = assignedHeight;
	}
	
	public Student(int assignRollNumber, String assignedName , int assignGrade) {
		name = assignedName;
		rollNumber = assignRollNumber;
		grade = assignGrade;
	}
}