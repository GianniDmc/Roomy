package WebServices;

import Devices.PresenceSensor;

public class PresenceSensorWS {
	static PresenceSensor presenceSensor = new PresenceSensor(6);
	
	public boolean getPresence() 
	{
		return presenceSensor.isPresence();
	}

}
