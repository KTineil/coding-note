package com.home.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class LeetCode_716_maxStack {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> maxStack = new Stack<Integer>();
		
		for (int i = 0; i < 10; i++) {
			String[] command = br.readLine().split(" ");
			
			if (command[0].equals("push")) {
				int n = Integer.valueOf(command[1]);
				stack.push(n);
				
				// maxStack
				if (maxStack.isEmpty()) {
					maxStack.push(n);
				}
				else {
					int max = maxStack.peek();
					if (max <= n) {
						maxStack.push(n);
					}
				}
			} else if(command[0].equals("pop")) {
				if (stack.peek() >= maxStack.peek())
					maxStack.pop();
				stack.pop();
			} else if(command[0].contentEquals("max")) {
				bw.write(String.valueOf(maxStack.peek()));
			}
		}
		bw.close();
		br.close();
	}
}