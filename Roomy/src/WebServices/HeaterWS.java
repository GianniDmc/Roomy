package WebServices;
import Devices.Heater;

public class HeaterWS {
	static Heater heater;
	
	public void turnOnHeater() {
		HeaterWS.heater.turnOn();
	}
	
	public void turnOffHeater() {
		HeaterWS.heater.turnOff();
	}
}
