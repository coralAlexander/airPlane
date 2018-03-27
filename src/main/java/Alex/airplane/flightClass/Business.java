package Alex.airplane.flightClass;

import java.util.ArrayList;
import java.util.List;

import Alex.airplane.Seat;
import Alex.airplane.ticket.Ticket;

public class Business extends Ticket {
	
	String specialFood;
	static int totalPlaces=2;	
	static int freePlaces ;
	
	
	public Business(String firstName, String LastName,int price,String specialFood) {
		super(firstName, LastName,price);
		this.specialFood=specialFood;
	}
	
	public void buyBisinessClassTicket(List<Seat> seatsList,Business business){
		
		
			for (Seat seat : seatsList) {
				if(totalPlaces > 0) {
				totalPlaces--;
				System.out.println(" Free Places :" + totalPlaces  + " " + business.getFirstName() + " "+ business.getLastName());
				}
				else{
					System.out.println("Not free tickets");
				}
			}	
	}
}
