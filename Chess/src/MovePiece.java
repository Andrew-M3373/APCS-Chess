import java.util.ArrayList;

public class MovePiece {

	private static int[] toCoordinates;
	private static int[] fromCoordinates;
	private static final String ANSI_WHITE = "\u001B[47m";
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_TEXT = "\u001B[31m";
	private static ArrayList<Piece> pieces = new ArrayList<Piece>();
	private static int index;
	
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
		while (moveToChecks(fromCoordinates[0], fromCoordinates[1],toCoordinates[0],toCoordinates[1]));
		
		pieces.get(index).setLocation(toCoordinates);
		pieces.get(index).setTimesMoved(pieces.get(index).getTimesMoved() + 1);
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
		while (moveToChecks(fromCoordinates[0],fromCoordinates[1],toCoordinates[0],toCoordinates[1]));
		
		pieces.get(index).setLocation(toCoordinates);
		pieces.get(index).setTimesMoved(pieces.get(index).getTimesMoved() + 1);
		PrintBoard.board[toCoordinates[0]][toCoordinates[1]] = PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]];
		PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]] = "  ";
	}
	
	public static void fillPiecesArray() {
		pieces.add(new Piece(ANSI_TEXT+"wp"+ANSI_RESET,new int[] {6,0},0));
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
	
	private static boolean moveToChecks(int fromRow, int fromCol, int toRow, int toCol) {
		
//		System.out.println(row + " " + col);
//		System.out.println(PrintBoard.board[row][col]);
//		System.out.println(toRow + " " + toCol);
		index = 0;
		for (int i = 0; i < pieces.size(); i ++) {
			if (pieces.get(i).getLocation()[0] == fromRow && pieces.get(i).getLocation()[1] == fromCol) {
				index = i;
			}
		}
		
		switch (PrintBoard.board[fromRow][fromCol]) {
		case ANSI_TEXT+"wp"+ANSI_RESET: 
//				System.out.println("First works.");
//				System.out.println("to0:" + toRow + "to1:" + toCol + "from0:" + fromRow + "from1:" + fromCol);
			
			// First move forward 2
			if (toRow == fromRow - 2 && toCol == fromCol) {
				if (pieces.get(index).getTimesMoved() > 0) {	
					System.out.println("\nYour pawn cannot move two spaces after the first move.");
					return true;
				}
				else {
					if (!PrintBoard.board[toRow][toCol].contains("  ")) {
						System.out.println("\nYour pawn cannot move forward to an occupied space.");
						return true;
					}
					else if(!PrintBoard.board[toRow+1][toCol].contains("  ")) {
						System.out.println("\nYour pawn cannot jump pieces.");
						return true;
					}
					return false;
				}
			}
		
			// Move diagonally
			else if (toRow == fromRow - 1 && (toCol == fromCol - 1 || toCol == fromCol + 1)) {
				if (PrintBoard.board[toRow][toCol].contains("  ")) {
					System.out.println("\nYour pawn can only move diagonally when taking a black chess piece.");
					return true;
				}
				else if (!PrintBoard.board[toRow][toCol].substring(5,6).contains("b")) {
					System.out.println("You cannot move to a location already occupied by a white piece.");
					return true;
				}
				return false;
			}
			
			// Normal move
			else if(toRow == fromRow - 1 && toCol == fromCol) {
				if (!PrintBoard.board[toRow][toCol].contains("  ")) {
					System.out.println("Your pawn cannot take a piece directly ahead.");
					return true;
				}
				return false;
			}
			else {
				System.out.println("\nPlease enter a valid move.");
				return true;
			}
			//break;
		case ANSI_TEXT+"bp"+ANSI_RESET:
			// First move forward 2
			if (toRow == fromRow + 2 && toCol == fromCol) {
				if (pieces.get(index).getTimesMoved() > 0) {	
					System.out.println("\nYour pawn cannot move two spaces after the first move.");
					return true;
				}
				else {
					if (!PrintBoard.board[toRow][toCol].contains("  ")) {
						System.out.println("\nYour pawn cannot move forward to an occupied space.");
						return true;
					}
					else if(!PrintBoard.board[toRow-1][toCol].contains("  ")) {
						System.out.println("\nYour pawn cannot jump pieces.");
						return true;
					}
					return false;
				}
			}
		
			// Move diagonally
			else if (toRow == fromRow + 1 && (toCol == fromCol - 1 || toCol == fromCol + 1)) {
				if (PrintBoard.board[toRow][toCol].contains("  ")) {
					System.out.println("\nYour pawn can only move diagonally when taking a white chess piece.");
					return true;
				}
				else if (!PrintBoard.board[toRow][toCol].substring(5,6).contains("w")) {
					System.out.println("You cannot move to a location already occupied by a black piece.");
					return true;
				}
				return false;
			}
			
			// Normal move
			else if(toRow == fromRow + 1 && toCol == fromCol) {
				if (!PrintBoard.board[toRow][toCol].contains("  ")) {
					System.out.println("Your pawn cannot move forward to an occupied space.");
					return true;
				}
				return false;
			}
			else {
				System.out.println("\nPlease enter a valid move.");
				return true;
			}
			//break;
		case ANSI_TEXT+"br"+ANSI_RESET: case ANSI_TEXT+"wr"+ANSI_RESET:
			
			if (toRow != fromRow && toCol == fromCol) {
				// Piece moved vertically
				if (toRow > fromRow) {
					// Moving down
					for (int i = fromRow + 1; i < toRow; i++) {
						if (!PrintBoard.board[i][fromCol].contains("  ")) {
							System.out.println("\nRooks cannot jump other pieces.");
							return true;
						}
					}
				}
				else if (toRow < fromRow) {
					// Moving Up
					for (int i = fromRow - 1; i > toRow; i--) {
						if (!PrintBoard.board[i][fromCol].contains("  ")) {
							System.out.println("\nRooks cannot jump other pieces.");
							return true;
						}
					}
				}
				// Move to Location Checks
				if (PrintBoard.board[toRow][toCol].contains("w")) {
					//if (pieces.get(index).getPiece().substring(5,6).contains("w")) {
					if (PrintBoard.board[fromRow][fromCol].substring(5,6).contains("w")) {
						System.out.println("\nYour rook cannot move to a space currently occupied by another white piece.");
						return true;
					}
					else {
						return false;
					}
				}
				if (!PrintBoard.board[toRow][toCol].contains("  ") && !PrintBoard.board[toRow][toCol].contains("w")) {
					if (PrintBoard.board[fromRow][fromCol].substring(5,6).contains("b")) {
						System.out.println("\nYour rook cannot move to a space currently occupied by another black piece.");
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			else if (toRow == fromRow && toCol != fromCol) {
				// Piece moved horizontally 
				if (toCol > fromCol) {
					// Moving right
					for (int i = fromCol + 1; i < toCol; i++) {
						if (!PrintBoard.board[fromRow][i].contains("  ")) {
							System.out.println("\nRooks cannot jump other pieces.");
							return true;
						}
					}
				}
				else if (toCol < fromCol) {
					// Moving left
					for (int i = fromCol - 1; i > toCol; i--) {
						if (!PrintBoard.board[fromRow][i].contains("  ")) {
							System.out.println("\nRooks cannot jump other pieces.");
							return true;
						}
					}
				}
				// Move to Location Checks
				if (PrintBoard.board[toRow][toCol].contains("w")) {
					//if (pieces.get(index).getPiece().substring(5,6).contains("w")) {
					if (PrintBoard.board[fromRow][fromCol].substring(5,6).contains("w")) {
						System.out.println("\nYour rook cannot move to a space currently occupied by another white piece.");
						return true;
					}
					else {
						return false;
					}
				}
				if (!PrintBoard.board[toRow][toCol].contains("  ") && !PrintBoard.board[toRow][toCol].contains("w")) {
					if (PrintBoard.board[fromRow][fromCol].substring(5,6).contains("b")) {
						System.out.println("\nYour rook cannot move to a space currently occupied by another black piece.");
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			else if (toRow != fromRow && toCol != fromCol) {
				// Piece moved both directions
				System.out.println("\nYour rook must only move horizontally OR vertically.");
				return true;
			}
			else {
				System.out.println("\nEnter a valid move.");
				return true;
			}
		}
		// return true to disallow other moves
		// return false to allow all moves not listed
		return false;
	}
}
