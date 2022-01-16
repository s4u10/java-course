package java_basics;

public class ControlFlow {

	public static void main(String[] args) {

		boolean hungry = true;
		
		if (hungry) {
			System.out.println("Im starving...");
		} else {
			System.out.println("I'm not hungry");
		}
		
		int hungerRoting = 5;
		
		if (!(hungerRoting != 6)) {
			System.out.println("Not Hungry");
		} else {
		System.out.println("I'm starving...");
	}
		int favoriteTemp = 75;
		int currentTemp = 100;
		String opinion = null;
		
	if(favoriteTemp == currentTemp) {
		if(currentTemp <= favoriteTemp - 30){
			opinion = "It's Pretty Darn Cold...";
		} else if(currentTemp < favoriteTemp - 20) {
			opinion = "I'ts kinda cold out ...";
		} else if(currentTemp < favoriteTemp + 10) {
			opinion = "I'ts hot out";
		} else {
			opinion = "it's a beautiful day...";
		}
	} else {
		opinion = "unknown temp";
	}

		System.out.println(opinion);
		
		int month = 4;
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
			break;
		}
		
		System.out.println(monthString);
		
	}
}

