package com.examples;

/**
 *  Demonstrates the declaration and the
 *  printing of contents of an array of integers
 *
 *  @author Nikos K
 *  @version 1.1
 *
 */
public class ArrayDemo
{

	public static void main(String[] args)
	{
		int[] anArray = {100, 200, 300, 400, 500,
				600, 700, 800, 900, 1000};
		
		// Print the array values.
		for (int index = 0; index < anArray.length; index++)
		{
			System.out.println("Element at index " + (index + 1 )+ ": " + anArray[index]);
		}
	}
}
