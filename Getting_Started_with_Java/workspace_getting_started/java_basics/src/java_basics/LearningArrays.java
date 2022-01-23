package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		
		
		// Initialize array -> a fixed size
		double [] values = new double[100];
		values[0] = 1000;
		values[1] = 69;
		values[99] = 314159;
		
		// Print array value
//		System.out.println(values[99]);
		
		String [] words = new String[3];
		words[0] = "My";
		words[1] = "name";
		words[2] = "is";
		
		System.out.println(words[1]);
		
		words = new String[10];
		
		System.out.println(words[1]);
		
	}

}
