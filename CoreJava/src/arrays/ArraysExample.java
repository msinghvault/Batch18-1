package arrays;

public class ArraysExample {

	public static void oneDimenArray() {
		int age1 = 10;
		int age2 = 20;
		int age3 = 30;

		int ages[] = new int[3]; // {10,20,30};
		ages[0] = age1;
		ages[1] = age2;
		ages[2] = age3;

		// ages[3] = 40;

		System.out.println(" Length is " + ages.length);

		System.out.println(ages[0] + " ");
		System.out.println(ages[1] + " ");
		System.out.println(ages[2] + " ");

		// System.out.println(ages[3] + " ");

		// String names[] = {"Jayram", "Manasa", "Rajeev"};
		// System.out.println(names[0]);

		System.out.println("\n=============");

		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i] + " ");
		}

		String names[] = { "one", "two", "three" };
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		// Enhanced for loop. For each
		for(String name : names) {
			System.out.println(name);
		}
		
		for(int age : ages) {
			System.out.println(age);
		}
		
	}

	public static void twoDimenArray() {
		int person1[] = { 5, 30 }; // height and age and percentage
		int person2[] = { 6, 32 }; // height and age
		int person3[] = { 7, 34 }; // height and age

		System.out.println(person1[0] + "  " + person1[1]);
		System.out.println(person3[0] + "  " + person3[1]);
		
		int persons[][] = { person1, person2, person3 };

		System.out.println(persons[0][0] + " " + persons[0][1]);
		System.out.println(persons[1][0] + " " + persons[1][1]);
		
		System.out.println(" persons.length "+persons.length);
		
		for(int i = 0 ; i < persons.length ; i++) {
			System.out.println(persons[i][0] + " " + persons[i][1]);
		}
		
		System.out.println("=======================");
		
		for(int i = 0 ; i < persons.length ; i++) {
			for(int  j = 0; j < persons[i].length ; j++) {
				System.out.print(persons[i][j] + " " + persons[i][j]);
			}
		}
	}

	public static void main(String[] args) {
//		oneDimenArray();
		twoDimenArray();
	}
}