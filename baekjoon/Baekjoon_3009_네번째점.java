package com.home.algorithm;

import java.io.*;
import java.util.Arrays;

public class Baekjoon_3009_네번째점 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int xList[] = new int[3];
		int yList[] = new int[3];
		for (int i = 0; i < 3; i++) {
			String data[] = br.readLine().split(" ");
			int x = Integer.valueOf(data[0]);
			int y = Integer.valueOf(data[1]);
			xList[i] = x;
			yList[i] = y;
		}
		Arrays.sort(xList);
		Arrays.sort(yList);
		
		int x = xList[0] == xList[1] ? xList[2]: xList[0];
		int y = yList[0] == yList[1] ? yList[2]: yList[0];
		
		System.out.printf("%d %d", x, y);
		br.close();
	}
}
