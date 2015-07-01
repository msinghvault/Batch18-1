package jrout.tutorial.inheritance;

public class CompileTimePoly {

	public void callMe(){
		System.out.println("In Call");
	}
	public void callMe(String name) {
		System.out.println("In Call with name "+ name);
	}
	
	public static void main(String[] args) {
		CompileTimePoly ctp = new CompileTimePoly();
		ctp.callMe();
		ctp.callMe("Jayram");

	}

}
