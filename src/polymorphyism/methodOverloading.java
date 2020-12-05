package polymorphyism;

public class methodOverloading {
	
	public void area(double b, double h)
	{
		System.out.println("Area of triangle = "+(0.5*b*h));
	}
	
	public void area(double r)
	{
		System.out.println("Area of Circle = "+(3.14*r*r));
	}

	public static void main(String[] args) {
		
		methodOverloading Area = new methodOverloading();
		Area.area(23.5, 22.3);
		Area.area(66.45);
		
	}

}
