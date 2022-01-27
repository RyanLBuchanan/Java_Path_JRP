package java_basics;

import java.time.MonthDay;

public class ControlFlow {

	public static void main(String[] args) {
//		boolean hungry;
//		
//		hungry = true;
//		
//		if(hungry){
//			System.out.println("Must have sustenance!");
//		} else {
//			System.out.println("I'm good.");
//		}
//		
//		int hungerRating = 6;
//		if(!(hungerRating < 6)) {
//			System.out.println("Don't need fooder.");
//		} else {
//			System.out.println("Eat already?!");
//		}
		
		int favTemp = 75;
		int curTemp = 75;
		String opine;

		if(favTemp != curTemp) {
			if(curTemp < favTemp - 30) {
				opine = "Damn, it cold!";
			} else if (curTemp < favTemp - 20) {
				opine = "Not too cold, but must have layers.";
			} else if (curTemp > favTemp + 10) {
				opine = "Motherlover!  It's warm!";
			} else {
				opine = "Lovely day, Mate!";
			}
		} else {
			opine = "No nothing, Nada!";
		}
			
		System.out.println(opine);
		
		
		int month = 2;
		String monthString;
		
		switch(month) {
		case 1: monthString = "January";
			break;
		case 2: monthString = "February";
			break;
		case 3: monthString = "March";
			break;
		case 4: monthString = "April";
			break;
		default: monthString = "Unknown Month";
		}
		
		System.out.println(monthString);
		
	}

}
