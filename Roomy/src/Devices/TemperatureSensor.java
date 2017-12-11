package Devices;

public class TemperatureSensor {
	
	private double temperature;
	private int id;
	
	public TemperatureSensor(int newId)
	{
		id = newId;
		temperature = 0.0;
	}
	
	public double temperature()
	{
		return temperature;
	}
	
	public void setTemp(float temp)
	{
		temperature = temp;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int newId)
	{
		id = newId;
	}
}
