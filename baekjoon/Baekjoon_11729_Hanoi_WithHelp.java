package com.home.algorithm;
/*
 * (µµ¿ò) https://st-lab.tistory.com/96
 * */
import java.io.*;

public class Baekjoon_11729_Hanoi_WithHelp {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(br.readLine());
		sb.append((int)Math.pow(2, N) - 1).append("\n");
		Hanoi(N, 1, 2, 3);
		
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
	
	public static void Hanoi(int N, int start, int mid, int end) {
		if (N == 1) {
			sb.append(start + " " + end).append("\n");
			return;
		}
		
		Hanoi(N-1, start, end, mid);
		
		sb.append(start + " " + end).append("\n");
		
		Hanoi(N-1, mid, start, end);
	}
}

