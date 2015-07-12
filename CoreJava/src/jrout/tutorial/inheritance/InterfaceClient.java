package jrout.tutorial.inheritance;

import jrout.tutorial.inheritance.itemp.JavaEmp;

public class InterfaceClient {
	
	public static void main(String[] args) {
		/*H2KEmployee emp = new FinanceEmployee(34, "Nuzhat","6");
		FinanceEmployee fe = (FinanceEmployee) emp;
		System.out.println(fe.getTaxFinance());*/
		
		Swimmable swim = new FinanceEmployee(34, "Nuzhat","6");
		printSwimmingDetails(swim);
		
		Swimmable swim1 = new JavaEmp(56,"Dinesh");
		printSwimmingDetails(swim1);
		
		Kickable kick = new JavaEmp(34, "Nuzhat");
		kick.kick();
		
//		Printer print = new Printer();
	}
	
	public static void printSwimmingDetails(Swimmable swim){
		swim.swimming();
	}

}
