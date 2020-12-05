package abstraction;

public abstract class shape {
	
	abstract float area();
	
	public void displayArea(float area) {
		
		System.out.println("printing area of shapes"+ area);
	}

}
