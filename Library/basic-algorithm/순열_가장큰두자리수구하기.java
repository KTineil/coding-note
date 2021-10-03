package com.home.algorithm;

public class 순열_가장큰두자리수구하기 {
	static int N = 5;
	static int[] NUMS = {1, 2, 3, 4, 5};
	static int SELECT = 3;
		
	public static void main(String[] args) {
		System.out.println(solve(0, 0, 0));
	}
	
	public static int solve(int cnt, int used, int val) {
		if (cnt == SELECT) return val;
		
		int max = 0;
		for (int i = 0; i < N; i++) {
			if ((used & 1 << i) != 0) continue;
			max = Math.max(max, solve(cnt+1, (used | 1 << i), val*10+NUMS[i]));
		}
		return max;
	}
}