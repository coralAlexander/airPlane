package Alex.airplane;

import java.util.Map;

public abstract class Plane {
     FlyCard flyCard;
	 String modelName;
	 String modelSerialNamber;
	 int Weght;
	 String color ;
	 int MaxSpeed;
	 double tank; 
	public Plane(String modelName, String modelSerialNamber, int weght , String color,int MaxSpeed, double tank) {
		this.modelName = modelName;
		this.modelSerialNamber = modelSerialNamber;
		this.Weght = weght;
		this.color = color;
		this.MaxSpeed=MaxSpeed;
		this.tank = tank;
	}

	public Map<String, Integer> fly(String modelName ,int speed ) {
		
		return null;
	}

	public int fuelLeft(FlyCard flyCard) {
		return 0;	
	}
	
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelSerialNamber() {
		return modelSerialNamber;
	}

	public void setModelSerialNamber(String modelSerialNamber) {
		this.modelSerialNamber = modelSerialNamber;
	}

	public int getWeght() {
		return Weght;
	}

	public void setWeght(int weght) {
		Weght = weght;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return MaxSpeed;
	}

	public void setSpeed(int MaxSpeed) {
		this.MaxSpeed = MaxSpeed;
	}

	@Override
	public String toString() {
		return "Plane [modelName=" + modelName + ", modelSerialNamber=" + modelSerialNamber + ", Weght=" + Weght
				+ ", color=" + color + ", speed=" + MaxSpeed + "]";
	}
	
	

}
