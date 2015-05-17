package basics;

public class DataTypes {

	public static void main(String[] args) {
		int myAge = Integer.parseInt("30");
		byte urAge = 40;
		
		byte totalAge = (byte)(myAge + urAge);
		
		int height = myAge;
		byte myHeight = (byte)height;
		System.out.println(totalAge);
		
		byte ageofAnimal = (byte)128;
		
		System.out.println("ageofAnimal " + ageofAnimal);
		
		//===================================
		
		double heightOfComputer = 5;
		int heighofC = (int) heightOfComputer;
		System.out.println(heighofC);

		System.out.println(totalAge  + " total Age " );
		System.out.println(myAge + urAge  + " ===== total Age " );
		System.out.println(" ===== total Age " + (myAge + urAge));
		
		
		boolean isJayramJavaTutor = false;
		
		char readFlag = 'r';
		String name = "Jayram" + readFlag;
	}
}
