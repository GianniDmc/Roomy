package WebServices;

import Devices.TemperatureSensor;

public class TemperatureSensorWS {
	static TemperatureSensor tempSensor = new TemperatureSensor(3);
	
	public double getTemperature()
	{
		return tempSensor.temperature();
	}
	
	public void setTemperature(double temp)
	{
		tempSensor.setTemp(temp);
	}
}