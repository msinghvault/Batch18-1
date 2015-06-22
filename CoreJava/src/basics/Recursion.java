package basics;

class Factorial {
	// this is a recursive method
	static int factorial(int n) {
		int result;
		if (n == 1)
			return 1;

		result = factorial(n - 1) * n;
		return result;
	}
}

public class Recursion {
	public static void main(String args[]) {
		
//		System.out.println("Factorial of 3 is " + f.factorial(3));
		System.out.println("Factorial of 4 is " + Factorial.factorial(4));
//		f.callMe();
//		System.out.println("Factorial of 5 is " + f.fact(5));
	}
	
}