package edureka.array;

public class arrayQuestion {
	
	public static void main(String[] args) {
		
		char[] source = {'A','B','C','D','H'}; // Source array 
		
		char[] destination = new char[7];
		
		//copy source array into destination array
		
		System.arraycopy(source, 0, destination, 1, 5);
		System.out.println(new String(destination));
	}

}
