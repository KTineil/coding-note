package com.home.algorithm;

/*
 * (도움) https://st-lab.tistory.com/91
 * */
import java.io.*;

public class Baekjoon_9020_골드바흐추측_help {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.valueOf(br.readLine());
		for (int i = 0; i < testCase; i++) {
			int n = Integer.valueOf(br.readLine());
			int p = n/2;
			int q = n/2;
			while (true) {
				if (checkPrime(p) && checkPrime(q))
					break;
				p--;
				q++;
			}
			System.out.printf("%d %d\n", p, q);
		}
		br.close();
	}

	private static boolean checkPrime(int num) {
		boolean isPrime = true;
		// num에 1이 올 수 없기 때문에 if (num == 1) 은 불필요
		for (int i = 2; i < num; i++) {
			if (num%i == 0)
				isPrime = false;
		}
		return isPrime;
	}
}