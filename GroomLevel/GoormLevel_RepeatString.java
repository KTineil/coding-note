package com.home.algorithm;

import java.io.*;

class GoormLevel_RepeatString {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int len = input.length();
		String result = "";
		int i;
		for (i = 0; i < len/2; i++) {
			String forward = input.substring(i, i+1);
			String back = input.substring(len-i-1, len-i);
			result += forward + back;
		}
		if (len%2 == 1)
			result += input.substring(i, i+1);
		System.out.println(result);
	}
}