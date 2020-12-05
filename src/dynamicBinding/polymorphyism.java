package dynamicBinding;

public class polymorphyism {

	public static void main(String[] args) {
		
		Bus obj =  new Bus();
		
		Vehicle v = obj;
		v.run();

	}

}
