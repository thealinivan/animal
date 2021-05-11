package animal;

public class Acvatic extends Animal {

	int swimmingExtensions;
	
	public Acvatic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Acvatic(String name, boolean predator, int speed, int swimmingExtensions) {
		super(name, predator, speed);
		// TODO Auto-generated constructor stub
		this.swimmingExtensions = swimmingExtensions;
	}
	public int getSwimmingExtensions() {
		return swimmingExtensions;
	}
	public void setSwimmingExtensions(int swimmingExtensions) {
		this.swimmingExtensions = swimmingExtensions;
	}
	
	

}
