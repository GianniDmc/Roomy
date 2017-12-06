package Devices;

public class PresenceSensor {
	int id ;
	boolean presence ;
	
	public PresenceSensor(int newId)
	{
		id = newId;
		presence = false;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isPresence() {
		return presence;
	}
	public void setPresence(boolean presence) {
		this.presence = presence;
	}
	
	
}
