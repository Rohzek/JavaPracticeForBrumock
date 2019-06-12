package com.gmail.rohzek.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AlphabeticalReturningTextMultiple 
{
	public static void main (String[] args) 
	{
		Scanner scanner;
		List<String> reply = new ArrayList<String>();
		
		try 
		{
			scanner = new Scanner(new File("input.txt"));
			
			while (scanner.hasNextLine()) 
			{
				reply.add(scanner.nextLine());
			}
			
			Collections.sort(reply); // Sorts list to alphabetical order
			//Collections.sort(reply, Collections.reverseOrder()); // Sorts list to reverse alphabetical order
			
			// Print replies one at a time, each on a new line.
			System.out.println("\nYou entered (Sorted to alphabetical order):\n"); // Space the input from the output
			
			for(String text : reply) 
			{
				System.out.println(text);
			}
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Please create a file called 'input.txt' and fill it with text");
		}
	}
}
