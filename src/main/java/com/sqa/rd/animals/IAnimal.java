/**
 * File Name: IAnimal.java<br>
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

public interface IAnimal {

	public abstract int calcWeight(int height);

	public abstract String getName();

	public abstract void makeSound();

	public abstract void move();
}
// Make sound
