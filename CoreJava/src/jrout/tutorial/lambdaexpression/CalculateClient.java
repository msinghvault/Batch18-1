package jrout.tutorial.lambdaexpression;

public class CalculateClient {

	public static void main(String[] args) {
		Calculate calc = new Add();
		System.out.println(calc.calc(12, 3));
		
		calc = new Multiply();
		System.out.println(calc.calc(12, 3));
		
		calc = (x ,y) -> x/y;
		
		System.out.println(calc.calc(12, 3));
	}
}