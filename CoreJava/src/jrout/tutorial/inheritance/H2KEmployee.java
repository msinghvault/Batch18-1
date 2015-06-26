package jrout.tutorial.inheritance;

public class H2KEmployee {
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
	
	public String tieColor() {
		return "Tie Color is GreenBlue";
	}
}
