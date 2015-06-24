package jrout.tutorial.classes.innerclass;

import jrout.tutorial.classes.innerclass.House.HousePainter;

public class InnerClassExample {	
	public static void main(String[] args) {
		House house = new House("Bag");
		HousePainter hp = house.new HousePainter("Blue");

		System.out.println(house.name);

		HousePainter hp1 = new House("Jayram").new HousePainter("Black");
		hp1.painter();
	}
}