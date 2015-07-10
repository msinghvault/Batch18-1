package jrout.tutorial.threads;

public class FileWriter implements Runnable {
	@Override
//	public synchronized void run() {
	public void run() {
		synchronized(this){
			for(int i = 0 ; i < 5 ; i++) {
				/*try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
				System.out.println("Writing "+ i + " " + Thread.currentThread().getName());
			}	
		}
		
	}
}
