package jrout.tutorial.threads;

public class ThreadingExample {

	public static void main(String[] args) {
		System.out.println("Main :" + Thread.currentThread().getName());
		FileWriter run = new FileWriter();
		
		Thread vanitha = new Thread(run,"Vanitha");
		System.out.println(vanitha.getPriority());
		Thread agni = new Thread(run,"Agni");
		System.out.println(agni.getPriority());
		vanitha.start();
		agni.start();
		
		System.out.println("I am done...");
	}
	
	public static void callMe(){
		System.out.println("ThreadingExample.callMe()" + Thread.currentThread().getName());
	}
}
