package com.home.algorithm;

import java.io.*;

public class Baekjoon_1316_GroupWordChecker {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.valueOf(br.readLine());
		int cnt = 0;
		outerLoop:
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			boolean check[] = new boolean[26];
			for (int j = 0; j < str.length(); j++) {
				char word = str.charAt(j);
				int idx = (int)word - 97;
				if (check[idx] && str.charAt(j-1) != word) 
					continue outerLoop;
				check[idx] = true;
			}
			cnt++;
		}
		bw.write(Integer.toString(cnt));
		br.close();
		bw.close();
	}
}
