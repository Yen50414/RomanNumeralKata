
package com.moa.romannumerals;

import java.util.ArrayList;

public class RNSwitch {
	
	private ArrayList<String> symbolList;
	
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
	}

	public String arabicToRoman(int arabic) {
		
		if (arabic <= 0 || arabic >= 4000)
			return "Not a valid number";
		
		int symbolIndex = 0;
		String roman = "";
		
		while (arabic >= 1000) {
			roman += symbolList.get(symbolIndex);
			arabic -= 1000;
		}
		symbolIndex++;
		while (arabic >= 900) {
			roman += symbolList.get(symbolIndex);
			arabic -= 900;
		}
		symbolIndex++;
		while (arabic >= 500) {
			roman += symbolList.get(symbolIndex);
			arabic -= 500;
			
		}
		symbolIndex++;
		while (arabic >= 400) {
			roman += symbolList.get(symbolIndex);
			arabic -= 400;
		}
		symbolIndex++;
		while (arabic >= 100) {
			roman += symbolList.get(symbolIndex);
			arabic -= 100;
		}
		symbolIndex++;
		while (arabic >= 90) {
			roman += symbolList.get(symbolIndex);
			arabic -= 90;
		}
		symbolIndex++;
		while (arabic >= 50) {
			roman += symbolList.get(symbolIndex);
			arabic -= 50;
		}
		symbolIndex++;
		while (arabic >= 40) {
			roman += symbolList.get(symbolIndex);
			arabic -= 40;
		}
		symbolIndex++;
		while (arabic >= 10) {
			roman += symbolList.get(symbolIndex);
			arabic -= 10;
		}
		symbolIndex++;
		while (arabic == 9) {
			roman += symbolList.get(symbolIndex);
			arabic -= 9;
		}
		symbolIndex++;
		while (arabic >= 5) {
			roman += symbolList.get(symbolIndex);
			arabic -= 5;
		}
		symbolIndex++;
		while (arabic == 4) {
			roman += symbolList.get(symbolIndex);
			arabic -= 4;
		}
		symbolIndex++;
		while (arabic > 0) {
			roman += symbolList.get(symbolIndex);
			arabic--;
		}
		
		return roman;
	}
}
