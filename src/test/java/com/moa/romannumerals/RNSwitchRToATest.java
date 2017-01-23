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
}
