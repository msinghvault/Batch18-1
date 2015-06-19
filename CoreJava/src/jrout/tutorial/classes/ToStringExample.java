package jrout.tutorial.classes;

public class ToStringExample {

	public static void main(String[] args) {
//		Student stud = new Student("Jayram",566);
		
//		System.out.println(stud);
		ToStringExample tse = new ToStringExample();
		
		String finalValue = "Hello " + tse.getName("Ranjani");
		System.out.println(finalValue);
		
	}
	

	public String getName(String firstName) {
		return firstName +"****";
	}
}