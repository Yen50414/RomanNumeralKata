
package com.moa.romannumerals;

public class RNSwitch {

	public Object arabicToRoman(int arabic) {
		
		if (arabic == 10) {
			return "X";
		}
		if (arabic == 5) {
			return "V";
		}
		return "I";
	}
}
