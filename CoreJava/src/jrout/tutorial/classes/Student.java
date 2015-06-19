package jrout.tutorial.classes;

public class Student {
	private String name;
	private int rollNumber;
	private int height;
	private int grade;
	private String teacher;
	
	public static int count;
	
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getHeight() {
		return height;
	}
	public String getName() {
		return name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void setHeight(int height) {
		if(height <= 0)
			this.height = 2;
		else 
			this.height = height;
		
		/*if(height <= 0) {
			this.height = 2;
		}else{
			this.height = height;
		}*/
			
	}
	
	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
		count++;
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
	
	public void printStudentInfo(){
		System.out.println(getInfo());
	}
	
	public void printStudentInfo(String message){
//		System.out.println(message + " " + this.name + " " + rollNumber + " " + grade);
		System.out.println(message + " " + getInfo());
	}
	
	private String getInfo() {
		return this.name + " " + rollNumber + " " + grade +" " + height;
	}
	
	public String toString() {
		return name + " " + rollNumber + " " + grade;
	}
	public static void callMe(){
	}
}