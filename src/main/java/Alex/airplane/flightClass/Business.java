package Alex.airplane.flightClass;

import java.util.ArrayList;
import java.util.List;

import Alex.airplane.Seat;
import Alex.airplane.ticket.Ticket;

public class Business extends Ticket {
	
	String specialFood;
	static int totalPlaces=100;	
	static int freePlaces ;
	ArrayList<Seat>seats = new ArrayList<Seat>();
	
	public Business(String firstName, String LastName,int price,String specialFood) {
		super(firstName, LastName,price);
		this.specialFood=specialFood;
	}
	
	public void buyBisinessClassTicket(Seat seat){
		
		if(totalPlaces > 0){
			seats.add(seat);
			totalPlaces--;
			System.out.println(seat.toString()  + " Free Places :" + totalPlaces  );	
		}
		else{
			System.out.println("Not free tickets");
		}
		
	}
}
