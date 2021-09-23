import java.util.Scanner;
public class Welcome {

	public static void welcomeUser() {
		System.out.println("Welcome to chess!\n\nPlayer 1 (white), enter your name here:");
		Scanner userInput = new Scanner(System.in);
		String user1 = userInput.nextLine().toLowerCase();
		user1 = user1.substring(0, 1).toUpperCase() + user1.substring(1);
		
		System.out.println("\nPlayer 2 (black), enter your name here:");
		String user2 = userInput.nextLine().toLowerCase();
		user2 = user2.substring(0, 1).toUpperCase() + user2.substring(1);
		
		System.out.println("\nHello " + user1 + " and " + user2 + "! When entering coordinates, enter a 2-character pair of coordinates "
				+ "\nin the form of a letter and a number."
				+ "\nPress enter when you are ready to play.");
		userInput.nextLine();
	}
}
