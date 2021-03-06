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
	
	@Test
	public void switchRomanToArabic14() {
		assertEquals(14, rnSwitch.romanToArabic("XIV"));
    }
	
	@Test
	public void switchRomanToArabic15() {
		assertEquals(15, rnSwitch.romanToArabic("XV"));
    }
	
	@Test
	public void switchRomanToArabic19() {
		assertEquals(19, rnSwitch.romanToArabic("XIX"));
    }
	
	@Test
	public void switchRomanToArabic20() {
		assertEquals(20, rnSwitch.romanToArabic("XX"));
    }
	
	@Test
	public void switchRomanToArabic50() {
		assertEquals(50, rnSwitch.romanToArabic("L"));
    }
	
	@Test
	public void switchRomanToArabic100() {
		assertEquals(100, rnSwitch.romanToArabic("C"));
    }
	
	@Test
	public void switchRomanToArabic300() {
		assertEquals(300, rnSwitch.romanToArabic("CCC"));
    }
	
	@Test
	public void switchRomanToArabic500() {
		assertEquals(500, rnSwitch.romanToArabic("D"));
    }
	
	@Test
	public void switchRomanToArabic1000() {
		assertEquals(1000, rnSwitch.romanToArabic("M"));
    }
	
	@Test
	public void switchRomanToArabic4000() {
		assertEquals(-1, rnSwitch.romanToArabic("MMMM"));
    }
	
	@Test
	public void switchRomanToArabicInvalidSymbol() {
		assertEquals(-1, rnSwitch.romanToArabic("A"));
    }
	
	@Test
	public void switchRomanToArabicInvalidSymbol2() {
		assertEquals(-1, rnSwitch.romanToArabic("BB"));
    }
}
