package com.gmail.rohzek.practice;

import java.util.*;

public class ReturningTextMultiple 
{
	@SuppressWarnings("resource")
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		List<String> reply = new ArrayList<String>();
		boolean loop = true;
		
		System.out.println("Type sentences to be returned back to you.");
		System.out.println("Type /quit or /exit to stop.\n");
		
		while(loop)  
		{
			String sentence = scanner.nextLine();
			
			if(sentence.equalsIgnoreCase("/quit") || sentence.equalsIgnoreCase("\\quit") || sentence.equalsIgnoreCase("/exit") || sentence.equalsIgnoreCase("\\exit")) 
			{
				loop = false;
				break;
			}	
			
			if(sentence.equalsIgnoreCase("/help") || sentence.equalsIgnoreCase("\\help")) 
			{
				System.out.println("\nType sentences to be returned back to you.");
				System.out.println("Type /quit or /exit to stop.\n");
			}
			
			// Skip all 'control' messages, and add text to reply list
			if(!sentence.startsWith("/") && !sentence.startsWith("\\")) 
			{
				reply.add(sentence);
			}
		}
		
		// Print replies one at a time, each on a new line.
		System.out.println("\nYou said:\n"); // Space the input from the output
		
		for(String text : reply) 
		{
			System.out.println(text);
		}
	}
}
