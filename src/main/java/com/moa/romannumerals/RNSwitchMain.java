package com.moa.romannumerals;

public class RNSwitchMain {
	
	private static void printAll() {

		RNSwitch rnSwitch = new RNSwitch();
		int maxValue = 4000;
		
		for (int i = 0; i <= maxValue; i++) {
			String result = rnSwitch.arabicToRoman(i);
			System.out.println(i + " = " + result);
		}
	}

	public static void main(String[] args) {
		
		printAll();
	}

}
