package jrout.tutorial.inheritance.itemp;

import jrout.tutorial.inheritance.Kickable;
import jrout.tutorial.inheritance.Swimmable;

public final class JavaEmp extends ITEmployee implements Swimmable , Kickable{

	public JavaEmp(int empId, String name) {
		super(empId, name);
	}

	@Override
	public void vehicle() {
		System.out.println("Java Vehicle");
		
	}
	
	@Override
	public String tieColor() {
		return "White Java Tie Color";
	}
	
	public String objectOrientedConceptKnow(){
		return "Very good OOC";
	}

	@Override
	public void swimming() {
		System.out.println("I am java guys who is bad swimming...");
		
	}

	@Override
	public void kick() {
		System.out.println("I know how to kick...");
	}
	
}