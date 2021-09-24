import java.util.Scanner;

public class Input {

	private static boolean enteringInput = true;
	private static String input;
	
	public static int[] input() {
		enteringInput = true;
		Scanner userInput = new Scanner(System.in);
		//String input = userInput.nextLine().toLowerCase();
		int row = 0;
		int col = 0;
		
		while(enteringInput) {
			String input = userInput.nextLine().toLowerCase();
			if (invalidInput(input)) {
				row = Math.abs(Integer.parseInt(input.substring(1))-8);
				col = Character.getNumericValue((char) (input.charAt(0)-49));
//				System.out.println(row);
//				System.out.println(col);
			}
		}
		
		int[] coordinates = {row,col};
		
		return coordinates;
	}
	
	public static boolean invalidInput(String i) {
		
		if (i.length() != 2 || (i.charAt(0) > 104 || i.charAt(0) < 97) || (i.charAt(1) > 56 || i.charAt(1) < 49)) {
			System.out.println("Please only enter a 2-character pair of coordinates in the form letter and a number.\n"
					+ "Enter your coordinates again.");
			return false;
		}
		enteringInput = false;
		return true;
	}
}
