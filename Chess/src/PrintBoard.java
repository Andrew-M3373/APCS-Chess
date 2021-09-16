import java.io.PrintWriter;

public class PrintBoard {

	
	static final String ANSI_WHITE = "\u001B[47m";
	static final String ANSI_RESET = "\u001B[0m";
	static final String ANSI_TEXT = "\u001B[31m";
	
	//static char [][] board = {{'\u2656','\u2658','\u2657','\u2655','\u2654','\u2657','\u2658','\u2656'}, {97,98,99,100,101,102,103}};
	static String [][] board = {{
		ANSI_TEXT+"br"+ANSI_RESET,
		ANSI_TEXT+"bn"+ANSI_RESET,
		ANSI_TEXT+"bb"+ANSI_RESET,
		ANSI_TEXT+"bk"+ANSI_RESET,
		ANSI_TEXT+"bq"+ANSI_RESET,
		ANSI_TEXT+"bb"+ANSI_RESET,
		ANSI_TEXT+"bn"+ANSI_RESET,
		ANSI_TEXT+"br"+ANSI_RESET}, 
		{ANSI_TEXT+"bp"+ANSI_RESET,
		ANSI_TEXT+"bp"+ANSI_RESET,
		ANSI_TEXT+"bp"+ANSI_RESET,
		ANSI_TEXT+"bp"+ANSI_RESET,
		ANSI_TEXT+"bp"+ANSI_RESET,
		ANSI_TEXT+"bp"+ANSI_RESET,
		ANSI_TEXT+"bp"+ANSI_RESET,
		ANSI_TEXT+"bp"+ANSI_RESET}, 
		{"  ","  ","  ","  ","  ","  ","  ","  "},
		{"  ","  ","  ","  ","  ","  ","  ","  "},
		{"  ","  ","  ","  ","  ","  ","  ","  "},
		{"  ","  ","  ","  ","  ","  ","  ","  "},
		{ANSI_TEXT+"wp"+ANSI_RESET,
		ANSI_TEXT+"wp"+ANSI_RESET,
		ANSI_TEXT+"wp"+ANSI_RESET,
		ANSI_TEXT+"wp"+ANSI_RESET,
		ANSI_TEXT+"wp"+ANSI_RESET,
		ANSI_TEXT+"wp"+ANSI_RESET,
		ANSI_TEXT+"wp"+ANSI_RESET,
		ANSI_TEXT+"wp"+ANSI_RESET},
		{ANSI_TEXT+"wr"+ANSI_RESET,
		ANSI_TEXT+"wn"+ANSI_RESET,
		ANSI_TEXT+"wb"+ANSI_RESET,
		ANSI_TEXT+"wk"+ANSI_RESET,
		ANSI_TEXT+"wq"+ANSI_RESET,
		ANSI_TEXT+"wb"+ANSI_RESET,
		ANSI_TEXT+"wn"+ANSI_RESET,
		ANSI_TEXT+"wr"+ANSI_RESET}};
	static PrintWriter printWriter = new PrintWriter(System.out,true);
	
	static int row = 9;
	
	
	
	public static void printBoard() {
		
		printWriter.println("\n\n\n     a    b    c    d    e    f    g    h\n  +----+----+----+----+----+----+----+----+");
		for (int i=0; i < board.length; i++) {
			if (i%2==0) {
				System.out.printf(axisLabels() 
						+ " |"
						+ANSI_WHITE
						+" %s" + ANSI_WHITE + " "
						+ANSI_RESET
						+"| %s |"
						+ANSI_WHITE
						+" %s" + ANSI_WHITE + " "
						+ANSI_RESET
						+"| %s |"
						+ANSI_WHITE
						+" %s" + ANSI_WHITE + " "
						+ANSI_RESET
						+"| %s |"
						+ANSI_WHITE
						+" %s" + ANSI_WHITE + " "
						+ANSI_RESET
						+"| %s |",board[i][0],board[i][1],board[i][2],board[i][3],board[i][4],board[i][5],board[i][6],board[i][7]);
			}
			else {
				System.out.printf(axisLabels() 
						+ " | %s |"
						+ANSI_WHITE + ANSI_TEXT
						+" %s" + ANSI_WHITE + " "
						+ANSI_RESET
						+"| %s |"
						+ANSI_WHITE + ANSI_TEXT
						+" %s" + ANSI_WHITE + " "
						+ANSI_RESET
						+"| %s |"
						+ANSI_WHITE + ANSI_TEXT
						+" %s" + ANSI_WHITE + " "
						+ANSI_RESET
						+"| %s |"
						+ANSI_WHITE + ANSI_TEXT
						+" %s" + ANSI_WHITE + " "
						+ANSI_RESET+"|",board[i][0],board[i][1],board[i][2],board[i][3],board[i][4],board[i][5],board[i][6],board[i][7]);
			}
			System.out.println("\n  +----+----+----+----+----+----+----+----+");
			
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
