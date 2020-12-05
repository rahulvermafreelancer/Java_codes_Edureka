package superClass;

public class Truck extends Vehicle11 {
	
	String Wheels = "Truck Has 4 Wheels";
	
	void printWheel() {
		
		System.out.println(Wheels);
		System.out.println(super.Wheels);
	}

}
