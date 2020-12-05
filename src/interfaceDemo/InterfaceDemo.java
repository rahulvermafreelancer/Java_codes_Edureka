package interfaceDemo;

interface money{
	
	void operation();
}

class Debit implements money{
	
	public void operation() {
		System.out.println("Debiting the money from the account");
	}
}

class Credit implements money{
	
	public void operation() {
		System.out.println("Crediting the money to the account");
	}
}



public interface InterfaceDemo {
	
	public static void main(String[] args) {
		
		money n = new Credit();
		n.operation();
	}

}
