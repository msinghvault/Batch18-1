package jrout.tutorial.classes;

public class ReturnTypeExample {

	public void callMe() {
		ReturnTypeExample rte = new ReturnTypeExample();

		Calculation calc = new Calculation();
		calc.doCalcuation(4, 5);
		calc.doCalcuation(4, 5, 6);
		//
		// String dou = rte.add(4,6) + "";

		// rte.getName("Dinesh", "Kumar");

		// System.out.println("Hello ");
		// String name = rte.getName("Dinesh", "Kumar");
		//
		System.out.println("Hello" + rte.getName("Dinesh", "Kumar")
				+ " How you doing");

		// System.out.println("How you doing.. ");
	}

	public static void main(String[] args) {
		ReturnTypeExample rte = new ReturnTypeExample();
		rte.callMe();
	}

	public String getName(String firstName, String lastName) {
		// System.out.println(firstName +" *** " + lastName);
		return firstName + " *** " + lastName;
	}

}
