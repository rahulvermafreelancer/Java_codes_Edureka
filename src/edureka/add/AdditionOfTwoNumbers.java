package edureka.add;

public class AdditionOfTwoNumbers {
	
	public Integer add (Integer arg1, Integer arg2) {
	
		Integer result = arg1+arg2;
		return result;
	}
	public Integer add (Integer arg1, Integer arg2, Integer arg3) {
		
		Integer result = arg1+arg2+arg3;
		return result;
	}
	public Integer subtract (Integer arg1, Integer arg2) {
		
		Integer result = arg1-arg2;
		return result;
	}
	public Integer multiplay (Integer arg1, Integer arg2) {
		
		Integer result = arg1*arg2;
		return result;
	}
	public Integer division (Integer arg1, Integer arg2) {
		
		Integer result = arg1/arg2;
		return result;
	}
	public Integer mode (Integer arg1, Integer arg2) {
		
		Integer result = arg1%arg2;
		return result;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Program for Calculator");
		
		AdditionOfTwoNumbers obj1 = new AdditionOfTwoNumbers();
		int arg1 = 30;
		int arg2 = 20;
		int arg3 = 30;
		Integer result = obj1.add(arg1, arg2);
		result = obj1.add(arg1, arg2,arg3);
		System.out.println("Addition = "+result);
	}

}
