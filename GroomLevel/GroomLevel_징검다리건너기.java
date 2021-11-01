package com.home.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class GroomLevel_징검다리건너기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.valueOf(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] data = new int[input.length];
		for (int i = 0; i < n; i++) {
			data[i] = Integer.valueOf(input[i]);
		}
		input = null;
		
		for (int i = 3; i < n; i++) {
			int min = Math.min(Math.min(data[i-3], data[i-2]), data[i-1]);
			data[i] = data[i]+min;
		}
		
		int minPoison = 0;
		
		if (n > 3) {
			minPoison = Math.min(Math.min(data[n-1], data[n-2]), data[n-3]);
		}
		
		bw.write(Integer.toString(minPoison));
		bw.close();
		br.close();
	}
}

/*
 * 7 8 9 10  9  8   7  6   5  4
 * 7 8 9 17 17 17 24 23 22 26
 *
 * 100 100 0 100 0 100 100 0 0 100 100 100 
 * 100 100 0 100 0 100 100 0 0 100 100 100
 * 
 * 95
 * 20 29 10 28 03 25 35 36 16 11 07 30 37 10 39  03 13 26 34  37
 * 20 29 10 38 13 35 48 49 51 59 56 81 93 66 105 69 79 95 103 116 
 * */
