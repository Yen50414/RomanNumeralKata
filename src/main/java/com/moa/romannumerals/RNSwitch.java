
package com.moa.romannumerals;

public class RNSwitch {

	public String arabicToRoman(int arabic) {
		
		String roman = "";
		
		while (arabic >= 10) {
			roman += "X";
			arabic -= 10;
		}
		if (arabic == 9) {
			roman += "IX";
			arabic -= 9;
		}
		else if (arabic >= 5) {
			roman += "V";
			arabic -= 5;
		}
		else if (arabic == 4) {
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
