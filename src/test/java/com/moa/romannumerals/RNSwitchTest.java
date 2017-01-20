
package com.moa.romannumerals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RNSwitchTest {
	
	RNSwitch rnSwitch;
	
	int maxValue = 3999;

	@Before
	public void setUp() {
		rnSwitch = new RNSwitch();
	}
	
	@Test
	public void switchArabicToRoman1() {
        assertEquals("I", rnSwitch.arabicToRoman(1));
    }
	
	@Test
	public void switchArabicToRoman3() {
        assertEquals("III", rnSwitch.arabicToRoman(3));
    }
	
	@Test
	public void switchArabicToRoman4() {
        assertEquals("IV", rnSwitch.arabicToRoman(4));
    }
	
	@Test
	public void switchArabicToRoman5() {
        assertEquals("V", rnSwitch.arabicToRoman(5));
    }
	
	@Test
	public void switchArabicToRoman8() {
        assertEquals("VIII", rnSwitch.arabicToRoman(8));
    }
	
	@Test
	public void switchArabicToRoman9() {
        assertEquals("IX", rnSwitch.arabicToRoman(9));
    }
	
	@Test
	public void switchArabicToRoman10() {
        assertEquals("X", rnSwitch.arabicToRoman(10));
    }
	
	@Test
	public void switchArabicToRoman15() {
        assertEquals("XV", rnSwitch.arabicToRoman(15));
    }
	
	@Test
	public void switchArabicToRoman18() {
        assertEquals("XVIII", rnSwitch.arabicToRoman(18));
    }
	
	@Test
	public void switchArabicToRoman19() {
        assertEquals("XIX", rnSwitch.arabicToRoman(19));
    }
	
	@Test
	public void switchArabicToRomanAllEnding14() {
		for (int i = 14; i <= maxValue; i += 100) {
			String result = rnSwitch.arabicToRoman(i);
			assertTrue(i + " != " + result, result.endsWith("XIV"));
		}
    }
	
	@Test
	public void switchArabicToRoman22() {
        assertEquals("XXII", rnSwitch.arabicToRoman(22));
    }
	
	@Test
	public void switchArabicToRomanAllEnding40() {
		for (int i = 40; i <= maxValue; i += 100) {
			String result = rnSwitch.arabicToRoman(i);
			assertTrue(i + " != " + result, result.endsWith("XL"));
		}
    }
	
	@Test
	public void switchArabicToRoman50() {
        assertEquals("L", rnSwitch.arabicToRoman(50));
    }
	
	@Test
	public void switchArabicToRomanAllEnding90() {
		for (int i = 90; i <= maxValue; i += 100) {
			String result = rnSwitch.arabicToRoman(i);
			assertTrue(i + " != " + result, result.endsWith("XC"));
		}
    }
	
	@Test
	public void switchArabicToRomanAllEnding100() {
		for (int i = 100; i <= maxValue; i += 1000) {
			String result = rnSwitch.arabicToRoman(i);
			assertTrue(i + " != " + result, result.endsWith("C"));
		}
    }
}
