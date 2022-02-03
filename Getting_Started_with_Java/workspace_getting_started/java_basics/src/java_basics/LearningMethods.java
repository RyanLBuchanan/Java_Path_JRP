package java_basics;

import another_package.ExampleClass;

public class LearningMethods {

	public static void main(String[] args) {
		
//		System.out.println("You must believe!");
		
////		
//		System.out.println(MyUtils.printStuff("This is a cyberstring!"));
////		
//		MyUtils.printStuff(42);
//		MyUtils.printStuff(42);
//		
//		MyUtils.sum2Numbers(42, 69);
//
//		int myVar = MyUtils.add10(42) + 1000 - 1000;
//		System.out.println(myVar);
		
		ExampleClass.doSomething();
	}
	
	public static void printStuff(String argument, int argInt) {
		System.out.println("This is the output: " + argument + argInt);
	}

	
	
}
