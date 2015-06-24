package basics;

enum Months {
	JAN(1), FEB(2), MAR(3), APRIL(4);
	
	public int value ;
	
	Months(int value){
		this.value = value; 
	}
	
	public int getValue() {
		return this.value;
	}
}

enum Coffee {
	SMALL(300) , MEDIUM(400) , LARGE(500);
	public int value ;
	Coffee(int value) {
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
}

public class EnumExample {
	public static final String NAME = "TESTING";
	
	public static void main(String[] args) {
		
		EnumExample.printMonthNamesWithIndex(1);
		EnumExample.printMonthNamesWithEnum(Months.JAN);
		
		EnumExample ee = new EnumExample();
		ee.orderCoffee(Coffee.LARGE);
	}
	
	public void orderCoffee(Coffee coffee){
		
		if(coffee.getValue() == 500){
			System.out.println("Its Large");
		}
		System.out.println(coffee.getValue());
	}
	
	public static void printMonthNamesWithEnum(Months month){
		if(month == Months.JAN) {
			System.out.println("January. So my lucky number is "+ (78 + month.getValue()));
		}else if(month == Months.FEB) {
			System.out.println("Feb. So my lucky number is "+ (90 + month.getValue()));
		}
		
	}
	
	public static void printMonthNamesWithIndex(int index){
		if(index == 1) {
			System.out.println("January . So my lucky number is " + (78 + index));
		}else if(index == 2) {
			System.out.println("Feb . So my lucky number is " + (90 + index));
		}else if(index == 12) {
			System.out.println("Dec. So my lucky number is " + (900 + index));
		}
		
	}

}
