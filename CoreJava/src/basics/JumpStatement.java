package basics;

public class JumpStatement {

	public static void main(String[] args) {
/*		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			if (i % 2 == 0)
				continue;
			System.out.println("");
		}
*/
		// Assignment : use nested for loop and use break from the inside loop 
		// and see what happens.
		for (int i = 0; i < 10; i++) {
			if(i == 7) break;
			System.out.print(i);
			
			System.out.println("Hello");
		}
		System.out.println("\nI am done...");
	}

}
