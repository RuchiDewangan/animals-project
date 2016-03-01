/**
 * File Name: Animal.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor<br>
 * Created: Dec 2, 2015
 */
package com.sqa.jf.animals;

import java.util.Scanner;

/**
 * Animal //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class Animal implements IAnimal {

	private String age;

	private boolean canFly;

	private boolean canSwim;

	private String name;

	private int numOfLegs;

	private String type;

	public Animal() {
		// default constructor
		this.requestAnimalValues();
	}

	public Animal(String type, String name, String age, int numOfLegs, boolean canFly, boolean canSwim) {
		super();
		this.age = age;
		this.canFly = canFly;
		this.canSwim = canSwim;
		this.name = name;
		this.numOfLegs = numOfLegs;
		this.type = type;
	}

	/**
	 * @see com.sqa.jf.animals.IAnimal#calcWeight(int)
	 */
	@Override
	public int calcWeight(int height) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getAge() {
		return this.age;
	}

	@Override
	public String getName() {
		return this.name;
	}

	public int getNumOfLegs() {
		return this.numOfLegs;
	}

	public String getType() {
		return this.type;
	}

	public boolean isCanFly() {
		return this.canFly;
	}

	public boolean isCanSwim() {
		return this.canSwim;
	}

	/**
	 * @see com.sqa.jf.animals.IAnimal#makeSound()
	 */
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see com.sqa.jf.animals.IAnimal#move()
	 */
	@Override
	public void move() {
		// TODO Auto-generated method stub
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Animal [age=" + this.age + ", canFly=" + this.canFly + ", canSwim=" + this.canSwim + ", name="
				+ this.name + ", numOfLegs=" + this.numOfLegs + ", type=" + this.type + "]";
	}

	/**
	 *
	 */
	private void requestAnimalValues() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("What kind of animal would you like:");
		this.setType(scanner.nextLine());
		System.out.print("What is this animals name:");
		this.setName(scanner.nextLine());
		System.out.print("How many legs does " + this.getName() + " have:");
		this.setNumOfLegs(Integer.parseInt(scanner.nextLine()));
		System.out.print("How old is " + this.getName() + ":");
		this.setAge(scanner.nextLine());
		System.out.print("Can " + this.getName() + " fly (true/false):");
		this.setCanFly(Boolean.parseBoolean(scanner.nextLine()));
		System.out.print("Can " + this.getName() + " swim (true/false):");
		this.setCanSwim(Boolean.parseBoolean(scanner.nextLine()));
	}
}
