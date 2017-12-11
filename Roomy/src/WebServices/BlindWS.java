package WebServices;

import Devices.Blind;

public class BlindWS {
	static Blind blind = new Blind(0);
	
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
}
