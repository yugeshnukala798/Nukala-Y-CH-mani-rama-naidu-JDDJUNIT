package com.epam.TDDJUNITDEMO;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.epam.TDDJUNIT.RemoveAinFirstTwoChars;

class RemoveAinFirstTwoCharsTest {

	/*
	 * 1. 1 char : A => ""
	 * 2. 1 char : B =>"B"
	 * 3. 2 chars : AA => ""
	 * 4. 2 chars : BA/AB => "B"
	 * 5. 3 chars : AAB => "B"
	 * 6. 3 chars : ABA/BAA => "BA"
	 * 7. n chars : ABBSJHVSGVSG => "BBSJHVSGVSG"
	 * 8. 0 chars : "" => ""
	 */
	
	RemoveAinFirstTwoChars RemoveAinFirstTwoChars;
	
	@BeforeEach
	void setup() {
		RemoveAinFirstTwoChars = new RemoveAinFirstTwoChars();
	}
	
	@Test
	void remove0char1() {
		assertEquals("",RemoveAinFirstTwoChars.remove(""));
	}
	
	@Test
	void remove1char1() {
		assertEquals("",RemoveAinFirstTwoChars.remove("A"));
	}
	
	@Test
	void remove1char2() {
		assertEquals("B",RemoveAinFirstTwoChars.remove("B"));
	}
	
	@Test
	void remove2char1() {
		assertEquals("",RemoveAinFirstTwoChars.remove("AA"));
	}

	@Test
	void remove2char2() {
		assertEquals("B",RemoveAinFirstTwoChars.remove("BA"));
	}
	
	@Test
	void remove2char3() {
		assertEquals("B",RemoveAinFirstTwoChars.remove("AB"));
	}
	
	@Test
	void remove3char1() {
		assertEquals("A",RemoveAinFirstTwoChars.remove("AAA"));
	}

	@Test
	void remove3char2() {
		assertEquals("BA",RemoveAinFirstTwoChars.remove("ABA"));
	}
	
	@Test
	void remove3char3() {
		assertEquals("BB",RemoveAinFirstTwoChars.remove("BAB"));
	}
	
	@Test
	void removenchar1() {
		assertEquals("BBSJHVSGVSG",RemoveAinFirstTwoChars.remove("ABBSJHVSGVSG"));
	}
	
}
