package Alex.airplane.ticket;

import Alex.airplane.Seat;

public abstract class Ticket  {

	int price;
	String firstName;
	String LastName;
	
	public Ticket (String firstName,String LastName,int price){
		this.firstName=firstName;
		this.LastName=LastName;
		this.price=price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
	
}
