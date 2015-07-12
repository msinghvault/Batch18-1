package jrout.tutorial.threads.threadcommunication;

public class Reader extends Thread {
	Calculator calc;
	String name;
	public Reader(Calculator calc, String name) {
		this.calc = calc;
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name + "Waiting for the Calcuation to be complete...");
		synchronized(calc) {
			try {
				calc.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Final Result ="+ name + " " + calc.sum);
	}
}
