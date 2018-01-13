import java.util.ArrayList;


public abstract class Animal { 
	
	public Animal(String aAge, String aColor, String aType, int aWeight, int aMinimumWeight){
			
		age = aAge;
		color = aColor;
		type = aType;
		weight = aWeight;
		minimumWeight = aMinimumWeight;
		
	}
	
	//added a few gets below to add info to my outputs 
	
	public void eat(){
		weight = weight+1;
	}
	
	public String getAge() {
		return age;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getType() {
		return type;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public int getMinWeight() {
		return minimumWeight;
	}
	
	public void setWeight(int sWeight){  //to be used when animals move
		weight = sWeight;
	}

	public String output(){
		return "This " + getType() + " is " + getAge() + " year(s) old and weighs " + getWeight() + " lbs.";
				
	}

//main method will test all code I wrote
	public static void main(String [] args) {
		
		Fish animal1 = new Fish("1","gold","fish",5,1);
		Mammal animal2 = new Mammal("15","brown","mammal",90,45);
		Bird animal3 = new Bird("8","red","bird",10,4);
		
		
		ArrayList <Animal> aList = new ArrayList<Animal>();
		
		aList.add(animal1);
		aList.add(animal2);
		aList.add(animal3);

//print out the contents of the array list using the output method.  Do this after every change so that we can observe the changes.
		for (int i = 0; i < aList.size(); i++) {
			if (aList.get(i) != null) {
				System.out.println(aList.get(i).output());
			}
		}

		
//test methods specific to the sub classes
		animal1.swim();  //the fish swims a bit
		animal2.run();  //the mammal runs a bit
		animal3.fly();  //the bird flys a bit
		
		for (int i = 0; i < aList.size(); i++) {
			if (aList.get(i) != null) {
				System.out.println(aList.get(i).output());
			}
		}
		
		System.out.println("All of the animal lost a bit of weight by moving!");

//fed of each of the animals using eat
		for (int i = 0; i < aList.size(); i++) {
			if (aList.get(i) != null) {
				aList.get(i).eat();
			}
				
		}

		
//check the current state again
		for (int i = 0; i < aList.size(); i++) {
			if (aList.get(i) != null) {
				System.out.println(aList.get(i).output());
			}
		}
		
		System.out.println("The animals were fed and gained some weight back!");
		
	}
	
	
	
	
	//private variables for class Animal
	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;
}


//Fish class
class Fish extends Animal{
	public Fish(String aAge, String aColor, String aType, int aWeight, int aMinimumWeight) {
		super (aAge, aColor, aType, aWeight, aMinimumWeight);
		aType = "fish";  //I decided to just set this variable after the fact.  I am not sure if there is a more eloquent way of doing this.			
	}
	
	public void swim() {
		int fishWeight = getWeight();
		int fishMin = getMinWeight();
		
		if (fishWeight <= fishMin) {  //catch if there is not enough weight left to support movement
			System.out.println("The fish needs to eat before it can swim more!");
		}
		else {
			setWeight(fishWeight-1);
			System.out.println("The fish swam a bit an lost some weight!");
		}	
		
	}	
}


//Mammal class
class Mammal extends Animal{
	public Mammal(String aAge, String aColor, String aType, int aWeight, int aMinimumWeight) {
		super (aAge, aColor, aType, aWeight, aMinimumWeight);
		aType = "mammal";			
	}
	
	public void run() {
		int mamWeight = getWeight();
		int mamMin = getMinWeight();
		
		if (mamWeight <= mamMin) {
			System.out.println("The mammal needs to eat before it can run more!");
		}
		else {
			setWeight(mamWeight-1);
			System.out.println("The mammal ran a bit an lost some weight!");
		}	
		
	}	
}

//Bird class
class Bird extends Animal{
	public Bird(String aAge, String aColor, String aType, int aWeight, int aMinimumWeight) {
		super (aAge, aColor, aType, aWeight, aMinimumWeight);
		aType = "bird";			
	}
	
	public void fly() {
		int brdWeight = getWeight();
		int brdMin = getMinWeight();
		
		if (brdWeight <= brdMin) {
			System.out.println("The bird needs to eat before it can fly more!");
		}
		else {
			setWeight(brdWeight-2);
			System.out.println("The bird flew a bit an lost some weight!");
		}
		
	}	
}