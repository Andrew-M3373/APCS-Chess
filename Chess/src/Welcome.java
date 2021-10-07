import java.util.Scanner;
public class Welcome {

	public static String[] players = new String[2];
	
	public static void welcomeUser() {
		System.out.println("Welcome to chess!\n\nPlayer 1 (white), enter your name here:");
		Scanner userInput = new Scanner(System.in);
		players[0] = userInput.nextLine().toLowerCase();
		while (players[0].length()<1) {
			System.out.println("Please enter your name.");
			players[0] = userInput.nextLine().toLowerCase();
		}
		players[0] = players[0].substring(0, 1).toUpperCase() + players[0].substring(1);
		
		System.out.println("\nPlayer 2 (black), enter your name here:");
		players[1] = userInput.nextLine().toLowerCase();
		while (players[1].length()<1) {
			System.out.println("Please enter your name.");
			players[1] = userInput.nextLine().toLowerCase();
		}
		players[1] = players[1].substring(0, 1).toUpperCase() + players[1].substring(1);
		
		System.out.println("\nHello, " + players[0] + " and " + players[1] + "! When entering coordinates, enter a 2-character pair of coordinates "
				+ "\nin the form of a letter and a number."
//				+ "\nNOTE: If you enter an incorrect piece location, enter the letter \"e\" into any input field."
				+ "\nPress enter when you are ready to play.");
		userInput.nextLine();
	}
}
