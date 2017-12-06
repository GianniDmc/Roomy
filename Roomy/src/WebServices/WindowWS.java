package WebServices;

import Devices.Window ;

public class WindowWS {
	Window window = new Window(0);
	
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
