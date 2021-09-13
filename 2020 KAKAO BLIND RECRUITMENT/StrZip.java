package com.home.algorithm;

public class StrZip {
	public int solution(String s) {
		String word = s;
		int size = word.length();
		int minSize = size;
		for (int i = 1; i <= size/2; i++) {
			int length = compression(word, i, 1).length();
			if (length < minSize)
				minSize = length;
		}
		return minSize;
	}

	private static String compression(String word, int i, int cnt) {
		if (word.length() <= i) {
			if (cnt != 1) {
				return cnt+word;
			} else {
				return word;
			}
		}
		String prev = word.substring(0, i);
		String next = word.substring(i);
		if (next.startsWith(prev)) {
			cnt++;
			return compression(next, i, cnt);
		} else {
			if (cnt > 1) {
				return cnt + prev + compression(next, i, 1); 
			}
			return prev + compression(next, i, 1);
		}
	}
	
	public static void main(String[] args) {
		StrZip main = new StrZip();
		System.out.println(main.solution("ababcdcdababcdcd"));
	}
}