package jrout.tutorial.threads;

public class DeadLockClient {
	public static String bike = "Bike";
	public static String helmet = "Helmet";
	
	public static void main(String[] args) {
		ManRider man = new ManRider();
		man.setName("Man");
		
		WomenRider wom = new WomenRider();
		wom.setName("Women");
		
		wom.start();
		man.start();
	}
	
	private static class ManRider extends Thread {
		@Override
		public void run() {
			synchronized(bike) {
				System.out.println("Man has got the Bike..now it will get the Helmet");
				synchronized(helmet) {
					System.out.println("Man has got the Helmet also..now Ready to Ride");	
				}
			}
		}
	}
	
	private static class WomenRider extends Thread {
		@Override
		public void run() {
			synchronized(bike) {
				System.out.println("Woman has got the Bike..now it will get the helmet");
				synchronized(helmet) {
					System.out.println("Woman has got the Helmet also..now Ready to Ride");	
				}
			}
		}
	}
}
