package com.examples;

/**
 *  Demonstrates the declaration and the
 *  display of contents of an integer array
 *
 *  @author Nikos K
 *  @version 1.2
 *
 */
public class ArrayDemo {

	public static void main(String[] args) 	{
		int[] intArray = {1, 2, 3, 4, 5};

		// Prints at console the array values
		for (int index = 0; index < intArray.length; index++) {
			System.out.println("Element at index " + (index + 1) + ": " + intArray[index]);
		}
	}
}
