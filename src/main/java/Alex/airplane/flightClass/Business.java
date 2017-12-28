package Alex.airplane.flightClass;

import java.util.ArrayList;
import java.util.List;

import Alex.airplane.Seat;
import Alex.airplane.ticket.Ticket;

public class Business extends Ticket {
	
	String specialFood;
	
	public Business(String firstName, String LastName, Seat seat) {
		super(firstName, LastName, seat);
		
	}
	static int totalPlaces=100;	
	static int freePlaces ;
	ArrayList<Seat> seats=null;
	
	
	
	
}
