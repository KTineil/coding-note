package com.home.algorithm;
import java.io.*;
public class GoormLevel_Stack {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int stack[] = new int[n];
		int top = 0;
		for (int i = 0; i < n; i++) {
			int flag = Integer.parseInt(br.readLine());
			if (flag == 0) {
				if (top < 10) {
					int item = Integer.valueOf(br.readLine());
					stack[top++] = item;
				} else
					System.out.println("overflow");
			} else if (flag == 1) {
				if (top > 0)
					--top;
				else
					System.out.println("underflow");
			} else {
				break;
			}
		}
		for (int i = 0; i < top; i++) {
			System.out.print(stack[i]+" ");
		}
	}
}