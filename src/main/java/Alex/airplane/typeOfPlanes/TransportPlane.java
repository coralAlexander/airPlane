package Alex.airplane.typeOfPlanes;

import java.util.Map;

import Alex.airplane.Plane;

public class TransportPlane extends Plane {

	
	
	public TransportPlane(String modelName, String modelSerialNamber, int weght, String color, int MaxSpeed,double tank) {
		super(modelName, modelSerialNamber, weght, color, MaxSpeed, tank);
			
	}

	@Override
	public Map<String, Integer> fly(String modelName ,int speed ) {
		
		return null;
	}
	
}
