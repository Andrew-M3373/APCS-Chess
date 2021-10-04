public class PlayGame {

	
	
	public static void main(String[] args) {
		
		Welcome.welcomeUser();
//		PrintBoard.printBoard();
//		PrintBoard.board[0][3] = "  ";
//		PrintBoard.printBoard();
		MovePiece.fillPiecesArray();
		do {
			PrintBoard.printBoard();
			MovePiece.white();
			if (PrintBoard.stillPlaying()) {
				PrintBoard.printBoard();
				MovePiece.black();
			}
		}
		while (PrintBoard.stillPlaying());
		PrintBoard.printBoard();
		PrintBoard.gameOver();
	}
}
