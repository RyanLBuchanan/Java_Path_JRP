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
//	public RussianHuman() {
//		// Ivan's age
//		возраст = 21;
//		// Ivan's eye color
//		цветглаз = "синий";
//		// Ivan's height
//		высота = 1.83;
//		// Ivan's name
//		название = "Иван Чернов"; 
//	}
//	
	
	public void russianSpeak() {
		System.out.println("Привет меня зовут " + название + ".");
		System.out.println("я " + высота + " метров высокий.");
		System.out.println("я " + возраст + " лет.");
		System.out.println("мой цвет глаз " + цветглаз + ".");
	}
	
	public RussianHuman(String название, int возраст, double высота, String цветглаз) {
		super();
		this.название = название;
		this.возраст = возраст;
		this.высота = высота;
		this.цветглаз = цветглаз;
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
