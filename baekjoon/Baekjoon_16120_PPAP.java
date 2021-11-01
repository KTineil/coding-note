package com.home.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_16120_PPAP {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String ppap = br.readLine();
		bw.write(findPPAP(ppap));
		
		bw.close();
		br.close();
	}
	
	static String findPPAP(String ppap) {
		int cnt = 0;
		for (int i = 0; i < ppap.length(); i++) {
			if (ppap.charAt(i) == 'P') {
				cnt++;
			} else {
				if (i == ppap.length()-1)
					return "NP";
				else if (ppap.charAt(i+1) == 'A' || cnt < 2)
					return "NP";
				cnt -= 2;
			}
		}
		if (cnt != 1)
			return "NP";
		return "PPAP";
	}
}