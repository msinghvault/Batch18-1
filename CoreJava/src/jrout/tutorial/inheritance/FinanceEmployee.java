package jrout.tutorial.inheritance;

public class FinanceEmployee extends H2KEmployee {
	private String taxFinanceExp;
	
	public FinanceEmployee(int empId , String name) {
		super(empId, name);
	}
	
	public String getTaxFinance() {
		return taxFinanceExp;
	}
	public void setTaxFinance(String taxFinance) {
		this.taxFinanceExp = taxFinance;
	}
}
