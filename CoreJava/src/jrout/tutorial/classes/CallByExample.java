package jrout.tutorial.classes;

public class CallByExample {

	public static void main(String[] args) {
		CallByExample cbe = new CallByExample();
		int val = 3;
		System.out.println("Before value = " + val);
		cbe.print(val);
		System.out.println("Final value = " + val);
		
		Student stud = new Student("Jay", 45);
		stud.setGrade(3);
		
		System.out.println("Before 1 : " + stud.getGrade());
		cbe.printStudentInfo(stud);
		System.out.println("After 1 : " + stud.getGrade());
	}
	
	public void print(int val)  {
		val = 100;
	}
	
	public void printStudentInfo(Student stud) {
		stud.setGrade(400);
	}
}
