package animal;

public class Aerial extends Animal {

	int wings;
	
	public Aerial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aerial(String name, boolean predator, int speed, int wings) {
		super(name, predator, speed);
		// TODO Auto-generated constructor stub
		this.wings = wings;
	}
	public int getWings() {
		return wings;
	}
	public void setWings(int wings) {
		this.wings = wings;
	}
	
	
	
}
