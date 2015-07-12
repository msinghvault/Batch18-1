package jrout.tutorial.threads.threadcommunication;

public class Calculator extends Thread {
	
	public int sum;
	@Override
	public void run() {
		synchronized(this) {
			for(int i = 0 ; i < 5; i++) {
				sum += i;
			}
			notifyAll();
		}
	}
	
}
