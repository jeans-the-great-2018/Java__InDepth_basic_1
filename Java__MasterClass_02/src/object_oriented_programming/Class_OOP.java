package object_oriented_programming;

public class Class_OOP {

	//Main method to Test
	public static void main(String[] args) {
		//objects are created, note: inherited from super class OBJECT
		Bike pulsar = new Bike();
		Bike calieber = new Bike();
		{	//encapsulation violated
			calieber.model = "kawaski";
			pulsar.model ="bajaj";
		}
		{	//to ensure encapsulation
			pulsar.setEngine("180cc");
			calieber.setEngine("100cc");
		}
		if(null!=pulsar && null!=calieber) {
			System.out.println(pulsar.toString());
			System.out.println(calieber.toString());
		}
	}
}

//public is assumed
class Bike{
	//accessible only any where within the class. 
	private int wheels;
	private int seats;
	private String engine;
	private String color;
	
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}

	//accessible everywhere
	public String model;
	
	@Override
	public String toString() {
		return "Bike [engine=" + engine + ", model=" + model + "]";
	}
}
