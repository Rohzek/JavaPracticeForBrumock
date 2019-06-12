package com.gmail.rohzek.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class AlphabeticalReturnTextMultipleToFile 
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
			System.out.println("Printing alphabetical sorted text to output.txt file"); // Space the input from the output
			
			PrintWriter printWriter = new PrintWriter(new FileWriter("output.txt"));

		    for(String text : reply) 
		    {
		    	printWriter.println(text);
		    }

		    printWriter.close();  // no need to flush, since close() does it anyway.
		}
		// Can put multiple catches to one try
		catch (FileNotFoundException e) 
		{
			System.out.println("Please create a file called 'input.txt' and fill it with text");
		}
		catch (IOException e) 
		{
		       e.printStackTrace();
		}
	}
}
