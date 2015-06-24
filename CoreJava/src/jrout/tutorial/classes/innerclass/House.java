package jrout.tutorial.classes.innerclass;

public class House {
	String name = "";
	
	public House(String name) {
		this.name = name;
	}
	
	public class HousePainter {
		String color ;
		public HousePainter(String color){
			this.color = color;
		}
		public void painter(){
			System.out.println("I am painting " + name + " House with "+ color +" Color");
		}
	}
	
	public class Testing {
		
	}
}