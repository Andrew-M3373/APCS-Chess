
public class MovePiece {

	private static int[] toCoordinates;
	private static int[] fromCoordinates;
	private static final String ANSI_WHITE = "\u001B[47m";
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_TEXT = "\u001B[31m";
	
	public static void white() {
		System.out.println(Welcome.players[0] + ", enter coordinates of the piece you want to move.");
		fromCoordinates = Input.input();
		while (!PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]].contains("w")) {
			System.out.println("Please enter coordinates of a space occupied by a white chess piece.");
			fromCoordinates = Input.input();
		}
		
		
		System.out.println("Enter the space to move your " + PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]] + " to.");
		//toCoordinates;
		do {
			toCoordinates = Input.input();
			PrintBoard.board[toCoordinates[0]][toCoordinates[1]] = PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]];
			PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]] = "  ";
		}
		while (!moveToChecks(toCoordinates[0], toCoordinates[1]));
	}
	
	public static void black() {
		System.out.println(Welcome.players[1] + ", enter coordinates of the piece you want to move.");
		fromCoordinates = Input.input();
		while (PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]].contains("w") || PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]].equals("  ")) {
			System.out.println("Please enter coordinates of a space occupied by a black chess piece.");
			fromCoordinates = Input.input();
		}
		
		
		
		System.out.println("Enter the space to move your " + PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]] + " to.");
		//int[] toCoordinates;
		do {
			toCoordinates = Input.input();
			PrintBoard.board[toCoordinates[0]][toCoordinates[1]] = PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]];
			PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]] = "  ";
		}
		while (!moveToChecks(toCoordinates[0], toCoordinates[1]));
	}
	private static boolean moveToChecks(int row, int col) {
		
		switch (PrintBoard.board[row][col]) {
		case ANSI_TEXT+"wp"+ANSI_RESET: 
			System.out.println("First works.");
		System.out.println("to0:" + toCoordinates[0] + "from0:" + fromCoordinates[0] + "from1:" + fromCoordinates[1]);
		System.out.println(row);
			if (toCoordinates[0] == fromCoordinates[0] - 1) {
				if (moved > 0) {
					
				}
				System.out.println("It works. ");
		}
		}
		
		return true;
	}
	
	
	
}
