package has_a;

class Has_A{
	
	int id;
	Name name;
	
	public Has_A(int id, Name name)
	{
		this.id = id;
		this.name = name;	
	}
	
	void display() {
		System.out.println("Id = "+id);
		System.out.println("First Name = "+ name.first+ " ,Last Name = "+name.last);
	}
}


public class Employee {
	
	public static void main(String[] args)
	{
		Name name = new Name("Rahul","Verma");
		Has_A e = new Has_A(700,name);
		
		e.display();
	}
	

}
