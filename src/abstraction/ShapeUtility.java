package abstraction;

public class ShapeUtility {

	public static void main(String[] args) {
		
		shape circle = new Circle();
		float areaOfCircle = circle.area();
		circle.displayArea(areaOfCircle);
	}

}
