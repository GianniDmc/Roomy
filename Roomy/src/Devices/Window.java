package Devices;

public class Window {
	int id ;
	boolean isOpen ;
	
	public Window(int newId)
	{
		id = newId;
		isOpen = false;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	public void open() 
	{
		isOpen = true ;
	}
	
	public void close() 
	{
		isOpen = false;
	}
}
