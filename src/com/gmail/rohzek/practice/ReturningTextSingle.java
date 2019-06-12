package com.gmail.rohzek.practice;

import java.util.Scanner;

public class ReturningTextSingle 
{
	@SuppressWarnings("resource")
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in); // Scanner is used to collect input
		boolean loop = true;
		
		System.out.println("Type a sentence to be returned back to you.");
		System.out.println("Type /quit or /exit to close program.");
		
		while(loop) // Loop until we choose to break it
		{
			String sentence = scanner.nextLine(); // Here we collect the next line of strings
			
			if(sentence.equalsIgnoreCase("/quit") || sentence.equalsIgnoreCase("\\quit") || sentence.equalsIgnoreCase("/exit") || sentence.equalsIgnoreCase("\\exit")) 
			{
				loop = false;
				break;
			}	
			
			if(sentence.equalsIgnoreCase("/help") || sentence.equalsIgnoreCase("\\help")) 
			{
				System.out.println("\nType a sentence to be returned back to you.");
				System.out.println("Type /quit or /exit to close program.\n");
			}
			
			if(!sentence.startsWith("/") && !sentence.startsWith("\\")) 
			{
				System.out.println('\n' + sentence + '\n');
			}
		}
	}
}
