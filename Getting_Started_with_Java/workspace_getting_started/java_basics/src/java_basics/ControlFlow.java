package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		boolean hungry;
		
		hungry = true;
		
		if(hungry){
			System.out.println("Must have sustenance!");
		} else {
			System.out.println("I'm good.");
		}
		
		int hungerRating = 6;
		if(!(hungerRating < 6)) {
			System.out.println("Don't need fooder.");
		} else {
			System.out.println("Eat already?!");
		}
		
		int favTemp = 75;
		int curTemp = 32;
		String opine;

		if(curTemp < favTemp - 30) {
			opine = "Damn, it cold!";
		} else if (curTemp < favTemp - 20) {
			opine = "No too cold, but must have layers.";
		} else if (curTemp > favTemp + 10) {
			opine = "Motherlover!  It's warm!";
		} else {
			opine = "Lovely day, Mate!";
		}
		
		System.out.println(opine);
		
	}

}
