
package com.moa.romannumerals;

public class RNSwitch {

	public String arabicToRoman(int arabic) {
		
		String roman = "";
		
		while (arabic >= 1000) {
			roman += "M";
			arabic -= 1000;
		}
		if (arabic >= 900) {
			roman += "CM";
			arabic -= 900;
		} else if (arabic >= 500) {
			roman += "D";
			arabic -= 500;
		} else if (arabic >= 400) {
			roman += "CD";
			arabic -= 400;
		}
		
		while (arabic >= 100) {
			roman += "C";
			arabic -= 100;
		}
		if (arabic >= 90) {
			roman += "XC";
			arabic -= 90;
		} else if (arabic >= 50) {
			roman += "L";
			arabic -= 50;
		} else if (arabic >= 40) {
			roman += "XL";
			arabic -= 40;
		}
		
		while (arabic >= 10) {
			roman += "X";
			arabic -= 10;
		}
		if (arabic == 9) {
			roman += "IX";
			arabic -= 9;
		} else if (arabic >= 5) {
			roman += "V";
			arabic -= 5;
		} else if (arabic == 4) {
				roman += "IV";
				arabic -= 4;
		}
		
		while (arabic > 0) {
			roman += "I";
			arabic--;
		}
		
		return roman;
	}
}
