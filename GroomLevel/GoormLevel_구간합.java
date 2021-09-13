package com.home.algorithm;

import java.io.*;
import java.util.Arrays;

class GoormLevel_±¸°£ÇÕ {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine().split(" ");
		String a[] = br.readLine().split(" ");
		String b[] = br.readLine().split(" ");
		int result[] = new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			result[i] = Integer.valueOf(a[i]);
		}
		for (int i = a.length; i < a.length+b.length; i++) {
			result[i] = Integer.valueOf(b[i-a.length]);
		}
		Arrays.sort(result);
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
			
	}
}