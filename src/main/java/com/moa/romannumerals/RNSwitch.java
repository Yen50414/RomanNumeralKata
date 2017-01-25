
package com.moa.romannumerals;

import java.util.ArrayList;

public class RNSwitch {
	
	private ArrayList<String> symbolList;
	private ArrayList<Integer> valueList;
	
	public RNSwitch() {
		symbolList = new ArrayList<String>();
		symbolList.add("M");
		symbolList.add("CM");
		symbolList.add("D");
		symbolList.add("CD");
		symbolList.add("C");
		symbolList.add("XC");
		symbolList.add("L");
		symbolList.add("XL");
		symbolList.add("X");
		symbolList.add("IX");
		symbolList.add("V");
		symbolList.add("IV");
		symbolList.add("I");
		
		valueList = new ArrayList<Integer>();
		valueList.add(1000);
		valueList.add(900);
		valueList.add(500);
		valueList.add(400);
		valueList.add(100);
		valueList.add(90);
		valueList.add(50);
		valueList.add(40);
		valueList.add(10);
		valueList.add(9);
		valueList.add(5);
		valueList.add(4);
		valueList.add(1);
	}

	/**
	 * Converts an Arabic number value to its Roman Numeral representation
	 * 
	 * @param arabic an Arabic number
	 * @return String that contains the Roman Numeral representation of the input
	 */
	public String arabicToRoman(int arabic) {
		
		if (arabic <= 0 || arabic >= 4000)
			return "Not a valid number";
		
		int symbolIndex = 0;
		String roman = "";
		
		while (arabic > 0) {
			if (arabic >= valueList.get(symbolIndex)) {
				roman += symbolList.get(symbolIndex);
				arabic -= valueList.get(symbolIndex);
			} else {
				symbolIndex++;
			}
		}
		
		return roman;
	}

	/**
	 * Converts a Roman Numeral value to its Arabic number value
	 * 
	 * @param roman Roman Numeral representation of a value
	 * @return integer value of roman numeral from input, returns -1 for invalid inputs.
	 */
	public int romanToArabic(String roman) {
		
		// Check input is valid roman numeral
		if (roman.length() <= 0
				|| !symbolList.contains(roman.substring(0, 1))
				|| roman.equalsIgnoreCase("MMMM")) {
			return -1;
		}
		
		// Look up index of first character from symbol list
		int symbolIndex = 0;
		symbolIndex = symbolList.indexOf(roman.substring(0, 1));
		
		if (roman.length() > 1) {
			if (roman.charAt(0) == 'I') {
				if (roman.charAt(1) == 'V') {
					return 4;
				} else if (roman.charAt(1) == 'X') {
					return 9;
				}
			}
			return valueList.get(symbolIndex) + romanToArabic(roman.substring(1));
		}
		
		// Retrieve value from value list
		return valueList.get(symbolIndex);
	}
}
