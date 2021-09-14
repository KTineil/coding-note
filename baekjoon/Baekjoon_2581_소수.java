package com.home.algorithm;
import java.io.*;
public class Baekjoon_2581_¼Ò¼ö {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int minNum = 0;
		for (int i = m; i <= n; i++) {
			boolean flag = true;
			if (i == 1) {
				flag = false;
			}
			for (int j = 2; j < i; j++) {
				if (i%j == 0) {
					flag = false;
					break;
				}
			}
			if (flag & minNum == 0)
				minNum = i;
			if (flag) {
				sum += i;
			}
		}
		if (sum == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(minNum);
		}
		br.close();
	}
}