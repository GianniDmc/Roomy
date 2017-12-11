package WebServices;

import Devices.Window ;

public class WindowWS {
	
	static Window window = new Window(0);
	
	
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
}
