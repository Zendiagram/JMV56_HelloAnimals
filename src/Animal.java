import java.util.ArrayList;


public class Animal { 
	
	public Animal(String aAge, String aColor, String aType, int aWeight, int aMinimumWeight){
			
		age = aAge;
		color = aColor;
		type = aType;
		weight = aWeight;
		minimumWeight = aMinimumWeight;
		
	}
	
	public void eat(){
		weight = weight++;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public int getMinWeight() {
		return minimumWeight;
	}
	
	public void setWeight(int sWeight){
		weight = sWeight;
	}

	public String output(){
		// gonna put something here at some point
		String a = new String();
				a = "This is a placeholder";
				
		return a;
				
	}
	
	public static void main(String [] args) {
		
		Animal animal1 = new Animal("4","Brown","Horse",120,60);
		
		ArrayList<Animal> aList = new ArrayList<Animal>();
		
		aList.add(animal1);
		
		System.out.println(animal1.weight + animal1.age + animal1.color + animal1.type);
	}
	
	
	
	
	//private variables for class Animal
	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;
}

class Fish extends Animal{
	public Fish(String aAge, String aColor, String aType, int aWeight, int aMinimumWeight) {
		super (aAge, aColor, aType, aWeight, aMinimumWeight);
		aType = "fish";			
	}
	
	public void swim(Fish fish1) {
		Fish f1 = fish1;
		int fishWeight = f1.getWeight();
		int fishMin = f1.getMinWeight();
		
		if (fishWeight <= fishMin) {
			System.out.println("The fish needs to eat before it can swim more!");
		}
		else {
			f1.setWeight(fishWeight--);
		}	
		
	}	
}

class Mammal extends Animal{
	public Mammal(String aAge, String aColor, String aType, int aWeight, int aMinimumWeight) {
		super (aAge, aColor, aType, aWeight, aMinimumWeight);
		aType = "mammal";			
	}
	
	public void run(Mammal mammal1) {
		Mammal m1 = mammal1;
		int mamWeight = m1.getWeight();
		int mamMin = m1.getMinWeight();
		
		if (mamWeight <= mamMin) {
			System.out.println("The mammal needs to eat before it can run more!");
		}
		else {
			m1.setWeight(mamWeight--);
		}	
		
	}	
}

class Bird extends Animal{
	public Bird(String aAge, String aColor, String aType, int aWeight, int aMinimumWeight) {
		super (aAge, aColor, aType, aWeight, aMinimumWeight);
		aType = "bird";			
	}
	
	public void fly(Bird brd1) {
		Bird b1 = brd1;
		int brdWeight = b1.getWeight();
		int brdMin = b1.getMinWeight();
		
		if (brdWeight <= brdMin) {
			System.out.println("The bird needs to eat before it can fly more!");
		}
		else {
			b1.setWeight(brdWeight--);
		}	
		
	}	
}