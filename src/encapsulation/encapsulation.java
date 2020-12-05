package encapsulation;

class Employee{
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}


public class encapsulation {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setName("Rishi");
		
		System.out.println(e.getName());

	}

}
