package com.home.algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_1002_터렛 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < testCase; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			
			while (token.hasMoreTokens()) {
				int x1 = Integer.valueOf(token.nextToken());
				int y1 = Integer.valueOf(token.nextToken());
				int r1 = Integer.valueOf(token.nextToken());
				int x2 = Integer.valueOf(token.nextToken());
				int y2 = Integer.valueOf(token.nextToken());
				int r2 = Integer.valueOf(token.nextToken());
				
				sb.append(findCase(x1, x2, y1, y2, r1, r2)).append("\n");
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
	
	public static int findCase(int x1, int x2, int y1, int y2, int r1, int r2) {
		
		int distance = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		int sum = r1+r2;
		
		// 무한일 경우
		if (x1 == x2 && y1 == y2 && r1 == r2 && r1+r2 != 0) {
			return -1;
		}
		
		// 원이 다른 원 안에 있을 경우
		else if (distance <= (r2-r1)*(r2-r1)) {
			if (distance == (r2-r1)*(r2-r1))
				return 1;
			else 
				return 0;
		}
		
		// 원이 다른 원 밖에 있을 때
		else {
			if (distance > sum*sum)
				return 0;
			else if(sum*sum == distance)
				return 1;
			else
				return 2;
		}
	}
}
