
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

	public int romanToArabic(String string) {
		if (string.length() > 1) {
			if (string.charAt(0) == 'I') {
				if (string.charAt(1) == 'V') {
					return 4;
				}
			}
			return 1 + romanToArabic(string.substring(1));
		}
		if (string.charAt(0) == 'V') {
			return 5;
		}
		return 1;
	}
}
