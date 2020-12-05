package oopConsepts;

class Manager
{
	int sal = 25000;
}
class Emp extends Manager
{
	int id = 20;
	int EmpSal = 12000;
}

public class Inheritance {

	public static void main(String[] args) {
		
		Emp e = new Emp();
		System.out.println("Employee Sal = "+e.EmpSal);
		System.out.println("Manager Sal = "+e.sal);
		
	}

}
