package oop;

public class example {
	int instanceVariable;
	
	example(){
		//constructor
		instanceVariable = 100;
	}
	example(int value){
		//constructor
		instanceVariable = value;
	}


	public static void main(String[] args) {
		
		example obj1 = new example(20);
		System.out.println(obj1.instanceVariable);

	}

}
