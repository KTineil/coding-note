package com.home.algorithm;
import java.io.*;
public class Baekjoon_1978_소수구하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input[] = br.readLine().split(" ");
		int cnt = 0;
		for (String str : input) {
			int num = Integer.parseInt(str);
			boolean flag = true;
			if (num == 1)
				flag = false;
			for (int i = 2; i < num; i++) {
				if (num%i == 0) {
					flag = false;
				}
			}
			if (flag)
				cnt++;
		}
		System.out.println(cnt);
		br.close();
	}
}