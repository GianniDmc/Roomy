package WebServices;

import Devices.Blind;
import Devices.LuminositySensor;

public class LumiBlindWS {

	static LuminositySensor luminositySensor = new LuminositySensor(12);
	static Blind blind = new Blind(13);
	
	public int getLuminosity() 
	{
		return luminositySensor.getLuminosity();
	}
	
	public void setLuminosity(int value)
	{
		luminositySensor.setLuminosity(value);
	}
	
	public void openBlind() 
	{
		blind.open();
	}
	
	public void closeBlind() 
	{
		blind.close();
	}
	
	public boolean getBlindState() 
	{
		return blind.isOpen();
	}
	
	public void launchScenarOnce()
	{
		int lumi = getLuminosity();
		// Si luminosite exterieure superieure a un certain seuil on ouvre les volets
		if(lumi > 10)
		{
			if(getBlindState() == false)
			{
				openBlind();
			}
		}
		else if(lumi < 2)
		{
			if(getBlindState() == true)
			{
				closeBlind();
			}
		}
	}
}
