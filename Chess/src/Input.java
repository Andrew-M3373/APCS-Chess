import java.util.Scanner;
public class Input {

	public static int input() {
		Scanner userInput = new Scanner(System.in);
		String input = userInput.next().toLowerCase();
		
		// Input checks
		for (int i = 1; i <= 8; i++) {
			if (input.length() > 2 || (input.charAt(0) > 104 || input.charAt(0) < 97) || (input.charAt(1) > 56 || input.charAt(1) < 49)) {
				invalidInput();
			}
		}
		
		int row = Integer.parseInt(input.substring(1));
		char letter = (char) (input.charAt(0)-48);
		int col = (char) (input.charAt(0)-48);
//		switch (input.substring(0,1)) {
//		case "a": col = 1; break;
//		case "b": col = 2; break;
//		case "c": col = 3; break; 
//		case "d": col = 4; break;
//		case "e": col = 5; break;
//		case "f": col = 6; break;
//		case "g": col = 7; break;
//		case "h": col = 8; break;
//		}
		System.out.println(row);
		System.out.println(col);
		
		
		return 0;
	}
	
	public static void invalidInput() {
		System.out.println("hi");
	}
}
