package basics;

public class TernaryOperator {

	public static void main(String[] args) {
		int age = 10;
		String name = (age > 18) ? "Adult" : "Child";
		
		if(age < 18) {
			name = "One";
		}else if(age > 18 && age < 21 ) {
			name = "Two";
		}else if(age > 21) {
			name = "tree";
		}else {
			name = "nothing";
		}

	}

}
