package busReservation;

public class Bus {
	private int busNO;
	private boolean AC;
	private int capacity;
	
	Bus(int no,boolean ac,int capacity){
		this.busNO=no;
		this.AC = ac;
		this.capacity = capacity;
	}
	
	//public getter method
	public int getBusNo() {
		return busNO;
	}
	public boolean getAC() {
		return AC;
	}
	public int getCapacity() {
		return capacity;
	}
	
	//public setter method
	public void setAC(boolean val) {
		AC=val;
	}
	public void setCapacity(int c) {
		capacity = c;
	}
	
	//display method
	public void displayBusInfo() {
		System.out.println("Bus No: "+busNO+" AC: "+AC+" Capacity: "+capacity);
	}
}
