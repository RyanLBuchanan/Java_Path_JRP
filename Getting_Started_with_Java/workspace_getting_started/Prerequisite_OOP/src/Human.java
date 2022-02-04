
public class Human {
	
	// Name
	String название;
	// Age
	int возраст;
	// Height
	int высота;
	// Eye color
	String цветглаз;
	
	public void speak() {
		System.out.println("Привет меня зовут " + название);
		System.out.println("я " + высота + " высокий");
		System.out.println("я " + возраст + "лет");
		System.out.println("мой цвет глаз " + цветглаз);
	}
	
	public void есть() {
		// Eating
		System.out.println("принимать пищу...");
	}
	
	public void ходить() {
		// Walking
		System.out.println("гулять пешком...");
	}
	
	public void Работа() {
		// Working
		System.out.println("работающий...");
	}
}
