public class Human {
	
	// Name
	String name;
	// Age
	int age;
	// Height
	double height;
	// Eye color
	String eyeColor;
	
	// Constructor method
	public Human() {
		
	}
	
	public void speak() {
		System.out.println("My name is " + name + ".");
		System.out.println("I am " + height + " meters tall.");
		System.out.println("I am " + age + " years old.");
		System.out.println("My eyes are " + eyeColor + ".");
	}
	
	
	public void eat() {
		// Eating
		System.out.println("I am eating...");
	}
	
	public void walk() {
		// Walking
		System.out.println("I am walking...");
	}
	
	public void work() {
		// Working
		System.out.println("I am working...");
	}
}


