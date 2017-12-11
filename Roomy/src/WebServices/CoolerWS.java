package WebServices;
import Devices.Cooler;

public class CoolerWS {
static Cooler cooler = new Cooler(4);
	
	public void turnOnHeater() {
		CoolerWS.cooler.turnOn();
	}
	
	public void turnOffHeater() {
		CoolerWS.cooler.turnOff();
	}
	
	public boolean getHeaterState() {
		return CoolerWS.cooler.isOn();
	}
}