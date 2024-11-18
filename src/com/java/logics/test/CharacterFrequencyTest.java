package com.java.logics.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import com.java.logics.CharacterFrequency;

class CharacterFrequencyTest {

	@Test
	public void testCharacterFrequency() {
		String input = "i am indian";
		HashMap<Character, Integer> expectedOutput = new HashMap<>();
		expectedOutput.put('i', 3);
		expectedOutput.put(' ', 2);
		expectedOutput.put('a', 2);
		expectedOutput.put('m', 1);
		expectedOutput.put('n', 2);
		expectedOutput.put('d', 1);
		HashMap<Character, Integer> actualOutput = CharacterFrequency.countFrequency(input);
		assertEquals(expectedOutput, actualOutput);
	}

}
