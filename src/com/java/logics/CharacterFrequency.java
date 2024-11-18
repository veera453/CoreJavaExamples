package com.java.logics;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
	
	public static HashMap<Character, Integer> countFrequency(String s) {
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for (Character c : ch) {
			map.merge(c, 1, Integer::sum);
		}
		return map;
	}

	public static void main(String[] args) {
		String s = "i am indian";
		HashMap<Character, Integer> frequencyMap = countFrequency(s);
		for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
		}
	}

}
