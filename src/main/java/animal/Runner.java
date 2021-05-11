package animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal lion = new Terrestrial("Lion", true, 95, 4);
		Animal eagle = new Aerial("Eagle", true, 120, 2);
		Animal shark = new Acvatic("Shark", true, 115, 3);
		Animal tiger = new Terrestrial("Tiger", true, 70, 4);
		
		
		Animal antilope = new Terrestrial("Antilope", false, 90, 4);
		Animal bird = new Aerial("Bird", false, 60, 2);
		Animal littleFish = new Acvatic("Little Fish", false, 90, 4);
		Animal babyAntilope = new Terrestrial("BabyAntilope", false, 40, 4);
	
		ArrayList<Animal> animals= new ArrayList<Animal>();
		animals.add(lion);
		animals.add(eagle);
		animals.add(shark);
		animals.add(tiger);
		animals.add(antilope);
		animals.add(bird);
		animals.add(littleFish);
		animals.add(babyAntilope);
		

		
		wildBehaviour(getAnimals(getUserInput()[0], getUserInput()[1], animals).get(0), 
				getAnimals(getUserInput()[0], getUserInput()[1], animals).get(1));
		
	}
	
	//get user input
	public static String[] getUserInput() {
		Scanner sc = new Scanner(System.in);
		
		String[] output = {};
		
		System.out.println("Enter the hunter (lion, eagle, shark or tiger) : ");
		String hnt = sc.nextLine();
		System.out.println("Enter the prade (antilope, bird, littleFish or babyAntilope) : ");
		String prd = sc.nextLine();
		
		output[0] = hnt;
		output[1] = prd;
		return output;
	}
	
	//get animals from db
	public static ArrayList<Animal> getAnimals(String hunter, String prade, ArrayList<Animal> animals) {
		ArrayList<Animal> output= new ArrayList<Animal>();
		Animal h = null, p = null;
		for (Animal a : animals) {
			if (a.isPredator()) {
				if (a.getName().equals(hunter)) {
					output.add(0, a);
				} else if (a.getName().equals(prade)) {
					output.add(1, a);
				}
			} else {
				System.out.println("Either hunter or prade does not exist in the database !");
			}
				
		}
		return output;
	}

	//sort out interaction
	public static void wildBehaviour(Animal hunter, Animal prade) {
		prade.eat();
		hunter.proximity();
		prade.move();
		hunter.move();
		System.out.println("---");
		if (hunter.getClass() == Terrestrial.class && prade.getClass() == Terrestrial.class) {
			if (hunter.getSpeed() > prade.getSpeed()) {
				System.out.println(hunter.getName() + " is faster than the " + prade.getName());
				System.out.println(prade.getName() + " has been catched by the " + hunter.getName());
			} else { 
				System.out.println(prade.getName() + " is faster than the " + hunter.getName());
				System.out.println(prade.getName() + " has escaped from being killed by the " + hunter.getName());
			}
		} else {
			System.out.println("Different environments -> No interaction");
		}
		
	}
	
}
