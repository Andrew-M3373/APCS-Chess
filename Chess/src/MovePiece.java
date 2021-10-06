import java.util.ArrayList;

public class MovePiece {

	private static int[] toCoordinates;
	private static int[] fromCoordinates;
	private static final String ANSI_WHITE = "\u001B[47m";
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_TEXT = "\u001B[31m";
	private static ArrayList<Piece> pieces = new ArrayList<Piece>();
	
	public static void white() {
		System.out.println(Welcome.players[0] + ", enter coordinates of the piece you want to move.");
		fromCoordinates = Input.input();
		while (!PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]].contains("w")) {
			System.out.println("Please enter coordinates of a space occupied by a white chess piece.");
			fromCoordinates = Input.input();
		}
		
		
		do {
			System.out.println("Enter the space to move your " + PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]] + " to.");
			toCoordinates = Input.input();
		}
		while (moveToChecks(fromCoordinates[0], fromCoordinates[1]));
		
		PrintBoard.board[toCoordinates[0]][toCoordinates[1]] = PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]];
		PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]] = "  ";
	}
	
	public static void black() {
		System.out.println(Welcome.players[1] + ", enter coordinates of the piece you want to move.");
		fromCoordinates = Input.input();
		while (PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]].contains("w") || PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]].equals("  ")) {
			System.out.println("Please enter coordinates of a space occupied by a black chess piece.");
			fromCoordinates = Input.input();
		}
		
		
		
		do {
			System.out.println("Enter the space to move your " + PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]] + " to.");
			toCoordinates = Input.input();
		}
		while (moveToChecks(fromCoordinates[0],fromCoordinates[1]));
		
		PrintBoard.board[toCoordinates[0]][toCoordinates[1]] = PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]];
		PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]] = "  ";
	}
	
	public static void fillPiecesArray() {
		pieces.add(new Piece(ANSI_TEXT+"wp"+ANSI_RESET,new int[] {6,0},1));
		pieces.add(new Piece(ANSI_TEXT+"wp"+ANSI_RESET,new int[] {6,1},0));
		pieces.add(new Piece(ANSI_TEXT+"wp"+ANSI_RESET,new int[] {6,2},0));
		pieces.add(new Piece(ANSI_TEXT+"wp"+ANSI_RESET,new int[] {6,3},0));
		pieces.add(new Piece(ANSI_TEXT+"wp"+ANSI_RESET,new int[] {6,4},0));
		pieces.add(new Piece(ANSI_TEXT+"wp"+ANSI_RESET,new int[] {6,5},0));
		pieces.add(new Piece(ANSI_TEXT+"wp"+ANSI_RESET,new int[] {6,6},0));
		pieces.add(new Piece(ANSI_TEXT+"wp"+ANSI_RESET,new int[] {6,7},0));
		pieces.add(new Piece(ANSI_TEXT+"wr"+ANSI_RESET,new int[] {7,0},0));
		pieces.add(new Piece(ANSI_TEXT+"wn"+ANSI_RESET,new int[] {7,1},0));
		pieces.add(new Piece(ANSI_TEXT+"wb"+ANSI_RESET,new int[] {7,2},0));
		pieces.add(new Piece(ANSI_TEXT+"wk"+ANSI_RESET,new int[] {7,3},0));
		pieces.add(new Piece(ANSI_TEXT+"wq"+ANSI_RESET,new int[] {7,4},0));
		pieces.add(new Piece(ANSI_TEXT+"wb"+ANSI_RESET,new int[] {7,5},0));
		pieces.add(new Piece(ANSI_TEXT+"wn"+ANSI_RESET,new int[] {7,6},0));
		pieces.add(new Piece(ANSI_TEXT+"wr"+ANSI_RESET,new int[] {7,7},0));
		pieces.add(new Piece(ANSI_TEXT+"bp"+ANSI_RESET,new int[] {1,0},0));
		pieces.add(new Piece(ANSI_TEXT+"bp"+ANSI_RESET,new int[] {1,1},0));
		pieces.add(new Piece(ANSI_TEXT+"bp"+ANSI_RESET,new int[] {1,2},0));
		pieces.add(new Piece(ANSI_TEXT+"bp"+ANSI_RESET,new int[] {1,3},0));
		pieces.add(new Piece(ANSI_TEXT+"bp"+ANSI_RESET,new int[] {1,4},0));
		pieces.add(new Piece(ANSI_TEXT+"bp"+ANSI_RESET,new int[] {1,5},0));
		pieces.add(new Piece(ANSI_TEXT+"bp"+ANSI_RESET,new int[] {1,6},0));
		pieces.add(new Piece(ANSI_TEXT+"bp"+ANSI_RESET,new int[] {1,7},0));
		pieces.add(new Piece(ANSI_TEXT+"br"+ANSI_RESET,new int[] {0,0},0));
		pieces.add(new Piece(ANSI_TEXT+"bn"+ANSI_RESET,new int[] {0,1},0));
		pieces.add(new Piece(ANSI_TEXT+"bb"+ANSI_RESET,new int[] {0,2},0));
		pieces.add(new Piece(ANSI_TEXT+"bk"+ANSI_RESET,new int[] {0,3},0));
		pieces.add(new Piece(ANSI_TEXT+"bq"+ANSI_RESET,new int[] {0,4},0));
		pieces.add(new Piece(ANSI_TEXT+"bb"+ANSI_RESET,new int[] {0,5},0));
		pieces.add(new Piece(ANSI_TEXT+"bn"+ANSI_RESET,new int[] {0,6},0));
		pieces.add(new Piece(ANSI_TEXT+"br"+ANSI_RESET,new int[] {0,7},0));
		
		
//		for (int i = 0; i < pieces.size(); i ++) {
//			System.out.println("location:" + pieces.get(i).getLocation()[0] + pieces.get(i).getLocation()[1]);
//			System.out.println("piece:" + PrintBoard.board[pieces.get(i).getLocation()[0]][pieces.get(i).getLocation()[1]]);
//		}
	}
	
	private static boolean moveToChecks(int row, int col) {
		
//		System.out.println(row + " " + col);
//		System.out.println(PrintBoard.board[row][col]);
//		System.out.println(toCoordinates[0] + " " + toCoordinates[1]);
		int index = 0;
		for (int i = 0; i < pieces.size(); i ++) {
			if (pieces.get(i).getLocation()[0] == fromCoordinates[0] && pieces.get(i).getLocation()[1] == fromCoordinates[1]) {
				index = i;
			}
		}
		
		switch (PrintBoard.board[row][col]) {
		case ANSI_TEXT+"wp"+ANSI_RESET: 
//				System.out.println("First works.");
//				System.out.println("to0:" + toCoordinates[0] + "to1:" + toCoordinates[1] + "from0:" + fromCoordinates[0] + "from1:" + fromCoordinates[1]);
			if (toCoordinates[0] == fromCoordinates[0] - 2 && toCoordinates[1] == fromCoordinates[1]) {
				if (pieces.get(index).getTimesMoved() > 0) {
					System.out.println("\nYour pawn cannot move two spaces after the first move.");
					return true;
				}
			}
			if (toCoordinates[1] == fromCoordinates[1] - 1 && (toCoordinates[0] == fromCoordinates[0] - 1 || toCoordinates[0] == fromCoordinates[0] + 1) && PrintBoard.board[toCoordinates[0]][toCoordinates[1]].equals("  ")) {
				System.out.println("\nYour pawn can only move diagonally when taking a black chess piece.");
				return true;
			}
			break;
		}
		
		return false;
	}
	
	
	
}
