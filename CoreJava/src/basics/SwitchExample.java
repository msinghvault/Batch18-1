package basics;

public class SwitchExample {

	public static void main(String[] args) {
		int age = 20;
		String name = (age > 18) ? "Adult" : "Child";
		long startTime = 0, endTime = 0;

		startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			if (age == 18) {
				name = "18";
			} else if (age == 19) {
				name = "19";
			} else if (age == 20) {
				name = "20";
			} else if (age == 21) {
				name = "21";
			} else {
				name = "nothing";
			}
		}

		endTime = System.currentTimeMillis();

		System.out.println("If Else Performance " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			switch (age) {
			case 18:
				name = "18";
				break;
			case 19:
				name = "19";
				break;
			case 20:
				name = "20";
				break;
			case 21: {
				name = "21";
				break;
			}
			default:
				name = "nothing";
				break;
			}	
		}
		endTime = System.currentTimeMillis();
		System.out.println("Switch Performance "+(endTime - startTime));
		
	}

}
