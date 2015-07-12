package jrout.tutorial.threads.threadcommunication;

public class CalcualtorClient {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();

		new Reader(calc, "Agni").start();
		new Reader(calc, "Jayram").start();
		new Reader(calc, "Nuzhat").start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		calc.start();
	}

}
