package com.home.algorithm;

/*
 * (µµ¿ò) https://st-lab.tistory.com/91
 * */
import java.io.*;

public class Fibonacci {
	static int cnt = 0;
	static int max;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		max = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(0, 1));
		
	}

	private static int fibonacci(int a, int b) {
		if (cnt == max)
			return a;
		cnt++;
		return fibonacci(b, a+b);
	}
	
}