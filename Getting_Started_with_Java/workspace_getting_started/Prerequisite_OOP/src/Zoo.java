
public class Zoo {

	public static void main(String[] args) {
		
		
		Animal puppyAnimal =  new Animal("Mammal", 10.11, "Male", 15, "Golden");
				
		puppyAnimal.speak();
		System.out.println("");
		
		Bird birdBrain = new Bird();
		birdBrain.fly();

		Fish fishFace = new Fish();
		fishFace.swim();
	}

}
