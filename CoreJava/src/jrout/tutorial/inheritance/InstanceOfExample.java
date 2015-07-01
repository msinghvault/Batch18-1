package jrout.tutorial.inheritance;

import jrout.tutorial.inheritance.itemp.JavaEmp;

public class InstanceOfExample {

	public static void main(String[] args) {
		H2KEmployee emp = new FinanceEmployee(34, "Nuzhat","6");
		printInfo(emp);
		
		emp = new JavaEmp(56,"Dinesh");
		printInfo(emp);
	}
	
	public static void printInfo(H2KEmployee emp){
		System.out.println(emp.getName());
		
		if(emp instanceof FinanceEmployee) {
			FinanceEmployee fe = (FinanceEmployee) emp;
			System.out.println(fe.getTaxFinance());
		}else if(emp instanceof JavaEmp) {
			JavaEmp fe = (JavaEmp) emp;
			System.out.println(fe.objectOrientedConceptKnow());
		}
	}
}
