package Devices;

public class Heater {
	int id ;
	boolean isOn ;
	
	public Heater(int newId)
	{
		id = newId;
		isOn = false;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean getIsOn() {
		return isOn;
	}
	public void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}
	
	public void turnOn()
	{
		isOn = true;
	}
	
	public void turnOff()
	{
		isOn = false;
	}
	
}
