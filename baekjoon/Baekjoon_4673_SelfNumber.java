package com.home.algorithm;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Baekjoon_4673_SelfNumber {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] isSelfNums = new boolean[10001];
		for (int i = 1; i < isSelfNums.length; i++) {
			int self = selfNumber(i);
			
			if (self <= 10000) {
				isSelfNums[self] = true;
			}
		}
		
		for (int i = 1; i < isSelfNums.length; i++) {
			if (!isSelfNums[i]) {
				bw.write(Integer.toString(i) + "\n");
			}
		}
		bw.close();
	}

	private static int selfNumber(int num) {
		int sum = num;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		
		return sum;
	}
}