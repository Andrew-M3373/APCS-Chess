
public class MovePiece {

	public static void white() {
		System.out.println(Welcome.players[0] + ", enter coordinates of the piece you want to move.");
		int[] fromCoordinates = Input.input();
		while (!PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]].contains("w")) {
			System.out.println("Please enter coordinates of a space occupied by a white chess piece.");
			fromCoordinates = Input.input();
		}
		
		
		
		System.out.println("Enter the space to move your " + PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]] + " to.");
		int[] toCoordinates = Input.input();
		PrintBoard.board[toCoordinates[0]][toCoordinates[1]] = PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]];
		PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]] = "  ";
	}
	
	public static void black() {
		System.out.println(Welcome.players[1] + ", enter coordinates of the piece you want to move.");
		int[] fromCoordinates = Input.input();
		while (PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]].contains("w") || PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]].equals("  ")) {
			System.out.println("Please enter coordinates of a space occupied by a black chess piece.");
			fromCoordinates = Input.input();
		}
		
		
		
		System.out.println("Enter the space to move your " + PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]] + " to.");
		int[] toCoordinates = Input.input();
		PrintBoard.board[toCoordinates[0]][toCoordinates[1]] = PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]];
		PrintBoard.board[fromCoordinates[0]][fromCoordinates[1]] = "  ";
	}
	
}
