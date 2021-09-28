package algorithm;

import java.io.*;


public class Baekjoon_1157_LearnWord__ {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String word = br.readLine();
		word = word.toUpperCase();
		int[] alpha = new int[26];
		
		for (int i = 0; i < word.length(); i++) {
			alpha[(int)word.charAt(i)-'A']++;
		}
		
		int maxNum = 0;
		for (int i = 0; i < alpha.length; i++) {
			if (maxNum < alpha[i]) {
				maxNum = alpha[i];
			}
		}
		char result = (char)(maxIdx+'A');
		int cnt = 0;
		for (int i : alpha) {
			if (i == maxNum)
				cnt++;
				result = i;
			if (cnt >= 2) {
				result = '?';
				break;
			}
		}
		
		bw.write(result);
		br.close();
		bw.close();
	}
//	public static String solution(String new_id) {
//		
//	}
}
