package jrout.tutorial.inheritance;



public class FinanceEmployee extends H2KEmployee implements Swimmable {
	private String taxFinanceExp;
	
	public FinanceEmployee(int empId , String name) {
		super(empId, name);
	}
	
	public FinanceEmployee(int empId , String name, String taxExp) {
		super(empId, name);
		this.taxFinanceExp = taxExp;
	}
	
	public String getTaxFinance() {
		return taxFinanceExp;
	}
	public void setTaxFinance(String taxFinance) {
		this.taxFinanceExp = taxFinance;
	}
	
	@Override
	public String tieColor() {
		return "BlackBlue Tie Color";
	}

	@Override
	public void vehicle() {
		System.out.println("BMW Vehicle");
	}

	@Override
	public void swimming() {
		System.out.println("I am good at swimming");
	}
}
