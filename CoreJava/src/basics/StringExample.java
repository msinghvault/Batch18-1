package basics;

import jrout.tutorial.classes.Student;

public class StringExample {

	public static void main(String[] args) {
		stringExample();
	}
	
	static public void stringExample() {
		/*String name0 = new String("Jayram");
		String name1 = new String("Jayram");
		String name2 = new String("Jayram");
		
		String name4 = "Rukmini";
		String name5 = "Rukmini";
		
		System.out.println(name0 == name1);
		System.out.println(name0.equals(name1));
		
		System.out.println("====================");
		System.out.println(name4 == name5);
		System.out.println(name4.equals(name5));

		
		String name6 = "Rukmini";*/
		
		/*String name0 = "Jayram";
		String name1 = "Jayram";
		String name3 = "Jayram";
		
		String name4 = "Rukmini";
		*/
		System.out.println("I am at last line..." );
		
		String name2 = "jayram rout";
		System.out.println("Replacing.. "+name2.replace("rout", "test"));
		
		System.out.println(name2.substring(2));

		String myfirstName = "Jayram";
//		myfirstName = myfirstName + "Rout";
		myfirstName = myfirstName.concat("Rout");
		System.out.println("I am at last line...");
		
		String lname = "Rout";
		
		String [] names = {"1","2","3","4"};
//		StringBuffer finalname = new StringBuffer();
		StringBuilder finalname = new StringBuilder();
		for(String name : names){
			finalname.append(name);
		}
		System.out.println(finalname);
	}

}
