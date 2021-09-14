import java.io.PrintWriter;

public class Chess {

	static char [][] board = {{'\u2656','\u2658','\u2657','\u2655','\u2654','\u2657','\u2658','\u2656'}, {97,98,99,100,101,102,103}};
	static PrintWriter printWriter = new PrintWriter(System.out,true);
	
	public static void main(String[] args) {
		
		printBoard();
		
	}
	
	public static void printBoard() {
		
		printWriter.println("    a   b   c   d   e   f   g  \n  +---+---+---+---+---+---+---+");
		for (int i=0; i < board.length; i++) {
			printWriter.printf((i+1) + " | %s | %s | %s | %s | %s | %s | %s |",board[i][0],board[i][1],board[i][2],board[i][3],board[i][4],board[i][5],board[i][6]);
			printWriter.println("\n  +---+---+---+---+---+---+---+");
		}
		
		
	}

}
