public class RussianHuman {
	
	// Name
	String название;
	// Age
	int возраст;
	// Height
	double высота;
	// Eye color
	String цветглаз;
	
	// Constructor method
	public RussianHuman() {
		
	}
	
	
	public void russianSpeak() {
		System.out.println("Привет меня зовут " + название + ".");
		System.out.println("я " + высота + " метров высокий.");
		System.out.println("я " + возраст + " лет.");
		System.out.println("мой цвет глаз " + цветглаз + ".");
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
