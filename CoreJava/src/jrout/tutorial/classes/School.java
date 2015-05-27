package jrout.tutorial.classes;

class Teacher{

}

public class School {

	public static void main(String[] args) {
		Student studOne = new Student();
		studOne.name = "Jayram";
		studOne.grade = 3;
		
		Student studTwo = new Student();
		studTwo.name = "Agni";
		studTwo.grade = 4;
		
		System.out.println(studOne.name);
		System.out.println(studTwo.name);
	
		studOne.name = "Girish";
		
		System.out.println(studOne.name);
		
		
	}
	
	
}