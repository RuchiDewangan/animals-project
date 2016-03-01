/**
 * File Name: AnimalArray.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor<br>
 * Created: Dec 2, 2015
 */
package com.sqa.jf.animals;

import java.util.Scanner;

import org.junit.Test;

/**
 * AnimalArray //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class AnimalArrayTest {

	@Test
	public void test() {
		System.out.println("Performing a test.");
		// Animal animal = new Animal("Dog", "Spot", "4", 6, false, false);
		// System.out.println("Animal:" + animal);
		// Ask the suer how many animals they would like to create
		System.out.print("How many animals would you like to create:");
		// Create a Scanner object
		Scanner scanner = new Scanner(System.in);
		// Store the number of animals to create in a variable
		int numOfAnimals = Integer.parseInt(scanner.nextLine());
		// Create an array of Animals with specified count
		Animal[] animals = new Animal[numOfAnimals];
		// Create Animal Objects
		for (int i = 0; i < animals.length; i++) {
			animals[i] = new Animal();
		}
		// Display Animal Objects
		for (Animal animal : animals) {
			System.out.println(animal);
		}
	}
}
