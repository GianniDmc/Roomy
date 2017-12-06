package Devices;

public class TemperatureExt {
	
	private float temperature;
	private int id;
	
	TemperatureExt()
	{
		temperature = 0;
	}
	
	public float getTemp()
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
