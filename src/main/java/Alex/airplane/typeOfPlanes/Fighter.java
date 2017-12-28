package Alex.airplane.typeOfPlanes;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import Alex.airplane.FlyCard;
import Alex.airplane.Plane;

public class Fighter extends Plane {
	
	Map <String,Integer> map =new HashMap<String, Integer>();
	private int numOfCannons;
	private int numOfRockets;
	
	
	public Fighter(String modelName, String modelSerialNamber, int weght, String color ,int speed,double tank ,int numOfCannons,int numOfRockets) {
		super(modelName, modelSerialNamber, weght, color , speed,tank);
		this.numOfCannons=numOfCannons;
		this.numOfRockets=numOfRockets;
	}
	
	@Override
	public  Map<String, Integer> fly (String modelName , int speed ) {
		map.put(modelName, speed);
		System.out.println(map);
		return map;
	}
	
	@Override
	public int fuelLeft(FlyCard flyCard) {	
	int fuel = 0 ;	
	int range = flyCard.getRange();
	double timeFly = flyCard.getTimeInFly()	;
	
	fuel = (int) (range * timeFly);
 
    System.out.println(flyCard.toString()+ "  fuel :"  + fuel);	 
	return fuel;
	}
	
	public Map<String, Integer> getMap() {
		return map;
	}
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	public int getNumOfCannons() {
		return numOfCannons;
	}
	public void setNumOfCannons(int numOfCannons) {
		this.numOfCannons = numOfCannons;
	}
	
	public int getNumOfRockets() {
		return numOfRockets;
	}

	public void setNumOfRockets(int numOfRockets) {
		this.numOfRockets = numOfRockets;
	}

	@Override
	public String toString() {
		return "Fighter [map=" + map + ", numOfCannons=" + numOfCannons + "]";
	}
	
	
}
