package com.home.algorithm;

/*
 * (����) https://st-lab.tistory.com/91
 * */
import java.io.*;

public class Baekjoon_9020_����������_help {
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
		// num�� 1�� �� �� ���� ������ if (num == 1) �� ���ʿ�
		for (int i = 2; i < num; i++) {
			if (num%i == 0)
				isPrime = false;
		}
		return isPrime;
	}
}