package jrout.tutorial.inheritance.itemp;

public class JavaEmp extends ITEmployee {

	public JavaEmp(int empId, String name) {
		super(empId, name);
	}

	@Override
	public void vehicle() {
		System.out.println("Java Vehicle");
		
	}
	
}
