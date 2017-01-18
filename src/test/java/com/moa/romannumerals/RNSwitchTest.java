
package com.moa.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RNSwitchTest {

	@Test
	public void switchArabicToRoman1() {
		RNSwitch rnSwitch = new RNSwitch();
        assertEquals("I", rnSwitch.arabicToRoman(1));
    }
	
	@Test
	public void switchArabicToRoman5() {
		RNSwitch rnSwitch = new RNSwitch();
        assertEquals("V", rnSwitch.arabicToRoman(5));
    }
}
