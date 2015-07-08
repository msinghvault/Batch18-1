package jrout.tutorial.exception;

public class Division {
	
	public static int divideValues(int a , int b) throws Exception {
		if(b == 0){
			throw new DivisionException("You have Passed Zero as the second Argument");
		}
		int div = a/b;
		return div;
	}
}