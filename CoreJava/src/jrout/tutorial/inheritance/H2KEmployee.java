package jrout.tutorial.inheritance;

public abstract class H2KEmployee {
	private int empId;
	private String name;
	private String workDetails = " All Employee work for 8 Hrs";
	
	public H2KEmployee(int empId , String name) {
		this.empId = empId;
		this.name = name;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkDetails() {
		return workDetails;
	}
	
	public abstract String tieColor();
	public abstract void vehicle();
	
	public void lunchTime() {
		System.out.println("Lunch time is 12:30 PM");
	}
	
	@Override
	public String toString() {
		return "empId = "+ empId + " name = "+ name;
	}
}
