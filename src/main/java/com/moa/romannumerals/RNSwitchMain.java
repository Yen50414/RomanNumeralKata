package com.moa.romannumerals;

import java.util.Scanner;

public class RNSwitchMain {
	
	private static RNSwitch rnSwitch;
	
	public static boolean isNumber(String str)
	{
	    for (char c : str.toCharArray())
	    {
	        if (!Character.isDigit(c)) {
	        	return false;
	        }
	    }
	    return true;
	}
	
	private static void printAll() {
		int maxValue = 4000;
		
		for (int i = 0; i <= maxValue; i++) {
			String result = rnSwitch.arabicToRoman(i);
			System.out.println(i + " = " + result);
		}
	}

	public static void main(String[] args) {
		rnSwitch = new RNSwitch();
		
		try (Scanner scanner = new Scanner(System.in)) {
			String input = "";
			while (true) {
				System.out.print("Enter a number or PRINT: ");
				input = scanner.next();
				if (input.equalsIgnoreCase("q")) {
					System.out.println("Program Terminated.");
					break;
				} else if (input.equalsIgnoreCase("PRINT")) {
					printAll();
				} else if (isNumber(input)) {
					System.out.println(input + " = " + rnSwitch.arabicToRoman(Integer.parseInt(input)));
				} else {
					System.out.println("Unaccepted Input.");
				}
			}
		}
	}
}
