/**
 * File Name: Animal.java<br>
 * Dewangan, Ruchi<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Dec 2, 2015
 */
// Day 8 Warm-Up Exercise: An Array of Animals
// Create an application that contains an array of Animal objects. The
// application should request the number of Animals to add to application. It
// then should create an array of Animal objects. The Animal Class should have
// the following properties:
// String name;
// String age;
// int numOfLegs;
// boolean canSwim;
// boolean canFly;
// Remember to create private fields, override the toString() method, and create
// a Constructor.
package com.sqa.rd.animals;

import java.util.Scanner;

// ur IAnimal must be present under Animal
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

	public Animal(String name, String type, String age, int numOfLegs, boolean canSwim, boolean canFly) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
		this.numOfLegs = numOfLegs;
		this.canSwim = canSwim;
		this.canFly = canFly;
	}

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

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
	}

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
		return "Animal [name=" + this.name + ", type=" + this.type + ", age=" + this.age + ", numOfLegs=" + this.numOfLegs + ", canSwim="
				+ this.canSwim + ", canFly=" + this.canFly + "]";
	}

	private void requestAnimalValues() {
		//
		Scanner scanner = new Scanner(System.in);
		System.out.println("What kindof animal would you like");
		this.setType(scanner.nextLine());
		System.out.println("What is this aniaml name:");
		this.setName(scanner.nextLine());
		System.out.println("How many legs does " + this.getName() + "have:");
		this.setNumOfLegs(Integer.parseInt(scanner.nextLine()));
		System.out.println("How old is " + this.getName() + ":");
		this.setAge(scanner.nextLine());
		System.out.println("Can " + this.getName() + "fly(true/false):");
		this.setCanFly(Boolean.parseBoolean(scanner.nextLine()));
		System.out.println("Can " + this.getName() + " swim(true/false):");
		this.setCanSwim(Boolean.parseBoolean(scanner.nextLine()));
	}
}
