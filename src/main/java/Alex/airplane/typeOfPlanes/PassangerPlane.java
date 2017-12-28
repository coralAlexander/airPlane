package Alex.airplane.typeOfPlanes;

import Alex.airplane.Plane;

public class PassangerPlane extends Plane {

	int numOfPassangers ;
	
	
	public PassangerPlane(String modelName, String modelSerialNamber, int weght, String color, int MaxSpeed,double tank , int numOfPassangers) {
		super(modelName, modelSerialNamber, weght, color, MaxSpeed, tank);
		this.numOfPassangers=numOfPassangers;
	}

}
