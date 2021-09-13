package com.home.algorithm;
import java.io.*;
public class Baekjoon_2775_∫Œ≥‡»∏¿Â {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			int k = Integer.valueOf(br.readLine());
			int n = Integer.valueOf(br.readLine());
			
			bw.write(Integer.toString(decomeposition(k, n))+"\n");
		}
		
		bw.close();
		br.close();
	}
	
	private static int decomeposition(int k, int n) {
		if (k == 0) {
			return n;
		}
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += decomeposition(k-1, i);
		}
		return sum;
	}
}