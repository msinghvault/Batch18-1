package jrout.tutorial.inheritance;

public class ITEmployee extends H2KEmployee {
	
	public ITEmployee(int empId, String name) {
		super(empId, name);
		//super.setEmpId(empId); // Invoking super method.
	}
	private String javaProgrammingExp;
	
	public String getJavaProgrammingExp() {
		return javaProgrammingExp;
	}
	
	public void setJavaProgrammingExp(String javaProgrammingExp) {
		this.javaProgrammingExp = javaProgrammingExp;
	}
	
	@Override
	public String getWorkDetails() {
		return "Work Hour for IT Employee is 10 Hrs";
	}
	
	@Override
	public String tieColor() {
		return "Tie Color is PurpleBlue";
	}
}