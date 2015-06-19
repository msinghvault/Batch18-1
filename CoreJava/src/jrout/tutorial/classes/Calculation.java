package jrout.tutorial.classes;

public class Calculation {
	public int add(int a , int b){
		int val = (a+b);
		return val;
	}

	public float add(int a , int b, int c) {
		return (a+b+c);
	}
	
	public void doCalcuation(int a , int b) {
		int finalValue = 8 - add(a, b);
		System.out.println(finalValue);
	}
	
	public void doCalcuation(int a , int b, int c) {
		float finalValue = 8 - add(a, b, c);
		System.out.println(finalValue);
	}
	
	public static void main(String[] args) {
			
	}
}