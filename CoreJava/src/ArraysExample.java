
public class ArraysExample {

	public static void main(String[] args) {
		// declaring
		// initializing
		
		int age1 = 10;
		int age2 = 20;
		int age3 = 30;
		
		String name ;
		name = "Jayram";
		
		int ages[] = new int[3]; //{10,20,30};
		ages[0] = age1;
		ages[1] = age2;
		ages[2] = age3;
		
//		ages[3] = 40;

		System.out.println(" Length is "+ages.length);

		System.out.println(ages[0] +" ");
		System.out.println(ages[1] +" ");
		System.out.println(ages[2] + " ");
		
		
//		System.out.println(ages[3] + " ");
		
//		String names[] = {"Jayram", "Manasa", "Rajeev"};
//		System.out.println(names[0]);
		
		
		int person1[] = {5,30}; // height and age and percentage
		int person2[] = {6,32}; // height and age
		int person3[] = {7,34}; // height and age
		
		int persons[][] = {   person1, person2 , person3};
		
		System.out.println(person1[0] +"  "+ person1[1]);
		System.out.println(person3[0] +"  "+ person3[1]);
		
		System.out.print (persons[2][0] +" ");
		System.out.print (persons[2][1] + " ");
		
		System.out.println("\n=============");
		
		for(int i = 0 ;  i < ages.length ; i++) {
			System.out.println(ages[i] +" ");	
		}
		
	}

}
