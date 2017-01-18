
package com.moa.romannumerals;

public class RNSwitch {

	public Object arabicToRoman(int arabic) {
		
		String roman = "";
		
		if (arabic == 10) {
			roman = "X";
		}
		else if (arabic == 9) {
			roman = "IX";
		}
		else if (arabic == 5) {
			roman = "V";
		}
		else {
			while (arabic > 0) {
				roman += "I";
				arabic--;
			}
		}
		
		return roman;
	}
}
