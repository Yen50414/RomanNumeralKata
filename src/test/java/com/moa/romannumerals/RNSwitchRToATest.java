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
	public void switchRomanToArabicEmpty() {
		assertEquals(-1, rnSwitch.romanToArabic(""));
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
	
	@Test
	public void switchRomanToArabic8() {
		assertEquals(8, rnSwitch.romanToArabic("VIII"));
    }
	
	@Test
	public void switchRomanToArabic9() {
		assertEquals(9, rnSwitch.romanToArabic("IX"));
    }
	
	@Test
	public void switchRomanToArabic10() {
		assertEquals(10, rnSwitch.romanToArabic("X"));
    }
	
	@Test
	public void switchRomanToArabic11() {
		assertEquals(11, rnSwitch.romanToArabic("XI"));
    }
}
