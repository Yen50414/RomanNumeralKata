
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
	public void switchArabicToRoman5() {
        assertEquals("V", rnSwitch.arabicToRoman(5));
    }
}
