package Alex.airplane.typeOfPlanes;

import java.util.Map;

import Alex.airplane.Plane;

public class TransportPlane extends Plane {

	int paletNumbers;
	
	public TransportPlane(String modelName, String modelSerialNamber, int weght, String color, int MaxSpeed,double tank,int paletNumbers ) {
		super(modelName, modelSerialNamber, weght, color, MaxSpeed, tank);
		
		this.paletNumbers=paletNumbers;
	}

	@Override
	public Map<String, Integer> fly(String modelName ,int speed ) {
		
		return null;
	}
	
}
