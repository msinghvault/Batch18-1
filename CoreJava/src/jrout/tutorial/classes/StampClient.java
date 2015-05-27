package jrout.tutorial.classes;

class Stamp {
	String name;
	int stampSize;
}

public class StampClient {
	public static void main(String[] args) {
		Stamp star = new Stamp();
		star.name = "STAR";
		star.stampSize= 3;
		
		Stamp butterfly = new Stamp();
		butterfly.name = "Butterfly";
		butterfly.stampSize= 4;
		
		Stamp crocodile = new Stamp();
		crocodile.name = "Crocodile";
		crocodile.stampSize= 5;
	}
}