/**
 * File Name: IAnimal.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor<br>
 * Created: Dec 2, 2015
 */
package com.sqa.jf.animals;

/**
 * IAnimal //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public interface IAnimal {

	public abstract int calcWeight(int height);

	public abstract String getName();

	public abstract void makeSound();

	public abstract void move();
}
