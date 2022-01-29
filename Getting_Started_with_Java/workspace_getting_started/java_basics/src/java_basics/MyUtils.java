package java_basics;

public class MyUtils {
	
	public static String printStuff(String argument) {
		System.out.println("This is the string output: " + argument);
		return argument;
	}
	
	public static int printStuff(int argument) {
		System.out.println("This is the int output: " + argument);
		return argument;
	}
	
	public static void sum2Numbers(int firstArg, int secondArg) {
		System.out.println(firstArg + secondArg);
	}
	
	public static int add10(int someArg) {
		int result = someArg + 10;
		return result;
	}
}
