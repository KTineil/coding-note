package com.home.algorithm;

import java.io.*;

public class Baekjoon_1929_소수구하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input[] = br.readLine().split(" ");
		int M = Integer.parseInt(input[0]);
		int N = Integer.parseInt(input[1]);
		
		for (int i = M; i <= N; i++) {
			if (checkPrime(i)) {
				bw.write(Integer.toString(i));
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

	private static boolean checkPrime(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num%i == 0)
				return false;
		}
		return true;
	}
}