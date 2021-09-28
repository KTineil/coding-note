package com.home.algorithm;

import java.io.*;
import java.util.Stack;

public class Baekjoon_1935_후위표기식2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.valueOf(br.readLine());
		
		Stack<Double> stack = new Stack<Double>();
		char post[] = br.readLine().toCharArray();
		
		double numbers[] = new double[post.length];
		for (int i = 0; i < n; i++) {
			numbers[i] = Double.valueOf(br.readLine());
		}
		
		for (int i = 0; i < post.length; i++) {
			char c = post[i];
			
			if (c < 'A') {
				double b = stack.pop();
				double a = stack.pop();
				
				switch (c) {
				case '+':
					stack.push(a + b);
					break;
				case '-':
					stack.push(a - b);
					break;
				case '*':
					stack.push(a * b);
					break;
				case '/':
					stack.push(a / b);
					break;
				default:
					break;
				}
			} else {
				stack.push(numbers[c-'A']);
			}
		}
		
		System.out.printf("%.2f", stack.pop());

	}
}
