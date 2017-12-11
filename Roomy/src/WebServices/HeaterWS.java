package WebServices;
import Devices.Heater;

public class HeaterWS {
	static Heater heater = new Heater(1);
	
	public void turnOnHeater() {
		HeaterWS.heater.turnOn();
	}
	
	public void turnOffHeater() {
		HeaterWS.heater.turnOff();
	}
	
	public boolean getHeaterState() {
		return HeaterWS.heater.isOn();
	}
}
