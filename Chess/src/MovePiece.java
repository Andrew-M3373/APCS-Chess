import java.util.ArrayList;

public class MovePiece {

	private static int[] toCoordinates;
	private static int[] fromCoordinates;
	private static int[][] pawnMoved = {{0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0}};
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
	
	public static void fillPiecesArray() {
		pieces.add(new Piece(ANSI_TEXT+"wp"+ANSI_RESET,new int[] {6,0},0));
//		pieces.add(ANSI_TEXT+"wp"+ANSI_RESET,6,1,0);
//		pieces.add(ANSI_TEXT+"wp"+ANSI_RESET,6,2,0);
//		pieces.add(ANSI_TEXT+"wp"+ANSI_RESET,6,3,0);
//		pieces.add(ANSI_TEXT+"wp"+ANSI_RESET,6,4,0);
//		pieces.add(ANSI_TEXT+"wp"+ANSI_RESET,6,5,0);
//		pieces.add(ANSI_TEXT+"wp"+ANSI_RESET,6,6,0);
//		pieces.add(ANSI_TEXT+"wp"+ANSI_RESET,6,7,0);
//		pieces.add(ANSI_TEXT+"wr"+ANSI_RESET,7,0,0);
//		pieces.add(ANSI_TEXT+"wn"+ANSI_RESET,7,1,0);
//		pieces.add(ANSI_TEXT+"wb"+ANSI_RESET,7,2,0);
//		pieces.add(ANSI_TEXT+"wk"+ANSI_RESET,7,3,0);
//		pieces.add(ANSI_TEXT+"wq"+ANSI_RESET,7,4,0);
//		pieces.add(ANSI_TEXT+"wb"+ANSI_RESET,7,5,0);
//		pieces.add(ANSI_TEXT+"wn"+ANSI_RESET,7,6,0);
//		pieces.add(ANSI_TEXT+"wr"+ANSI_RESET,7,7,0);
//		pieces.add(ANSI_TEXT+"br"+ANSI_RESET,0,0,0);
//		pieces.add(ANSI_TEXT+"bn"+ANSI_RESET,0,1,0);
//		pieces.add(ANSI_TEXT+"bb"+ANSI_RESET,0,2,0);
//		pieces.add(ANSI_TEXT+"bk"+ANSI_RESET,0,3,0);
//		pieces.add(ANSI_TEXT+"bq"+ANSI_RESET,0,4,0);
//		pieces.add(ANSI_TEXT+"bb"+ANSI_RESET,0,5,0);
//		pieces.add(ANSI_TEXT+"bn"+ANSI_RESET,0,6,0);
//		pieces.add(ANSI_TEXT+"br"+ANSI_RESET,0,7,0);
//		pieces.add(ANSI_TEXT+"bp"+ANSI_RESET,1,0,0);
//		pieces.add(ANSI_TEXT+"bp"+ANSI_RESET,1,1,0);
//		pieces.add(ANSI_TEXT+"bp"+ANSI_RESET,1,2,0);
//		pieces.add(ANSI_TEXT+"bp"+ANSI_RESET,1,3,0);
//		pieces.add(ANSI_TEXT+"bp"+ANSI_RESET,1,4,0);
//		pieces.add(ANSI_TEXT+"bp"+ANSI_RESET,1,5,0);
//		pieces.add(ANSI_TEXT+"bp"+ANSI_RESET,1,6,0);
//		pieces.add(ANSI_TEXT+"bp"+ANSI_RESET,1,7,0);
		System.out.println(pieces.get(0).getLocation());
	}
	
	private static boolean moveToChecks(int row, int col) {
		
//		System.out.println(row + " " + col);
//		System.out.println(PrintBoard.board[row][col]);
//		System.out.println(toCoordinates[0] + " " + toCoordinates[1]);
		System.out.println(pieces.size());
		for (int i = 0; i < pieces.size(); i ++) {
		
			switch (PrintBoard.board[row][col]) {
			case ANSI_TEXT+"wp"+ANSI_RESET: 
				System.out.println("First works.");
				System.out.println("to0:" + toCoordinates[0] + "from0:" + fromCoordinates[0] + "from1:" + fromCoordinates[1]);
				System.out.println(row);
				if (toCoordinates[0] == fromCoordinates[0] - 1) {
					if (pieces.get(i).getTimesMoved() > 0) {
						
					}
					System.out.println("It works. ");
				}
				break;
			}
		}
		
		return true;
	}
	
	
	
}
