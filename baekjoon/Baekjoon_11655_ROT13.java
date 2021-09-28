package com.home.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_11655_ROT13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		char data[] = input.toCharArray();
		
		for (char c : data) {
			if (c <= '9' || c == ' ') {
				bw.write(c);
			} else if (c <= 'Z'){
				// 대문자
				if ('Z'-c < 13) {
					bw.write(('A'-1)+(c+13-'Z'));
				} else {
					bw.write(c+13);
				}
			} else {
				// 소문자
				if ('z'-c < 13)
					bw.write(('a'-1)+(c+13-'z'));
				else
					bw.write(c+13);
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
