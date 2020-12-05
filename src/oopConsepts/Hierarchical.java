package oopConsepts;

public class Hierarchical {
	
	public static void main(String[] args) {
		Car van = new Car();
		van.Wheel = 4;
		van.run();
		Bike BMW = new Bike();
		BMW.Wheel = 2;
		BMW.run();
	}

}
