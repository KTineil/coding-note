// https://level.goorm.io/exam/88520/%EB%86%80%EC%9D%B4%EA%B3%B5%EC%9B%90/quiz/1

package com.home.algorithm;

import java.io.*;
import java.lang.*;
import java.util.*;


public class GoormLevel_AmusementPark {
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void testCase(int caseIndex) {
		int N = scanner.nextInt();  // 지도의 크기 
		int K = scanner.nextInt();  // 놀이공원의 크기
		
		int[][] wastes = new int[N][N]; // 각 칸의 쓰레기 존재 여부 
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c += 1) {
				wastes[r][c] = scanner.nextInt();
			}
		}
		
		int minWaste = K*K;
		for (int r = 0; r < N-K+1; r++) {
			for (int c = 0; c < N-K+1; c++) {
				int waste = 0;
				for (int i = r; i < r+K; i++) {
					for (int j = c; j < c+K; j++) {
						if (wastes[i][j] == 1) {
							waste++;
						}
					}
				}
				if (waste < minWaste)
					minWaste = waste;
			}
		}
		
		int answer = minWaste;
		
		
		System.out.println(answer);
	}
	
	public static void main(String[] args) throws Exception {
		int caseSize = scanner.nextInt();
		
		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
			testCase(caseIndex);
		}
	}
}