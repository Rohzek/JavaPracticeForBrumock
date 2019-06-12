package com.gmail.rohzek.practice;

import java.util.Scanner;

public class SimpleReturningTextSingle 
{
	@SuppressWarnings("resource")
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in); // Scanner is used to collect input
		
		System.out.println("Type a sentence to be returned back to you.");
		String sentence = scanner.nextLine(); // Here we collect the next line of strings
		System.out.println('\n' + sentence + '\n');

	}
}
