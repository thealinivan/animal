package animal;

public class Animal implements Action, Sustenance, Proximity {
	String name;
	boolean predator;
	int speed;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String name, boolean predator, int speed) {
		super();
		this.name = name;
		this.predator = predator;
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPredator() {
		return predator;
	}
	public void setPredator(boolean predator) {
		this.predator = predator;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	//Interfaces methods
	
	
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + " started eating...");
	}
	public void stopEating() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + " stoped eating...");
		
	}
	
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + " started moving with " + this.getSpeed() + "km/h");
	}
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + " stopped moving...");
	}

	public void proximity() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + " is in the proximity!");
	}


	
	
	
	
	
}
