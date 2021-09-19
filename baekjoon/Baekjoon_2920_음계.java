package com.home.algorithm;

import java.io.*;

public class Baekjoon_2920_À½°è {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input[] = br.readLine().split(" ");
		boolean ascending = true;
		boolean descending = true;
		
		for (int i = 1; i < 9; i++) {
			int num = Integer.parseInt(input[i-1]);
			if (num != i)
				ascending = false;
			if (num != 9-i)
				descending = false;
		}
		
		if (ascending)
			bw.write("ascending");
		else if(descending)
			bw.write("descending");
		else
			bw.write("mixed");
		
		bw.close();
		br.close();
	}
}