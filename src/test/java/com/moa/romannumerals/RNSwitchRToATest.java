package com.moa.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RNSwitchRToATest {
	
	RNSwitch rnSwitch;
	
	@Before
	public void setUp() {
		rnSwitch = new RNSwitch();
	}

	@Test
	public void switchRomanToArabic1() {
		assertEquals(1, rnSwitch.romanToArabic("I"));
    }
	
	@Test
	public void switchRomanToArabic2() {
		assertEquals(2, rnSwitch.romanToArabic("II"));
    }
	
	@Test
	public void switchRomanToArabic3() {
		assertEquals(3, rnSwitch.romanToArabic("III"));
    }
	
	@Test
	public void switchRomanToArabic4() {
		assertEquals(4, rnSwitch.romanToArabic("IV"));
    }
	
	@Test
	public void switchRomanToArabic5() {
		assertEquals(5, rnSwitch.romanToArabic("V"));
    }
}
