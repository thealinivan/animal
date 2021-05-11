package animal;

public class Terrestrial extends Animal {
	
	int legs;
	
	public Terrestrial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Terrestrial(String name, boolean predator, int speed, int legs) {
		super(name, predator, speed);
		// TODO Auto-generated constructor stub
		this.legs = legs;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	
}
