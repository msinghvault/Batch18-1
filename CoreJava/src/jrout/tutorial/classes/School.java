package jrout.tutorial.classes;

class Teacher{

}
/**
 * This is a school Object
 * @author Jayram
 *
 */
public class School {
	public void callMe(){
		System.out.println("I am a school");
	}
	public static void main(String[] args) {
		/*Student studOne = new Student();
		studOne.name = "Jayram";
		studOne.grade = 3;
		
		Student studTwo = new Student();
		studTwo.name = "Agni";
		studTwo.grade = 4;
		
		System.out.println(studOne.name);
		System.out.println(studTwo.name);
	
		studOne.name = "Girish";
		
		System.out.println(studOne.name);*/
		
		
		
		/*Student studThree = new Student("Girish");
		studThree.grade = 5;
		
		System.out.println(studThree.name);
		
		studThree.name = "Nuzhat";
		
		System.out.println(studThree.name);
		
		Student stud = studThree;
		
		stud.name = "New Name";
		
		System.out.println(studThree.name);
		System.out.println(stud.name);*/
		
		
		Student studOne = new Student("Agni",369);
		
		studOne.printStudentInfo();
//		studOne.name = "Ranjani";
		studOne.printStudentInfo("Hello");
		
//		studOne.getInfo();
//		studOne.printStudentInfo("Bye");
		
//		System.out.println(studOne.name + " " + studOne.rollNumber);
		System.out.println(studOne.getName());
		System.out.println(studOne.getRollNumber());
		
	}
}