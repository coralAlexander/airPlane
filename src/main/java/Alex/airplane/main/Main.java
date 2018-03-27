package Alex.airplane.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Alex.airplane.FlyCard;
import Alex.airplane.Seat;
import Alex.airplane.flightClass.Business;
import Alex.airplane.typeOfPlanes.Fighter;

public class Main {

	public static void main(String[] args) {
		//FlyCard flyCard = new FlyCard("Los Angles", 10000, 12);
		//Fighter f16 = new Fighter("F-16", "12345", 4000, "Blue", 1300, 4);
		//f16.fuelLeft(flyCard);
		//System.out.println((f16.fly(f16.getModelName(),f16.getSpeed())));
		
		/*Map <String , Object> map = new HashMap<String, Object>();
		
		Fighter f16 = new Fighter("F-16", "12345", 4000, "Blue", 1300, 4);
		Fighter f22= new Fighter("F-22", "54321", 6000, "Red", 2000, 8);
		
		map.put(f16.getModelName(), f16.fly(f16.getModelName(), f16.getSpeed()));
		map.put(f22.getModelName(), f22);
		
		map.forEach((key, value) -> System.out.println(key + " : " + value));*/
		
		Seat seat1 = new Seat("A", 44);
		Seat seat2 = new Seat("B", 55);
		Seat seat3 = new Seat("C", 55);
		
		List<Seat> seatsList = new ArrayList<Seat>(); 
		seatsList.add(seat1);
		seatsList.add(seat2);
		seatsList.add(seat3);
		
		System.out.println(seatsList);
		
		Business business = new Business("Vasa", "Cuk",22, "Banna");
		
		business.buyBisinessClassTicket(seatsList,business);
		
		
	}

}
