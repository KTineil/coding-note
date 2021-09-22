package com.home.algorithm;

import java.util.HashMap;

public class CharacterUniqueChecker {
	public static void main(String[] args) {
		System.out.println(isUniqueBinary("klasjdsa"));
		System.out.println(isUniqueBinary("kljdsa"));
	}
	public static boolean isUnique(String str) {
		HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);
			if (map.containsKey(key)) {
				return false;
			}
			map.put(key, true);
		}
		return true;
	}
	public static boolean isUniqueBinary(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= 1 << val;
			System.out.println(checker);
		}
		return true;
	}
}