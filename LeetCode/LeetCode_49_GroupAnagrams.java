package com.home.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LeetCode_49_GroupAnagrams {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		List<List<String>> list = groupAnagrams(new String[]{"a"});
		System.out.println(list.toString());
		
		bw.close();
		br.close();
	}
	
	static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, LinkedList<String>> map = new HashMap<String, LinkedList<String>>();
		for (String word : strs) {
			int[] alpha = new int[26];
			String key = "";
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				alpha[c-'a'] += 1;
			}
			for (int i = 0; i < alpha.length; i++) {
				if (alpha[i] != 0) {
					key += String.valueOf(alpha[i])+(char)(i+'a');
				}
			}
			
			
			if (map.get(key) == null) {
				map.put(key, new LinkedList<String>());
			}
			map.get(key).add(word);
		}
		
		List<List<String>> list = new LinkedList<List<String>>();
		for (String str : map.keySet()) {
			list.add(map.get(str));
		}
		
		return list;
	}
}