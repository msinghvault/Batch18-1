package jrout.tutorial.exception;

import jrout.tutorial.inheritance.itemp.JavaEmp;

public class ExceptionExample {
	
	public static void main(String[] args) throws Exception {
		/*JavaEmp emp = null;
		printEmp(emp);
		int index;
		String vol[] = {args[0], args[1]};
		try {
			index = Integer.parseInt(args[0]);
		} catch (Exception e) {
			index = 1;
			e.printStackTrace();
		}
		
		int ages[] = {23,45,67,98,100};
		int randomValue[] = {1,3,0,5,8};
		
		System.out.println("Before");
		
		int age = 0, value;
		System.out.println("After");
		
		try{
			age = ages[index];
			value = randomValue[index];
			int someValue = age/value;
		}catch(ArrayIndexOutOfBoundsException exp){
			exp.printStackTrace();
			age = 1000;
		}catch(ArithmeticException exp){
			exp.printStackTrace();
		}finally {
			System.out.println("I am the finally block..");
			// close connection
		}
		
		System.out.println(age);
		if(age == 1000){
			System.out.println("Not Sure...");
		}else if(age > 30) {
			System.out.println("Age is More then 30");
		}else if(age < 1){
			System.out.println("Small Kid");
		}*/
		
		System.out.println("Division === "+Division.divideValues(12,0));
		/*try {
			System.out.println("Division === "+Division.divideValues(12,0));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		System.out.println("I am at the final Stage...");
	}
	
	public static void printEmp(JavaEmp emp) {
//		System.out.println(emp.toString());
		System.out.println(emp != null ? emp.toString() : "===========");
	}
	
	
}