package com.home.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon_17298_¿ÀÅ«¼ö {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.valueOf(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] data = new int[n];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		int prev = Integer.valueOf(input[0]);
		for (int i = 1; i < n; i++) {
			int cur = Integer.valueOf(input[i]);
			
			if (prev < cur) {
				while (!stack.isEmpty()) {
					if (Integer.valueOf(input[stack.peek()]) >= cur) {
						break;
					}
					else {
						data[stack.pop()] = cur;
					}
				}
			}
			
			stack.push(i);
			
			prev = cur;
		}
		while(!stack.isEmpty()) {
			data[stack.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int num : data) {
			sb.append(num).append(" ");
		}
		
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}