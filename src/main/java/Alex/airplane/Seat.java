package Alex.airplane;

public class Seat {

	String seatInLine;
	int line ;
	
	public Seat (String seatInLine,int line ){
		this.seatInLine=seatInLine;
		this.line=line;
	}

	@Override
	public String toString() {
		return "Seat [seatInLine=" + seatInLine + ", line=" + line + "]";
	}
	
}
