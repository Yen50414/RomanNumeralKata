
package com.moa.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RNSwitchTest {
	
	RNSwitch rnSwitch;

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
	public void switchArabicToRoman9() {
        assertEquals("IX", rnSwitch.arabicToRoman(9));
    }
	
	@Test
	public void switchArabicToRoman10() {
        assertEquals("X", rnSwitch.arabicToRoman(10));
    }
}
