package com.home.algorithm;

import java.io.*;

public class Baekjoon_4948_베르트랑공준 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;
			int cnt = 0;
			for (int i = n+1; i <= 2*n; i++) {
				if (checkPrime(i)) {
					cnt++;
				}
			}
			bw.write(Integer.toString(cnt));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}

	private static boolean checkPrime(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}