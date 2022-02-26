
public class Earth {
	public static void main(String args[]) {
		
		Human Archer = new Human("Archer", 42, 1.73, "blue");
		RussianHuman Ivan = new RussianHuman(null, 0, 0, null);
		Vulcan TPol = new Vulcan(null, 0, 0, null);
		
		Archer.speak();
		System.out.println("");
		Ivan.russianSpeak();
		System.out.println("");
		TPol.speak();
	}
}
