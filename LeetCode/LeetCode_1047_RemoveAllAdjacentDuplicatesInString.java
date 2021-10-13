package com.home.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class LeetCode_1047_RemoveAllAdjacentDuplicatesInString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		String s = input[0];
		int k = Integer.valueOf(input[1]);
		System.out.println(removeDuplicates(s, k));
		
		bw.close();
		br.close();
	}
	static String removeDuplicates(String s, int k) {
		String word = s;
		Stack<Character> stack = new Stack<Character>();
		Stack<Integer> cntStack = new Stack<Integer>();
		
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			
			if (stack.isEmpty()) {
				stack.push(c);
				cntStack.push(1);
			}
			else {
				if (stack.peek() == c) {
					
					int cnt = cntStack.pop()+1;
					if (cnt == k) {
						for (int j = 0; j < k-1; j++) {
							stack.pop();
						}
					}
					else {
						cntStack.push(cnt);
						stack.push(c);
					}
					
				} else {
					stack.push(c);
					cntStack.push(1);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (char c : stack) {
			sb.append(c);
		}
		
		return sb.toString();
	}
}