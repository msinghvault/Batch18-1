package jrout.tutorial.classes;

/**
 * This is a school Object
 * @author Jayram
 *
 */
public class SchoolConstructor {

	public static void main(String[] args) {

		Student stud = new Student("Girish",300);

		// The constructor Student() is undefined
		System.out.println(stud.name + " " + stud.grade);

		Student stud1 = new Student("Ranjani",675);
		System.out.println(stud1.name + " " + stud1.grade);
		
		Student stud3 = new Student("Ishtiaq",600, 4);
		
		System.out.println(stud3.grade + " " + stud3.name);
		
		Student stud4 = new Student(600,"Ishtiaq", 4);
		System.out.println(stud4.grade + " " + stud4.name);
		
	}
}