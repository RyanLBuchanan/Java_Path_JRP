
public class Earth {
	public static void main(String args[]) {
		
		RussianHuman Иван;
		
		Иван = new RussianHuman();
		// Ivan's age
		Иван.возраст = 21;
		// Ivan's eye color
		Иван.цветглаз = "синий";
		// Ivan's height
		Иван.высота = 1.83;
		// Ivan's name
		Иван.название = "Иван Чернов"; 
		
		Иван.russianSpeak();
		
		Vulcan Tpol = new Vulcan();
		Tpol.age = 69;
		Tpol.eyeColor = "Green";
		Tpol.name = "Tpol VulcanSexy";
		Tpol.height = 1.62;
		
		
		Tpol.speak();
		
		
		Human Archer = new Human();
		Archer.age = 41;
		Archer.eyeColor = "Blue";
		Archer.name = "Captain Archer";
		Archer.height = 1.72;
		
		Archer.speak();
		
		
	
		
		
		
	}
}
