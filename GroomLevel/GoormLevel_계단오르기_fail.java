package com.home.algorithm;

import java.io.*;

class GoormLevel_계단오르기_fail {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 1;
		for (int i = 2; i <= n; i+=2) {
			int idx = i/2;
			int num = n - i + idx;
			System.out.print(factorial(num)+ " ");
			System.out.print(factorial(num-idx) + " ");
			System.out.print(factorial(idx) + " ");
			cnt += combination(num, idx);
		}
		System.out.println(cnt);
		br.close();
	}
	
	public static long combination(int n, int a) {
		long up = factorial(n) / factorial(n-a);
		System.out.println(up);
		long down = factorial(a);
		return up / down;
	}
	public static long factorial(int n) {
		if (n <= 1)
			return 1;
		return (n * factorial(n-1));
	}
}