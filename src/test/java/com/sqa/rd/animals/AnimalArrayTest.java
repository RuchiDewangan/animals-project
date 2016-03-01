/**
 * File Name: AnimalAray.java<br>
 * Dewangan, Ruchi<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Dec 2, 2015
 */
package com.sqa.rd.animals;

/**
 * AnimalAray //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Dewangan, Ruchi
 * @version 1.0.0
 * @since 1.0
 */
import java.util.Scanner;

import org.junit.Test;

public class AnimalArrayT12est {

	@Test
	public void test() {
		System.out.println("Performing a test");
		// fail("Not yet implemented")
		// Animal animal = new Animal("4", "spot", "Dog", 4, false, false);
		// System.out.println("Animal:" + animal);
		// Ask the user how many animals they would like to create
		System.out.println("How amny animals would you like to create:");
		// Create a Scanner object
		Scanner scanner = new Scanner(System.in);
		// store the number of animals to create in a variable
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
