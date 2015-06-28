package jrout.tutorial.inheritance.itemp;

public class GroovyEmp extends ITEmployee {

	public GroovyEmp(int empId, String name) {
		super(empId, name);
	}

	@Override
	public void vehicle() {
		System.out.println("Groovy Vehicle");
		
	}
	
}
