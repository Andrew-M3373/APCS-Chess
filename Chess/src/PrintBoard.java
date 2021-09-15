import java.io.PrintWriter;

public class PrintBoard {

	//static char [][] board = {{'\u2656','\u2658','\u2657','\u2655','\u2654','\u2657','\u2658','\u2656'}, {97,98,99,100,101,102,103}};
	static String [][] board = {{"br","bn","bb","bk","bq","bb","bn","br"}, {"bp","bp","bp","bp","bp","bp","bp","bp"}, {"  ","  ","  ","  ","  ","  ","  ","  "},{"  ","  ","  ","  ","  ","  ","  ","  "},{"  ","  ","  ","  ","  ","  ","  ","  "},{"  ","  ","  ","  ","  ","  ","  ","  "},{"wp","wp","wp","wp","wp","wp","wp","wp"},{"wr","wn","wb","wk","wq","wb","wn","wr"}};
	static PrintWriter printWriter = new PrintWriter(System.out,true);
	
	static int row = 9;
	
	static final String ANSI_WHITE = "\u001B[47m";
	static final String ANSI_RESET = "\u001B[0m";
	
	public static void printBoard() {
		
		printWriter.println("     a    b    c    d    e    f    g    \n  +----+----+----+----+----+----+----+");
		for (int i=0; i < board.length; i++) {
			System.out.printf(axisLabels() + " | %s | %s | %s | %s | %s | %s | %s |",board[i][0],board[i][1],board[i][2],board[i][3],board[i][4],board[i][5],board[i][6]);
			System.out.println(ANSI_WHITE + "\n  +----+----+----+----+----+----+----+" + ANSI_RESET);
			
		}
	}
	public static int axisLabels() {
		row --;
		if (row == 0) {
			row = 8;
		}
		return row;
	}
}
