package WebServices;

import Devices.TemperatureSensor;
import Devices.Window;

public class TempWindowWS {

	static Window window = new Window(10);
	static TemperatureSensor tempSensor = new TemperatureSensor(11);
	
	
	public double getTemperature()
	{
		return tempSensor.temperature();
	}
	
	public void setTemperature(double temp)
	{
		tempSensor.setTemp(temp);
	}
	
	public void openWindow() {
		window.open();
	}
	
	public void closeWindow() {
		window.close();
	}
	
	public boolean getWindowState()
	{
		return window.isOpen();
	}
	
	public void launchScenarioOnce()
	{
		if(getTemperature() > 20.0)
		{
			if(getWindowState() == false)
			{
				openWindow();
			}
		}
		else
		{
			if(getWindowState() == true)
			{
				closeWindow();
			}
		}
	}	
}
