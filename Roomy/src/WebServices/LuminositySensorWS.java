package WebServices;

import Devices.LuminositySensor;

public class LuminositySensorWS {
	static LuminositySensor luminositySensor = new LuminositySensor(5);
	
	public int getLuminosity() 
	{
		return luminositySensor.getLuminosity();
	}
}
