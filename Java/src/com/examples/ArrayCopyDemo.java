package com.examples;

public class ArrayCopyDemo
{
	public static void main(String args[])
	{
		// Declare a char array containing the word
		// decaffeinated.
		char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
				'i', 'n', 'a', 't', 'e', 'd'};
		
		// Create a char array to containing a part of 
		// the decaffeinated word.
		char[] copyTo = new char[7];
		
		// Call the arrayCopy method.
		/*
			Copy from the third element of the copyFrom array
			and insert it as the first element to the copyTo 
			array and do it for the next six elements (total 7)
		*/
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		
		// Print the char array copyTo as a String.
		System.out.println(copyTo);
	}
}
