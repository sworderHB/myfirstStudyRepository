package com.interview;

public class TestArray
{
	public static void main(String[] args)
	{
		int[] myArray = new int[3];
		myArray[0] = 11;
		myArray[1] = 22;
		myArray[2] = 33;
		System.err.println(myArray.length);
		for (int i = 0; i < myArray.length; i++)
		{
			System.err.println(myArray[i]);
		}
		
		myArray = new int[6];
		System.err.println(myArray.length);
		for (int i = 0; i < myArray.length; i++)
		{
			System.err.println(myArray[i]);
		}
	}
}
