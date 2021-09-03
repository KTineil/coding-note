package com.home.algorithm;

import java.io.*;

public class Baekjoon_2941_Croatia {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

		String word = br.readLine();
		int len = word.length();
		int result = len;
		String[] croatias = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for (String croatia : croatias) {
			for (int j = 0; j < len-1; j++) {
				String string = word.substring(j, j+2);
				if (croatia.equals(string)) {
					result--;
					if (croatia.equals("z=") && j != 0 && word.substring(j-1, j).equals("d"))
						result--;
				}
			}
		}
		
		bw.write(Integer.toString(result));
		br.close();
		bw.close();
	}
}
