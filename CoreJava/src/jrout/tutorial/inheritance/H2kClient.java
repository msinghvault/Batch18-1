package jrout.tutorial.inheritance;

import jrout.tutorial.inheritance.itemp.JavaEmp;

public class H2kClient {

	public static void main(String[] args) {
//		FinanceEmployee fe = new FinanceEmployee(34, "Nuzhat");
//		System.out.println(fe.toString());
//		
//		System.out.println(fe.getEmpId());
//		System.out.println(fe.getName());
		
		/*System.out.println(fe.getWorkDetails());
		System.out.println(fe.tieColor());
		
		ITEmployee ie = new ITEmployee(56,"Dinesh");
		System.out.println(ie.getEmpId());
		System.out.println(ie.getName());
		System.out.println(ie.getWorkDetails());
		System.out.println(ie.tieColor());
		
		ITEmployee ie2 = new ITEmployee(56,"Dinesh"){
			@Override
			public String tieColor() {
				return "Golden Color tie";
			}
		};
		
		System.out.println(ie2.tieColor());*/
		
		H2KEmployee fEmp = new FinanceEmployee(34, "Nuzhat");
		printInfo(fEmp);
		H2KEmployee itEmp = new JavaEmp(56,"Dinesh");
		printInfo(itEmp);
	}
	
	public static void printInfo(H2KEmployee emp){
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getWorkDetails());
		System.out.println(emp.tieColor());
	}
}