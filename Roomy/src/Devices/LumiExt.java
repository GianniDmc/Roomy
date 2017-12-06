package Devices;

public class LumiExt {
	int id;
	int luminosity;
	
	public int getId(){
		return this.id;
	}
	
	public int getLuminosity(){
		return this.luminosity;
	}
	
	public void setId(int value){
		this.id = value;
	}
	
	//Pour les test, on peut affecter une valeur au capteur
	public void setLuminosity(int value){
		this.luminosity = value;
	}
}
