package basics;

import jrout.tutorial.classes.Student;

public class VariablesExample {
	
	public static void main(String[] args) {
		Student jay = new Student("Jay",34);
		Student ranjani = new Student("Ranjani",355);
		Student girish = new Student("Girish",633);
		Student nuzhat = new Student("Nuzhat",600);
		
		System.out.println(Student.count);
		
//		VariablesExample.callMe();
		
		/*VariablesExample ex = new VariablesExample();
		ex.callMe();*/
		
	}
	
	public static void callMe(){
	}
	
}