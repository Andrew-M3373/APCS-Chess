
public class Pieces {

	private String piece;
	private int[] location;
	private int timesMoved;
	
	
	public Pieces(String p, int[] l, int m) {
		piece = p;
		timesMoved = m;
		location = l;
	}


	public String getPiece() {
		return piece;
	}


	public void setPiece(String piece) {
		this.piece = piece;
	}


	public int getTimesMoved() {
		return timesMoved;
	}


	public void setTimesMoved(int timesMoved) {
		this.timesMoved = timesMoved;
	}


	public int[] getLocation() {
		return location;
	}


	public void setLocation(int[] location) {
		this.location = location;
	}
	
	
	
}
