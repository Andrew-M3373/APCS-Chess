import java.util.Scanner;
public class Input {

	private static boolean enteringInput = true;
	private static String input = "";
	
	public static int input() {
		Scanner userInput = new Scanner(System.in);
		//String input = userInput.nextLine().toLowerCase();
		
		while(enteringInput) {
			input = userInput.nextLine().toLowerCase();
			if (invalidInput(input)) {
				int row = Integer.parseInt(input.substring(1));
				int col = Character.getNumericValue((char) (input.charAt(0)-48));
				System.out.println(row);
				System.out.println(col);
			}
		}
		
		
		return 0;
	}
	
	public static boolean invalidInput(String i) {
		
		if (i.length() > 2 || (i.charAt(0) > 104 || i.charAt(0) < 97) || (i.charAt(1) > 56 || i.charAt(1) < 49)) {
			System.out.println("Please only enter a 2-character pair of coordinates in the form letter and a number.\n"
					+ "Enter your coordinates again.");
			return false;
		}
		enteringInput = false;
		return true;
	}
}
