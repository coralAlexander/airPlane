package Alex.airplane;

import java.util.Date;

public class FlyCard {
	
	String distanation;
	int range ;
	double timeInFly;

	public FlyCard(String distanation,int range,double timeInFly) {
		this.distanation=distanation;
		this.range=range;
		this.timeInFly=timeInFly;
	}

	public String getDistanation() {
		return distanation;
	}

	public void setDistanation(String distanation) {
		this.distanation = distanation;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getTimeInFly() {
		return timeInFly;
	}

	public void setTimeInFly(double timeInFly) {
		this.timeInFly = timeInFly;
	}

	@Override
	public String toString() {
		return "FlyCard [distanation=" + distanation + ", range=" + range + ", timeInFly=" + timeInFly + "]";
	}
	
}
