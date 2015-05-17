package basics.bitlogic;

public class BooleanLogicalOperatorExample {

	public static void main(String[] args) {
		int urAge = 21;//Integer.parseInt(args[0]); // 10 
		int myAge = 23;//Integer.parseInt(args[1]); // 23
		/*
		String message = (age > 10) ? "I am more then 10 Yrs" : "I am less 10 Yrs"; 
		System.out.println(message);
		*/
		boolean checkCondition = ((urAge++ > 20) & (myAge++ >= 20));
		
		System.out.println(" urAge "+urAge );
		System.out.println(" myAge "+myAge );
		
//		String message = checkCondition ? "We are adults" : "We are not";
//		String playMessage = checkCondition ? "We are allowed to Play" : "We are not allowed to play";
//		System.out.println(message);
	
		
	}
}
