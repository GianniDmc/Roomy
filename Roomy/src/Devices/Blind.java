package Devices;

public class Blind {
	int id;
	boolean isOpen;
	
	public Blind(int num) {
		this.id = num;
		this.isOpen = false;
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
	
	public void open() {
		this.isOpen = true;
	}
	
	public void close() {
		this.isOpen = false;
	}
}
