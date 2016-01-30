package edu.gatech.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyWeirdStringTest {

	private MyWeirdStringInterface myweirdstring;

	@Before
	public void setUp() throws Exception {
		myweirdstring = new MyWeirdString();
	}

	@After
	public void tearDown() throws Exception {
		myweirdstring = null;
	}

	@Test
	public void testCountDigits1() {
		myweirdstring.setWeirdString("I'd better put s0me d1gits in this 5tr1n9, right?");
		assertEquals(5, myweirdstring.countDigits());
	}

	/**
	 * Passing null should throw an IllegalArgumentException
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testCountDigits2() {
		myweirdstring.setWeirdString(null);
		myweirdstring.countDigits();
	}

	/**
	 * Passing an empty String, "", should return 0
	 */
	@Test
	public void testCountDigits3() {
		myweirdstring.setWeirdString("");
		assertEquals(0, myweirdstring.countDigits());
	}

	/**
	 * Passing a String with NO digits should return 0
	 */
	@Test
	public void testCountDigits4() {
		myweirdstring.setWeirdString("SCHAHANAPALLY");
		assertEquals(0, myweirdstring.countDigits());
	}

	@Test
	public void testGetEvenCharacters1() {
		myweirdstring.setWeirdString("I'd better put s0me d1gits in this 5tr1n9, right?");
		assertEquals("' etrptsm 1isi hs5rn,rgt", myweirdstring.getEvenCharacters());
	}

	/**
	 * Passing null should throw an IllegalArgumentException
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testGetEvenCharacters2() {
		myweirdstring.setWeirdString(null);
		myweirdstring.getEvenCharacters();
	}

	/**
	 * Passing an empty String, "", should return an empty String back.
	 */
	@Test
	public void testGetEvenCharacters3() {
		myweirdstring.setWeirdString("");
		assertEquals("", myweirdstring.getEvenCharacters());
	}

	/**
	 * Passing a Single Character String should return an empty String back.
	 */
	@Test
	public void testGetEvenCharacters4() {
		myweirdstring.setWeirdString("S");
		assertEquals("", myweirdstring.getEvenCharacters());
	}

	@Test
	public void testGetOddCharacters1() {
		myweirdstring.setWeirdString("I'd better put s0me d1gits in this 5tr1n9, right?");
		assertEquals("Idbte u 0edgt nti t19 ih?", myweirdstring.getOddCharacters());
	}

	/**
	 * Passing null should throw an IllegalArgumentException
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testGetOddCharacters2() {
		myweirdstring.setWeirdString(null);
		myweirdstring.getOddCharacters();
	}

	/**
	 * Passing an empty String, "", should return an empty String back.
	 */
	@Test
	public void testGetOddCharacters3() {
		myweirdstring.setWeirdString("");
		assertEquals("", myweirdstring.getOddCharacters());
	}

	/**
	 * Passing a Single Character String should return the same String back.
	 */
	@Test
	public void testGetOddCharacters4() {
		myweirdstring.setWeirdString("S");
		assertEquals("S", myweirdstring.getOddCharacters());
	}

	@Test
	public void testConvertDigitsToRomanNumeralsInSubstring1() {
		myweirdstring.setWeirdString("I'd better put s0me d1gits in this 5tr1n9, right?");
		myweirdstring.convertDigitsToRomanNumeralsInSubstring(40, 45);
		assertEquals("I'd better put s0me d1gits in this 5tr1nIX, right?", myweirdstring.getWeirdString());
	}

	/**
	 * startPosition > endPosition throws IllegalArgumentException
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testConvertDigitsToRomanNumeralsInSubstring2() {
		myweirdstring.setWeirdString("I'd better put s0me d1gits in this 5tr1n9, right?");
		myweirdstring.convertDigitsToRomanNumeralsInSubstring(45, 40);
	}

	/**
	 * endPosition >= String length throws MyIndexOutOfBoundsException
	 */
	@Test(expected=MyIndexOutOfBoundsException.class)
	public void testConvertDigitsToRomanNumeralsInSubstring3() {
		myweirdstring.setWeirdString("SCHAHANAPALLY");
		myweirdstring.convertDigitsToRomanNumeralsInSubstring(1, 14);
	}

	/**
	 * Passing null should throw an IllegalArgumentException
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testConvertDigitsToRomanNumeralsInSubstring4() {
		myweirdstring.setWeirdString(null);
		myweirdstring.convertDigitsToRomanNumeralsInSubstring(1, 13);
	}

	@Test
	public void testConvertDigitsToRomanNumeralsInSubstring5() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertDigitsToRomanNumeralsInSubstring6() {
		fail("Not yet implemented");
	}

}
